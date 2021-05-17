package Fileprograms;

import java.io.File;

public class FileHidden {
	public static void main(String[] args) {
	      try {
	         File file = new File("D:\\files programs\\java.txt");
	         file.createNewFile();
	         System.out.println("Is file hidden?" + file.isHidden());
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	   }

}
