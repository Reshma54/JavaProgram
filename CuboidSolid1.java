/*
 * 
 * 
 */



package itpjava;

class CuboidSolid11{
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
public class CuboidSolid1 {

	public static void main(String[] args) {

		CuboidSolid csl=new CuboidSolid();
		
		csl.setLength(11.2f);
		csl.setBreadth(22.5f);
		csl.setHeight(28.7f);
		csl.setMass(300);
		
		System.out.println("Length :"+ csl.getLength() +
				"\nBreadth:" +csl.getBreadth()+
				"\nHeight:" +csl.getHeight() +
				"\nMass:" +csl.getMass() +
				"\nVolume:"+csl.getVolume() +
				"\nSurfaceArea :" +csl.getSurfaceArea()+
				"\nDensity:" +csl.getDensity());
		
	}

}
