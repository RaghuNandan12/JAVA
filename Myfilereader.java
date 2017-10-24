package filereader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Myfilereader 
{
  void fileread()
  {
    
    char a[]=new char[50];
    try(FileReader f=new FileReader("E:\\Raghu JAVA\\fr.txt"))
    {
    	 f.read(a);
    	 for(char c:a)
    	 {
    		 System.out.print(c);
    	 }
    	 
    }
    catch(IOException e1)
	  {
		   System.out.println(e1);  //displaying error
	  }
	  catch(Exception e2)
	  {
		  System.out.println(e2); //file not found  
	  }
  }
  void filewrite()
  {
     String s="how are you dude";	  
     char buf[]=new char[s.length()];
     try(FileWriter f=new FileWriter("\\E:Raghu JAVA\\fr.txt"))
     {
     	 s.getChars(0,s.length(),buf,0);
     	 f.write(buf);
      }
     catch(IOException e1)
	  {
		   System.out.println(e1);  //displaying error
	  }
	  catch(Exception e2)
	  {
		  System.out.println(e2); //file not found  
	  }
  }
 public static void main(String[] args)
 {
	Myfilereader m1=new Myfilereader();
	
	m1.filewrite();
	m1.fileread();
 }
 
} 
 
  
