package eligibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class college 
{
  public static void main(String[] args)throws IOException
  {
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   long ms;
   long op;
   String name;
   System.out.println("enter the details:");
   System.out.println("enter your name:");
   name=br.readLine();
   System.out.println("marks of maths and science:");
   ms=Long.parseLong(br.readLine());
   System.out.println("marks of op(overall percentage)");
   
   op=Long.parseLong(br.readLine());
		   
   if(op>95 && ms>97)
   {
	  System.out.println("eligible for medical college:");
   }
    else if(op>90 && ms>95)
   {
	  System.out.println("eligible for Engneering college:");
	  
   }
   else if(op>85 && ms>90)
   {
	  System.out.println("eligible for dental college:");
   }
   else if(op>80 && ms>85)
   {
	  System.out.println("eligible for pharmacy:");
   }
   else
   {
 	   System.out.println("vote is invalid");
   }
   
  }
}