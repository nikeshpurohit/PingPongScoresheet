/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oosd2coursework;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nik_3
 */
public class Fixtures {

    private Team homeTeam;
    private Team awayTeam;
    private int homeSets; //add score to this
    private int awaySets; //score
    //check if played


    Fixtures(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
                //while ((this.homeTeam == null || (this.awayTeam == null))) {
            // for (Team newteam : OOSD2Coursework.teamList) {
            //     if (homeTeam == null) {
            //         homeTeam = newteam;
            //     } else if (newteam.getName() != homeTeam.getName()) {
            //          awayTeam = newteam;
            //     }
            //for (int i = 0; i < OOSD2Coursework.teamList.size(); i++) {
              // for (int z = 0; z < OOSD2Coursework.teamList.size(); z++) {
                   //if i == z do nothing
          

        //}
    }

    public void viewFixture() {
        System.out.println("hometeam: " + this.homeTeam.toString() + " awayteam: " + this.awayTeam.toString() + "   homesets: " + this.homeSets + " " + "Awaysets:" + this.awaySets);
    }
}
