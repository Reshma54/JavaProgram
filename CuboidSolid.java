/*
 * 
 * 
 */



package itpjava;

class CuboidSolid{
	private float length,breadth,height,mass;
	
	public void setLength(float l) {
		length=l;
	}
	
	public void setBreadth(float b) {
		breadth=b;
	}

	public void setHeight(float h) {
		height=h;
	}

	public void setMass(float m) {
		mass=m;
	}
	
	
	public float getLength() {
		return length;
	}

	
	public float getBreadth() {
		return breadth;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getMass() {
		return mass;
	}
	
	public float getVolume() {
		return length*breadth*height;
	}
	
	public float getSurfaceArea() {
		return 2*(length*breadth + breadth*height + height*length);
	}
	public float getDensity() {
		return mass/getVolume();
	}
	
}
public class CuboidSolid {

	public static void main(String[] args) {

		CoboidSolid csl=new CuboidSolid();
		
	}

}
