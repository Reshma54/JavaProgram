package itpjava;

class Furniture{
	int len,breadth;   
	
	public void dispFurniture (){
	System.out.println("Len :" +len+ "\nBreath :" +breadth);	
		
	}
}

class Chairs extends Furniture{
	int heigth;
	
	public void dispChirs() {
		System.out.println("heigth :"+heigth);
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chairs c=new Chairs();
		
		c.len=10;
		c.breadth=15;
		c.heigth=34;
		
		c.dispFurniture();
		c.dispChirs();
	}

}
