![java](../../images/java.png)

# KriptaAES-Java

An implementation of Symmetric encryption of kriptaAES in Java.

## Requirements

- There is any  library for this project :-) !

## How to use

#### HOW TO CODE

This is how it's work in the code:

```java
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
```

#### OUTPUT

This is what your code will return:
```shell
WELCOME TO KRIPTA-AES-JAVA
-----------------------------------------------------
Message : Mon message Secret
-----------------------------------------------------
secret_key : secret-code-password
-----------------------------------------------------
Encrypted-Message : 3vcZmZeSEzLdBsDOfESYgXUOOvljMzo2lhrn20VI+eiMgBxkLXAtVIOBIiUs3bOpm6RPCz3RahPmnGD9I9c911SUzonVucGxKYgyaRj/uAyGremAaeSjFxxMt1M/E3eJ
-----------------------------------------------------
Decrypted-Message : Mon message Secret
-----------------------------------------------------
```

## How to test

This java project is a NetBeans project, so just open it and Run:

## Author

- Sanix darker  