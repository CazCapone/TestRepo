package javagithubtest.StringStuff;

/**
 *
 * @author jduclos1
 */
public class Strings {
    public static String a = "abc";
    public static String b = "def";
    
    
    public static void main(String[] args){
        //concat a string
/*    System.out.println(a + " " + b);
    System.out.println(a.concat(b));
    System.out.println(a.concat(" ").concat(b));
    
    StringBuilder sb = new StringBuilder();
    sb.append(a);
    sb.append(b);
    sb.insert(2, "zzz");
    sb.delete(5, 7);
    String s = sb.toString();
    System.out.println(s);
*/    
    //concat an array of strings
/*    String c = "cat";
    String d = "dog";
    String e = "elephant";
    String f = "frog";
    String[] strings = {c, d, e, f};
        String animals = "";
        for (int i=0 ; i < strings.length ; i++ ){
            animals += strings[i].toString().concat(" ");
        }
        
        System.out.println(e.toString());
        System.out.println(animals);
 */       
    //concat an array of strings
/*    String spider = "parker";
    String bat = "wayne";
    String hulk = "banner";
    String captain = "rogers";
    String[] heroes = {spider, bat, hulk, captain};
        String temp = " ";
        for (String h : heroes){
            h = h.trim();
            
            if (!h.isEmpty()){
                //print out on new lines
                System.out.println(h);
                //adds to one line to be printed later
                temp += h.concat(" ");
            }
        }
        //prints all array data on one line
        System.out.println(temp);
 */       
    	
    String x = "x-men";
    String y = "yoda";
    String z = "Zod";
    String[] random = {x, y, z};
    for (String s1 : random){
        //get char at specified index **diff methods**
        int index = 2;
        System.out.println(s1.charAt(index));
        
        char[] charArray = s1.toCharArray();
        System.out.println("The character at a specified index is " + charArray[1]);
        
        int indexOfLetter = s1.indexOf('e');
        System.out.println("The index of a letter is " + indexOfLetter);
        
        //print string if it contains a substring
        String sub = "yo";
        if (s1.contains(sub)){
            System.out.println("The substring is " + s1);
        }
        //grab a substring using 2 indexes
          System.out.println("The substring of 2 indexes is " + s1.substring(1,3));
          
        //print a reverse string - build a method
        System.out.println("The reverse string is " + reverseString(s1));
        
        System.out.println(" ");
    }

    }
    
    public static String reverseString(String s) {
    	StringBuilder sb = new StringBuilder();	
    	for (int i = s.length() -1 ; i >= 0; i--) {
    		sb.append(s.charAt(i));
    	}
        return sb.toString();
    }
    
}
