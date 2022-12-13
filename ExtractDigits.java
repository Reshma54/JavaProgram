/*
 * Write a program called ExtractDigits to extract each
 *  digit from an int, in the reverse order.
 *   For example, if the int is 15423, the output shall
 *    be "3 2 4 5 1", with a space separating the digits.


 */

package itpjava;

public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =15432;
		
		while(n>0) {
			System.out.print(n%10 +" ");
			
			//int digit =n% 10;
			
			
			n = n/10;
		}
	}

}
