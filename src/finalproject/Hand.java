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
public class Hand extends GroupOfCard{
    
    private ArrayList<Card> myHand;

    public Hand() {
        myHand = new ArrayList<>();
    }
    
    public void takeCard(Card newCard){
        myHand.add(newCard);
    }
    
    //Ascending alphabetical order: clubs (lowest), followed by diamonds, hearts, and spades (highest)
    public void orderHand(){
        Collections.sort(myHand);
        ArrayList<Card> orderedHand = new ArrayList<>();
        
        for(int i = 0; i < 4; i++){
            for(Card e : myHand){
                if(e.getTheCardSuite()==Suit.values()[i]){
                    orderedHand.add(e);
                }
            }
        }
        
        myHand = orderedHand;
    }

    public Card dealCard(){
        return myHand.remove(0);
    }
    
    public int numOfCard() {
        return myHand.size();
    }
    
    public void removeAllCard() {
        myHand.clear();
    }
    
    
    @Override
    public String toString() {
        myHand.forEach((e) -> {
            System.out.println(e.toString());
        });
//        int i = 0;
//        while(i<4){
//            switch (i){
//                case 0: 
//                    myHand.forEach((e) -> {
//                        if(e.getTheCardSuite()==Suit.SPADES){
//                            System.out.println(e.toString());
//                        }
//                    });
//                    break;
//                case 1: 
//                    myHand.forEach((e) -> {
//                        if(e.getTheCardSuite()==Suit.HEARTS){
//                            System.out.println(e.toString());
//                        }
//                    });
//                    break;
//                case 2: 
//                    myHand.forEach((e) -> {
//                        if(e.getTheCardSuite()==Suit.DIAMONDS){
//                            System.out.println(e.toString());
//                        }
//                    });
//                    break;
//                default:
//                    myHand.forEach((e) -> {
//                        if(e.getTheCardSuite()==Suit.CLUBS){
//                            System.out.println(e.toString());
//                        }
//                    });
//                    break;
//            }
//            i++;
//        }
        return "";
    }
    
    
}
