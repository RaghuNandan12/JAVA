package newJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryCheck 
{
  public static void main(String[] aa) throws  IOException
  {
	  InputStreamReader isr=new InputStreamReader(System.in);
	  BufferedReader br=new BufferedReader(isr);
	  int salary;
	  System.out.println("ENTER THE BANK DETAILS FOR LOAN");
	  System.out.println("ENTER THE AMOUNT:");
	  salary=Integer.parseInt(br.readLine());
	  if(salary<0)
	  {
		  System.out.println("YOU ARE NOT ELIGIBLE FOR LOAN");
	  }
	  else if(salary>10000)
	  {
		  System.out.println("YOU ARE ELIGIBLE FOR LOAN OF 100000");
	  }
	  else if(salary>50000)
	  {
          System.out.println("YOU ARE ELIGIBLE FOR LOAN OF 500000");		  
	  }
	  else if(salary>100000)
	  {
		  System.out.println("YOU ARE ELIGIBLE FOR LOAN OF  1000000");
	  }
  }
}
