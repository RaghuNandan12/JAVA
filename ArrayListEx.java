/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsex;

/**
 *
 * @author slt
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
public class ArrayListEx 
{
    public static void EmpDetails()
    {
        String name;
        Scanner sin = new Scanner(System.in);
        
        System.out.println("Enter the Name");
        name = sin.next();
        
        ArrayList emp = new ArrayList();
        emp.add("Tim");
        emp.add(21);
        emp.add("Pune");
        
        emp.add("Kim");
        emp.add(22);
        emp.add("Delhi");
       
        emp.add("Jim");
        emp.add(23);
        emp.add("Mumbai");
    
        System.out.println(emp);
        System.out.println(emp.get(2));
        Iterator itr = emp.iterator();        
        
        ListIterator itr1 = emp.listIterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public static void main(String[] aa)
    {
        EmpDetails();
    }
}