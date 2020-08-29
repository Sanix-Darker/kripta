![java](../../images/java.png)


# KriptaRSA-Java

An implementation of Asymmetric encryption of kriptaRSA in Java.

## Requirements

- There are some externals lib to import to the project, availables on `./KriptaRSA/lib/`

## How to use

#### HOW TO CODE

This is how it's work in the code:

```java
package kripta;
public class Example {

    public static void main(String args[]) throws Exception {

        // Instantiate the KriptaRSA
        KriptaRSA k = new KriptaRSA();

        // You can generate KeyPairs here:
        // System.out.println(k.generate_RSA())

        // You can set/get PublicKey or Private key :
        k.setPublicKey("-----BEGIN PUBLIC KEY-----\n"+
        "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCb8Jqk7U9RMEzb4bvO63EtDTHR\n"+
        "LUQg8cJD5/0OQB1yx0Tro6sWNHScn40Px5+SHQYtH9VQPAcydJ+3wS/K7gA5D+r3\n"+
        "RqqJMLWV1EkXQ6U0/3QR38twXN4eP9gqI1WaAW4Fad8kiuxfaVtEmmng9BN2ccg0\n"+
        "RP80PMCLjDP0gv+umwIDAQAB\n"+
        "-----END PUBLIC KEY-----");

        k.setPrivateKey("-----BEGIN RSA PRIVATE KEY-----\n"+
        "MIICXAIBAAKBgQCb8Jqk7U9RMEzb4bvO63EtDTHRLUQg8cJD5/0OQB1yx0Tro6sW\n"+
        "NHScn40Px5+SHQYtH9VQPAcydJ+3wS/K7gA5D+r3RqqJMLWV1EkXQ6U0/3QR38tw\n"+
        "XN4eP9gqI1WaAW4Fad8kiuxfaVtEmmng9BN2ccg0RP80PMCLjDP0gv+umwIDAQAB\n"+
        "AoGBAJPhemYJfnyZ92lWCsrR0ERPDP03ljI/0mCfcgW/m62rd5qXXbnzCNs3G4jp\n"+
        "YFQqHh9Q3vP12UVp/8U8+VvSlHYMSmWH0Tzcm2G894+V5WKfPAadYnTfRWIdhZs8\n"+
        "eMpKmBL/R4ITprAIapz/2JkHoXMVVhjsmvSuR/UpXb4BfmYBAkEAtvITL7Z8z2tu\n"+
        "Yi8Vn5dEvqlyha1my6hVeEvPI14RYfSSJUAVROGsjfz1Gfe6jJb53DBd7rylYcSZ\n"+
        "62KwGjo6gQJBANo10imgQWjX0MurYen1kWWMIOx/DotPf39gB/vfWgOdm+8j72da\n"+
        "iSSHUogPQX+fPYr8W55rFZfdjkEenAIsAxsCQED/72szZlL386c03XTvdQBdChCO\n"+
        "1IgljgCIxtblFD3+fHJ5u1TW7c0hBCCu0PwkpC/ki2tIYWZESP/F95XJ/IECQEpy\n"+
        "KERpV0eEsch6rQob7MH/X9AvvO+MbMwxICgvWE95exTIZsoVGkrrHB4tTkRTOLTt\n"+
        "SfivQguw2/Kdlc4r49cCQEgULygEDSzkkz3FD0KCy9jprYs9Pdswc5Log19kW3Ih\n"+
        "ELBTlo8/pPOqTVTgJ2XNCsXrZDtkM2j0e8MiFhXhDZ0=\n"+
        "-----END RSA PRIVATE KEY-----");

        System.out.println("\nWELCOME TO KRIPTA-RSA-JAVA");
        String message = "Mon message Secret";
        System.out.println("-----------------------------------------------------");
        System.out.println("Message : "+ message);
        System.out.println("-----------------------------------------------------");
        System.out.println("PublicKey : "+ k.getPublicKey());
        System.out.println("-----------------------------------------------------");
        System.out.println("PrivateKey : "+ k.getPrivateKey());
        System.out.println("-----------------------------------------------------");
        String encrypted_msg = k.encrypt(k.getPublicKey(), message);
        System.out.println("Encrypted-Message : "+ encrypted_msg);
        System.out.println("-----------------------------------------------------");
        System.out.println("Decrypted-Message : "+ k.decrypt(encrypted_msg));
        System.out.println("-----------------------------------------------------");
    }
    
}
```

