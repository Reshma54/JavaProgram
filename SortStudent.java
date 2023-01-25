/*
 * Write a Java program to create n objects of the Student class. Assign
roll numbers in the ascending order. Accept name and percentage from
the user for each object. Define a static method “sortStudent” which
sorts the array on the basis of percentage.
 */


package HWProgram;
import java.io.*;

class Sort{
	int rollno;
	String name;
	float per;
	
	static void sortStudent(Sort[]studentArray,int n) {
		
		Sort temp;
		for(int i=0 ;i<n ;i++) {
			
			for(int j=i+1 ;j<n ;j++)
				if(studentArray[i].per<studentArray[j].per) {
					temp=studentArray[i];
					studentArray[i]=studentArray[i];
					studentArray[j]=temp;
				}
		}
	}
	public String toString()
	{
		return "[" + name+ "," +per+ "," +rollno+ "]" ;
		
	}
}
public class SortStudent {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		int n,i;
		
		BufferedReader  br= new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter the n volue");
		n=Integer.parseInt(br.readLine());
		
		Sort[] studentArray=new Sort[20];
		
		for(i=0 ;i<n ;i++)
		{
			studentArray[i] =new Sort();
			studentArray[i].rollno=i+1;
			
			System.out.println("Enter your name :");
			studentArray[i].name=br.readLine();
			
			System.out.println("Enter your per :");
			studentArray[i].per=Float.parseFloat(br.readLine());
			
			System.out.println("rollno = " +studentArray[i].rollno);
			System.out.println("name = " +studentArray[i].name);
			System.out.println("per = " +studentArray[i].per);

		}
		
		
		Sort.sortStudent(studentArray, n);

		for(i=0 ;i<n ;i++)
		{
			System.out.println(studentArray[i]);
		}
		
		
	}

}

