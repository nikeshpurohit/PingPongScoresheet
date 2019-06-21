/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd2coursework;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.layout.*;
import javafx.stage.StageStyle;
import javafx.util.Pair;

/**
 *
 * @author nik_3
 */
public class FXMLDocumentController implements Initializable {

    ArrayList<Team> teamListsuperior;

    //FXMLDocumentController(){
    //teamListsuperior< = new ArrayList<>();
    //}
    @FXML
    private Label homeTeamLabel;
    @FXML
    private Label awayTeamLabel;
    @FXML
    private TextField adminTeamNameTextbox;
    @FXML
    private TextField adminPlayerNameTextbox;
    @FXML
    ChoiceBox addTeamListBox;
    @FXML
    ChoiceBox homeChoice;
    @FXML
    ChoiceBox choiceHomePlayer1;
    @FXML
    ChoiceBox choiceHomePlayer2;
    @FXML
    ChoiceBox choiceAwayPlayer1;
    @FXML
    ChoiceBox choiceAwayPlayer2;
    @FXML
    Match newMatch;
    @FXML
    GridPane scoreSheetGridPane;
    @FXML
    GridPane scoreSheetGridPane2;
   
    @FXML
    protected static TextField box_11set1;
    @FXML
    protected static TextField box_11set2;
    @FXML
    protected static TextField box_11set3;
    @FXML
    protected static TextField box_12set1;
    @FXML
    protected static TextField box_12set2;
    @FXML
    protected static TextField box_12set3;
    @FXML
    protected static TextField box_21set1;
    @FXML
    protected static TextField box_21set2;
    @FXML
    protected static TextField box_21set3;
    @FXML
    protected static TextField box_22set1;
    @FXML
    protected static TextField box_22set2;
    @FXML
    protected static TextField box_22set3;
    @FXML
    protected static TextField box_Dset1;
    @FXML
    protected static TextField box_Dset2;
    @FXML
    protected static TextField box_Dset3;
    
    

    @FXML
    private void logoAboutButtonAction(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Sports Score System (S₃)");
        alert.setContentText("Created by Nikesh Purohit \n Vanne Cabahug \n Karl Sartorio");

        alert.showAndWait();
    }

    @FXML
    private void fixtureGenButtonAction(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle(" ");
        alert.setHeaderText("Continue with operation?");
        alert.setContentText("Generating new fixtures will delete previously generated fixtures.");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {
            //OOSD2Coursework.fixtureList.add(OOSD2Coursework.GenerateFixtures());
            OOSD2Coursework.GenerateFixtures();
            System.out.println("MANUALLY GENERATE FIXUTRES: ");
            for (int i = 0; i < OOSD2Coursework.fixtureList.size(); i++) {
                OOSD2Coursework.fixtureList.get(i).viewFixture();
            }
        } else {
            // ... user chose CANCEL or closed the dialog do none
        }
    }

    @FXML
    private void newScoreSheetButtonAction(ActionEvent event) {
        newMatch = new Match();
        scoreSheetGridPane.setDisable(false);
        scoreSheetGridPane2.setDisable(false);
        
    }
    
    @FXML
    private void saveScoreSheetButtonAction(ActionEvent event) {
         OOSD2Coursework.matchList.add(newMatch); //SAVE MATCH
         for (int i = 0; i < OOSD2Coursework.matchList.size(); i++)
            System.out.println(OOSD2Coursework.matchList.get(i));
    }

    @FXML
    private void chooseTeamButtonAction(ActionEvent event) {
        Dialog dialog = new Dialog<>();
        dialog.setTitle("Choose teams...");
        dialog.setHeaderText("Please choose the home and away teams:");
        dialog.setResizable(true);

        Label label1 = new Label("Home: ");
        Label label2 = new Label("Away: ");
        ChoiceBox homeChoice = new ChoiceBox();
        homeChoice.getItems().setAll(OOSD2Coursework.teamList);
        //homeChoice.getItems().add("<home team>");
        ChoiceBox awayChoice = new ChoiceBox();
        awayChoice.getItems().setAll(OOSD2Coursework.teamList);
        //awayChoice.getItems().add("<away team>");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        grid.add(label1, 0, 0);
        grid.add(homeChoice, 1, 0);
        grid.add(label2, 0, 1);
        grid.add(awayChoice, 1, 1);
        dialog.getDialogPane().setContent(grid);

        ButtonType buttonTypeOk = new ButtonType("OK", ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().add(buttonTypeOk);
        //dialog.show();
        //Optional<ButtonType> result = 
        //Match newMatch = new Match();
        dialog.showAndWait();

        System.out.println("ok pressed");
        System.out.println("home slected: " + homeChoice.getValue().toString() + " away selected: " + awayChoice.getValue().toString());

        for (int i = 0; i < OOSD2Coursework.teamList.size(); i++) {
            if (homeChoice.getValue().toString() == OOSD2Coursework.teamList.get(i).toString()) { //compared chosen object to all in the list to find the chosen team.
                newMatch.setHomeTeam(OOSD2Coursework.teamList.get(i));

            }
            for (int e = 0; e < OOSD2Coursework.teamList.size(); e++) {
                if (awayChoice.getValue().toString() == OOSD2Coursework.teamList.get(e).toString()) { //compared chosen object to all in the list to find the chosen team.
                    newMatch.setAwayTeam(OOSD2Coursework.teamList.get(e));

                }
            }

            homeTeamLabel.setText(newMatch.getHomeTeam().toString());
            awayTeamLabel.setText(newMatch.getAwayTeam().toString());
            choiceAwayPlayer1.getItems().setAll(newMatch.getAwayTeam().getPlayers());
            choiceAwayPlayer2.getItems().setAll(newMatch.getAwayTeam().getPlayers());
            choiceHomePlayer1.getItems().setAll(newMatch.getHomeTeam().getPlayers());
            choiceHomePlayer2.getItems().setAll(newMatch.getHomeTeam().getPlayers());
            //OOSD2Coursework.matchList.add(newMatch); NEED TO SAVE MATCH
            //homeChoice.getValue()
            //awayChoice.getValue()
        }
    }

    @FXML
    private void addTeamButtonAction(ActionEvent event) {
        String t;
        t = adminTeamNameTextbox.getText().toString();
        System.out.println(t);
        Team tempTeam = new Team(adminTeamNameTextbox.getText().toString());
        //OOSD2Coursework.teamList.add(tempTeam);
        OOSD2Coursework.teamList.add(tempTeam);
        System.out.println(OOSD2Coursework.teamList);

        addTeamListBox.getItems().setAll(OOSD2Coursework.teamList);

    }

    @FXML
    private void addPlayerButtonAction(ActionEvent event) {
        Object tempTeam = addTeamListBox.getSelectionModel().getSelectedItem();
        tempTeam.toString();

        for (int i = 0; i < OOSD2Coursework.teamList.size(); i++) {
            if (tempTeam.toString() == OOSD2Coursework.teamList.get(i).toString()) { //compared chosen object to all in the list to find the chosen team.
                OOSD2Coursework.teamList.get(i).addPlayer(adminPlayerNameTextbox.getText().toString());
            }

        }
        System.out.println(addTeamListBox.getSelectionModel().getSelectedItem());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addTeamListBox.getItems().setAll(OOSD2Coursework.teamList);
    }

}
