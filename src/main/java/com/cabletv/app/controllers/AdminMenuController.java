/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cabletv.app.controllers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.logging.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.Pane;
import javafx.scene.control.*;
import java.io.IOException;
/**
 * FXML Controller class
 *
 * @author Kumaran
 */
public class AdminMenuController implements Initializable {
  
    private Scene scene;
    
    @FXML 
    private Button logoutButton;
    /*
    public void initSessionID(String sessionID) {
  //  sessionLabel.setText(sessionID);
    logoutButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
       logout();
      }
    });*/

    
    @FXML
    public void logout() {
    showLoginScreen();
  }
    
    public void showLoginScreen() {
   
       
    Stage stage; 
     Parent root;
      try {
    // if(event.getSource()==btn1){
        //get reference to the button's stage         
        stage=(Stage) logoutButton.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
    //  }
    // else{
      // stage=(Stage) loginButton.getScene().getWindow();
//  root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    
     //create a new scene with root and set the stage
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    } catch (IOException ex) {
      Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
    /**
     * 
     * 
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    /*
    Method to Add New User 
    */
    @FXML
    public void addAppUsers() {
       
         System.out.println("fdsfssf");
    }

}
