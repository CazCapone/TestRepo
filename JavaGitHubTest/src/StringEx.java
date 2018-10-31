
import com.sun.xml.internal.fastinfoset.util.CharArray;
import static java.util.Arrays.sort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jduclos1
 */
public class StringEx {
    
    
    
    public static void main(String[] args){
        
        String hi = "Hi, ";
        String mom = "mom.";
        
        System.out.println(hi.concat(mom));
        System.out.println(hi + mom);
        
        String myName = "Joseph Duclos";      
        StringBuilder initials = new StringBuilder();
                
        initials.append(myName, 0, 1);
        initials.append(myName, myName.indexOf(" ")+1, myName.indexOf(" ")+2 );

        System.out.println(initials);
            
        
        
        
        
    }
    
}
