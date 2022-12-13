package itpjava;

public class MaxThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		
		int max =a>b?(a>c?a:c):(b>c?b:c);
		
		System.out.printf("Max(%d,%d,%d)=%d ",a,b,c,max);
		System.out.println();
		System.out.println("Max("+a+","+b+","+c+")="+max);

	}


	}


