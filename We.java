package VEHICLE;

import java.util.Scanner;

class vehicle
{
	String color;
	float petrol;
	String name;
	String engine;
	float price,milage;
	
	void start()
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("DETAILS OF VEHICLE:");
		System.out.println("COLOR OF THE VEHICLE IS GOOD:");
		//System.out.println("COLOR:"+color);
	    //System.out.println("HOW MUCH LITERS OF PETREOL:"+petrol);
	}
}
class bike extends vehicle
{
	 void start()
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("\n");
		System.out.println("WELCOME TO SHOWROOM:");
	    System.out.println("DETAILS OF BIKE:");
	    System.out.println("NAME OF THE BIKE");
	    name=sc.next();
		System.out.println("PRICE OF THE BIKE");
		price=sc.nextFloat();
		System.out.println("ENGINE DETAILS:");
		engine=sc.next();
		System.out.println("MILAGE OF THE BIKE:");
		milage=sc.nextFloat();
       
		
		System.out.println("BIKE NAME:"+name);
		System.out.println("PRICE:"+price);
		System.out.println("ENGINE:"+engine);
		System.out.println("MILAGE:"+milage);
		
		
		
	}
}

class car extends vehicle
{
	 void start()
	{
		Scanner sc=new Scanner(System.in);
		
		//float price, milage;
		System.out.println("WELCOME TO SHOWROOM:");
	    System.out.println("DETAILS OF CAR:");
		System.out.println("NAME OF THE CAR:");
		name=sc.nextLine();		
		System.out.println("PRICE OF THE CAR:");
		price=sc.nextFloat();
		System.out.println("WHAT IS THE CAPACITY OF ENGINE:");
		engine=sc.next();
		System.out.println("MILAGE OF THE CAR:");
		milage=sc.nextFloat();

		System.out.println("CAR:"+name);
		System.out.println("PRICE:"+price);
		System.out.println("CAPACITY of ENGINE:"+engine);
		System.out.println("MILAGE:"+milage);
		
	}
}

class working
{
	static void display(vehicle v1)
	{
		v1.start();
	}
}
public class We 
{
  public static void main(String[] aa)
  {
	  Scanner sc=new Scanner(System.in);
	  vehicle i=new bike();

	  
	  
	  vehicle u=new car();
	  
	  int choice=0;
	  System.out.println("DETAILS OF AUTOMOBILES:");
	  System.out.println("1.BIKE:");
	  System.out.println("2.Car:");
	  System.out.println("enter your choice:");
	  choice=sc.nextInt();
	  switch(choice)
	  {
	  case 1:
	  {
		  working.display(i);  
	  }
	  break;
	  case 2:
	  {
		  working.display(u);
	  }
	  break;
	  default:
	  {
         System.out.println("invalid choice");		  
	  }
	  }
  }
  
}
