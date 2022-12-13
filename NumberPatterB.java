package itpjava;

import java.util.Scanner;

public class NumberPatterB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		System.out.print("Enter the size :");
		int n=s.nextInt();

		for(int i=n;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(j +"  ");
			}
			System.out.println();
		}

	}

}
