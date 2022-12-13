/*
 * Write the definition for the class called REctangle that has floating point data member length and width 
 * .The class has the following member function:
 * 
 * void setlength(float) to set the length of data member
 * void setwidth (float) to set the width of data member
 * float perimeter() to calculate and return the permeter of the rectangle 
 * float area() to to calculate and return the area of the rectangle 
 * void show() to display the length and width of the rectangle
 * Write the function to crate two rectangle object and display each rectangle and its area and perimeter.
 */


package itpjava;

class Rectangle{
	private float length, width;
	
	 public void setLength(float l) {
		 length=l;
	 }
	 
	 public void setWidth(float w) {
		 width=w;
	 }
	 
	 public float perimeter() {
		 return 2*(length + width);
	 }
	 public float area() {
		 return length*width;
	 }
	 
	 public void show() {
		 System.out.println("Length :" +length+ "\nWidth:" +width);
	 }
	
	
}



public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1=new Rectangle(),
				r2=new Rectangle();
		
		r1.setLength(10.2f);
		r1.setWidth(35.2f);
		
		r2.setLength(7.2f);
		r2.setWidth(11.2f);
		
		
		r1.show();
		System.out.println("Perimeter :" +r1.perimeter()+ "\nArea :" +r1.area());


		r2.show();
		System.out.println("Perimeter :" +r2.perimeter()+ "\nArea :" +r2.area());

	}

}
