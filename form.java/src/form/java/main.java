package form.java;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class main extends JFrame implements ActionListener{
	private JList<String> namelist;
	private JTextField nameField;
	private JButton addButton;
	private DefaultListModel<String> nameListModel;
	
	public main() {
		
		setTitle("Displayed names are:");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nameField = new JTextField(15);
		addButton = new JButton("Enter your name: ");
		addButton.addActionListener(this);
		
		nameListModel = new DefaultListModel<String>();
		namelist = new JList<String>(nameListModel);
		
		JPanel panel = new JPanel();
		panel.add(addButton);
		panel.add(nameField);
		add(panel, BorderLayout.WEST);
		add(new JScrollPane (namelist),BorderLayout.SOUTH);
		
		setSize(500 ,400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButton) {
			String name = nameField.getText();
			if (!name.equals(" ")) {
				nameListModel.addElement(name);
				nameField.setText(" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new main();
		
	}

}
