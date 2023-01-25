package HWProgram;

public class Computer {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=0,b=0,s=0,n=args.length;

      for (int i = 0; i < n; i++) {
    	  try {
    		  a=Integer.parseInt(args[i]);
    		  
    		  
    		  s+=a;
    	  }catch(NumberFormatException e) {
    		  b++;
    	  }

	}
      System.out.println("total no entered ="+n+
    		  "\ninvalid integer ="+b+
    		  "\nsum of integer="+s);
	}

	

}
