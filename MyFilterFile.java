package fILEioandoUTPUT;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilterFile
{
   public static void main(String[] aa)
   {
	   File file=new File("F://Raghu_Java");
	   
       String[] files = file.list(new FilenameFilter() {
            
           @Override
           public boolean accept(File dir, String name) {
               if(name.toLowerCase().endsWith(name)){
                   return true;
               } else {
                   return false;
               }
           }
       });
       for(String f:files){
           System.out.print(f);
   }
}
}