/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */


package itpjava;
import java.util.Scanner;
public class TriangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.print("Enter the size :");
int n=s.nextInt();

for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++) {
		System.out.print(" # ");
	}
	System.out.println();
}

	}

}
