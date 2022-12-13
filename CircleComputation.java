/*Write a program called CircleComputation that prompts
 *  user for the radius of a circle in floating point 
 *  number. The program shall read the input as double;
 *   compute the diameter, circumference, and area of
 *    the circle in double; and print the values rounded 
 *    to 2 decimal places. Use System-provided constant
 *     Math.PI for pi. The formulas are:
 * 
 * 
 */

package itpjava;

import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in); //object of scanner

		//double radius,diameter,circumference,area;
		System.out.print("Enter radius of circle :");
		double radius =s.nextDouble();
		
		double diameter= 2* radius;
		double circumference=2 * Math.PI * radius;
		double area=Math.PI *radius * radius;
		
		System.out.printf("Diameter is %2.f \n",diameter);
		System.out.printf("Circumference is %2.f\n",circumference);
		System.out.printf("Area is %2.f\n",area);

	}

}
