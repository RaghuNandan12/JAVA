package inpustStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo
{
	
	public void read()
	{
		 int i;
		 char c;
		 try(FileInputStream f=new FileInputStream("F:\\RaghunewJava\\q1.txt"))
		 {
			 while((i=f.read()) !=-1)
			 {
				 c=(char) i;
				 System.out.print(c);
	
			 }
		 }
		 catch(IOException ex)
		 {
			 System.out.println(ex);
		 }
	}
	

	public static void main1(String[] args)
	{
        FileInputStreamDemo d1=new FileInputStreamDemo();
        d1.read();
        	
 
	}

}
