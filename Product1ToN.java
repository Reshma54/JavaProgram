package itpjava;

public class Product1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int LOWER_BOUND=1;
		final int UPPER_BOUND=10;
		
		int product =1;
		
		for (int i = LOWER_BOUND; i <=UPPER_BOUND; i++) {
			product *=i;
			
		}
		System.out.printf("product of %d to %d is %d",
				LOWER_BOUND,UPPER_BOUND,product);
	}

}
