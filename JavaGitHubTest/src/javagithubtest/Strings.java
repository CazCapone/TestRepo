package javagithubtest;

/**
 *
 * @author jduclos1
 */
public class Strings {
    public static String a = "abc";
    public static String b = "def";
    
    
    public static void main(String[] args){
    System.out.println(a + " " + b);
    System.out.println(a.concat(b));
    System.out.println(a.concat(" ").concat(b));
    
    StringBuilder sb = new StringBuilder();
    sb.append(a);
    sb.append(b);
    sb.insert(2, "zzz");
    sb.delete(5, 7);
    String s = sb.toString();
    System.out.println(s);
    
    String c = "cat";
    String d = "dog";
    String e = "elephant";
    String f = "frog";
    String[] strings = {c, d, e, f};
    
    
    
    }
    
    
    
}
