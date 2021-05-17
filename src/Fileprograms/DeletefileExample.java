package Fileprograms;

import java.io.File;

public class DeletefileExample {
	public static void main(String[] args)  
	{     
	try  
	{         
	File f= new File("D:\\files programs\\javapro.txt");          
	if(f.delete())                       
	{  
	System.out.println(f.getName() + " deleted");    
	}  
	else  
	{  
	System.out.println("failed");  
	}  
	}  
	catch(Exception e)  
	{  
	e.printStackTrace();  
	}  
}
}
