/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardEx;

import java.util.Random;

/**
 *
 * @author jduclos1
 */
public class Cards {
    String[] rank = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    
    public String getSuit(){
        Random rand = new Random();
        int r = rand.nextInt(4);
        return suit[r];
    }
    
    public String getRank(){
        Random rand = new Random();
        int r = rand.nextInt(14);
        return rank[r];
    }
    
    
    
}
