
package joinarray;

import java.util.ArrayList;
import java.util.List;


public class JoinArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> colors =new ArrayList();
        colors.add("Red");
        colors.add("Pink");
        colors.add(0,"Blue");
        colors.add("Blond");
        
        
        System.out.println(colors);
        
        
        System.out.println("Second list");
        
        List<String> names=new ArrayList();
        names.add("Rubin");
        names.add("Lani");
        names.add(2,"Elene");
        names.add("Nikolas");
        
      
        System.out.println(names);
    
      
         List<String> addList=new ArrayList();
         
         
         addList.addAll(names);
         addList.addAll(colors);
         System.out.println(addList);
    }
        
    
}
