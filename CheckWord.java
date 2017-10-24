package newJava;

import java.util.Scanner;

public class CheckWord 
{

  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  String name="hi ude h ow are s you";
      String n="so";
	  //System.out.println("enter your name:");
	  //name=sc.nextLine();
	  
	  //int result1=name.indexOf('s');
	  //System.out.println(result1);
	  char result=name.charAt(3);
	  if(name.charAt(3)>0)
	  {
		  System.out.println(result);  
	  }
	  
	  System.out.println("after changing the name:"+name.replace('h','s'));
	  System.out.println("after changing the name:"+n.replace('o','R'));
	   System.out.println(name.equals("Raghu"));
       System.out.println("no of S:"+name);
  }
}
  