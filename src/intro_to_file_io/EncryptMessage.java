package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class EncryptMessage {
	public static void main(String[] args) {
		String msg = JOptionPane.showInputDialog("Enter a mesage");
		String Emsg = "";

		for (int i = 0; i < msg.length(); i++) {
			Emsg += (char) (msg.charAt(i) * 5);
		}
		JOptionPane.showMessageDialog(null, "Message Encrypted: " + Emsg);

		try {
			FileWriter fw = new FileWriter("EncryptedText.txt");

			fw.write(Emsg);

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
