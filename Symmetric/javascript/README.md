![javascript](../../images/javascript.png)

# KriptaAES-Javascript

An implementation of Symmetric encryption of KriptaAES in Javascript.

## Requirements

- crypto@1.0.1
- fs@0.0.1-security

## How to use

First you need to copy/Paste the directory KriptaAES to your project, and then install its dependencies by running:
```shell

# Add theese dependencies to your package.json file
#   "dependencies": {
#     "crypto": "1.0.1",
#     "fs": "0.0.1-security"
#   }
# and run yarn install
# or install them manually :
cd KriptaAES
yarn add fs@0.0.1-security
yarn add crypto@1.0.1
```

#### HOW TO CODE

This is how it's work in the code:

```javascript
//First you call the module KriptaRSA
import KriptaAES from ".";

let k = new KriptaAES()

console.log("\nWELCOME TO KRIPTA-AES-JAVASCRIPT")
const message = "Mon message Secret"
const secret_key = "secret-code-password"
console.log("-----------------------------------------------------")
console.log("Message : ", message)
console.log("-----------------------------------------------------")
console.log("secret_key : ", secret_key)
console.log("-----------------------------------------------------")
const encrypted_msg = k.encrypt(message, secret_key)
console.log("Encrypted-Message : ", encrypted_msg)
console.log("-----------------------------------------------------")
console.log("Decrypted-Message : ", k.decrypt(encrypted_msg, secret_key).toString())
console.log("-----------------------------------------------------")

/** You can also :
* encrypt/decrypt files with KriptaAES
* set a master_key
* sign a file
* Verify a file + some interesting methods :-)
** Consult the main class or contact the author for more informations./
```

#### OUTPUT

This is what your code will return:
```shell
WELCOME TO KRIPTA-AES-JAVASCRIPT
-----------------------------------------------------
Message :  Mon message Secret
-----------------------------------------------------
secret_key :  secret-code-password
-----------------------------------------------------
Encrypted-Message :  QS5noMUQCA2uX6gpaMusIKMNTjuxVWf2tpapPN7qda4HEEZVWwppbxqdWhLB/wqtuR9AIB5u1tKU9DTkBXRMJFPy1azIMmmabk2voEEIvtawFN4qhdsGHTOeSDu/wWcH
-----------------------------------------------------
Decrypted-Message :  Mon message Secret
-----------------------------------------------------
Done in 0.92s.
```

## How to test

To test the Symmetric Enryption, you just need to run :
```shell
# This command will follow what is in package.json such as launching example.js
cd KriptaAES
yarn start
```

## Author

- Sanix darker  