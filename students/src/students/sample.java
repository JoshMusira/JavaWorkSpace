package students;

import javax.swing.JButton;
import javax.swing.JFrame;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame ("students details");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JButton jb = new JButton("OK");
		frame.add(jb);

	}

}
