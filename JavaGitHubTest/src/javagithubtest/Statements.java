/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagithubtest;

/**
 *
 * @author Caz-Desktop
 */
public class Statements {
    static int x = 5;
    static int y = 10;
    
    
    
    public static void main(String[] args) {
        int z = 1;
       
        if (x >= y){
            System.out.println("X is larger than Y!");
        }
        
        if (x >= y){
            System.out.println("X is larger than Y!");
        }else{
            System.out.println("X is not larger than Y!");
        }  
        
        if (x >= y){
            System.out.println("X is larger than Y!");
        }else if(x == y){
            System.out.println("X is equal to Y!");
        }else{
            System.out.println("X is not larger than Y!");
        }
        
        String result;
        switch (x) {
            case 1 : result = "one";
                break;
            case 2 : result = "two";
                break;
            case 3 : result = "three";
                break;
            case 4 : result = "four";
                break;
            case 5 : result = "five";
                break;
            case 6 : result = "six";
                break;
            default : result = "Out of Range";
                break;
        }System.out.println(result);
        
        while (z < 5 ){
            System.out.println("Z is " + z);
            z++;
        }
        
        do{
            System.out.println("Z is " + z);
            z--;
        }while (z>1);
        
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("i equals " + i);
        }
        
        int[] array1 = {1,2,4,5,6,7};
        for (int i : array1){
            System.out.println(i);
        }
        
    }
    
    
}
