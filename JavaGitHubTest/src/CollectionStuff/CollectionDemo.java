/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionStuff;

import com.sun.prism.paint.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jduclos1
 */
public class CollectionDemo {
    //Collection -> List -> ArrayList
    
    
    public static void main(String[] args){
        //does not use indexes so must use Iterator to go thru
        Collection ex = new ArrayList();
        ex.add("a");
        ex.add("b");
        System.out.println(ex);
        
        Iterator it = ex.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
            
        Collection<Integer> ex2 = new ArrayList<>();
        ex2.add(8);
        ex2.add(5);
        ex2.add(10);
        System.out.println(ex2);
        
        Collection<String> ex3 = new ArrayList<>();
        ex3.add("about");
        ex3.add("taco");
        System.out.println(ex3);
        
        //ordered list - can have duplicate values and uses indexes
        List<Integer> lex = new ArrayList<>();
        lex.add(5);
        lex.add(7);
        lex.add(2);
        lex.add(1, 6);  //uses index to place item @ index 1
        System.out.println("list is " + lex);
        Collections.sort(lex);
        System.out.println("Sorted list is " + lex);
        Collections.reverse(lex);
        System.out.println("Reversed list is " + lex);
        Collections.shuffle(lex);
        System.out.println("Shuffled list is " + lex);
        
    /*    
        lex.stream()
                .filter(e -> getNumber() == 7)
                .forEach(e -> System.out.println(lex.get(getName())));
     */   
        
        for(int i=0 ; i < lex.size() ; i++){
            System.out.println(lex.get(i));
        }
        //OR for-each loop
        for(Integer i : lex){
            System.out.println(i);
        }
        
        //No duplicate values  - SortedSet (Ascending order)
        Set<Integer> sex = new HashSet<>();
        
        //No duplicate values
        Set<Integer> sex2 = new TreeSet<>();
        
        //maps keys to values  - SortedMap (Ascending order)
        Map<Integer, String> m = new HashMap<>();
        
        
    }
    
    
}
