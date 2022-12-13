/*
 * implement a class printdata with three member function all with same name print
 * void print(int)-output value
 */



package itpjava;

class Printdata{
	public void print(int value) {
		System.out.println("value -"+value);
	}
	
	public void print (int value1 ,int value2) {
		System.out.println("value - ["+value1 + "," + value2+"]");
	}
	public void print(String s) {
		System.out.println("value - \""+s+"\"");
	}
}

public class PrintdataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printdata pd=new Printdata();
		 
		
		pd.print(100);
		
		pd.print(200,4000);
		pd.print("@rsh");

	}

}
