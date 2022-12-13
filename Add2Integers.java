/*
Write a program called Add2Integers that prompts user to
enter two integers. The program shall read the two integers 
as int; compute their sum; and print the result.
For example,
*/


package itpjava;
import java.util.Scanner;

public class Add2Integers {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter the integer :");
		int a = s.nextInt();
		
		System.out.print("Enter the second integer:");
		
		int b =s.nextInt();
		
		int c =a+b;
		System.out.println("The sum is :"+c);
		
		
	}

}
