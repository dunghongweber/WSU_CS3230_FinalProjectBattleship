/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Dung Hong
 */
public class MyGameController implements Initializable {
    
    private static ArrayList<Integer> chosenPoints = new ArrayList<>();
    private static ArrayList<Integer> deployedPoints = new ArrayList<>();
    private static ArrayList<Integer> chosenStartingPoints = new ArrayList<>();
    private Carrier myCarrier = new Carrier();
    private Cruiser myCruiser = new Cruiser();
    private Destroyer myDestroyer = new Destroyer();
    
    @FXML
    Pane myPane = new Pane();
    
    @FXML
    ImageView rocket = new ImageView();
    
    @FXML
    ImageView target = new ImageView();
    
    @FXML
    ImageView imgCarrier = new ImageView();
    @FXML
    ImageView imgCruiser = new ImageView();
    @FXML
    ImageView imgDestroyer = new ImageView();
    
    @FXML
    Button fireBtn = new Button();
    
    @FXML
    TextArea winner = new TextArea();
    
    @FXML
    CheckBox checkBox0 = new CheckBox();
    @FXML
    CheckBox checkBox1 = new CheckBox();
    @FXML
    CheckBox checkBox2 = new CheckBox();
    @FXML
    CheckBox checkBox3 = new CheckBox();
    @FXML
    CheckBox checkBox4 = new CheckBox();
    @FXML
    CheckBox checkBox5 = new CheckBox();
    @FXML
    CheckBox checkBox6 = new CheckBox();
    @FXML
    CheckBox checkBox7 = new CheckBox();
    @FXML
    CheckBox checkBox8 = new CheckBox();
    @FXML
    CheckBox checkBox9 = new CheckBox();
    
    @FXML
    CheckBox checkBox10 = new CheckBox();
    @FXML
    CheckBox checkBox11 = new CheckBox();
    @FXML
    CheckBox checkBox12 = new CheckBox();
    @FXML
    CheckBox checkBox13 = new CheckBox();
    @FXML
    CheckBox checkBox14 = new CheckBox();
    @FXML
    CheckBox checkBox15 = new CheckBox();
    @FXML
    CheckBox checkBox16 = new CheckBox();
    @FXML
    CheckBox checkBox17 = new CheckBox();
    @FXML
    CheckBox checkBox18 = new CheckBox();
    @FXML
    CheckBox checkBox19 = new CheckBox();
    
    @FXML
    CheckBox checkBox20 = new CheckBox();
    @FXML
    CheckBox checkBox21 = new CheckBox();
    @FXML
    CheckBox checkBox22 = new CheckBox();
    @FXML
    CheckBox checkBox23 = new CheckBox();
    @FXML
    CheckBox checkBox24 = new CheckBox();
    @FXML
    CheckBox checkBox25 = new CheckBox();
    @FXML
    CheckBox checkBox26 = new CheckBox();
    @FXML
    CheckBox checkBox27 = new CheckBox();
    @FXML
    CheckBox checkBox28 = new CheckBox();
    @FXML
    CheckBox checkBox29 = new CheckBox();
    
    @FXML
    CheckBox checkBox30 = new CheckBox();
    @FXML
    CheckBox checkBox31 = new CheckBox();
    @FXML
    CheckBox checkBox32 = new CheckBox();
    @FXML
    CheckBox checkBox33 = new CheckBox();
    @FXML
    CheckBox checkBox34 = new CheckBox();
    @FXML
    CheckBox checkBox35 = new CheckBox();
    @FXML
    CheckBox checkBox36 = new CheckBox();
    @FXML
    CheckBox checkBox37 = new CheckBox();
    @FXML
    CheckBox checkBox38 = new CheckBox();
    @FXML
    CheckBox checkBox39 = new CheckBox();
    
    @FXML
    CheckBox checkBox40 = new CheckBox();
    @FXML
    CheckBox checkBox41 = new CheckBox();
    @FXML
    CheckBox checkBox42 = new CheckBox();
    @FXML
    CheckBox checkBox43 = new CheckBox();
    @FXML
    CheckBox checkBox44 = new CheckBox();
    @FXML
    CheckBox checkBox45 = new CheckBox();
    @FXML
    CheckBox checkBox46 = new CheckBox();
    @FXML
    CheckBox checkBox47 = new CheckBox();
    @FXML
    CheckBox checkBox48 = new CheckBox();
    @FXML
    CheckBox checkBox49 = new CheckBox();
    
    @FXML
    CheckBox checkBox50 = new CheckBox();
    @FXML
    CheckBox checkBox51 = new CheckBox();
    @FXML
    CheckBox checkBox52 = new CheckBox();
    @FXML
    CheckBox checkBox53 = new CheckBox();
    @FXML
    CheckBox checkBox54 = new CheckBox();
    @FXML
    CheckBox checkBox55 = new CheckBox();
    @FXML
    CheckBox checkBox56 = new CheckBox();
    @FXML
    CheckBox checkBox57 = new CheckBox();
    @FXML
    CheckBox checkBox58 = new CheckBox();
    @FXML
    CheckBox checkBox59 = new CheckBox();
    
    @FXML
    CheckBox checkBox60 = new CheckBox();
    @FXML
    CheckBox checkBox61 = new CheckBox();
    @FXML
    CheckBox checkBox62 = new CheckBox();
    @FXML
    CheckBox checkBox63 = new CheckBox();
    @FXML
    CheckBox checkBox64 = new CheckBox();
    @FXML
    CheckBox checkBox65 = new CheckBox();
    @FXML
    CheckBox checkBox66 = new CheckBox();
    @FXML
    CheckBox checkBox67 = new CheckBox();
    @FXML
    CheckBox checkBox68 = new CheckBox();
    @FXML
    CheckBox checkBox69 = new CheckBox();
    
