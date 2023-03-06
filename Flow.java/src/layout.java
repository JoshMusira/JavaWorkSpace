import javaX.Swing.Jlabel;
import javaX.Swing.Jtextfield;
import javaX.Swing.Jframe;
import java.awt.FlowLayout;
public class sample() {
	setLayout(new FlowLayout(FlowLayout.LEFT,10,50));
	add(new Jlabel("first Name"));
	add(new JTextfield(8));
	add(new JLabel("Last Name"));
	add(new Jextfield(8));
}

	public static void main(String[] args) {
		sample fr=new sample();
		fr.setTitle("show flow ayout");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(Jframe.EXIT_ON_Close);
		fr.=(300,400);
		fr.setVisible(true);
		// TODO Auto-generated method st;ub
	}
}
