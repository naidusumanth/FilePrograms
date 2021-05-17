package Fileprograms;

import java.io.FileWriter;

public class WriteFileExample {
	public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("D:\\files programs\\java.txt");    
          fw.write("Welcome to the world of java");    
          fw.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println("pass");    
    }    
}
