package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo
{
 
	public static void main(String[] args)
	{
	   TreeSet<Integer> o=new TreeSet<Integer>();
	   Integer io1=new Integer(114);
	   Integer io2=new Integer(111);
	   Integer io3=new Integer(113);
	   Integer io4=new Integer(112);
       
	   System.out.println("Size of TreeSet is: "+o.size());
	   
	   o.add(io1);
	   o.add(io2);
	   o.add(io3);
	   o.add(io4);
	   o.add(io2);
	   
	   System.out.println("\n TreeSet after adding the objects :"+o);
	   System.out.println("Size  of TreeSet after adding objects:"+o.size());
	   
	   o.remove(io3);
	   o.remove(io1);
	   
	   System.out.println("\n TreeSet after removing the object:"+o);
	   System.out.println("Size of TreeSet after remove objects:"+o.size());
	   
	   System.out.println("\n The final TreeSet: ");
	   Iterator  i=o.iterator();
	   while(i.hasNext())
	   {
		     System.out.println(i.next());
	   }
	   
	}

}
