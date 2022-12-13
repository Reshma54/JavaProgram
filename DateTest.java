/*
 * Create a class Date with day month and year as member .
 * Write appropriate member function .Create another class Student which has 
 * id,name,date of birth and marks of 3 sun=object as member Write appropriate contructor for the student which assing value to 
 * the member Accept the details
 */

package itpjava;

class Date{
	private int dd,mm,yy;
	
	public Date(int d,int m, int y) {
		dd=d;
		mm=m;
		yy=y;
	}
	
	public String toString() {
		return dd+ "/" +mm+ "/" +yy;
		
	}
}

class StudentInfo{
	private int id;
	private String name;
	private Date dob;
	private int m1,m2,m3;
	
	public StudentInfo(int i,String n, int d,int m,int y,int a,int b,int c){
		
		id=i;
		name=n;
		dob=new Date (d,m,y);
		m1=a;
		m2=b;
		m3=c;
	}
	public String toString() {
		return "ID:"+id+
				"\nName:"+dob+
				"\nMarks:"+m1+
				"\nMarks:"+m2+
				"\nMarks:"+m3;
	}
}

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo s=new StudentInfo(
				Integer.parseInt(args[0]),
				args[1],
				Integer.parseInt(args[2]),
				Integer.parseInt(args[3]),
				Integer.parseInt(args[4]),
				Integer.parseInt(args[5]),
				Integer.parseInt(args[6]),
				Integer.parseInt(args[7])

				);
		
		System.out.print(" s");
		
		

	}

}
