package itpjava;


class Student{
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
		
	}
	public void printInfo(int age) {
		System.out.println(age);
		
		
		
	}
	public void printInfo(String name,int age) {
		System.out.println(name +" "+ age);
	}
	
}
public class ApStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1=new Student();
		s1.name="Rosh";
		s1.age=22;
		
		s1.printInfo(s1.name,s1.age);
		
			}

}
