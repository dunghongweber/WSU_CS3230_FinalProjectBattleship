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
public enum ValueOfCard {
    ACE (14),
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    EIGHT (8),
    NINE (9),
    TEN (10),
    JACK (11),
    QUEEN (12),
    KING (13);
    
    private int cardValue;
    
    private ValueOfCard(int value){
        this.cardValue = value;
    }

    public int getvalueOfTheCard() {
        return cardValue;
    }
}
