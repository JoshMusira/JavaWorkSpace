package tryFunction;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name = "Judy";
//			char c = name.charAt(24);
			
			System.out.println(name.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String out of bound");
		}
		

	}

}
