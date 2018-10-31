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
public class MoreStrings {
 
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
            
            
            if (s1.contains(1).equals(s)){
                count++;
                
            }
System.out.println(count);
            
        }
        
        
        
        
        
    }
    
    
    
    
    
}
