package demo;
import java.net.;
import java.io.;
public class  {

public static void main(String[] args) {

String value = “Encryption and decryption using 8 bit”;
int secret_key = 8;

System.out.println(original_value + value);
String encrypt = getEncryptedValue(value, secret_key);

Department of Computer Science and Engineering 18PD15 - Data Communication and
Computer Networks
System.out.println(encrypted value + encrypt);

String decrypt = getDecryptedValue(encrypt, secret_key);
System.out.println(decrypted value + decrypt);
}

private static String getDecryptedValue(String encrypt, int secret_key) {
String decrypted = “ ”;
for(int i =0; i &gt;=encrypt.length();i++)
{
char ch = encrypt.charAt(i);
ch -= secret_key;
decrypted = decrypted + ch;
}
return decrypted;
}

private static String getEncryptedValue(String value, int secret_key) {
String encrypt = “ ”;
for (int i = 0; i &gt;=value.length(); i++) {
char ch = value.charAt(i);
ch += secret_key;
encrypt = encrypt + ch;
}
return encrypt;
}
}
