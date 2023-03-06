package checkBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class food extends JFrame implements ActionListener {
	JLabel lb;
	JCheckBox cb1,cb2,cb3;
	JButton bn;
	food(){
		  	lb = new JLabel("Food Ordering System");  
	        lb.setBounds(50,50,300,20);  
	        
	        cb1 = new JCheckBox("Pizza @ 900");  
	        cb1.setBounds(100,100,150,20);  
	        cb2 = new JCheckBox("Burger @ 400");  
	        cb2.setBounds(100,150,150,20);  
	        cb3 = new JCheckBox("Tea @ 80");  
	        cb3.setBounds(100,200,150,20);  
	        
	        bn = new JButton("Order");  
	        bn.setBounds(100,250,80,30);  
	        bn.addActionListener(this);  
	        
	        add(lb);add(cb1);add(cb2);add(cb3);add(bn);  
	        setSize(400,400);  
	        setLayout(null);  
	        setVisible(true);  
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 	float amount=0;  
	        String msg=""; 
	        
	        if(cb1.isSelected()){  
	            amount+=900;  
	            msg="Pizza: 900\n";  
	        }  
	        if(cb2.isSelected()){  
	            amount+=400;  
	            msg+="Burger: 400\n";  
	        }  
	        if(cb3.isSelected()){  
	            amount+=80;  
	            msg+="Tea: 80\n";  
	        }  
	        msg+="-----------------\n";  
	        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new food();

	}



}
