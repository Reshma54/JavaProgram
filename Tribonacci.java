
/* write  a program called tribonaci to produce the first 
 * 20 tribonacci number
 */
package itpjava;

public class Tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =20;
		int a=1,b=1,c=2,d;
		
		System.out.println("The first "+n+" Tribonacci number are ");
		for (int i = 1; i <=n; i++) {
			System.out.printf(a+" ");
			d = a+b+c;
			a=b;
			b=c;
			c=d;
			
		}
	}

}
