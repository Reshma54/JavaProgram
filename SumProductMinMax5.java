package itpjava;

import java.util.Scanner;

public class SumProductMinMax5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner s = new Scanner (System.in); //object of scanner
		
		System.out.print("Enter first integer ");
				int n1= s.nextInt();
				
				System.out.print("Enter second integer ");
				int n2=s.nextInt();

				System.out.print("Enter third integer ");
				int n3=s.nextInt();
				
				System.out.print("Enter forth integer ");
				int n4=s.nextInt();
				
				System.out.print("Enter fifth integer ");
				int n5=s.nextInt();


				int sum =n1+n2+n3+n4+n5;
				int product =n1*n2*n3;
				
				int min=n1;
				
				if(n2<min) {
					min=n2;
				}
				
				if(n3<min) {
					min=n3;
				}
				
				if(n4<min) {
					min=n4;
				}
				if(n5<min) {
					min=n5;
				}
				
				
				int max=n1;
				
				if(n2>max) {
					max=n2;
				}
				
				if(n3>max) {
					max=n3;
				}
				if(n4>max) {
					max=n4;
				}
				if(n5>max) {
					max=n5;
				}
				
				System.out.println(" The sum is "+sum);
				System.out.println(" The product is "+product);
				System.out.println(" The min is "+min);
				System.out.println(" The max is "+max);


		
		//in.close();
		

	}

}
