![javascript](../../images/javascript.png)


# KriptaRSA-Javascript

An implementation of Asymmetric encryption of kriptaRSA in Javascript.

## Requirements

- node-forge (install it with `yarn add node-forge@0.9.1` )

## How to use

First you need to copy/Paste the directory kriptaRSA to your project, and then install it's dependencies by running:
```shell
# Add theese dependencies to your package.json file
#   "dependencies": {
#     "node-forge": "0.9.1"
#   }
# and run yarn install
# or in your project you just have to run :
yarn add node-forge@0.9.1
```

#### HOW TO CODE

This is how it's work in the code:

```javascript
// You import the module
import KriptaRSA from './KriptaRSA'

// You instantiate it
let k = new KriptaRSA()

// You can generate KeyPairs here:
// console.log(k.generate_RSA())

// You can set/get PublicKey or Private key :
k.setPublicKey('-----BEGIN PUBLIC KEY-----\n'+
'MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCb8Jqk7U9RMEzb4bvO63EtDTHR\n'+
'LUQg8cJD5/0OQB1yx0Tro6sWNHScn40Px5+SHQYtH9VQPAcydJ+3wS/K7gA5D+r3\n'+
'RqqJMLWV1EkXQ6U0/3QR38twXN4eP9gqI1WaAW4Fad8kiuxfaVtEmmng9BN2ccg0\n'+
'RP80PMCLjDP0gv+umwIDAQAB\n'+
'-----END PUBLIC KEY-----')

k.setPrivateKey('-----BEGIN RSA PRIVATE KEY-----\n'+
'MIICXAIBAAKBgQCb8Jqk7U9RMEzb4bvO63EtDTHRLUQg8cJD5/0OQB1yx0Tro6sW\n'+
'NHScn40Px5+SHQYtH9VQPAcydJ+3wS/K7gA5D+r3RqqJMLWV1EkXQ6U0/3QR38tw\n'+
'XN4eP9gqI1WaAW4Fad8kiuxfaVtEmmng9BN2ccg0RP80PMCLjDP0gv+umwIDAQAB\n'+
'AoGBAJPhemYJfnyZ92lWCsrR0ERPDP03ljI/0mCfcgW/m62rd5qXXbnzCNs3G4jp\n'+
'YFQqHh9Q3vP12UVp/8U8+VvSlHYMSmWH0Tzcm2G894+V5WKfPAadYnTfRWIdhZs8\n'+
'eMpKmBL/R4ITprAIapz/2JkHoXMVVhjsmvSuR/UpXb4BfmYBAkEAtvITL7Z8z2tu\n'+
'Yi8Vn5dEvqlyha1my6hVeEvPI14RYfSSJUAVROGsjfz1Gfe6jJb53DBd7rylYcSZ\n'+
'62KwGjo6gQJBANo10imgQWjX0MurYen1kWWMIOx/DotPf39gB/vfWgOdm+8j72da\n'+
'iSSHUogPQX+fPYr8W55rFZfdjkEenAIsAxsCQED/72szZlL386c03XTvdQBdChCO\n'+
'1IgljgCIxtblFD3+fHJ5u1TW7c0hBCCu0PwkpC/ki2tIYWZESP/F95XJ/IECQEpy\n'+
'KERpV0eEsch6rQob7MH/X9AvvO+MbMwxICgvWE95exTIZsoVGkrrHB4tTkRTOLTt\n'+
'SfivQguw2/Kdlc4r49cCQEgULygEDSzkkz3FD0KCy9jprYs9Pdswc5Log19kW3Ih\n'+
'ELBTlo8/pPOqTVTgJ2XNCsXrZDtkM2j0e8MiFhXhDZ0=\n'+
'-----END RSA PRIVATE KEY-----')

console.log("\nWELCOME TO KRIPTA-RSA-JAVASCRIPT")
const message = "Mon message Secret"
console.log("-----------------------------------------------------")
console.log("Message : ", message)
console.log("-----------------------------------------------------")
console.log("PublicKey : ", k.getPublicKey())
console.log("-----------------------------------------------------")
console.log("PrivateKey : ", k.getPrivateKey())
console.log("-----------------------------------------------------")
const encrypted_msg = k.encrypt(k.getPublicKey(), message)
console.log("Encrypted-Message : ", encrypted_msg)
console.log("-----------------------------------------------------")
console.log("Decrypted-Message : ", k.decrypt(encrypted_msg))
console.log("-----------------------------------------------------")
```

#### OUTPUT

This is what your code will return:
```shell
WELCOME TO KRIPTA-RSA-JAVASCRIPT
-----------------------------------------------------
Message :  Mon message Secret
-----------------------------------------------------
PublicKey :  -----BEGIN PUBLIC KEY-----
MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCb8Jqk7U9RMEzb4bvO63EtDTHR
LUQg8cJD5/0OQB1yx0Tro6sWNHScn40Px5+SHQYtH9VQPAcydJ+3wS/K7gA5D+r3
RqqJMLWV1EkXQ6U0/3QR38twXN4eP9gqI1WaAW4Fad8kiuxfaVtEmmng9BN2ccg0
RP80PMCLjDP0gv+umwIDAQAB
-----END PUBLIC KEY-----
-----------------------------------------------------
PrivateKey :  -----BEGIN RSA PRIVATE KEY-----
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
Encrypted-Message :  AIMCa0Ghdk7sNf/maerAqOjDImU2CH8sGhZGjXISqDCZ1PnkESE6JsLbXcImdw64mNXpmAl+puwvbOJOWi9WXZ1BFGde/FBsXFgYg0S7Y/gHpYKuSOX3KWhJyLdI6Rfhl1c6SiOVelHLcyXOnT3WC/a3eEka4+RZA3+vkYk4rDI=
-----------------------------------------------------
Decrypted-Message :  Mon message Secret
-----------------------------------------------------
```

## How to test

To test the Asymmetric Enryption, you just need to run :
```shell
# This command will follow what is in package.json such as launching example.js
cd KriptaRSA
yarn start
```

## Author

- Sanix darker  