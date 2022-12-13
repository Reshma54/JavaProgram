/*
 * Define a Student class (roll number,name,percentage).Define a default and parameterized constructor.Override the toString() method. 
 * Keep a count of object created Create object using parameterize constructor and display the object count after each object is create 
 * (Use static member and method) Also display the contents of each object.
 */


package itpjava;

import java.util.Scanner;

class Student1{
	private static int count;
	
	private int rollNo;
	private String name;
	private float per;
	
	public Student1() {
	}
	
	public Student1(int no,String n ,float h) {
		rollNo=no;
		name=n;
		per=h;
		count++;  //static:count the no of object 
	}
	
	public String toString() {
		return "Roll No :"+rollNo+
				"\nName :"+name+
				"\nPercentage:"+per;
				
				
		
	}
	
	public static void dispCount() {
		System.out.println("No.of objects created:"+count);
	}
}

public class Student {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner (System.in);
		
		String ch= " ";
		
		do {
			System.out.println("Enter roll no:");
			int rno= s.nextInt();
			
			System.out.print("Enter Name :");
			s.nextLine();
			String name=s.nextLine();
			
			System.out.print("Enter Percentage \n :");
			float per=s.nextFloat();
			
			Student1 stud= new Student1(rno ,name ,per);
			
			System.out.print(stud);
			Student1.dispCount();
			
			System.out.println("Continue Y /N");
			s.nextLine();
			ch=s.nextLine();
			
			
		}while(ch.equals("Y"));    //equals always return true or false.
		
			

	}

}
