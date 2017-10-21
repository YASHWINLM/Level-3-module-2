package intro_to_file_io;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoListTracker {
	public static void main(String[] args) {
		ToDoListTracker todo = new ToDoListTracker();
		todo.run();
	}

	private void run() {
		JFrame frame = new JFrame();
		JPanel pane = new JPanel();
		JButton but = new JButton();
		JButton but2 = new JButton();
		JButton but3 = new JButton();
		JButton but4 = new JButton();

		frame.add(pane);
		pane.add(but4);
		pane.add(but3);
		pane.add(but2);
		pane.add(but);

		frame.setVisible(true);
		pane.setVisible(true);
		but.setVisible(true);
		but2.setVisible(true);
		but3.setVisible(true);
		but4.setVisible(true);

	}
}
