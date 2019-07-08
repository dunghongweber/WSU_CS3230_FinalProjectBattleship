/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Dung Hong
 */
public class GOWController implements Initializable {
    
    private final int NUMBER_OF_ROUNDS = 1;
    private int startRound = 0;
    private boolean itIsWar = false;
    
    //piles for the game
    private ArrayList<Card> comparePile;
    private ArrayList<Card> player1Pile;
    private ArrayList<Card> player2Pile;
    
    //players
    private Hand player1;
    private Hand player2;
    
    @FXML
    private Label displayLabel = new Label();
    
    @FXML
    private Button playBtn = new Button();
    
    @FXML
    private Button winnerBtn = new Button();
    
    @FXML
    private ImageView initializedDeck = new ImageView();
    
    @FXML
    private ImageView player1Hand = new ImageView();
    
    @FXML
    private ImageView player1Card = new ImageView();
    
    
    @FXML
    private ImageView player2Hand = new ImageView();
    
    @FXML
    private ImageView player2Card = new ImageView();
    
    @FXML
    private Pane theTable = new Pane();
    
    @FXML
    ImageView play1Down = new ImageView();
    
    @FXML
    ImageView play2Down = new ImageView();

    @FXML
    ImageView play1DownCenter = new ImageView();
    
    @FXML
    ImageView play2DownCenter = new ImageView();
    
    @FXML
    private void handleButtonPlay(ActionEvent event) {
        System.out.println("Start round : "+startRound);
        playBtn.setText("Deal");
        play();
    }
    
    @FXML
    private void gotoMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setTitle("Final Project");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void handleButtonWinner(ActionEvent event) {
        displayWinner();
        initialize();
    }
    
    @FXML
    private void handleButtonExit(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        winnerBtn.setDisable(true);
        playBtn.setDisable(true);
        theTable.setStyle("-fx-background-color: green");
        theTable.setPrefHeight(400);
        theTable.setPrefWidth(400);
        initialize();
        displayPlayerHands();
        
    }
    