    @FXML
    CheckBox checkBox70 = new CheckBox();
    @FXML
    CheckBox checkBox71 = new CheckBox();
    @FXML
    CheckBox checkBox72 = new CheckBox();
    @FXML
    CheckBox checkBox73 = new CheckBox();
    @FXML
    CheckBox checkBox74 = new CheckBox();
    @FXML
    CheckBox checkBox75 = new CheckBox();
    @FXML
    CheckBox checkBox76 = new CheckBox();
    @FXML
    CheckBox checkBox77 = new CheckBox();
    @FXML
    CheckBox checkBox78 = new CheckBox();
    @FXML
    CheckBox checkBox79 = new CheckBox();
    
    @FXML
    CheckBox checkBox80 = new CheckBox();
    @FXML
    CheckBox checkBox81 = new CheckBox();
    @FXML
    CheckBox checkBox82 = new CheckBox();
    @FXML
    CheckBox checkBox83 = new CheckBox();
    @FXML
    CheckBox checkBox84 = new CheckBox();
    @FXML
    CheckBox checkBox85 = new CheckBox();
    @FXML
    CheckBox checkBox86 = new CheckBox();
    @FXML
    CheckBox checkBox87 = new CheckBox();
    @FXML
    CheckBox checkBox88 = new CheckBox();
    @FXML
    CheckBox checkBox89 = new CheckBox();
    
    @FXML
    CheckBox checkBox90 = new CheckBox();
    @FXML
    CheckBox checkBox91 = new CheckBox();
    @FXML
    CheckBox checkBox92 = new CheckBox();
    @FXML
    CheckBox checkBox93 = new CheckBox();
    @FXML
    CheckBox checkBox94 = new CheckBox();
    @FXML
    CheckBox checkBox95 = new CheckBox();
    @FXML
    CheckBox checkBox96 = new CheckBox();
    @FXML
    CheckBox checkBox97 = new CheckBox();
    @FXML
    CheckBox checkBox98 = new CheckBox();
    @FXML
    CheckBox checkBox99 = new CheckBox();
    
    
    @FXML
    GridPane myGride = new GridPane();
    

