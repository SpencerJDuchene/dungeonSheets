package Player;


import javafx.scene.control.RadioMenuItem;
import main.Controller;

/**
 * Created by Spencer on 3/1/2017.
 */
public class raceHandler extends Controller {
    String race;
    public void handleRace(){
       // String race = getRace();
        //Handle all race data
        switch(race){
            case "Aasimar":
                playerRaceLabel.setText(race);
            case "Dwarf":
                playerRaceLabel.setText(race);
            case "Elf":
                playerRaceLabel.setText(race);
            case "Firebolg":
                playerRaceLabel.setText(race);
            case "Genasi":
                playerRaceLabel.setText(race);
            case "Gnome":
                playerRaceLabel.setText(race);
            case "Goblin":
                playerRaceLabel.setText(race);
            case "Goliath":
                playerRaceLabel.setText(race);
            case "Halfling":
                playerRaceLabel.setText(race);
            case "Half-Elf":
                playerRaceLabel.setText(race);
            case "Half-Orc":
                playerRaceLabel.setText(race);
            case "Hobgoblin":
                playerRaceLabel.setText(race);
            case "Human":
                playerRaceLabel.setText(race);
            case "Kenku":
                playerRaceLabel.setText(race);
            case "Kobold":
                playerRaceLabel.setText(race);
            case "Lizardfolk":
                playerRaceLabel.setText(race);
            case "Orc":
                playerRaceLabel.setText(race);
            case "Tabaxi":
                playerRaceLabel.setText(race);
            case "Tiefling":
                playerRaceLabel.setText(race);
            case "Triton":
                playerRaceLabel.setText(race);
            case "Yuan-ti":
                playerRaceLabel.setText(race);
        }
    }


    //TODO: handle new race's from players

}
