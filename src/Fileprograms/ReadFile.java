package Fileprograms;

import java.io.File;

public class ReadFile {
	 public static void main(String[] args) {
	      File file = new File("D:\\files programs\\javapro.txt");
	      System.out.println(file.setReadOnly());
	      System.out.println(file.canWrite());
	   }
}
