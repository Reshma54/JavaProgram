package HWProgram;
import java.util.*;

class as{

	public static int length;
	
}

public class InvalidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,cnt=0,sum=0;
		for(int i=0; i<as.length ;i++) {
			try {
				String[] as = null;
				n=Integer.parseInt(as[i]);
				sum=sum+n;
				
			}
			
			catch(NumberFormatException e)
			{
				System.out.println("Invalid integer");
				cnt++;
			}
		}
		
		System.out.println("Sum of only valid integers is =" +sum);
		System.out.println("Invalid integers are :" +cnt);
	}

}
