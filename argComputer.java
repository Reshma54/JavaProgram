/*
 * //Write a Java program to accept two file names as command line arguments. Copy only
//those lines from the first file to the second which contains the word ''Computer''.

 */



package HWProgram;


import java.io.*;


public class argComputer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("argsfile1.txt");
		FileWriter fw = new FileWriter("argsfile2.txt");
		
		String test = "computer";
		Reader inputString = new StringReader(test);
		BufferedReader br = new BufferedReader(inputString);
		
		
		//BufferedReader br = new BufferedReader(
		//new InputStreamReader(System.in));
		char ch;
		while((ch=(char)br.read())!=-1) {
		fw.write(ch);
	}
		fw.close();
	}

}
