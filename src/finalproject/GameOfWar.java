/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;

/**
 *
 * @author Dung Hong
 */
public class GameOfWar implements Game{
    
    private final int NUMBER_OF_ROUNDS = 5;
    private int startRound = 0;
    
    //piles for the game
    private ArrayList<Card> comparePile;
    private ArrayList<Card> player1Pile;
    private ArrayList<Card> player2Pile;
    
    //players
    private Hand player1;
    private Hand player2;
    

    @Override
    public void initialize() {
        comparePile =  new ArrayList<>();
        player1Pile =  new ArrayList<>();
        player2Pile =  new ArrayList<>();
        
        Deck newDeck = new Deck();
        
        newDeck.shuffleDeck();
        newDeck.shuffleDeck();
        newDeck.shuffleDeck();
        
        player1 = new Hand();
        player2 = new Hand();
        
        for(int i = 0; i < 26; i++){
            player1.takeCard(newDeck.dealCard());
            player2.takeCard(newDeck.dealCard());
        }
    }

    @Override
    public void play() {
        while(startRound<NUMBER_OF_ROUNDS ){
            
            /*
            ********for testing round playing*********
            
            System.out.println("Round number : "+(startRound+1));
            System.out.println("Player 1 has "+player1.numOfCard()+" cards");
            System.out.println("Player 2 has "+player2.numOfCard()+" cards");
            */
            //each player deal a card out
            comparePile.add(player1.dealCard());
            comparePile.add(player2.dealCard());
            
            //player 1 out of card, but player 2 has card
            if(player1.numOfCard()==0&&player2.numOfCard()!=0){
                //player 1 pile has cards, add these to player 1 hand
                if (!player1Pile.isEmpty()) {
                    player1Pile.forEach((e) -> {
                        player1.takeCard(e);
                    });
                    player1Pile.clear();
                    startRound++;
                }else{
                    //if player 1 pile has no card, end game
                    switch (comparePile.get(comparePile.size()-1).compareTo(comparePile.get(comparePile.size()))) {
                        case 1:
                            comparePile.forEach((e) -> {
                                player1Pile.add(e);
                            });
                            comparePile.clear();
                            break;
                        case -1:
                            comparePile.forEach((e) -> {
                                player2Pile.add(e);
                            });
                            comparePile.clear();
                            break;
                        default:
                            break;
                    }
                    break;
                }
            }
            
            //player 2 out of card, but player 1 has card
            else if(player1.numOfCard()!=0&&player2.numOfCard()==0){
                //player 2 pile has cards, add these to player 2 hand
                if (!player2Pile.isEmpty()) {
                    player2Pile.forEach((e) -> {
                        player2.takeCard(e);
                    });
                    player2Pile.clear();
                    startRound++;
                }else{
                    //if player 2 pile has no card, end game
                    switch (comparePile.get(comparePile.size()-1).compareTo(comparePile.get(comparePile.size()))) {
                        case 1:
                            comparePile.forEach((e) -> {
                                player1Pile.add(e);
                            });
                            comparePile.clear();
                            break;
                        case -1:
                            comparePile.forEach((e) -> {
                                player2Pile.add(e);
                            }); 
                            comparePile.clear();
                            break;
                        default:
                            break;
                    }
                    break;
                }
            }
            
            // both player out of cards
            else if(player1.numOfCard()==0&&player2.numOfCard()==0){
                //both piles are not empty
                if( !(player1Pile.isEmpty()&&player2Pile.isEmpty()) ){
                    //add player 1 pile to player 1 hand
                    player1Pile.forEach((e) -> {
                        player1.takeCard(e);
                    });
                    player1Pile.clear();
                    //add player 2 pile to player 1 hand
                    player2Pile.forEach((e) -> {
                        player2.takeCard(e);
                    });
                    player2Pile.clear();
                    startRound++;
                }else{
                    //one of players out of card
                    break;
                }
            }
            
            switch (comparePile.get(comparePile.size()-2).compareTo(comparePile.get(comparePile.size()-1))) {
                case 1:
                    comparePile.forEach((e) -> {
                        player1Pile.add(e);
                    });
                    comparePile.clear();
                    /*
                    testing if player 1 wins this deal
                    System.out.println("***********Player 1 win this deal***********\n");
                    */
                    break;
                case -1:
                    comparePile.forEach((e) -> {
                        player2Pile.add(e);
                    });
                    comparePile.clear();
                    /*
                    Testing if player 2 wins this deal
                    System.out.println("***********Player 2 win this deal***********\n");
                    */
                    break;
                default:
                    if(player1.numOfCard()==3 && player2.numOfCard()==3){
                        for(int i = 0; i < 2; i++){
                            comparePile.add(player1.dealCard());
                            comparePile.add(player2.dealCard());
                        }
                    }else{
                        break;
                    }
                    /*
                    testing if there is war
                    System.out.println("***********WAR!!!***********\n");
                    */
                    break;
            }
            
        }
    }

    @Override
    public void displayWinner() {
        int player1Score = player1.numOfCard()+player1Pile.size();
        int player2Score = player2.numOfCard()+player2Pile.size();
        
        if(player1Score>player2Score){
            System.out.println("Player 1 WIN");
        }
        else{
            System.out.println("Player 2 WIN");
        }
    }
    
}
