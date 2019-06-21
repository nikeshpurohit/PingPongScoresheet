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
public class Team {
    private String teamName;
    private List<Player> playerList = new ArrayList<Player>();
    private int matchesPlayed;
    private int winCount;
    private int wonSets;
    private int points;
    
    public Team(String teamName){
        this.matchesPlayed = 0;
        this.winCount = 0;
        this.wonSets = 0;
        this.points = 0;
        this.setName(teamName);
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    public String getName(){
        return this.teamName;
    }
    
    public void setName(String name){
        this.teamName = name;
    }
    
    public void addPlayer(String playerName){
        Player tempPlayer = new Player(playerName);
        this.playerList.add(tempPlayer);
        System.out.println(this.playerList);
    }
    
    public List<Player> getPlayers(){
        return this.playerList;
    }
    
    public int getMatchesPlayed(){
        return this.matchesPlayed;
    }
    
    public void increaseMatchesPlayed(){
        this.matchesPlayed++;
    }
    
    public int getWinCount(){
        return this.winCount;
    }
    
    public void increaseWinCount(){
        this.winCount++;
    }
    
    public int getWonSets(){
        return this.wonSets;
    }
    
    public void wonSets(){
        this.wonSets++;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public void setPoints(int point){
        this.points= point;
    }
}
