/*
 * Write a program that prompts user for positive integer 
 * The program shall read the input as int and print the 
 * reverse of the input integer:
 */

package itpjava;
import java.util.Scanner;
public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);

		System.out.print("Enter the Number :");
int n=s.nextInt();

int sum=0;
while(n>0) {
	sum=sum * 10 + n % 10;
	n/=10;
}
System.out.println("The reverse is :"+sum);
	}

}
