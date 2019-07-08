/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;
import java.util.Collections;
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
public class Deck extends GroupOfCard{
    
    private ArrayList<Card> myDeck;

    public Deck() {
        this.myDeck = new ArrayList<>();
        
        for(int i = 0; i < 13; i++){
            ValueOfCard cardValue = ValueOfCard.values()[i];
            
            for(int j=0; j<4; j++){
                Card newCard = new Card(cardValue, Suit.values()[j]);
                this.myDeck.add(newCard);
            }
        }
        
    }
    
    public Card dealCard(){
        return myDeck.remove(0);
    }
    
    public int numOfCard() {
        return myDeck.size();
    }
    
    public void shuffleDeck(){
        Collections.shuffle(myDeck);
    }

    @Override
    public String toString() {
        
        int i = 0;
        while(i<4){
            switch (i){
                case 0: 
                    myDeck.forEach((e) -> {
                        if(e.getTheCardSuite()==Suit.SPADES){
                            System.out.println(e.toString());
                        }
                    });
                    break;
                case 1: 
                    myDeck.forEach((e) -> {
                        if(e.getTheCardSuite()==Suit.HEARTS){
                            System.out.println(e.toString());
                        }
                    });
                    break;
                case 2: 
                    myDeck.forEach((e) -> {
                        if(e.getTheCardSuite()==Suit.DIAMONDS){
                            System.out.println(e.toString());
                        }
                    });
                    break;
                default:
                    myDeck.forEach((e) -> {
                        if(e.getTheCardSuite()==Suit.CLUBS){
                            System.out.println(e.toString());
                        }
                    });
                    break;
            }
            i++;
        }
        return "";
    }

}
