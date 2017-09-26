package intro_to_file_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

public class EncryptMessage {
public static void main(String[] args) {
	String msg=JOptionPane.showInputDialog("Enter a mesage");
	
	
	try {
		
		//did you know that the legendary Lucas Baizer wrote this?
	KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
    SecretKeySpec myDesKey = new SecretKeySpec("hello".getBytes(), "DES");
   
    String ss= new String( myDesKey.getEncoded()+" this is the key");
    System.out.println(ss);
    
    Cipher desCipher;
    desCipher = Cipher.getInstance("DES");
    
    byte[] text= msg.getBytes("UTF8");
    
    desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
     byte[]textEncrypted = desCipher.doFinal(text);

     String s = new String(textEncrypted);
   

     FileWriter fw= new FileWriter("EncryptedText.txt");
		fw.write(s);
		fw.close();
	
	}catch(Exception e){
		System.out.println(e.getMessage());
		
	}
}
}
