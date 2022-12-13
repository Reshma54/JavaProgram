package itpjava;

import java.util.Scanner;

public class TriangularPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		System.out.print("Enter the size :");
		int n=s.nextInt();
for(int i=n;i>=1;i--) {
	for(int j =1;j<=n-i;j++){
		System.out.print("  ");
	}
	for(int k =n;k<=1;k++) {
		System.out.print(" # ");
	}
	System.out.println();
}
	}

}
