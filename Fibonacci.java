/* Write a program called Fibonacci to print the first 20 fibonacci
 * number f(n) where f(n)=f(n-1)+f(n-2) and f(1) = f(2)=1 aslo compute their
 * average.
 * */


package itpjava;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=20;
		int a=1 , b =1,c;
		System.out.println("The first "+n+" fibonacci number are :");
		
		double sum =0;
		for(int i=1 ; i<=n ; i++) {
			sum+= a;
			System.out.print(a+" ");
			c = a+b;
			a= b;
			b = c;
			
		}
		System.out.println();
		System.out.println("The average is " +sum/n);
		
	}

}
