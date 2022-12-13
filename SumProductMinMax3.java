/*
 * 
 * Write a program called SumProductMinMax3 that prompts
 *  user for three integers. The program shall read the 
 as int; compute the sum, product, minimum and maximum of 
 the three integers; and print the results. 


 */

package itpjava;
import java.util.Scanner;

public class SumProductMinMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int n1,n2,n3;
		//int sum,product,min,max;
		
		Scanner s = new Scanner (System.in); //object of scanner
		
		System.out.print("Enter first integer ");
				int n1= s.nextInt();
				
				System.out.print("Enter second integer ");
				int n2=s.nextInt();

				System.out.print("Enter third integer ");
				int n3=s.nextInt();
				
				int sum =n1+n2+n3;
				int product =n1*n2*n3;
				
				int min=n1;
				
				if(n2<min) {
					min=n2;
				}
				
				if(n3<min) {
					min=n3;
				}
				
				
				int max=n1;
				
				if(n2>max) {
					max=n2;
				}
				
				if(n3>max) {
					max=n3;
				}
				
				
				System.out.println(" The sum is "+sum);
				System.out.println(" The product is "+product);
				System.out.println(" The min is "+min);
				System.out.println(" The max is "+max);


		
		//in.close();
		
	}

}
