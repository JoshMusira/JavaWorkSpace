package joshua.java;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

 class musira{



	public static void main(String[] args) {
		
		JTextArea area;
		area =new JTextArea();
		area.setBounds(60,40,350,50);
		area.setEditable(false);
		area.setLineWrap(true);
		
		JFrame f=new JFrame("Button Example");  
		JLabel lb1,lb2,lb3;
		lb1 = new JLabel("Fname: ");
		lb2 = new JLabel("Sname: ");
		lb3 = new JLabel("TextArea");
		
		lb2.setBounds(50,130,150,20);
		lb1.setBounds(50,100,150,20);
		lb3.setBounds(0,40,150,20);
		
		JTextField input1,input2;
//		field = new JTextField();
		input1 = new JTextField();
		input2 = new JTextField();
//		field.setBounds(50,50, 150,20); 
		input1.setBounds(100,100,150,20);
		input2.setBounds(100,130,150,20);

		JButton b=new JButton(new ImageIcon("C:\\Users\\CMB-Ken\\OneDrive\\Pictures\\mLogo.jfif"));  
		b.setBounds(200,250,100, 40); 
		
		b.addActionListener( new ActionListener() {
			

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					area.setText("AM doing a great work in working with the JavatPoint Tutorials site in gainning more knowkledge in java so that i can better myself in my work.");
				
		}
				
				});
		
		f.add(area);
		f.add(lb3);
		f.add(input1);
		f.add(input2);
		f.add(lb1);
		f.add(lb2);
		f.add(b);    
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setLayout(null);    
		f.setVisible(true);    
		
	}

}
