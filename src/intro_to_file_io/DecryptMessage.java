package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class DecryptMessage {
	public static void main(String[] args) {
		String pass = JOptionPane.showInputDialog("Enter the  secret passwors to decrypt the message");
		if (pass.equals("password")) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("EncryptedText.txt"));

				String line = br.readLine();
				String msg = "";
				while (line != null) {

					for (int i = 0; i < line.length(); i++) {
						msg += (char) (line.charAt(i) / 5);
					}
					line = br.readLine();

				}
				JOptionPane.showMessageDialog(null, msg);
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}

	}
}
