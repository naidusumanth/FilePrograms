package Fileprograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendTextExample {
	public static void main( String[] args ) {

	      try {
	         String data = " programming";
	         File f1 = new File("D:\\files programs\\java.txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         }

	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(data);
	         bw.close();
	         System.out.println("pass");
	      } catch(IOException e){
	         e.printStackTrace();
	      }
	   }
}
