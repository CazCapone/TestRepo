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
public class HeroMain {
    
    
    
    public static void main(String[] args){
        
        Hero h1 = new Hero();
        h1.changeHealth(150);
        h1.changeIntel(50);
        h1.changeSpeed(200);
        h1.changeStrength(250);
        h1.printStats();
        
        Superman s1 = new Superman();
        s1.changeHealth(100);
        s1.changeIntel(50);
        s1.changeSpeed(120);
        s1.changeStrength(175);
        s1.canFly(true);
        s1.printStats();
        
        SupermanInt s2 = new  SupermanInt();
        s2.changeHealth(100);
        s2.changeIntel(50);
        s2.changeSpeed(120);
        s2.changeStrength(175);
        s2.printStats();
        
        
    }
    
}
