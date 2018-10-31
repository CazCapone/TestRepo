/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagithubtest.StringStuff;

/**
 *
 * @author jduclos1
 */
public class StringBuilderDemo {
    
    static String text = "I like pizza.";
    
    
    public static void main(String[] args){
        
        StringBuilder sb = new StringBuilder();
        sb.append("I like tacos.");
        sb.append(text);
        sb.insert(13, "I like nachos.");
        sb.replace(3, 6, "ove");
        sb.reverse();
        
        //sb.deleteCharAt(5);
        
        
        System.out.println(sb);
        
    }
    
}
