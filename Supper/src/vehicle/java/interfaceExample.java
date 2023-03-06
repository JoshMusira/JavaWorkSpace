package vehicle.java;


	interface pen{
	String type = "Obama";
	String color = "blue";
	void writes();
	void click();
	}
//	  final int age = 99;
//	static int a =7;
//	static int b =9;
//	
//	public void test( int a, int b) {
//		this.a = a;
//		this.b = b;
//		
//	}
public class interfaceExample implements pen{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(color);
		System.out.println(type);
		interfaceExample ex = new interfaceExample();
		ex.writes();
		ex.click();
	}
		
//		vehicle v = new vehicle();
//		System.out.println(v.age);
		
//		vehicle t = new vehicle();
		
//		test(7,6);
//		System.out.println(a);
//		System.out.println(b);
//		

	

	@Override
	public void writes() {
		// TODO Auto-generated method stub
		System.out.println("Writes very smooth.");
		
		}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println(" Click to true");
	}
}

	
