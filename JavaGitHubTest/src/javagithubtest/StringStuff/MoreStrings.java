/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagithubtest.StringStuff;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 *
 * @author jduclos1
 */
public class MoreStrings {
    static String test = "123";
    static int test2 = 5;
    static Integer i1 = 187;
    
    public static void main(String[] args){
        String text = "He's back and better than ever - the hero that wouldn't die, Captain Marvel. After a few years in hiatus, mighty Marvel's space-born super hero returned, and under the aegis of writer/artist Jim Starlin, his story would achieve a scale never before imagined. Stripping the Kree Captain down to his very core and forcing him through a gauntlet of past opponents, Starlin then brought to the fore one of Marvel's pre-eminent cosmic menaces for the very first time: the mad Titan, Thanos. With the stage set and the players from unearthly entity Eon to Drax the Destroyer and the mighty Avengers pulled into fray, the good Captain led the fight against Thanos and his Cosmic Cube in a confrontation that would redefine super-hero epics forever.";
        
        //splitting by . requires \\ 
        String[] sentences;
        sentences = text.split("\\.");
        System.out.println("The text has " + sentences.length + " sentences.");
        String[] words;
        words = text.split(" ");
        System.out.println("The text has " + words.length + " words");
        System.out.println("The text has " + text.length() + " characters."); 
        
        //Replace text method
        String newText = text.replace("super", "awesome");
        System.out.println(newText);
        
        //practice 
        String s1 = "Hello";
        String[] vowels = {"a", "e", "i", "u", "o", "y"};
        for (String s : vowels){
            int count=0;
        }    
        
        //Conversions Methods
        System.out.println(i1.toString());
        System.out.println(parseInt(test));
        System.out.println(valueOf(test2));
        System.out.println(valueOf(test));
        
        int i2 = 50;
        double d1 = 5354.445;
        String s2 = Double.toString(d1);
        String s3 = Integer.toString(i2);
        System.out.println("The String version of d1 is " + s2);
        System.out.println("The String version of i2 is " + s3);
        int in = s2.indexOf(".");
        System.out.println("The index of s2 is " + in);
        
        String substring = text.substring(5, 20);
        System.out.println("The substring is " + substring);
        System.out.println("The substring is " + substring.toLowerCase());
        System.out.println("The substring is " + substring.toUpperCase());
    /*    
        //Formatter
        long n = 125111;
        System.out.format("%d%n", n);
        System.out.format("%08d%n", n); //places decimal 8 places
        System.out.format("%+8d%n", n);
        System.out.format("%,8d%n", n); //adds , at 3rd place
        System.out.format("%+,8d%n%n", n);
        
        double d = 5.24;
        System.out.format("%f%n", d);
        System.out.format("%.3f%n", d);
        System.out.format("%10.3f%n", d);
        System.out.format("%-10.3f%n", d);
    */    
        
    
        //Comparing
        String taco = "taco";
        String t1 = "ac";
        
        boolean si = taco.endsWith("co");
        boolean no = taco.contains(t1);
        System.out.println(si);
        System.out.println(no);
        
        
        
        
        
        

    }
    
    
    
    
    
}
