package itpjava;

import java.util.Scanner;

public class BoxPatternA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		System.out.print("Enter the size :");
		int n=s.nextInt();

		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n ;j++) {
				
			 if(i==1 || i==n || j==1 || j==n) {
				 System.out.print(" # ");
			 }else { 
				 System.out.print("   ");
			 }
			}
			System.out.println();
		}
		
			
			//if(i ==1 || i==n ||)
	}

}
