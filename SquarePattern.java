package itpjava;
import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
		//int n;
System.out.print("Enter the size :");
		int n=s.nextInt();

		for( int i=1;i<=n ;i++) {
			
			if(i%2==0) {
				System.out.print(" ");
			}
		
		for(int j=1;j<=n ; j++) {
			System.out.print(" # ");
		}
			
		//}
		System.out.println();
	}
		
	}
}
