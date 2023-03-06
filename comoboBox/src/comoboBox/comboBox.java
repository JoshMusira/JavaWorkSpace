package comoboBox;
	import javax.swing.*;
public class comboBox {
	JFrame f;
	
	comboBox(){
		
			f=new JFrame("ComboBox Example");    
		    String country[]={"Kenya","Uganda", "Tanzania","Rwanda","Burundi"}; 
		    
		    JComboBox cb= new JComboBox(country);    
		    cb.setBounds(50, 50,90,20);  
		    
		    f.add(cb);        
		    f.setLayout(null);    
		    f.setSize(400,500);    
		    f.setVisible(true);         
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new comboBox();
	}

}
