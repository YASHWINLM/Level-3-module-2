package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoListTracker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel pane = new JPanel();
	JButton but = new JButton();
	JButton but2 = new JButton();
	JButton but3 = new JButton();
	JButton but4 = new JButton();
	ArrayList<String> tasks = new ArrayList<String>();

	public static void main(String[] args) {
		ToDoListTracker todo = new ToDoListTracker();
		todo.run();

	}

	private void run() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

		but.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);

		but.setText("Add Task");
		but2.setText("Remove Task");
		but3.setText("Save Current Tasks");
		but4.setText("Load Current Tasks");

		frame.pack();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == but) {
			String s = JOptionPane.showInputDialog("Enter task");
			s.trim();
			tasks.add(s);

		} else if (e.getSource() == but2) {
			JOptionPane.showMessageDialog(null, tasks);
			String s = JOptionPane.showInputDialog("Which task do you want to remove?").trim();

			if (tasks.remove(s)) {
				JOptionPane.showMessageDialog(null, "Task removed " + tasks);

			} else {
				JOptionPane.showMessageDialog(null, "Task not found");

			}

		} else if (e.getSource() == but3) {
			try {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Tasks.txt"));
				out.writeUnshared(tasks);
				out.close();

			} catch (IOException f) {
				f.printStackTrace();
			}

		}
		else if(e.getSource()== but4) {
			try{ObjectInputStream in = new ObjectInputStream(new FileInputStream("Tasks.txt"));
			tasks = (ArrayList<String>) in.readUnshared();
			in.close();
			JOptionPane.showMessageDialog(null, tasks);
			}catch(IOException | ReflectiveOperationException f){
				f.printStackTrace();
				
			}
			
		}

	}
}
