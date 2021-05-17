package Fileprograms;

import java.io.File;
import java.sql.Date;

public class LastModifiedDate {
	public static void main(String args[]) {
	      String filePath = "D:\\files programs\\java.txt";

	      File file = new File(filePath);
	      
	      long lastModified = file.lastModified();
	      Date date = new Date(lastModified);
	      System.out.println("last modified at: ");
	      System.out.println(date);
	   }
}
