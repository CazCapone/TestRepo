/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FractionCalc;

import java.util.Scanner;

/**
 *
 * @author jduclos1
 */
public class FractionCalculator {
    private static Scanner scan;
    
    private String getOperation(Scanner input){
        System.out.println("Please enter a fraction (a/b) or integer (a):");
        String in = input.next();
        if (!in.equals("+") || !in.equals("-") || !in.equals("/") || !in.equals("*") || !in.equals("=") || !in.equals("Q") || !in.equals("q")){
            System.out.println("Please enter an operation (+, -, /, *, =, or Q to Quit):");
        }
        return in;
    }
    
    private boolean validFraction(String input){
        String in = input;
        if (in.startsWith("-")){
            in.replaceFirst("-", "");
        }
        if (in.contains("-")){
            System.out.println("Invalid Fraction!");
        }
        if (!in.contains("/")){
            isNumber(in);
        }
        if (in.contains("/")){
            String s1, s2;
            s1 = in.substring(0, in.indexOf("/"));
            s2 = in.substring(in.indexOf("/")+1, in.length());
            if (s1 == null || s2 == null){
                return false;
            }
            if (!isNumber(s1) || !isNumber(s2)){
                return false;
            }
            if (s2.equals(0)){
                return false;
            }
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
        }
        return true;
    }
    
    private boolean isNumber(String input){
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 0 || input.charAt(i) == 1 || input.charAt(i) == 2 || input.charAt(i) == 3 || input.charAt(i) == 4 || input.charAt(i) == 5 || 
                    input.charAt(i) == 6 || input.charAt(i) == 7 || input.charAt(i) == 8 || input.charAt(i) == 9){
                return true;
            }
        }
        return false;
    }
    
    /*   private Fraction getFraction(Scanner input){
    System.out.println("Please enter a fraction (a/b) or integer (a):");
    String in = input.next();
    
    getOperation(input);
    
    
    
    
    }*/
    
    
    public static void main(String[] args){
        String answer = "";
        Scanner scan1 = null;
        System.out.println("Enter your fractions.");
        System.out.println("Please enter an operation (+, -, *, /, =, or Q): ");
        answer = scan1.next();
        
        
        
        
       
       
        
        
    }
    
}
