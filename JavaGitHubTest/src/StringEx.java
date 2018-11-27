
import java.util.Scanner;

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
        /*        String ip = "192.168.1.1";
        String ip2 = "[0-255].[0-255].[0-255].[0-255]";*/
        
        String ip = "5";
        String ip2 = "\\D";
        System.out.println(ip.matches(ip2));
        
        String name = "Tom";
        
        String text = "[A-Z]om";
        System.out.println(name.matches(text));
        
        
        String hi = "Hi, ";
        String mom = "mom.";

        System.out.println(hi.concat(mom));
        System.out.println(hi + mom);
        
        String myName = "Joseph Duclos";      
        StringBuilder initials = new StringBuilder();
                
        initials.append(myName, 0, 1);
        initials.append(myName, myName.indexOf(" ")+1, myName.indexOf(" ")+2 );

        System.out.println(initials);
            
        
        System.out.println(Math.pow(12, 2));
        
        
    }
    
}
