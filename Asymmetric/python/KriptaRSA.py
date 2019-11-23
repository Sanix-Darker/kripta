from Crypto.Protocol.KDF import PBKDF2
from Crypto.Hash import SHA256
from Crypto.PublicKey import RSA
from Crypto.Cipher import PKCS1_OAEP
from Crypto.Cipher import AES
import base64


class KriptaRSA:

    def __init__(self, keysize = 1024):
        self.keysize = keysize
        self.public_key = b""
        self.private_key = b""

    def toBytes(self, m):
        if type(m) == str:
            return m.encode()
        else:
            return m

    # Setters and getters
    def getKeySize(self):
        return self.keysize
    def setKeySize(self, m):
        self.keysize = m

    # Setters and getters
    def getPublicKey(self):
        return self.public_key
    def setPublicKey(self, m):
        self.public_key = self.toBytes(m)

    # Setters and getters
    def getPrivateKey(self):
        return self.private_key
    def setPrivateKey(self, m):
        self.private_key = self.toBytes(m)

    def generate_RSA(self):
        new_key = RSA.generate(self.keysize, e=65537)
        self.setPublicKey(new_key.publickey().exportKey("PEM"))
        self.setPrivateKey(new_key.exportKey("PEM"))
        return self.getPrivateKey(), self.getPublicKey()


    def encrypt(self, key, plaintext):
        # Assuming that the public key is coming from java or javascript,
        # strip off the headers.
        # if it's bytes, then convert to string
        if type(key) == bytes:
            key = key.decode('utf-8')
        key = key.replace('-----BEGIN PUBLIC KEY-----', '').replace('-----END PUBLIC KEY-----', '')
        # Since it's coming from java/javascript, it's base 64 encoded.
        # Decode before importing.
        pubkey = RSA.importKey(base64.b64decode(key))
        cipher = PKCS1_OAEP.new(pubkey, hashAlgo=SHA256)
        encrypted = cipher.encrypt(plaintext)
        return base64.b64encode(encrypted).decode('utf-8')


    def decrypt(self, ciphertext):
        rsa_key = RSA.importKey(self.getPrivateKey())
        cipher = PKCS1_OAEP.new(rsa_key, hashAlgo=SHA256)
        decrypted = cipher.decrypt(base64.b64decode(ciphertext))
        return decrypted.decode('utf-8')