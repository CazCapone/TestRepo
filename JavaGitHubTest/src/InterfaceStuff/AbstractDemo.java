/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceStuff;

/**
 *
 * @author jduclos1
 */
abstract class Jedi{
    public void theForce(Boolean b){
        System.out.println("The force is Strong with you ... " + b);
    }
    
    public void sith(String s){
            System.out.println("I am a Sith Lord named " + s);
}

}


public class AbstractDemo extends Jedi{
    
    public static void main(String[] args){
        Jedi j = new Jedi() {};
        j.theForce(Boolean.TRUE);
        
        
        
        
    }
    
    
}
