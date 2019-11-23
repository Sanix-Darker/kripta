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