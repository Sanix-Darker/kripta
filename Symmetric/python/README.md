![python](../../images/python.png)

# KriptaAES-Python

An implementation of Symmetric encryption of kriptaAES in python.

## Requirements

- Python (3.X)
- pycryptodome (install it with `pip install -r requirements.txt`)

## How to use

First you need to copy/Paste the script KriptaAES to your project, and then install its dependencies by running:
```shell
# Add pycryptodome==3.9.0 in your requirements.txt file of your project
pip install -r requirements.txt
```

#### HOW TO CODE

This is how it's work in the code:

```python
# First you call the module KriptaRSA
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

## You can also :
# encrypt/decrypt files with KriptaAES
# set a master_key
# sign a file
# Verify a file + some interesting methods :-)
## Consult the main class or contact the author for more informations.
```

#### OUTPUT

This is what your code will return:
```shell
WELCOME TO KRIPTA-AES-PYTHON
-----------------------------------------------------
Message :  Mon message Secret
-----------------------------------------------------
secret_key :  secret-code-password
-----------------------------------------------------
Encrypted-Message :  OyIdlFlruPcoFvcrwg424e8Sfa29KjGeUfof6NqI1Mxn29Ch5JO3obAHdLQ5CJM1bfXU4HlhtZZEQMcdlkth37mjEIJVdlwil6nOnoPF5I67O6A1Fv+IcvI21Xpw9nJs
-----------------------------------------------------
Decrypted-Message :  Mon message Secret
-----------------------------------------------------
```

## How to test

To test the Symmetric Enryption, you just need to run :
```shell
python example.py
```

## Author

- Sanix darker
