package itpjava;

class Pen{
	String color;  //property
	String type;
	
	public void write() {
		System.out.println("Writing something");
	}
	
	
	public void printColor() {
		System.out.println(this.color);
	}
}

public class ApOOPS {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen p1=new Pen();
		p1.color="blue";  //Acces pen property
		p1.type="Gel";
		
		Pen p2=new Pen();
		p2.color="Red";
		p2.type="Ballpoint";
		
		//p1.write();  //call
		
		p1.printColor();
		p2.printColor();
		
	}

}
