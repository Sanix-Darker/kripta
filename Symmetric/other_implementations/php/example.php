<?php 

include("../KriptaAES.php");

$k = new KriptaAES;
$message = "Mon message Secret";
$secret_key = "secret-code-password";

echo "\nWELCOME TO KRIPTA-AES-PHP";

echo "-----------------------------------------------------";
echo "Message : ". $message;
echo "-----------------------------------------------------";
echo "secret_key : ". $secret_key;
echo "-----------------------------------------------------";

$encrypted_msg = k.encrypt(message, secret_key);

echo "Encrypted-Message : ". $encrypted_msg;
echo "-----------------------------------------------------";
echo "Decrypted-Message : ". k.decrypt($encrypted_msg, $secret_key);
echo "-----------------------------------------------------";

?>