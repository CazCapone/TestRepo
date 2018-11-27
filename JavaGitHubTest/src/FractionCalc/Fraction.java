/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FractionCalc;


/**
 *
 * @author jduclos1
 */
public class Fraction {
    private int numerator, denominator;
    
    private Fraction(int num, int den){
        numerator = num;
        denominator = den;
        
        if (denominator == 0){
            throw new IllegalArgumentException("Cannot be zero.");
        }
        
        if (denominator < 0){
            numerator = numerator * -1;
            denominator = denominator * -1;
        }
    }
    
    private Fraction(int num){
        numerator = num;
        denominator = 1;
    }
    
    private Fraction(){
        numerator = 0;
        denominator = 1;
    }
        
    private int getNumerator(){
        return this.numerator;
    }
    
    private int getDenominator(){
        return this.denominator;
    }
    
    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
    
    private double toDouble(){
        return numerator / denominator;
    }
    
/*    private Fraction add(Fraction other){

        return answer;
    }
    
       private Fraction subtract(Fraction other){
    
    }
    
    private Fraction multiply(Fraction other){
    
    }
    
    private Fraction divide(Fraction other){
    
    }
    
    private boolean equals(Object other){
    
    }
    
    private void toLowestTerms(){
    
    }
    
    private int gcd(int num, int den){
    
    }*/
}
