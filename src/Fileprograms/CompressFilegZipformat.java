package Fileprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class CompressFilegZipformat {
	 public static void main( String[] args )
	  {
		 CompressFilegZipformat zipObj = new CompressFilegZipformat();
	    zipObj.gzipMyFile();
	  }
	 
	  public void gzipMyFile(){ 
	    byte[] buffer = new byte[1024];
	    try{
	     
	      GZIPOutputStream gos = 
	       new GZIPOutputStream(new FileOutputStream("D:\\files programs\\java.gz"));
	 
	     
	      FileInputStream fis = 
	       new FileInputStream("D:\\files programs\\java.txt");
	 
	      
	      int length;
	      while ((length = fis.read(buffer)) > 0) {
	 
	        
	        gos.write(buffer, 0, length);
	      }
	 
	      fis.close();
	 
	      
	      gos.finish();
	      gos.close();
	 
	      System.out.println("success");
	 
	    }catch(IOException ioe){
	        ioe.printStackTrace(); 
	     }
	  }
}
