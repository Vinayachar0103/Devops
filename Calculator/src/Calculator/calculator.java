package Calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first , second , add , sub , multiply;
		float divide;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("enter two numbers");
		first=scanner.nextInt();
		second=scanner.nextInt();
		
		add=first+second;
				sub=first-second;
				multiply=first*second;
				divide=(float) first/second;
				System.out.println("Sum="+add);
				System.out.println("difference="+sub);
				System.out.println("multiplication="+multiply);
				System.out.println("division="+divide);}

}
