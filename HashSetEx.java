/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author slt
 */
public class HashSetEx 
{
    public static void EmpDetails()
    {
        HashSet emp = new HashSet();
        emp.add("Tim");
        emp.add(21);
        emp.add("Pune");
        
        emp.add("Kim");
        emp.add(22);
        emp.add("Delhi");
       
        emp.add("Jim");
        emp.add(23);
        emp.add("Mumbai");   
        
        Iterator itr = emp.iterator();
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
