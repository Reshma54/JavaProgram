package HWProgram;
import java.util.*;


class Name{
	String fname , mname,lname;
	int len;
	
	void accept()
	{
		System.out.println("Enter First Name : ");
		Scanner sc=new Scanner(System.in);
		
		fname=sc.nextLine();
		
		System.out.println("Enter Midddle Name :");
		mname=sc.nextLine();
		
		System.out.println("Enter last name :");
		lname=sc.nextLine();
		
		len=mname.length();
		
		String f=mname.substring(0,1);
		String l=mname.substring(1,len);
		
		f=f.toUpperCase();
		mname=f+1;
				
	}
	
	void display()
	{
		System.out.println("First Name :" +fname);
		System.out.println("Middle Name :" +mname);
		System.out.println("Last Name :" +lname);

	}
}

public class MiddleName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Name n=new Name();
		
		n.accept();
		n.display();
		
	}

}
