
/* write a program called "CozaLozaWoza"  which print the number 1 to 110,11 number per line 
 * The program shall print "Coza" in place of the number which are multiple of 3 "Loza" for multiple of 5 
 * "Woza" for multiple of 7 "CozaLoza" for multiple of 3 and 5 and so on
 */
package itpjava;

public class CozaLozaWoza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <=110; i++) {
			boolean f=false;
			if(i%3==0) {
				System.out.print("Coza");
				f=true;
			}
			if(i%5==0) {
				System.out.print("Loza");
				f=true;
			}
			if(i%7==0) {
				System.out.print("Woza");
				f=true;
			}
			if(!f) {
				System.out.print(i);
			}
			System.out.print("  ");
			
			if(i%11==0) {
				System.out.println();
			}
			
		}
		
	}

}
