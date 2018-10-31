/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnnotationStuff;

/**
 *
 * @author jduclos1
 */

class Animal{
    
    @Deprecated
    public void size(){
        System.out.println("Animals have a size");
    }
    
    
    public void color(){
        System.out.println("Animals have a color");
    }
    
    public void legs(){
        System.out.println("Animals have a legs");
    }
    
    public void fly(){
        System.out.println("Animals can fly");
    }
    
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

    @Override
    public void fly() {
        super.fly(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void legs() {
        super.legs(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void color() {
        super.color(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void size() {
        super.size(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

public class AnnotationEx {
    
    public static void main(String[] args){
        Animal a = new Animal();        
        a.sound();
        Pig p = new Pig();
        p.sound();
                
    }
    
}

