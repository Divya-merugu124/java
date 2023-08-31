package Training;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//Factorial of a given number
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a= scanner.nextInt();
		int factorial=1;
		int i= a;
		while(i>1)
		{
			factorial *=i;
			i--;
		}
		System.out.println("Factorial of " + a +  " is "  + factorial);
		

	}

}
