package Fileprograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilecreationusingCreateMethod {
	public static void main(String[] args)   
	{  
	Path path = Paths.get("D:\\files programs\\javapro.txt");   
	try   
	{  
	Path p= Files.createFile(path);       
	System.out.println("File Created at Path: "+p);  
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	}  
}

