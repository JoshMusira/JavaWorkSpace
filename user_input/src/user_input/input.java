package user_input;

import java.util.Scanner;

public class input {
	static String fname,sname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first and second name: ");
		
		fname = scan.nextLine();
		sname = scan.nextLine();
		
		//num3 = num1 + num2;
		
		System.out.println("My names are " + fname + " " + sname + ".");
		

	}

}
