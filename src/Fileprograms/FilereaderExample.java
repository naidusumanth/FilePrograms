package Fileprograms;

import java.io.FileReader;

public class FilereaderExample {
	public static void main(String args[])throws Exception{    
		FileReader fr=new FileReader("D:\\files programs\\java.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
}
}