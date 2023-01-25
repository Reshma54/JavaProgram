package HWProgram;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ReverseString {
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String :");
		
		String str=br.readLine();
		
		int count=1;
		
		for(int i=0 ;i < str.length() -1 ;i++) {
			 
			if((str.charAt(i) == ' ' ) && (str.charAt(i +1) != ' '))
			
			{
				count++;
			}
		}
		
		System.out.println("Number of world in a String : " +count);
	}

}
