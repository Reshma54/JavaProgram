package itpjava;
import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
boolean flag=false;

int n=0;

//System.out.print("Enter a number between 1-10");
 //int num= s.nextInt();
 
 do {
	System.out.print("Enter a number between 1-10 or 90-100 :");
	n=s.nextInt();
	
	if((n>=0 && n<=10) || (n>=90 && n<=100)) {
		flag =true;
		
	}
	else {
		System.out.println("Invalid Input, try again ...");
	}

 }while(!flag);

 System.out.println("You have entered :"+n);
	}

}
