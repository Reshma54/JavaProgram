/*Write a program that prompts user for the mark 
 * (between 0-100 in int) of 3 students; computes the 
 * average (in double); and prints the result rounded to
 *  2 decimal places. Your program needs to perform input
 *   validation. For examples,


 * 
 */

package itpjava;
import java.util.Scanner;
public class AverageWithInputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);

final int NOS=3;
int sum =0;
for(int i=1 ; i<=NOS ; i++) {
	int marks=0;
	boolean flag=false;
	
	do {
		System.out.printf("Enter the mark (0-100) for student %d::",i);
		marks=s.nextInt();
		
		if(marks>=0 && marks<=100) {
			flag=true;
		}
		else {
			System.out.println("Invalid input,tyr again,");
		}
	}while(!flag);
	sum +=marks;
}
float avg = (float)sum/NOS;
System.out.printf("The average is : %.2f",avg);


		
	}

}
