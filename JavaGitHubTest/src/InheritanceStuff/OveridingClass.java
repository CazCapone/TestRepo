/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceStuff;

/**
 *
 * @author jduclos1
 */

class Animal{
    
    public void sound(){
        System.out.println("Animals make noises!");
    }
}

class Pig extends Animal {

    @Override
    public void sound() {
       // super.sound(); 
        System.out.println("Pigs say Oink!");
    }
    
}

public class OveridingClass {
    
    public static void main(String[] args){
        Animal a = new Animal();        
        a.sound();
        Pig p = new Pig();
        p.sound();
                
    }
    
}
