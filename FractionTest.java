/*Define a class fraction having integer data member numerator and denominator define parameterized and default constructors (default values 0 and 1) 
 * Parameterized constructor should store the fraction in reduced form after diving both numerator and denominator by GCD (greatest common divisor) .Write a private function member
 * to compute gcd two integers.
 * 
 * write four member function ADD,SUB,MULt,DIV of fraction  object Each function will have two fraction object as argument.Write the main function to illustrate the use of the class
 *  
 */


package itpjava;

class Fraction{
	
	private int  num,den;
	
	private int gcd() {
		int a=num,
				b=den;
		
	while(b!=0) {
		
		int t=a%b;
		a=b;
		b=t;
	}
	return a;
	}
	
	
	
	public Fraction(){    										//default constructor
		num=0;
		den=1;
		
	}							
	
	
	public Fraction( int num, int den){						//parameterized  Cons
		
		num=a;
		den=b;
		
		int x=gcd();
		num/=x;
		den/=x;
	}
	
	public String toString() {
		return num+"/"+ den;
	}
	
	public void add(Fraction p,Fraction q) {
		num=p.num*q.den + q.num* p.den;
		den= p.den * q.den;
		int x =gcd();
		
		num/=x;
		den/=x;

	}
	
	
	public void sub(Fraction p,Fraction q) {
		num=p.num*q.den - q.num* p.den;
		den= p.den * q.den;
		int x =gcd();
		
		num/=x;
		den/=x;

		
	}
	
	public void mult(Fraction p,Fraction q) {
		num=p.num * q.num;
		den= p.den * q.den;
		int x =gcd();
		
		num/=x;
		den/=x;

		
	}

	
	public void div(Fraction p,Fraction q) {
		num=p.num * q.num;

		den= p.den * q.den;
		int x =gcd();
		
		num/=x;
		den/=x;

		
	}


	
}

public class FractionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fraction f1=new Fraction(35,49),
				f2=new Fraction(36,47),
				f3=new Fraction();
		
		
		System.out.println(f1);
		
		System.out.println(f2);

		
		f3.add(f1, f2);
		
		System.out.println(f3);

		
		f3.sub(f1, f2);
		System.out.println(f3);

		
		f3.mult(f1, f2);
		System.out.println(f3);

		
		f3.div(f1, f2);
		System.out.println(f3);

	}

}
