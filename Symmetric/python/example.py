# Example for AES Symmetric encryption
# Using KriptaAES-JS

from KriptaAES import KriptaAES

k = KriptaAES()

print("\nWELCOME TO KRIPTA-AES-PYTHON")
message = "Mon message Secret"
secret_key = "secret-code-password"
print("-----------------------------------------------------")
print("Message : ", message)
print("-----------------------------------------------------")
print("secret_key : ", secret_key)
print("-----------------------------------------------------")
encrypted_msg = k.encrypt(message, secret_key)
print("Encrypted-Message : ", encrypted_msg.decode('utf-8'))
print("-----------------------------------------------------")
print("Decrypted-Message : ", k.decrypt(encrypted_msg, secret_key).decode('utf-8'))
print("-----------------------------------------------------")
