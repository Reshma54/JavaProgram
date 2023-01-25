package HWProgram;
import java.io.FileReader;

public class Alternate {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
    FileReader fr = new FileReader(args[0]);


		int ch,i=0;
		while((ch=fr.read())!=-1) {   

			if(i%2==0)
			System.out.print((char)ch);
			i++;
		}

	}
}