#### OUTPUT

This is what your code will return:
```shell
WELCOME TO KRIPTA-RSA-JAVA
-----------------------------------------------------
Message : Mon message Secret
-----------------------------------------------------
PublicKey : -----BEGIN PUBLIC KEY-----
MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCb8Jqk7U9RMEzb4bvO63EtDTHR
LUQg8cJD5/0OQB1yx0Tro6sWNHScn40Px5+SHQYtH9VQPAcydJ+3wS/K7gA5D+r3
RqqJMLWV1EkXQ6U0/3QR38twXN4eP9gqI1WaAW4Fad8kiuxfaVtEmmng9BN2ccg0
RP80PMCLjDP0gv+umwIDAQAB
-----END PUBLIC KEY-----
-----------------------------------------------------
PrivateKey : -----BEGIN RSA PRIVATE KEY-----
MIICXAIBAAKBgQCb8Jqk7U9RMEzb4bvO63EtDTHRLUQg8cJD5/0OQB1yx0Tro6sW
NHScn40Px5+SHQYtH9VQPAcydJ+3wS/K7gA5D+r3RqqJMLWV1EkXQ6U0/3QR38tw
XN4eP9gqI1WaAW4Fad8kiuxfaVtEmmng9BN2ccg0RP80PMCLjDP0gv+umwIDAQAB
AoGBAJPhemYJfnyZ92lWCsrR0ERPDP03ljI/0mCfcgW/m62rd5qXXbnzCNs3G4jp
YFQqHh9Q3vP12UVp/8U8+VvSlHYMSmWH0Tzcm2G894+V5WKfPAadYnTfRWIdhZs8
eMpKmBL/R4ITprAIapz/2JkHoXMVVhjsmvSuR/UpXb4BfmYBAkEAtvITL7Z8z2tu
Yi8Vn5dEvqlyha1my6hVeEvPI14RYfSSJUAVROGsjfz1Gfe6jJb53DBd7rylYcSZ
62KwGjo6gQJBANo10imgQWjX0MurYen1kWWMIOx/DotPf39gB/vfWgOdm+8j72da
iSSHUogPQX+fPYr8W55rFZfdjkEenAIsAxsCQED/72szZlL386c03XTvdQBdChCO
1IgljgCIxtblFD3+fHJ5u1TW7c0hBCCu0PwkpC/ki2tIYWZESP/F95XJ/IECQEpy
KERpV0eEsch6rQob7MH/X9AvvO+MbMwxICgvWE95exTIZsoVGkrrHB4tTkRTOLTt
SfivQguw2/Kdlc4r49cCQEgULygEDSzkkz3FD0KCy9jprYs9Pdswc5Log19kW3Ih
ELBTlo8/pPOqTVTgJ2XNCsXrZDtkM2j0e8MiFhXhDZ0=
-----END RSA PRIVATE KEY-----
-----------------------------------------------------
Encrypted-Message : MWHE4hOKnZxTiEqgZ0YwAq5ZrL7OD01E96Vkjtjryf0jL+GUFOfK7wBM3yhlAOOtFThkiXP4Vo1pOZDqzYIw6CL7cOv3aTu8dM6QDDSgae3LbPvY9aCe/eLYrLcsMAqxlInvm+PYCrKsBimgqugrCQPuPp6CRPwE281fdTaZBqA=
-----------------------------------------------------
Decrypted-Message : Mon message Secret
-----------------------------------------------------
```

## How to test

This java project is a NetBeans project, so just open it and Run:


## Author

- Sanix darker  