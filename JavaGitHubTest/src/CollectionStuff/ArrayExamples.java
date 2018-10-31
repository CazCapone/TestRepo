/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionStuff;

/**
 *
 * @author jduclos1
 */
public class ArrayExamples {
    
    
    
    public static void main(String[] args){
         
        //1 demensional array
        int num[] = new int[4];
        num[0] = 2;
        num[1] = 5;
        num[2] = 10;
        num[3] = 12;
         
        for (int i : num){
            System.out.println("Your number is " + i);
        }
        
        //2 demensional array
        int num2[][] = {{1,2,3,4,5},{7,8,9,10,11},{6,9,6,9}};
        
        for (int i = 0 ; i < num2.length ; i++){
            System.out.print("Row " + (i+1) + " contains");
            for (int j = 0 ; j < num2[i].length ; j++){
                System.out.print(" " + num2[i][j]);
            }
            System.out.println();
        }
        //number of rows
        System.out.println(num2.length);
        //number of columns
        System.out.println(num2[0].length);
        
        
        //2 demensional array with enhanced loop
        int num3[][] = {{1,2,3,4,5},{7,8,9,10,11},{6,9,6,9}};
        
        for (int i[] : num3){
            for (int j : i){
                System.out.print(" " + j);
            }
            System.out.println();
        }

        
    }
}
