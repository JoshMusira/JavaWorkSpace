/**
 * 
 */
package user_login;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

/**
 * @author CMB-Ken
 *
 */
public class brocode {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image = new ImageIcon("image.JPEG");//create an image icon
		
		JLabel label = new JLabel();
		label.setText("Showing great work in writing code");
		label.setIcon(image);
		
		
		JFrame  frame = new JFrame();
		frame.setTitle("Learning from Bro Code.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.add(label);

		
		
		frame.setIconImage(image.getImage());//Change icon of the frame
		frame.getContentPane().setBackground(Color.gray);//changes background color
		
	}

}