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
public class Hero {
    int health = 0;
    int speed = 0;
    int strength = 0;
    int intel = 0;

    void changeHealth(int health){
        this.health = health;
    }
    
    void changeSpeed(int speed){
        this.speed = speed;
    }
    
    void changeStrength(int strength){
        this.strength = strength;
    }
    void changeIntel(int intel){
        this.intel = intel;
    }
    
    void printStats(){
        System.out.println("This hero has a health pool of " + health + ".");
        System.out.println("This hero has a speed level of " + speed + ".");
        System.out.println("This hero has a strength level of " + strength + ".");
        System.out.println("This hero has a intelligence level of " + intel + ".");
        System.out.println(" ");
    }
    
}