    //display winner of the game
    public void displayWinner() {
        int player1Score = player1.numOfCard()+player1Pile.size();
        int player2Score = player2.numOfCard()+player2Pile.size();
        
        if(player1Score>player2Score){
            
            displayLabel.setText("Player 1 WIN");
            displayLabel.setFont(Font.font(55));
            
            Line lineToDisplay = new Line(475, 500 , 475, 30);  
            lineToDisplay.setVisible(false);
            
            theTable.getChildren().addAll(displayLabel,lineToDisplay);
        
            // Create path transitions
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToDisplay, displayLabel);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(4);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                theTable.getChildren().removeAll(displayLabel,lineToDisplay);
            });
            
            System.out.println("Player 1 WIN");
        }
        else{
            
            displayLabel.setText("Player 2 WIN");
            displayLabel.setFont(Font.font(55));
            
            Line lineToDisplay = new Line(475, 500 , 475, 30);  
            lineToDisplay.setVisible(false);
            
            theTable.getChildren().addAll(displayLabel,lineToDisplay);
        
            // Create path transitions
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToDisplay, displayLabel);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(4);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                theTable.getChildren().removeAll(displayLabel,lineToDisplay);
            });
            
            System.out.println("Player 2 WIN");
        }
        
        player1.removeAllCard();
        player2.removeAllCard();
        player1Pile.clear();
        player2Pile.clear();
        comparePile.clear();
        startRound = 0;
        initialize();
    }
    
    //initialize the card game
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
    
    public Image getCardImage(Card theCard){
        if(theCard.getTheCardSuite()==Suit.CLUBS){
            switch(theCard.getTheCardNum().getvalueOfTheCard()){
                case 2:
                    Image returnImg0 = new Image("image/2C.png");
                    return returnImg0;
                case 3:
                    Image returnImg1 = new Image("image/3C.png");
                    return returnImg1;
                case 4:
                    Image returnImg2 = new Image("image/4C.png");
                    return returnImg2;
                case 5:
                    Image returnImg3 = new Image("image/5C.png");
                    return returnImg3;
                case 6:
                    Image returnImg4 = new Image("image/6C.png");
                    return returnImg4;
                case 7:
                    Image returnImg5 = new Image("image/7C.png");
                    return returnImg5;
                case 8:
                    Image returnImg6 = new Image("image/8C.png");
                    return returnImg6;
                case 9:
                    Image returnImg7 = new Image("image/9C.png");
                    return returnImg7;
                case 10:
                    Image returnImg8 = new Image("image/10C.png");
                    return returnImg8;
                case 11:
                    Image returnImg9 = new Image("image/JC.png");
                    return returnImg9;
                case 12:
                    Image returnImg10 = new Image("image/QC.png");
                    return returnImg10;
                case 13:
                    Image returnImg11 = new Image("image/KC.png");
                    return returnImg11;
                default:
                    Image returnImg = new Image("image/AC.png");
                    return returnImg;
            }
        }
        else if(theCard.getTheCardSuite()==Suit.DIAMONDS){
             switch(theCard.getTheCardNum().getvalueOfTheCard()){
                case 2:
                    Image returnImg0 = new Image("image/2D.png");
                    return returnImg0;
                case 3:
                    Image returnImg1 = new Image("image/3D.png");
                    return returnImg1;
                case 4:
                    Image returnImg2 = new Image("image/4D.png");
                    return returnImg2;
                case 5:
                    Image returnImg3 = new Image("image/5D.png");
                    return returnImg3;
                case 6:
                    Image returnImg4 = new Image("image/6D.png");
                    return returnImg4;
                case 7:
                    Image returnImg5 = new Image("image/7D.png");
                    return returnImg5;
                case 8:
                    Image returnImg6 = new Image("image/8D.png");
                    return returnImg6;
                case 9:
                    Image returnImg7 = new Image("image/9D.png");
                    return returnImg7;
                case 10:
                    Image returnImg8 = new Image("image/10D.png");
                    return returnImg8;
                case 11:
                    Image returnImg9 = new Image("image/JD.png");
                    return returnImg9;
                case 12:
                    Image returnImg10 = new Image("image/QD.png");
                    return returnImg10;
                case 13:
                    Image returnImg11 = new Image("image/KD.png");
                    return returnImg11;
                default:
                    Image returnImg = new Image("image/AD.png");
                    return returnImg;
            }
        }
        else if(theCard.getTheCardSuite()==Suit.HEARTS){
             switch(theCard.getTheCardNum().getvalueOfTheCard()){
                case 2:
                    Image returnImg0 = new Image("image/2H.png");
                    return returnImg0;
                case 3:
                    Image returnImg1 = new Image("image/3H.png");
                    return returnImg1;
                case 4:
                    Image returnImg2 = new Image("image/4H.png");
                    return returnImg2;
                case 5:
                    Image returnImg3 = new Image("image/5H.png");
                    return returnImg3;
                case 6:
                    Image returnImg4 = new Image("image/6H.png");
                    return returnImg4;
                case 7:
                    Image returnImg5 = new Image("image/7H.png");
                    return returnImg5;
                case 8:
                    Image returnImg6 = new Image("image/8H.png");
                    return returnImg6;
                case 9:
                    Image returnImg7 = new Image("image/9H.png");
                    return returnImg7;
                case 10:
                    Image returnImg8 = new Image("image/10H.png");
                    return returnImg8;
                case 11:
                    Image returnImg9 = new Image("image/JH.png");
                    return returnImg9;
                case 12:
                    Image returnImg10 = new Image("image/QH.png");
                    return returnImg10;
                case 13:
                    Image returnImg11 = new Image("image/KH.png");
                    return returnImg11;
                default:
                    Image returnImg = new Image("image/AH.png");
                    return returnImg;
            }
        }
        else if(theCard.getTheCardSuite()==Suit.SPADES){
             switch(theCard.getTheCardNum().getvalueOfTheCard()){
                case 2:
                    Image returnImg0 = new Image("image/2S.png");
                    return returnImg0;
                case 3:
                    Image returnImg1 = new Image("image/3S.png");
                    return returnImg1;
                case 4:
                    Image returnImg2 = new Image("image/4S.png");
                    return returnImg2;
                case 5:
                    Image returnImg3 = new Image("image/5S.png");
                    return returnImg3;
                case 6:
                    Image returnImg4 = new Image("image/6S.png");
                    return returnImg4;
                case 7:
                    Image returnImg5 = new Image("image/7S.png");
                    return returnImg5;
                case 8:
                    Image returnImg6 = new Image("image/8S.png");
                    return returnImg6;
                case 9:
                    Image returnImg7 = new Image("image/9S.png");
                    return returnImg7;
                case 10:
                    Image returnImg8 = new Image("image/10S.png");
                    return returnImg8;
                case 11:
                    Image returnImg9 = new Image("image/JS.png");
                    return returnImg9;
                case 12:
                    Image returnImg10 = new Image("image/QS.png");
                    return returnImg10;
                case 13:
                    Image returnImg11 = new Image("image/KS.png");
                    return returnImg11;
                default:
                    Image returnImg = new Image("image/AS.png");
                    return returnImg;
            }
        }
        return null;
    }

    //divide the deck of card into 2 hands and give out cards to players
    public void displayPlayerHands() {
        initializedDeck.setVisible(false);
        
        player1Hand.setImage(new Image("image/back.png"));
        player1Hand.setFitHeight(200);
        player1Hand.setFitWidth(120);
        
        player2Hand.setImage(new Image("image/back.png"));
        player2Hand.setFitHeight(200);
        player2Hand.setFitWidth(120);
        
        Line lineToPlayer1 = new Line(475, 350 , 60, 100);  
        lineToPlayer1.setVisible(false);
        
        Line lineToPlayer2 = new Line(475, 350 ,890, 550);  
        lineToPlayer2.setVisible(false);
        
        theTable.getChildren().addAll(player1Hand,lineToPlayer1,player2Hand,lineToPlayer2);
        
        // Create path transitions
        PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToPlayer1, player1Hand);
        pt1.setDelay(Duration.ZERO);
        pt1.setCycleCount(1);
        pt1.setRate(5);
        pt1.play(); // Start animation 
        
        // Create path transitions
        PathTransition pt2 = new PathTransition(Duration.millis(10000), lineToPlayer2, player2Hand);
        pt2.setDelay(Duration.ZERO);
        pt2.setCycleCount(1);
        pt2.setRate(5);
        pt2.play(); // Start animation 
        
        pt2.setOnFinished(e->{
            playBtn.setDisable(false);
        });
        
    }
    
    public void displayCardDeal(Card p1Card, Card p2Card){
        playBtn.setDisable(true);
        winnerBtn.setDisable(false);
        initializedDeck.setVisible(false);
        if(itIsWar==true){
            initializedDeck.setVisible(true);
            itIsWar = false;
        }
        
        player1Card.setImage(getCardImage(p1Card));
        player1Card.setFitHeight(200);
        player1Card.setFitWidth(120);

        player2Card.setImage(getCardImage(p2Card));
        player2Card.setFitHeight(200);
        player2Card.setFitWidth(120);

        //Line lineFromPlayer1 = new Line(475, 350 , 60, 100);
        Line lineFromPlayer1 = new Line(60, 100 , 475, 250); 
        lineFromPlayer1.setVisible(false);

        //Line lineFromPlayer2 = new Line(475, 350 ,890, 550);  
        Line lineFromPlayer2 = new Line(890, 550 ,475, 450);
        lineFromPlayer2.setVisible(false);

        theTable.getChildren().addAll(player1Card,lineFromPlayer1,player2Card,lineFromPlayer2);
        
        // Create path transitions
        PathTransition pt1 = new PathTransition(Duration.millis(10000), lineFromPlayer1, player1Card);
        pt1.setDelay(Duration.ZERO);
        pt1.setCycleCount(1);
        pt1.setRate(4);
        pt1.play(); // Start animation 

        // Create path transitions
        PathTransition pt2 = new PathTransition(Duration.millis(10000), lineFromPlayer2, player2Card);
        pt2.setDelay(Duration.ZERO);
        pt2.setCycleCount(1);
        pt2.setRate(4);
        pt2.play(); // Start animation
        
        pt1.setOnFinished(e->{
            theTable.getChildren().removeAll(lineFromPlayer1);
            checkWinDeal();
        });
        
        pt2.setOnFinished(e->{
            theTable.getChildren().removeAll(lineFromPlayer2);
           
            //checkWinDeal();
        });
    }
    
    public void displayPlayer1WinDeal(){
        initializedDeck.setVisible(false);
        //Line lineFromPlayer1 = new Line(60, 100 , 475, 250);
        Line lineFromPlayer1 = new Line(475, 250 , 60, 100);
        lineFromPlayer1.setVisible(false);

        //Line lineFromPlayer2 = new Line(890, 550 ,475, 450);
        Line lineFromPlayer2 = new Line(475, 450 ,60, 100);
        lineFromPlayer2.setVisible(false);

        theTable.getChildren().addAll(lineFromPlayer1,lineFromPlayer2);
        
        // Create path transitions
        PathTransition pt1 = new PathTransition(Duration.millis(10000), lineFromPlayer1, player1Card);
        pt1.setDelay(Duration.ZERO);
        pt1.setCycleCount(1);
        pt1.setRate(4);
        pt1.play(); // Start animation 

        // Create path transitions
        PathTransition pt2 = new PathTransition(Duration.millis(10000), lineFromPlayer2, player2Card);
        pt2.setDelay(Duration.ZERO);
        pt2.setCycleCount(1);
        pt2.setRate(4);
        pt2.play(); // Start animation
        
        pt1.setOnFinished(e->{
            theTable.getChildren().removeAll(lineFromPlayer1,player1Card);
            playBtn.setDisable(false);
        });
        
        pt2.setOnFinished(e->{
            theTable.getChildren().removeAll(lineFromPlayer2,player2Card);
            playBtn.setDisable(false);
        });
    }
    
    public void displayPlayer2WinDeal(){
        initializedDeck.setVisible(false);
        //Line lineFromPlayer1 = new Line(60, 100 , 475, 250);
        Line lineFromPlayer1 = new Line(475, 250 , 890, 550);
        lineFromPlayer1.setVisible(false);

        //Line lineFromPlayer2 = new Line(890, 550 ,475, 450);
        Line lineFromPlayer2 = new Line(475, 450 ,890, 550);
        lineFromPlayer2.setVisible(false);

        theTable.getChildren().addAll(lineFromPlayer1,lineFromPlayer2);
        
        // Create path transitions
        PathTransition pt1 = new PathTransition(Duration.millis(10000), lineFromPlayer1, player1Card);
        pt1.setDelay(Duration.ZERO);
        pt1.setCycleCount(1);
        pt1.setRate(4);
        pt1.play(); // Start animation 

        // Create path transitions
        PathTransition pt2 = new PathTransition(Duration.millis(10000), lineFromPlayer2, player2Card);
        pt2.setDelay(Duration.ZERO);
        pt2.setCycleCount(1);
        pt2.setRate(4);
        pt2.play(); // Start animation
        
        pt1.setOnFinished(e->{
            theTable.getChildren().removeAll(lineFromPlayer1,player1Card);
            playBtn.setDisable(false);
        });
        
        pt2.setOnFinished(e->{
            theTable.getChildren().removeAll(lineFromPlayer2,player2Card);
            playBtn.setDisable(false);
        });
    }
    
    public void displayWar(){
        //theTable.getChildren().removeAll(player1Card, player2Card);
        
        play1Down.setImage(new Image("image/back.png"));
        play1Down.setFitHeight(200);
        play1Down.setFitWidth(120);
        
        play1DownCenter.setImage(new Image("image/back.png"));
        play1DownCenter.setFitHeight(200);
        play1DownCenter.setFitWidth(120);

        play2Down.setImage(new Image("image/back.png"));
        play2Down.setFitHeight(200);
        play2Down.setFitWidth(120);
        
        play2DownCenter.setImage(new Image("image/back.png"));
        play2DownCenter.setFitHeight(200);
        play2DownCenter.setFitWidth(120);

        Line lineFromPlayer1 = new Line(60, 100 , 475, 250); 
        lineFromPlayer1.setVisible(false);
 
        Line lineFromPlayer2 = new Line(890, 550 ,475, 450);
        lineFromPlayer2.setVisible(false);

        theTable.getChildren().addAll(play1Down, play1DownCenter,lineFromPlayer1,
                play2Down, play2DownCenter,lineFromPlayer2);
        
        // Create path transitions
        PathTransition pt1 = new PathTransition(Duration.millis(10000), lineFromPlayer1, play1Down);
        pt1.setDelay(Duration.ZERO);
        pt1.setCycleCount(2);
        pt1.setRate(4);
        
        // Create path transitions
        PathTransition pt1Center = new PathTransition(Duration.millis(10000), lineFromPlayer1, play1DownCenter);
        pt1Center.setDelay(Duration.ZERO);
        pt1Center.setCycleCount(1);
        pt1Center.setRate(4);
        pt1Center.play(); // Start animation 

        // Create path transitions
        PathTransition pt2 = new PathTransition(Duration.millis(10000), lineFromPlayer2, play2Down);
        pt2.setDelay(Duration.ZERO);
        pt2.setCycleCount(2);
        pt2.setRate(4);
        
        // Create path transitions
        PathTransition pt2Center = new PathTransition(Duration.millis(10000), lineFromPlayer2, play2DownCenter);
        pt2Center.setDelay(Duration.ZERO);
        pt2Center.setCycleCount(1);
        pt2Center.setRate(4);
        pt2Center.play(); // Start animation
        
        pt1Center.setOnFinished(e->{
            pt1.play();
            
            playBtn.setDisable(false);
        });
        
        pt2Center.setOnFinished(e->{
            pt2.play();
            
            playBtn.setDisable(false);
            
        });
        
        pt1.setOnFinished(e->{
            theTable.getChildren().removeAll(lineFromPlayer1, player1Card, play1DownCenter, play1Down);
            playBtn.setDisable(false);
        });
        
        pt2.setOnFinished(e->{
            theTable.getChildren().removeAll(lineFromPlayer2, player2Card, play2DownCenter,play2Down);
            playBtn.setDisable(false);
            initializedDeck.setVisible(true);
            play();
        });
    }
    
    public void checkWinDeal(){
        if(comparePile.size()>0){
            switch (comparePile.get(comparePile.size()-2).compareTo(comparePile.get(comparePile.size()-1))) {
                case 1:
                    displayPlayer1WinDeal();
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
                    displayPlayer2WinDeal();
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
                    itIsWar = true;
                    displayWar();
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
    
    public void play() {
        if(startRound<NUMBER_OF_ROUNDS ){
            Card p1Card, p2Card;
            //each player deal a card out
            p1Card = player1.dealCard();
            p2Card = player2.dealCard();
            
            comparePile.add(p1Card);
            comparePile.add(p2Card);
            
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
                    displayWinner();
                    //break;
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
                    displayWinner();
                    //break;
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
                    //break;
                    displayWinner();
                }
            }
            //animate dealing cards
            displayCardDeal(p1Card, p2Card);
        }
        else{
            displayWinner();
        }
    }
    
}
