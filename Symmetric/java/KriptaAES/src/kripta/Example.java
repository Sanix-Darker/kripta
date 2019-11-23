package kripta;
public class Example {
    public static void main(String args[]) throws Exception {

        // Instantiate the KriptaRSA
        KriptaAES k = new KriptaAES();

        System.out.println("\nWELCOME TO KRIPTA-AES-JAVA");
        String message = "Mon message Secret";
        String secret_key = "secret-code-password";
        System.out.println("-----------------------------------------------------");
        System.out.println("Message : "+ message);
        System.out.println("-----------------------------------------------------");
        System.out.println("secret_key : "+ secret_key);
        System.out.println("-----------------------------------------------------");
        byte[] encrypted_msg = k.encrypt(message, secret_key);
        System.out.println("Encrypted-Message : "+ new String(encrypted_msg));
        System.out.println("-----------------------------------------------------");
        System.out.println("Decrypted-Message : "+ new String(k.decrypt(encrypted_msg, secret_key)));
        System.out.println("-----------------------------------------------------");
    }
}