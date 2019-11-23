
package kripta;

import java.io.IOException;
import java.io.StringReader;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;


import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;

//// Encode data on your side using BASE64
//byte[] bytesEncoded = Base64.encodeBase64(str.getBytes());
//System.out.println("encoded value is " + new String(bytesEncoded));
//
//// Decode data on other side, by processing encoded data
//byte[] valueDecoded = Base64.decodeBase64(bytesEncoded);
//System.out.println("Decoded value is " + new String(valueDecoded));

/**
 *
 * @author Sanix-darker
 */

public class KriptaRSA {

    private int keysize = 1024;
    private String public_key = "-";
    private String private_key = "-";
    
    private static final String PUBLIC_KEY_HEADER = "-----BEGIN PUBLIC KEY-----";
    private static final String PUBLIC_KEY_FOOTER = "-----END PUBLIC KEY-----";
    
    private static final String RSA_CONFIGURATION = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
    private static final String RSA_PROVIDER = "SunJCE";

    /**
     * A Setter for the keysize
     * @param m
     */
    public void setKeySize(int m) {
      // set passed parameter as name
      this.keysize = m;
    }
    /**
     * A getter for the keysize param
     * @return
     */
    public int getKeySize() {
      // return the set name
      return this.keysize;
    }

    
    /**
     * A Setter for the public_key
     * @param m
     */
    public void setPublicKey(String m) {
      // set passed parameter as name
      this.public_key = m;
    }
    /**
     * A getter for the public_key param
     * @return
     */
    public String getPublicKey() {
      // return the set name
      return this.public_key;
    }
    

    /**
     * A Setter for the private_key
     * @param m
     */
    public void setPrivateKey(String m) {
      // set passed parameter as name
      this.private_key = m;
    }
    /**
     * A getter for the private_key param
     * @return
     */
    public String getPrivateKey() {
      // return the set name
      return this.private_key;
    }

    
    public KeyPair generateRsaKeyPair(int keySize) throws Exception {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(keySize);
        return kpg.generateKeyPair();
    }

    public String createStringFromPublicKey(Key publicKey) throws Exception {
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(publicKey.getEncoded());
        return PUBLIC_KEY_HEADER + new String(Base64.encodeBase64(x509EncodedKeySpec.getEncoded()), "UTF-8")
                + PUBLIC_KEY_FOOTER;
    }
    public PublicKey createPublicKeyFromString(String publicKeyString) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        publicKeyString = publicKeyString.replace(PUBLIC_KEY_HEADER, "");
        publicKeyString = publicKeyString.replace(PUBLIC_KEY_FOOTER, "");
        return keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decodeBase64(publicKeyString.getBytes())));
    }

//    public PrivateKey createPrivateKeyFromString(String privateKeyString) throws Exception {
//        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//        privateKeyString = privateKeyString.replace(PRIVATE_KEY_HEADER, "");
//        privateKeyString = privateKeyString.replace(PRIVATE_KEY_FOOTER, "");
//        
////        // getting byte data of private key 
////        byte[] KeyBytes = privateKeyString.getBytes(); 
////        // creating keyspec object 
////        EncodedKeySpec KeySpec  = new PKCS8EncodedKeySpec( KeyBytes);
//        return keyFactory.generatePrivate( new PKCS8EncodedKeySpec( Base64.decodeBase64( privateKeyString.getBytes() ) ) );
//    }
//    
    private PrivateKey getPrivateKeyFromString(String privateKeyString) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
        RSAPrivateKey privKey = null;
        try {
            Security.addProvider(new BouncyCastleProvider());
            PemObject pem = new PemReader(new StringReader(privateKeyString)).readPemObject();
            byte[] der = pem.getContent();
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PKCS8EncodedKeySpec ks = new PKCS8EncodedKeySpec(der);
            privKey = (RSAPrivateKey) keyFactory.generatePrivate(ks);
        }catch(Exception err){
            System.out.println(err);
        }
        return privKey;
   }
    
    
    public String encrypt(String public_key, String clearText) throws Exception {
        Key key = this.createPublicKeyFromString(public_key);  
        
        Cipher c = Cipher.getInstance(RSA_CONFIGURATION, RSA_PROVIDER);
        c.init(Cipher.ENCRYPT_MODE, key, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256,
                PSource.PSpecified.DEFAULT));
        byte[] encodedBytes = Base64.encodeBase64(c.doFinal(clearText.getBytes("UTF-8")));
        String cipherText = new String(encodedBytes, "UTF-8");
        return cipherText;
    }
    
    public String decrypt(String base64cypherText) throws Exception {
        Key key = this.getPrivateKeyFromString(this.getPrivateKey());  
        
        Cipher c = Cipher.getInstance(RSA_CONFIGURATION , RSA_PROVIDER);
        c.init(Cipher.DECRYPT_MODE, key, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256,
                PSource.PSpecified.DEFAULT));
        byte[] decodedBytes = c.doFinal(Base64.decodeBase64(base64cypherText.getBytes("UTF-8")));
        String clearText = new String(decodedBytes, "UTF-8");
        return clearText;
    }
}

