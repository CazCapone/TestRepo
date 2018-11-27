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
public class Crypto {
    static String text = "This is some \"really\" great. (Text)!?";
    
    private static String normalizeText(String s){
        s = s.replace("?", "");
        s = s.replace("!", "");
        s = s.replace("\"", "");
        s = s.replace("(", "");
        s = s.replace(")", "");
        s = s.replace(",", "");
        s = s.replace(".", "");
        s = s.replace(":", "");
        s = s.replace(";", "");
        s = s.replace(" ", "");
        s = s.toUpperCase();
        return s;
    }
    
    private static String caesarify(String s, int key){
        String results = "";
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        for (int i = 0; i < s.length(); i++){
            int index = alpha.indexOf(s.charAt(i));
            String shift = shiftAlphabet(index);
            results += shift.charAt(key);
        }
        return results;
    }
    
    public static String shiftAlphabet(int shift){
        int start = 0;
        if (shift < 0){
            start = (int) 'Z' + shift + 1;
        }else{
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start; 
        for(; currChar <= 'Z'; ++currChar) {
        result = result + currChar;
    }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
   
    public static String groupify(String s, int chunk){
        String results = "";
        
        while (s.length() % chunk != 0){
            s += 'x';
        }
        
        for (int i = 0; s.length() > i; i++){
        //    boolean count = (i % chunk == 0);
            if (i % chunk != 0){
                results += s.charAt(i);
            }else{
                results = results.concat(" ")+s.charAt(i);
            }
        }
        return results;
    }
    
    public static void main (String[] args){
        System.out.println(groupify((caesarify((normalizeText(text)), 3)), 3));
       
        
    //    System.out.println(normalizeText(text));
    //    System.out.println(caesarify("ABCDEF", 3));
    //    System.out.println(groupify("HELLOWORLD", 4));
    }
    
}
