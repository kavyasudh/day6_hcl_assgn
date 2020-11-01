package day6_hcl_assgn;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
 
public class ReadDoubleFromFile {
 
  public static void main(String[] args) {
 
    String strFilePath = "doubledata.txt";
   
    try
    {
      //create FileInputStream object
      FileInputStream fin = new FileInputStream(strFilePath);
     
      /*
       * To create DataInputStream object, use
       * DataInputStream(InputStream in) constructor.
       */
      
       DataInputStream din = new DataInputStream(fin);
      
       /*
        * To read a Java double primitive from file, use
        * byte readDouble() method of Java DataInputStream class.
        *
        * This method reads 8 bytes and returns it as a double value.
        */
       
       BigDecimal d =new BigDecimal(din.readDouble());
       
       System.out.println("Double : " + d);
			/*
			 * while(d != -1) { System.out.print("\n"+d); d = din.readLine(); }
			 */
       
        /*
         * To close DataInputStream, use
         * void close() method.
         */
         din.close();
       
    }
    catch(FileNotFoundException fe)
    { 
      System.out.println("FileNotFoundException : " + fe);
    }
    catch(IOException ioe)
    {
      System.out.println("IOException : " + ioe);
    }
  }
}