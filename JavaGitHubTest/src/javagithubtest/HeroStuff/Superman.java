/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagithubtest.HeroStuff;

/**
 *
 * @author jduclos1
 */
public class Superman extends Hero {
    Boolean fly = false;
    
    void canFly(boolean fly){
        fly = true;
        this.fly = fly;
    }
    
    void noFly(boolean fly){
        fly = false;
        this.fly = fly;
    }

    @Override
    void printStats() {
        System.out.println("This hero has a health pool of " + health + ".");
        System.out.println("This hero has a speed level of " + speed + ".");
        System.out.println("This hero has a strength level of " + strength + ".");
        System.out.println("This hero has a intelligence level of " + intel + ".");
        if (fly){
            System.out.println("This hero can fly");    
        }
        System.out.println(" ");
        
    }
    
    
    
    
}
