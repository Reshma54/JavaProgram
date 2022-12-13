/* Write the program called SumAverageRunningInt to produce sum of 1,2,3,... to 100. store 1 and 100 in varible lowerbond and 
 * upperbound so that the 
 * 
 */


package itpjava;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int LOWER_BOUND = 1;
		final int UPPER_BOUND=3;
		
		int sum1=0,sum2=0;
		
		for (int i =LOWER_BOUND; i <=UPPER_BOUND ; i++) {
			if (i%2==0) sum1 +=i;
			else sum2+=i;		
			System.out.println("sum of odd number" +sum2);
			System.out.println("sum of even number" +sum1);
			
			int diff = sum1>sum2 ? sum1-sum2:sum2-sum1;

			System.out.println("absolut difference  " +diff);

		}
		//double avg;

		/*
		for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {
			
			sum += i;
			
		}
		
		
		
		int i = LOWER_BOUND;
		while (i <= UPPER_BOUND) {
			sum += i;
			i++;
			
		}
		
		
		
		int i= LOWER_BOUND;
		
		do {
			sum +=i;
			i++;
			
		} while (i<=UPPER_BOUND);
		
		avg =(double) sum /( UPPER_BOUND - LOWER_BOUND +1) ;
		
		 int count =0;
		 
		for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {
			sum += i;
			count ++;
			
		}
		avg =(double)sum/count;
		
		System.out.println("The sum of "+ LOWER_BOUND +" to " + UPPER_BOUND +" is "+ sum);
		System.out.println("The Averange is "+avg);
		
	}

}

		for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {

			sum+= i*i;
			
		}
		System.out.println("sum of the squares is " +sum);
		*/
	
		
	}
	
}