    @FXML
    private void handleButtonExit(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    private void handleButtonFire(ActionEvent event) {
        
        fireBtn.setDisable(true);
        
        if(checkBox0.isSelected()){
            checkBox0.setDisable(true);
            checkBox0.setSelected(false);
            
            target.setX(38);
            target.setY(4);
            
            Line lineToFire = new Line(0, 0 , 50, 20);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(0)|| myCruiser.fireShip(0) || myDestroyer.fireShip(0)){
                checkBox0.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox0.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox1.isSelected()){
            checkBox1.setDisable(true);
            checkBox1.setSelected(false);
            
            target.setX(138);
            target.setY(4);
            
            Line lineToFire = new Line(0, 0 , 150, 20);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(1)|| myCruiser.fireShip(1) || myDestroyer.fireShip(1)){
                checkBox1.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox1.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox2.isSelected()){
            checkBox2.setDisable(true);
            checkBox2.setSelected(false);
            
            target.setX(238);
            target.setY(4);
            
            Line lineToFire = new Line(0, 0 , 250, 20);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(2)|| myCruiser.fireShip(2) || myDestroyer.fireShip(2)){
                checkBox2.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox2.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox3.isSelected()){
            checkBox3.setDisable(true);
            checkBox3.setSelected(false);
            
            target.setX(338);
            target.setY(4);
            
            Line lineToFire = new Line(0, 0 , 350, 20);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(3)|| myCruiser.fireShip(3) || myDestroyer.fireShip(3)){
                checkBox3.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox3.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox4.isSelected()){
            checkBox4.setDisable(true);
            checkBox4.setSelected(false);
            
            target.setX(438);
            target.setY(4);
            
            Line lineToFire = new Line(0, 0 , 450, 20);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(4)|| myCruiser.fireShip(4) || myDestroyer.fireShip(4)){
                checkBox4.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox4.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox5.isSelected()){
            checkBox5.setDisable(true);
            checkBox5.setSelected(false);
            
            target.setX(538);
            target.setY(4);
            
            Line lineToFire = new Line(0, 0 , 550, 20);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(5)|| myCruiser.fireShip(5) || myDestroyer.fireShip(5)){
                checkBox5.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox5.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
       if(checkBox6.isSelected()){
            checkBox6.setDisable(true);
            checkBox6.setSelected(false);
            
            target.setX(638);
            target.setY(4);
            
            Line lineToFire = new Line(0, 0 , 650, 20);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(6)|| myCruiser.fireShip(6) || myDestroyer.fireShip(6)){
                checkBox6.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox6.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox7.isSelected()){
            checkBox7.setDisable(true);
            checkBox7.setSelected(false);
            
            target.setX(738);
            target.setY(4);
            
            Line lineToFire = new Line(0, 0 , 750, 20);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(7)|| myCruiser.fireShip(7) || myDestroyer.fireShip(7)){
                checkBox7.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox7.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox8.isSelected()){
            checkBox8.setDisable(true);
            checkBox8.setSelected(false);
            
            target.setX(838);
            target.setY(4);
            
            Line lineToFire = new Line(0, 0 , 850, 20);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(8)|| myCruiser.fireShip(8) || myDestroyer.fireShip(8)){
                checkBox8.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox8.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox9.isSelected()){
            checkBox9.setDisable(true);
            checkBox9.setSelected(false);
            
            target.setX(938);
            target.setY(4);
            
            Line lineToFire = new Line(0, 0 , 950, 20);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(9)|| myCruiser.fireShip(9) || myDestroyer.fireShip(9)){
                checkBox9.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox9.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        
        
        if(checkBox10.isSelected()){
            checkBox10.setDisable(true);
            checkBox10.setSelected(false);
            
            target.setX(38);
            target.setY(53);
            
            Line lineToFire = new Line(0, 0 , 50, 65);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(10)|| myCruiser.fireShip(10) || myDestroyer.fireShip(10)){
                checkBox10.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox10.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox11.isSelected()){
            checkBox11.setDisable(true);
            checkBox11.setSelected(false);
            
            target.setX(138);
            target.setY(53);
            
            Line lineToFire = new Line(0, 0 , 150, 65);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(11)|| myCruiser.fireShip(11) || myDestroyer.fireShip(11)){
                checkBox11.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox11.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox12.isSelected()){
            checkBox12.setDisable(true);
            checkBox12.setSelected(false);
            
            target.setX(238);
            target.setY(53);
            
            Line lineToFire = new Line(0, 0 , 250, 65);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(12)|| myCruiser.fireShip(12) || myDestroyer.fireShip(12)){
                checkBox12.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox12.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox13.isSelected()){
            checkBox13.setDisable(true);
            checkBox13.setSelected(false);
            
            target.setX(338);
            target.setY(53);
            
            Line lineToFire = new Line(0, 0 , 350, 65);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(13)|| myCruiser.fireShip(13) || myDestroyer.fireShip(13)){
                checkBox13.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox13.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox14.isSelected()){
            checkBox14.setDisable(true);
            checkBox14.setSelected(false);
            
            target.setX(438);
            target.setY(53);
            
            Line lineToFire = new Line(0, 0 , 450, 65);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(14)|| myCruiser.fireShip(14) || myDestroyer.fireShip(14)){
                checkBox14.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox14.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
       if(checkBox15.isSelected()){
           checkBox15.setDisable(true);
            checkBox15.setSelected(false);
            
            target.setX(538);
            target.setY(53);
            
            Line lineToFire = new Line(0, 0 , 550, 65);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(15)|| myCruiser.fireShip(15) || myDestroyer.fireShip(15)){
                checkBox15.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox15.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox16.isSelected()){
            checkBox16.setDisable(true);
            checkBox16.setSelected(false);
            
            target.setX(638);
            target.setY(53);
            
            Line lineToFire = new Line(0, 0 , 650, 65);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(16)|| myCruiser.fireShip(16) || myDestroyer.fireShip(16)){
                checkBox16.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox16.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox17.isSelected()){
            checkBox17.setDisable(true);
            checkBox17.setSelected(false);
            
            target.setX(738);
            target.setY(53);
            
            Line lineToFire = new Line(0, 0 , 750, 65);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(17)|| myCruiser.fireShip(17) || myDestroyer.fireShip(17)){
                checkBox17.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox17.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox18.isSelected()){
            checkBox18.setDisable(true);
            checkBox18.setSelected(false);
            
            target.setX(838);
            target.setY(53);
            
            Line lineToFire = new Line(0, 0 , 850, 65);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(18)|| myCruiser.fireShip(18) || myDestroyer.fireShip(18)){
                checkBox18.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox18.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox19.isSelected()){
            checkBox19.setDisable(true);
            checkBox19.setSelected(false);
            
            target.setX(938);
            target.setY(53);
            
            Line lineToFire = new Line(0, 0 , 950, 65);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(19)|| myCruiser.fireShip(19) || myDestroyer.fireShip(19)){
                checkBox19.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox19.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        
        if(checkBox20.isSelected()){
            checkBox20.setDisable(true);
            checkBox20.setSelected(false);
            
            target.setX(38);
            target.setY(103);
            
            Line lineToFire = new Line(0, 0 , 50, 115);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(20)|| myCruiser.fireShip(20) || myDestroyer.fireShip(20)){
                checkBox20.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox20.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox21.isSelected()){
            checkBox21.setDisable(true);
            checkBox21.setSelected(false);
            
            target.setX(138);
            target.setY(103);
            
            Line lineToFire = new Line(0, 0 , 150, 115);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(21)|| myCruiser.fireShip(21) || myDestroyer.fireShip(21)){
                checkBox21.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox21.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox22.isSelected()){
            checkBox22.setDisable(true);
            checkBox22.setSelected(false);
            
            target.setX(238);
            target.setY(103);
            
            Line lineToFire = new Line(0, 0 , 250, 115);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(22)|| myCruiser.fireShip(22) || myDestroyer.fireShip(22)){
                checkBox22.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox22.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox23.isSelected()){
            checkBox23.setDisable(true);
            checkBox23.setSelected(false);
            
            target.setX(338);
            target.setY(103);
            
            Line lineToFire = new Line(0, 0 , 350, 115);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(23)|| myCruiser.fireShip(23) || myDestroyer.fireShip(23)){
                checkBox23.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox23.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox24.isSelected()){
            checkBox24.setDisable(true);
            checkBox24.setSelected(false);
            
            target.setX(438);
            target.setY(103);
            
            Line lineToFire = new Line(0, 0 , 450, 115);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(24)|| myCruiser.fireShip(24) || myDestroyer.fireShip(24)){
                checkBox24.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox24.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox25.isSelected()){
            checkBox25.setDisable(true);
            checkBox25.setSelected(false);
            
            target.setX(538);
            target.setY(103);
            
            Line lineToFire = new Line(0, 0 , 550, 115);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(25)|| myCruiser.fireShip(25) || myDestroyer.fireShip(25)){
                checkBox25.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox25.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox26.isSelected()){
            checkBox26.setDisable(true);
            checkBox26.setSelected(false);
            
            target.setX(638);
            target.setY(103);
            
            Line lineToFire = new Line(0, 0 , 650, 115);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(26)|| myCruiser.fireShip(26) || myDestroyer.fireShip(26)){
                checkBox26.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox26.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox27.isSelected()){
            checkBox27.setDisable(true);
            checkBox27.setSelected(false);
            
            target.setX(738);
            target.setY(103);
            
            Line lineToFire = new Line(0, 0 , 750, 115);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(27)|| myCruiser.fireShip(27) || myDestroyer.fireShip(27)){
                checkBox27.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox27.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox28.isSelected()){
            checkBox28.setDisable(true);
            checkBox28.setSelected(false);
            
            target.setX(838);
            target.setY(103);
            
            Line lineToFire = new Line(0, 0 , 850, 115);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(28)|| myCruiser.fireShip(28) || myDestroyer.fireShip(28)){
                checkBox28.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox28.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox29.isSelected()){
            checkBox29.setDisable(true);
            checkBox29.setSelected(false);
            
            target.setX(938);
            target.setY(103);
            
            Line lineToFire = new Line(0, 0 , 950, 115);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(29)|| myCruiser.fireShip(29) || myDestroyer.fireShip(29)){
                    checkBox29.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox29.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        
        if(checkBox30.isSelected()){
            checkBox30.setDisable(true);
            checkBox30.setSelected(false);
            
            target.setX(38);
            target.setY(153);
            
            Line lineToFire = new Line(0, 0 , 50, 165);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(30)|| myCruiser.fireShip(30) || myDestroyer.fireShip(30)){
                checkBox30.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox30.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox31.isSelected()){
            checkBox31.setDisable(true);
            checkBox31.setSelected(false);
            
            target.setX(138);
            target.setY(153);
            
            Line lineToFire = new Line(0, 0 , 150, 165);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(31)|| myCruiser.fireShip(31) || myDestroyer.fireShip(31)){
                checkBox31.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox31.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox32.isSelected()){
            checkBox32.setDisable(true);
            checkBox32.setSelected(false);
            
            target.setX(238);
            target.setY(153);
            
            Line lineToFire = new Line(0, 0 , 250, 165);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(32)|| myCruiser.fireShip(32) || myDestroyer.fireShip(32)){
                checkBox32.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox32.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox33.isSelected()){
            checkBox33.setDisable(true);
            checkBox33.setSelected(false);
            
            target.setX(338);
            target.setY(153);
            
            Line lineToFire = new Line(0, 0 , 350, 165);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(33)|| myCruiser.fireShip(33) || myDestroyer.fireShip(33)){
                checkBox33.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox33.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox34.isSelected()){
            checkBox34.setDisable(true);
            checkBox34.setSelected(false);
            target.setX(438);
            target.setY(153);
            
            Line lineToFire = new Line(0, 0 , 450, 165);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(34)|| myCruiser.fireShip(34) || myDestroyer.fireShip(34)){
                checkBox34.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox34.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox35.isSelected()){
            checkBox35.setDisable(true);
            checkBox35.setSelected(false);
            
            target.setX(538);
            target.setY(153);
            
            Line lineToFire = new Line(0, 0 , 550, 165);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(35)|| myCruiser.fireShip(35) || myDestroyer.fireShip(35)){
                checkBox35.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox35.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox36.isSelected()){
            checkBox36.setDisable(true);
            checkBox36.setSelected(false);
            
            target.setX(638);
            target.setY(153);
            
            Line lineToFire = new Line(0, 0 , 650, 165);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(36)|| myCruiser.fireShip(36) || myDestroyer.fireShip(36)){
                checkBox36.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox36.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox37.isSelected()){
            checkBox37.setDisable(true);
            checkBox37.setSelected(false);
            
            target.setX(738);
            target.setY(153);
            
            Line lineToFire = new Line(0, 0 , 750, 165);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(37)|| myCruiser.fireShip(37) || myDestroyer.fireShip(37)){
                checkBox37.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox37.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox38.isSelected()){
            checkBox38.setDisable(true);
            checkBox38.setSelected(false);
            
            target.setX(838);
            target.setY(153);
            
            Line lineToFire = new Line(0, 0 , 850, 165);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(38)|| myCruiser.fireShip(38) || myDestroyer.fireShip(38)){
                checkBox38.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox38.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox39.isSelected()){
            checkBox39.setDisable(true);
            checkBox39.setSelected(false);
            target.setX(938);
            target.setY(153);
            
            Line lineToFire = new Line(0, 0 , 950, 165);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(39)|| myCruiser.fireShip(39) || myDestroyer.fireShip(39)){
                checkBox39.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox39.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        
        if(checkBox40.isSelected()){
            checkBox40.setDisable(true);
            checkBox40.setSelected(false);
            target.setX(38);
            target.setY(200);
            
            Line lineToFire = new Line(0, 0 , 50, 215);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(40)|| myCruiser.fireShip(40) || myDestroyer.fireShip(40)){
                checkBox40.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox40.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox41.isSelected()){
            checkBox41.setDisable(true);
            checkBox41.setSelected(false);
            target.setX(138);
            target.setY(200);
            
            Line lineToFire = new Line(0, 0 , 150, 215);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(41)|| myCruiser.fireShip(41) || myDestroyer.fireShip(41)){
                checkBox41.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox41.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox42.isSelected()){
            checkBox42.setDisable(true);
            checkBox42.setSelected(false);
            target.setX(238);
            target.setY(200);
            
            Line lineToFire = new Line(0, 0 , 250, 215);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(42)|| myCruiser.fireShip(42) || myDestroyer.fireShip(42)){
                checkBox42.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox42.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox43.isSelected()){
            checkBox43.setDisable(true);
            checkBox43.setSelected(false);
            target.setX(338);
            target.setY(200);
            
            Line lineToFire = new Line(0, 0 , 350, 215);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(43)|| myCruiser.fireShip(43) || myDestroyer.fireShip(43)){
                checkBox43.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox43.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox44.isSelected()){
            checkBox44.setDisable(true);
            checkBox44.setSelected(false);
           target.setX(438);
            target.setY(200);
            
            Line lineToFire = new Line(0, 0 , 450, 215);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(44)|| myCruiser.fireShip(44) || myDestroyer.fireShip(44)){
                checkBox44.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox44.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox45.isSelected()){
            checkBox45.setDisable(true);
            checkBox45.setSelected(false);
            target.setX(538);
            target.setY(200);
            
            Line lineToFire = new Line(0, 0 , 550, 215);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(45)|| myCruiser.fireShip(45) || myDestroyer.fireShip(45)){
                checkBox45.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox45.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox46.isSelected()){
            checkBox46.setDisable(true);
            checkBox46.setSelected(false);
            target.setX(638);
            target.setY(200);
            
            Line lineToFire = new Line(0, 0 , 650, 215);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(46)|| myCruiser.fireShip(46) || myDestroyer.fireShip(46)){
                checkBox46.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox46.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox47.isSelected()){
            checkBox47.setDisable(true);
            checkBox47.setSelected(false);
            target.setX(738);
            target.setY(200);
            
            Line lineToFire = new Line(0, 0 , 750, 215);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(47)|| myCruiser.fireShip(47) || myDestroyer.fireShip(47)){
                checkBox47.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox47.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox48.isSelected()){
            checkBox48.setDisable(true);
            checkBox48.setSelected(false);
            target.setX(838);
            target.setY(200);
            
            Line lineToFire = new Line(0, 0 , 850, 215);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(48)|| myCruiser.fireShip(48) || myDestroyer.fireShip(48)){
                checkBox48.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox48.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox49.isSelected()){
            checkBox49.setDisable(true);
            checkBox49.setSelected(false);
            target.setX(938);
            target.setY(200);
            
            Line lineToFire = new Line(0, 0 , 950, 215);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(49)|| myCruiser.fireShip(49) || myDestroyer.fireShip(49)){
                checkBox49.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox49.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        
        if(checkBox50.isSelected()){
            checkBox50.setDisable(true);
            checkBox50.setSelected(false);
            target.setX(38);
            target.setY(248);
            
            Line lineToFire = new Line(0, 0 , 50, 263);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(50)|| myCruiser.fireShip(50) || myDestroyer.fireShip(50)){
                checkBox50.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox50.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox51.isSelected()){
            checkBox51.setDisable(true);
            checkBox51.setSelected(false);
            target.setX(138);
            target.setY(248);
            
            Line lineToFire = new Line(0, 0 , 150, 263);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(51)|| myCruiser.fireShip(51) || myDestroyer.fireShip(51)){
                checkBox51.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox51.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox52.isSelected()){
            checkBox52.setDisable(true);
            checkBox52.setSelected(false);
            target.setX(238);
            target.setY(248);
            
            Line lineToFire = new Line(0, 0 , 250, 263);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(52)|| myCruiser.fireShip(52) || myDestroyer.fireShip(52)){
                checkBox52.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox52.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox53.isSelected()){
            checkBox53.setDisable(true);
            checkBox53.setSelected(false);
            target.setX(338);
            target.setY(248);
            
            Line lineToFire = new Line(0, 0 , 350, 263);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(53)|| myCruiser.fireShip(53) || myDestroyer.fireShip(53)){
                checkBox53.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox53.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox54.isSelected()){
            checkBox54.setDisable(true);
            checkBox54.setSelected(false);
            target.setX(438);
            target.setY(248);
            
            Line lineToFire = new Line(0, 0 , 450, 263);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(54)|| myCruiser.fireShip(54) || myDestroyer.fireShip(54)){
                checkBox54.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox54.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox55.isSelected()){
            checkBox55.setDisable(true);
            checkBox55.setSelected(false);
            target.setX(538);
            target.setY(248);
            
            Line lineToFire = new Line(0, 0 , 550, 263);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(55)|| myCruiser.fireShip(55) || myDestroyer.fireShip(55)){
                checkBox55.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox55.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox56.isSelected()){
            checkBox56.setDisable(true);
            checkBox56.setSelected(false);
            target.setX(638);
            target.setY(248);
            
            Line lineToFire = new Line(0, 0 , 650, 263);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(56)|| myCruiser.fireShip(56) || myDestroyer.fireShip(56)){
                checkBox56.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox56.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox57.isSelected()){
            checkBox57.setDisable(true);
            checkBox57.setSelected(false);
            target.setX(738);
            target.setY(248);
            
            Line lineToFire = new Line(0, 0 , 750, 263);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(57)|| myCruiser.fireShip(57) || myDestroyer.fireShip(57)){
                checkBox57.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox57.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox58.isSelected()){
            checkBox58.setDisable(true);
            checkBox58.setSelected(false);
            target.setX(838);
            target.setY(248);
            
            Line lineToFire = new Line(0, 0 , 850, 263);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(58)|| myCruiser.fireShip(58) || myDestroyer.fireShip(50)){
                checkBox58.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox58.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox59.isSelected()){
            checkBox59.setDisable(true);
            checkBox59.setSelected(false);
            target.setX(938);
            target.setY(248);
            
            Line lineToFire = new Line(0, 0 , 950, 263);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(59)|| myCruiser.fireShip(59) || myDestroyer.fireShip(59)){
                checkBox59.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox59.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        
        if(checkBox60.isSelected()){
            checkBox60.setDisable(true);
            checkBox60.setSelected(false);
            target.setX(38);
            target.setY(296);
            
            Line lineToFire = new Line(0, 0 , 50, 313);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(60)|| myCruiser.fireShip(60) || myDestroyer.fireShip(60)){
                checkBox60.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox60.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox61.isSelected()){
            checkBox61.setDisable(true);
            checkBox61.setSelected(false);
            target.setX(138);
            target.setY(296);
            
            Line lineToFire = new Line(0, 0 , 150, 313);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(61)|| myCruiser.fireShip(61) || myDestroyer.fireShip(61)){
                checkBox61.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox61.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox62.isSelected()){
            checkBox62.setDisable(true);
            checkBox62.setSelected(false);
            target.setX(238);
            target.setY(296);
            
            Line lineToFire = new Line(0, 0 , 250, 313);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(62)|| myCruiser.fireShip(62) || myDestroyer.fireShip(62)){
                checkBox62.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox62.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox63.isSelected()){
            checkBox63.setDisable(true);
            checkBox63.setSelected(false);
            target.setX(338);
            target.setY(296);
            
            Line lineToFire = new Line(0, 0 , 350, 313);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(63)|| myCruiser.fireShip(63) || myDestroyer.fireShip(63)){
                checkBox63.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox63.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox64.isSelected()){
            checkBox64.setDisable(true);
            checkBox64.setSelected(false);
            target.setX(438);
            target.setY(296);
            
            Line lineToFire = new Line(0, 0 , 450, 313);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(64)|| myCruiser.fireShip(64) || myDestroyer.fireShip(64)){
                checkBox64.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox64.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox65.isSelected()){
            checkBox65.setDisable(true);
            checkBox65.setSelected(false);
            target.setX(538);
            target.setY(296);
            
            Line lineToFire = new Line(0, 0 , 550, 313);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(65)|| myCruiser.fireShip(65) || myDestroyer.fireShip(65)){
                checkBox65.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox65.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
       if(checkBox66.isSelected()){
            checkBox66.setDisable(true);
            checkBox66.setSelected(false);
            target.setX(638);
            target.setY(296);
            
            Line lineToFire = new Line(0, 0 , 650, 313);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(66)|| myCruiser.fireShip(66) || myDestroyer.fireShip(66)){
                checkBox66.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox66.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox67.isSelected()){
            checkBox67.setDisable(true);
            checkBox67.setSelected(false);
            target.setX(738);
            target.setY(296);
            
            Line lineToFire = new Line(0, 0 , 750, 313);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(67)|| myCruiser.fireShip(67) || myDestroyer.fireShip(67)){
                checkBox67.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox67.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox68.isSelected()){
            checkBox68.setDisable(true);
            checkBox68.setSelected(false);
            
            target.setX(838);
            target.setY(296);
            
            Line lineToFire = new Line(0, 0 , 850, 313);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(68)|| myCruiser.fireShip(68) || myDestroyer.fireShip(68)){
                checkBox68.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox68.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
            
            
        }
        if(checkBox69.isSelected()){
            checkBox69.setDisable(true);
            checkBox69.setSelected(false);
            target.setX(938);
            target.setY(296);
            
            Line lineToFire = new Line(0, 0 , 950, 313);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(69)|| myCruiser.fireShip(69) || myDestroyer.fireShip(69)){
                    checkBox69.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox69.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        
        if(checkBox70.isSelected()){
            checkBox70.setDisable(true);
            checkBox70.setSelected(false);
            target.setX(38);
            target.setY(346);
            
            Line lineToFire = new Line(0, 0 , 50, 363);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(70)|| myCruiser.fireShip(70) || myDestroyer.fireShip(70)){
                checkBox70.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox70.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox71.isSelected()){
            checkBox71.setDisable(true);
            checkBox71.setSelected(false);
            target.setX(138);
            target.setY(346);
            
            Line lineToFire = new Line(0, 0 , 150, 363);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(71)|| myCruiser.fireShip(71) || myDestroyer.fireShip(71)){
                checkBox71.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox71.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox72.isSelected()){
            checkBox72.setDisable(true);
            checkBox72.setSelected(false);
            target.setX(238);
            target.setY(346);
            
            Line lineToFire = new Line(0, 0 , 250, 363);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(72)|| myCruiser.fireShip(72) || myDestroyer.fireShip(72)){
                checkBox72.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox72.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox73.isSelected()){
            checkBox73.setDisable(true);
            checkBox73.setSelected(false);
            target.setX(338);
            target.setY(346);
            
            Line lineToFire = new Line(0, 0 , 350, 363);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(73)|| myCruiser.fireShip(73) || myDestroyer.fireShip(73)){
                checkBox73.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox73.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox74.isSelected()){
            checkBox74.setDisable(true);
            checkBox74.setSelected(false);
            target.setX(438);
            target.setY(346);
            
            Line lineToFire = new Line(0, 0 , 450, 363);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(74)|| myCruiser.fireShip(74) || myDestroyer.fireShip(74)){
                checkBox74.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox74.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox75.isSelected()){
            checkBox75.setDisable(true);
            checkBox75.setSelected(false);
            target.setX(538);
            target.setY(346);
            
            Line lineToFire = new Line(0, 0 , 550, 363);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(75)|| myCruiser.fireShip(75) || myDestroyer.fireShip(75)){
                checkBox75.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox75.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
       if(checkBox76.isSelected()){
            checkBox76.setDisable(true);
            checkBox76.setSelected(false);
            target.setX(638);
            target.setY(346);
            
            Line lineToFire = new Line(0, 0 , 650, 363);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(76)|| myCruiser.fireShip(76) || myDestroyer.fireShip(76)){
                checkBox76.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox76.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox77.isSelected()){
            checkBox77.setDisable(true);
            checkBox77.setSelected(false);
            target.setX(738);
            target.setY(346);
            
            Line lineToFire = new Line(0, 0 , 750, 363);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(77)|| myCruiser.fireShip(77) || myDestroyer.fireShip(77)){
                checkBox77.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox77.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox78.isSelected()){
            checkBox78.setDisable(true);
            checkBox78.setSelected(false);
            target.setX(838);
            target.setY(346);
            
            Line lineToFire = new Line(0, 0 , 850, 363);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(78)|| myCruiser.fireShip(78) || myDestroyer.fireShip(78)){
                checkBox78.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox78.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox79.isSelected()){
            checkBox79.setDisable(true);
            checkBox79.setSelected(false);
            target.setX(938);
            target.setY(346);
            
            Line lineToFire = new Line(0, 0 , 950, 363);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(79)|| myCruiser.fireShip(79) || myDestroyer.fireShip(79)){
                checkBox79.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox79.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        
        if(checkBox80.isSelected()){
            checkBox80.setDisable(true);
            checkBox80.setSelected(false);
            target.setX(38);
            target.setY(396);
            
            Line lineToFire = new Line(0, 0 , 50, 423);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(80)|| myCruiser.fireShip(80) || myDestroyer.fireShip(80)){
                checkBox80.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox80.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox81.isSelected()){
            checkBox81.setDisable(true);
            checkBox81.setSelected(false);
            target.setX(138);
            target.setY(396);
            
            Line lineToFire = new Line(0, 0 , 150, 423);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(81)|| myCruiser.fireShip(81) || myDestroyer.fireShip(81)){
                checkBox81.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox81.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox82.isSelected()){
            checkBox82.setDisable(true);
            checkBox82.setSelected(false);
            target.setX(238);
            target.setY(396);
            
            Line lineToFire = new Line(0, 0 , 250, 423);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(82)|| myCruiser.fireShip(82) || myDestroyer.fireShip(82)){
                checkBox82.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox82.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox83.isSelected()){
            checkBox83.setDisable(true);
            checkBox83.setSelected(false);
            target.setX(338);
            target.setY(396);
            
            Line lineToFire = new Line(0, 0 , 350, 423);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(83)|| myCruiser.fireShip(83) || myDestroyer.fireShip(83)){
                checkBox83.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox83.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox84.isSelected()){
            checkBox84.setDisable(true);
            checkBox84.setSelected(false);
            target.setX(438);
            target.setY(396);
            
            Line lineToFire = new Line(0, 0 , 450, 423);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(84)|| myCruiser.fireShip(84) || myDestroyer.fireShip(84)){
                checkBox84.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox84.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox85.isSelected()){
            checkBox85.setDisable(true);
            checkBox85.setSelected(false);
            target.setX(538);
            target.setY(396);
            
            Line lineToFire = new Line(0, 0 , 550, 423);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(85)|| myCruiser.fireShip(85) || myDestroyer.fireShip(85)){
                    checkBox85.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox85.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
       if(checkBox86.isSelected()){
            checkBox86.setDisable(true);
            checkBox86.setSelected(false);
            target.setX(638);
            target.setY(396);
            
            Line lineToFire = new Line(0, 0 , 650, 423);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(86)|| myCruiser.fireShip(86) || myDestroyer.fireShip(86)){
                    checkBox86.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox86.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox87.isSelected()){
            checkBox87.setDisable(true);
            checkBox87.setSelected(false);
           target.setX(738);
            target.setY(396);
            
            Line lineToFire = new Line(0, 0 , 750, 423);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(87)|| myCruiser.fireShip(87) || myDestroyer.fireShip(87)){
                    checkBox87.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox87.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox88.isSelected()){
            checkBox88.setDisable(true);
            checkBox88.setSelected(false);
            target.setX(838);
            target.setY(396);
            
            Line lineToFire = new Line(0, 0 , 850, 423);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(88)|| myCruiser.fireShip(88) || myDestroyer.fireShip(88)){
                    checkBox88.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox88.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox89.isSelected()){
            checkBox89.setDisable(true);
            checkBox89.setSelected(false);
            target.setX(938);
            target.setY(396);
            
            Line lineToFire = new Line(0, 0 , 950, 423);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(89)|| myCruiser.fireShip(89) || myDestroyer.fireShip(89)){
                    checkBox89.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox89.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        
        if(checkBox90.isSelected()){
            checkBox90.setDisable(true);
            checkBox90.setSelected(false);
            target.setX(38);
            target.setY(446);
            
            Line lineToFire = new Line(0, 0 , 50, 473);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(90)|| myCruiser.fireShip(90) || myDestroyer.fireShip(90)){
                checkBox90.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox90.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox91.isSelected()){
            checkBox91.setDisable(true);
            checkBox91.setSelected(false);
            target.setX(138);
            target.setY(446);
            
            Line lineToFire = new Line(0, 0 , 150, 473);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(91)|| myCruiser.fireShip(91) || myDestroyer.fireShip(91)){
                checkBox91.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox91.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox92.isSelected()){
            checkBox92.setDisable(true);
            checkBox92.setSelected(false);
            target.setX(238);
            target.setY(446);
            
            Line lineToFire = new Line(0, 0 , 250, 473);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(92)|| myCruiser.fireShip(92) || myDestroyer.fireShip(92)){
                checkBox92.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox92.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox93.isSelected()){
            checkBox93.setDisable(true);
            checkBox93.setSelected(false);
            target.setX(338);
            target.setY(446);
            
            Line lineToFire = new Line(0, 0 , 350, 473);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(93)|| myCruiser.fireShip(93) || myDestroyer.fireShip(93)){
                checkBox93.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox93.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox94.isSelected()){
            checkBox94.setDisable(true);
            checkBox94.setSelected(false);
            target.setX(438);
            target.setY(446);
            
            Line lineToFire = new Line(0, 0 , 450, 473);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(94)|| myCruiser.fireShip(94) || myDestroyer.fireShip(94)){
                checkBox94.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox94.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox95.isSelected()){
            checkBox95.setDisable(true);
            checkBox95.setSelected(false);
            target.setX(538);
            target.setY(446);
            
            Line lineToFire = new Line(0, 0 , 550, 473);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(95)|| myCruiser.fireShip(95) || myDestroyer.fireShip(95)){
                checkBox95.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox95.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
       if(checkBox96.isSelected()){
            checkBox96.setDisable(true);
            checkBox96.setSelected(false);
            
            target.setX(638);
            target.setY(446);
            
            Line lineToFire = new Line(0, 0 , 650, 473);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(96)|| myCruiser.fireShip(96) || myDestroyer.fireShip(96)){
                checkBox96.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox96.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox97.isSelected()){
            checkBox97.setDisable(true);
            checkBox97.setSelected(false);
            target.setX(738);
            target.setY(446);
            
            Line lineToFire = new Line(0, 0 , 750, 473);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(97)|| myCruiser.fireShip(97) || myDestroyer.fireShip(97)){
                checkBox97.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox97.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
        }
        if(checkBox98.isSelected()){
            checkBox98.setDisable(true);
            checkBox98.setSelected(false);
            
            target.setX(838);
            target.setY(446);
            
            Line lineToFire = new Line(0, 0 , 852, 473);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(98)|| myCruiser.fireShip(98) || myDestroyer.fireShip(98)){
                checkBox98.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox98.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
            
        }
        if(checkBox99.isSelected()){
            checkBox99.setDisable(true);
            checkBox99.setSelected(false);
            
            target.setX(938);
            target.setY(446);
            
            Line lineToFire = new Line(0, 0 , 962, 473);  
            lineToFire.setVisible(false);
            
            myPane.getChildren().addAll(target,rocket,lineToFire);
            
            PathTransition pt1 = new PathTransition(Duration.millis(10000), lineToFire, rocket);
            pt1.setDelay(Duration.ZERO);
            pt1.setCycleCount(1);
            pt1.setRate(3);
            pt1.play(); // Start animation 
            
            pt1.setOnFinished(e->{
                if(myCarrier.fireShip(99)|| myCruiser.fireShip(99) || myDestroyer.fireShip(99)){
                checkBox99.setStyle("-fx-background-color:  blue");
                }
                else{
                    checkBox99.setStyle("-fx-background-color: red");
                }
                myPane.getChildren().removeAll(rocket, lineToFire,target);
                fireBtn.setDisable(false);
                
                displayWinner();
            });
            
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeGame();
        winner.setEditable(false);
        Image image = new Image("image/myOcean.gif");
        myGride.setGridLinesVisible(true);
        
        myGride.setStyle("-fx-background-image: url('image/myOcean1.gif')");
        
        rocket.setImage(new Image("image/rocket2.gif"));
        rocket.setFitHeight(100);
        rocket.setFitWidth(70);

        target.setImage(new Image("image/target4.gif"));
        target.setFitHeight(40);
        target.setFitWidth(40);
        
    }

    public void initializeGame(){
        while( deployShip(myCarrier, createStartingPoint(), true) == false){
            deployShip(myCarrier, createStartingPoint(), true);
        }
        
        while(deployShip(myCruiser, createStartingPoint(), false) == false){
            deployShip(myCruiser, createStartingPoint(), false);
        }
        
        while(deployShip(myDestroyer, createStartingPoint(), false) == false){
            deployShip(myDestroyer, createStartingPoint(), false);
        }
        
        
        System.out.println("Carrier :"+myCarrier.getShipCoordinate());
        System.out.println("Cruiser :"+myCruiser.getShipCoordinate());
        System.out.println("Destroyer :"+myDestroyer.getShipCoordinate());
        
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

    private int createStartingPoint(){
        int startPoint;
        Random r = new Random();
        int Low = 0;
        int Hight = 100;
        
        startPoint = r.nextInt(Hight-Low)+ Low;
        
        while(chosenStartingPoints.contains(startPoint)){
            startPoint = r.nextInt(Hight-Low)+ Low;
        }
        chosenStartingPoints.add(startPoint);
        
        return startPoint;
    }
    
    private boolean deployShip(Ship theShip, int startPoint, boolean vertSet){
        if(theShip.setShipCoordinate(startPoint, vertSet)){
            if(checkDeployable(theShip)==false){
                return false;
            }
            startDeploy(theShip.getShipCoordinate());
            return true;
        }
        return false;
    }
    
    private void startDeploy(ArrayList<Integer> list){
        for(int e : list){
            deployedPoints.add(e);
        }
    }
    
    private boolean checkDeployable(Ship thisShip){
        ArrayList<Integer> shipCo = thisShip.getShipCoordinate();
        for(int e: shipCo){
            if(deployedPoints.contains(e)){
                deployedPoints.remove(deployedPoints.indexOf(e));
                if(chosenStartingPoints.contains(e)){
                    chosenStartingPoints.remove(chosenStartingPoints.indexOf(e));
                }
                thisShip.clearCoordinates();
                return false;
            }
        }
        return true;
    }
    
    private void displayWinner(){
        if(myDestroyer.checkShrunk()&&myCarrier.checkShrunk()&&myCruiser.checkShrunk()){
            winner.setText("Shrunk all ships");
            
            imgCarrier.setImage(new Image("image/firework1.gif"));
            imgCruiser.setImage(new Image("image/win.gif"));
            imgDestroyer.setImage(new Image("image/firework1.gif"));
            
            fireBtn.setDisable(true);
        }
        if(this.myDestroyer.checkShrunk()){
                        winner.setText("Shrunk destroyer");
                        imgDestroyer.setImage(new Image("image/fire2.gif"));
        }
        if(this.myCarrier.checkShrunk()){
                        winner.setText("Shrunk Carrier");
                        imgCarrier.setImage(new Image("image/fire2.gif"));
        }
        if(this.myCruiser.checkShrunk()){
                        winner.setText("Shrunk Cruiser");
                        imgCruiser.setImage(new Image("image/fire2.gif"));
        }
    }
    
}
