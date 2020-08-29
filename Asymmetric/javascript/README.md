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
import KriptaRSA from '.'
import keypair from 'keypair'


console.log("\nWELCOME TO KRIPTA-RSA-JAVASCRIPT")

const verbose = (k, message) => {
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
}

///////////////////////////////////////////////////////////////
/////// MANUAL-MODE (You can provide your own KeyPairs) ///////
///////////////////////////////////////////////////////////////

let k = new KriptaRSA()

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

const message = "My secret messae !!!";
// We print all working process
verbose(k, message);


console.log("\n///////////////////////////////////////////////////////////////////////////////////\n")

///////////////////////////////////////////////////////////////////////////////////////
/////// OR USE THE AUTOSET-MODE(You don't have to provide manually pub/pri) ///////////
///////////////////////////////////////////////////////////////////////////////////////

let k2 = new KriptaRSA();

k2.autoSet();
const message2 = "Another secret message !";

// We print all working process
verbose(k2, message2);
```

#### OUTPUT

This is what your code will return:
```shell
WELCOME TO KRIPTA-RSA-JAVASCRIPT
-----------------------------------------------------
Message :  My secret messae !!!
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
Encrypted-Message :  WEE0DvGbgnI7tbb7N4+ws2zDNVTbqvJOJzE5y1HeFcmw4jknzXn8TiojKyp5RWWFVZmkM6moOPXlgxpkVJ7hUDCK/LP+5RVUoL8aqLXVPSIH8Pre0Xz139ZUBQkTF9WupaSC7FZKWRyGhBaVXfDxFgikAeciMqWtBtWBPlOI7C4=
-----------------------------------------------------
Decrypted-Message :  My secret messae !!!
-----------------------------------------------------
//////////////////////////////////////////////////////////
/////// - - - - - - - - - - - - - - - - - - - - - ////////
//////////////////////////////////////////////////////////
-----------------------------------------------------
Message :  Another secret message !
-----------------------------------------------------
PublicKey :  -----BEGIN RSA PUBLIC KEY-----
MIIBCgKCAQEAmwLC19ssdTJcTtqAy2YLRf1B82+QvxmQheyYc3+Lr8rY/ic3afjWWQW9tvM1
yB6O+DRJW855KrsYnecqM4kZhEjlYGEnjc+ckT65dJCToYMT61nbiPRHNph5yNGfLPSbpLhN
SuRtAqF47CwFrUA1Dgq95l7jaTjAmK2p7BTpYpVk2j/itUD/YpzCf+opbMxmvnohqWFxIOTf
4uoqAqIF3+rs9MYS4OkK56R0iy++7XmuU2OVNIdPEI8z0Gatevh5+wNeCkdjumvPY3W9vMsx
0Tk9u0uEFmGp2EDgSMi04JxNeZytuvz9VG4UgIo8dJ0AI/px2eOU45OmR7E+GrpJgwIDAQAB
-----END RSA PUBLIC KEY-----

