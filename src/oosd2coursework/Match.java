/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd2coursework;

/**
 *
 * @author n2-purohit
 */
public class Match {
 //---------------------------Home player 1 vs AWAY player 1----------------------------//
    private int a11set1Home;
    private int a11set1Away;
    
    private int a11set2Home;
    private int a11set2Away;
    
    private int a11set3Home;
    private int a11set3Away;
    
 //---------------------------Home player 1 vs AWAY player 2----------------------------//   
    private int a12set1Home;
    private int a12set1Away;
    
    private int a12set2Home;
    private int a12set2Away;
    
    private int a12set3Home;
    private int a12set3Away;
    
 //---------------------------Home player 2 vs AWAY player 1----------------------------//
    private int a21set1Home;
    private int a21set1Away;
    
    private int a21set2Home;
    private int a21set2Away;
    
    private int a21set3Home;
    private int a21set3Away;
    
 //---------------------------Home player 2 vs AWAY player 2----------------------------//  
    private int a22set1Home;
    private int a22set1Away;
    
    private int a22set2Home;
    private int a22set2Away;
    
    private int a22set3Home;
    private int a22set3Away;
    
 //-------------------------Double set-----------------------------------//
    private int Dset1Home;
    private int Dset1Away;
    
    private int Dset2Home;
    private int Dset2Away;
    
    private int Dset3Home;
    private int Dset3Away;
    
  
    
    
    
    
    protected Team homeTeam;
    protected Team awayTeam;
    //participating players
    
    //SPLIT
    public void setScore(String variable) {
        FXMLDocumentController.box_11set1.getText();
        FXMLDocumentController.box_11set2.getText();
        FXMLDocumentController.box_11set3.getText();
        FXMLDocumentController.box_12set1.getText();
        FXMLDocumentController.box_12set2.getText();
        FXMLDocumentController.box_12set3.getText();
        FXMLDocumentController.box_21set1.getText();
        FXMLDocumentController.box_21set2.getText();
        FXMLDocumentController.box_21set3.getText();
        FXMLDocumentController.box_22set1.getText();
        FXMLDocumentController.box_22set2.getText();
        FXMLDocumentController.box_22set3.getText();
        FXMLDocumentController.box_Dset1.getText();
        FXMLDocumentController.box_Dset2.getText();
        FXMLDocumentController.box_Dset3.getText();
    }

    public Team getHomeTeam() {
        return this.homeTeam;
    }

    public Team getAwayTeam() {
        return this.awayTeam;
    }

    public void setHomeTeam(Team name) {
        this.homeTeam = name;
    }

    public void setAwayTeam(Team name) {
        this.awayTeam = name;
    }
}
