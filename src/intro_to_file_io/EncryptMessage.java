package intro_to_file_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

public class EncryptMessage {
public static void main(String[] args) {
	String msg=JOptionPane.showInputDialog("Enter a mesage");
	
	StringBuilder build= new StringBuilder(msg);
	JOptionPane.showMessageDialog(null, build.reverse());
	
	String ans=JOptionPane.showInputDialog("Enter the key to decrypt the message ");
	
	if (ans.equals("reverse")) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	
	
	
	
}
}
