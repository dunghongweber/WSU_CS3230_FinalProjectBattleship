/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
/**
 * @author Dung Hong
 * 
 * Assignment : Homework Week 5 - Initial Card Game
 * 
 * Due Day: Feb 17, 2018
 * 
 * Description :  Modify your card game application and classes to include 
 * the following modifications and additional capabilities
 */
public enum Suit {
    SPADES (4),
    HEARTS (3),
    DIAMONDS (2),
    CLUBS (1);
    
    private int suitValue;
    
    private Suit(int value){
        this.suitValue = value;
    }

    public int getvalueOfSuit() {
        return suitValue;
    }
}
