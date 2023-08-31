package Training;

import java.util.Scanner;

public class grade_example {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a grade (A,B,C,D or F)-");
		char grade=sc.next().charAt(0);
		
		if(grade=='A')
		{
			System.out.println("Excellent job!!!");
			
		}
		else if(grade=='B')
		{
			System.out.println("Good Job!!!!");
		}
		else if(grade=='C')
		{
			System.out.println("Average Job!!!!");
		}
		else if(grade=='D')
		{
			System.out.println("Needs improvement");
			
		}
		else if(grade=='F')
		{
			System.out.println("Failed.");
		}
		else
		{
			System.out.println("Invalid grade.");
		}

	}

}
