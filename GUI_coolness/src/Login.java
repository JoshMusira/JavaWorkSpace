import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel userlabel = new JLabel("Enter Username");
		userlabel.setBounds(10, 20, 80,25);
		panel.add(userlabel);
		
		JTextField UserText = new JTextField(20);
		UserText.setBounds(100,20,165,25);
		panel.add(UserText);
		
		JLabel passwordLabel = new JLabel("Your Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		frame.setVisible(true);
		
		

	}

}
