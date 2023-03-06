package pesh;

import javax.swing.JButton;
import javax.swing.JFrame;

public class start {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame =new JFrame("title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
		JButton button =new JButton("ok");
		frame.add(button);
				
		frame.setVisible(true);
	}

}
;