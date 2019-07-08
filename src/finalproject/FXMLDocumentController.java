/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Dung Hong
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane myRoot;
    
    @FXML
    private void gotoSceneGOW(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("GOW.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setTitle("Game Of War");
        stage.setScene(scene);
        stage.show();
    }
    
    
    @FXML
    private void gotoSceneBattleship(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("myGame.fxml"));
        
        Scene scene = new Scene(root);
        
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setTitle("Battle Ship");
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void handleButtonExit(ActionEvent event) {
        System.exit(0);
    }
    
    private void loadSplash(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("SplashScreen.fxml"));
            
            Scene scene = new Scene(root);
        
            myRoot.getChildren().setAll(root);

            
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(2), root);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);
            fadeIn.setCycleCount(1);
            
            FadeTransition fadeOut = new FadeTransition(Duration.seconds(2), root);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setCycleCount(1);
            
            fadeIn.play();
            
            fadeIn.setOnFinished(e->{
                fadeOut.play();
            });
            
            fadeOut.setOnFinished(e->{
                try {
                    Parent newroot = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                    myRoot.getChildren().setAll(newroot);
                } catch (IOException ex) {
                    Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            
            FinalProject.loadSplashed = true;
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(FinalProject.loadSplashed == false){
            loadSplash();
        }
    }    
    
}
