package main;
import Player.*;
import Player.background.*;
/**
 * Created by Spencer on 1/24/2017.
 */
public class main {
    public static void main(String[] args){
        background interact = new background(); //background extends StatGen so we get the same access
        System.out.println("Welcome to Dungeon Sheets, here are some random stats");
        interact.trueRandomStats();
        interact.currentStats();
        interact.raceSelection();
        interact.currentStats();
        interact.statModGen();
        interact.skills();



    }

}
