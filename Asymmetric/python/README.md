![python](../../images/python.png)

# KriptaRSA-Python

An implementation of Asymmetric encryption of kriptaRSA in python.

## Requirements

- Python (3.X)
- pycryptodome (install it with `pip install -r requirements.txt`)

## How to use

First you need to copy/Paste the script kriptaRSA to your project, and then install its dependencies by running:
```shell
# Add pycryptodome==3.9.0 in your requirements.txt file of your project
pip install -r requirements.txt
```

#### HOW TO CODE

This is how it's work in the code:

```python
# First you call the module KriptaRSA
from KriptaRSA import KriptaRSA

# Then you instantiate it
k = KriptaRSA()

# You can generate KeyPairs here:
# print(k.generate_RSA())

# You can set/get PublicKey or Private key :
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

print("\nWELCOME TO KRIPTA-RSA-PYTHON")
message = "Mon message Secret"
print("-----------------------------------------------------")
print("Message : ", message)
print("-----------------------------------------------------")
print("PublicKey : ", k.getPublicKey())
print("-----------------------------------------------------")
print("PrivateKey : ", k.getPrivateKey())
print("-----------------------------------------------------")
encrypted_msg = k.encrypt(k.getPublicKey(), message.encode())
print("Encrypted-Message : ", encrypted_msg)
print("-----------------------------------------------------")
print("Decrypted-Message : ", k.decrypt(encrypted_msg))
print("-----------------------------------------------------")
```

#### OUTPUT

This is what your code will return:
```shell
WELCOME TO KRIPTA-RSA-PYTHON
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
Encrypted-Message :  jNsPo4YjS4QKt2BspybBodu8gX16X4mvwprMaE1HhrMv75j/q8Kg5Tzu+/dPmIxQ1zWA0Us75r3EmoKXuZu+554CDsYcXW4mAon8OkT2y04J3NPFjs9Iu/TNbpuPCTgcg7T2ONOBgqD0ClsRPz+d9Kz1IowyB0gDmSo/n17feFg=
-----------------------------------------------------
Decrypted-Message :  Mon message Secret
-----------------------------------------------------
```

## How to test

To test the Asymmetric Enryption, you just need to run :
```shell
python example.py
```

## Author

- Sanix darker  