-----------------------------------------------------
PrivateKey :  -----BEGIN RSA PRIVATE KEY-----
MIIEpAIBAAKCAQEAmwLC19ssdTJcTtqAy2YLRf1B82+QvxmQheyYc3+Lr8rY/ic3afjWWQW9
tvM1yB6O+DRJW855KrsYnecqM4kZhEjlYGEnjc+ckT65dJCToYMT61nbiPRHNph5yNGfLPSb
pLhNSuRtAqF47CwFrUA1Dgq95l7jaTjAmK2p7BTpYpVk2j/itUD/YpzCf+opbMxmvnohqWFx
IOTf4uoqAqIF3+rs9MYS4OkK56R0iy++7XmuU2OVNIdPEI8z0Gatevh5+wNeCkdjumvPY3W9
vMsx0Tk9u0uEFmGp2EDgSMi04JxNeZytuvz9VG4UgIo8dJ0AI/px2eOU45OmR7E+GrpJgwID
AQABAoIBAQCDR8NcrPLqDsy+u694k+PYUrUYRtSABFayFb7Hkq3rJBDCrtPvnB9tJb+WwkQ6
SCctbprydduIpQwkLzM+kk5aCqK5DY9COyKOoGDQp+FgWHL2UBPt2XS2eEwsF9yHZmKrDqvn
Ua5BHCAdZOsp38cPLWnHQXW4F6iFpg7TMqK2KhR8O820KaQR2DxeQE/XDVIbII0QBNW9iYHT
VXpwktFPWU5vWTWd5xy9tZO4OZJeHc+aURRp5Xza+lL3sVQVD+oQYNSQK7vVdXMAoCA3gPVW
Z01u55GnMuWaX2WjTdPuarKCWNQoVTcbijEuQ2f95Lyb5Xg8K+IAuxxIOUUH8MGBAoGBAP8x
+q2phSQ2+mlz6nEO9CIrF6knclJcMMM4yWFo+ei+QEvERdzbpXYNPr83EIiD3lF3ru91fNBS
W5468VW3ni2zPQH2A3erzo/w14GnTAIfHVV2EGTi2VMjBU1Ph4FERLvG85FZz3Vt526MXw5Z
35o/3fFEeXy0rMgWVRZFbrNXAoGBAJt/5v8/lDCAACbC9KjV2dliXxyzvOl584GPFblxq/FJ
Ue++J6Hg0thayuBvljKKJnrIOGFJSjlfRB/Lmuy6jXFmDhErzhZpKBgDK8XAxeXdhE/HPL4q
I7Hu2D521x9oZUp/d6MgakSYOM7fMHbvgpuJxlzbzBrIHdwvV4TijUu1AoGAMLl5NGk2i5iX
rUS9kYKaaF+z788hS8pgYRXZlWi2tpKEsjKyaB3j9KtIvLelx3ruGr3wP7Y984SWC5sTcxtQ
70bWsiYnuVSrZt5EN3Qa1hjcv/F/5dNOTUpVe9Jge/Tt7rBo1uq/6prmYjwY9iOAxvHEzYkW
bRIOH1HsQwlUvpcCgYAWMlS7/Mxfe/YJkmywKQ6WzEb9Zt7BiSnsRYt5VDOSFsA+c6tenSQb
xCIPlX4gKr5BapE5ueeBdwrXaw3rWtnT5Rh+9PzPECWr/8/gw5q8LDm11Z/jGUrNHGX7zKT6
k8FZuAZQ39Crh/sb9JoLcDb5ktog6TMiY4x3oL5idqBqvQKBgQC0ogHgSgYKIlnpP8xMlu/v
2KwmOfy9wfdLWRdjyut+nv5FyYTarn6X93KGdy5kfpoFSTAQ3zPpCYgtKQg32jjbQ1Pe3rjS
zlzsDB498p5lt8+Tn94PTx12KB401BnsAasIlus364Eu4EcwgGa+4wNx10qehYcri1alApCl
9UfT+w==
-----END RSA PRIVATE KEY-----

-----------------------------------------------------
Encrypted-Message :  FHejKqDH5T+y+tJB0s3VbAriLo2e/LBFyex/vmISkMiKCGZn5oSarSQsAoyiRV3HCewXiOQePKFeq1W7/BV7k6hID6yENhI3CawhEQRIkfWZUe9hQYkYpn9GDC3H++0wo1EQ71jr1KFa6XgJX1eCTqmrxpT663ZjMFjNtFZ5spiYV6Shaa1dvAwx3FUErbXeZy9v5XT2fohPdI4re8SfSFAE4mpF0JMHr4w2S3BqkvdYKHGUx8Gc+o+IbYhIw1ueok93bnGe1MATKjYMhcrlRsdya8iNxPgsSFyOP3GnTUkRLO5r2cowLwNxfnSWxsR0M4/PIjAgvLOmyFZp+rVN9Q==
-----------------------------------------------------
Decrypted-Message :  Another secret message !
-----------------------------------------------------
Done in 3.07s.
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
