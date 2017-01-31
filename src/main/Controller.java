package main;
/**
 * Sample Skeleton for 'Dungeon_Sheets_Gui.fxml' Controller Class
 */


import javafx.scene.control.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import Player.*;


public class Controller {

    @FXML
    private TextField StrDisplay, DexDisplay,ConDisplay,ChaDisplay,WisDisplay,IntDisplay;




    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resourceBundle;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {int strength, dexterity,constitution,charisma,wisdom,intelligence;
        StatGen statCreate = new StatGen();

        //use a method to let players pick stats
        statCreate.trueRandomStats();
        statCreate.statModGen();
        statCreate.skills();

        //loads the base stats
        strength = statCreate.getStrength();
        Integer strength1 = new Integer(strength);

        dexterity = statCreate.getDexterity();
        Integer dexterity1 = new Integer(dexterity);

        constitution = statCreate.getConstitution();
        Integer constitution1 = new Integer(constitution);


        charisma = statCreate.getCharisma();
        Integer charisma1 = new Integer(charisma);

        wisdom = statCreate.getWisdom();
        Integer wisdom1 = new Integer(wisdom);

        intelligence = statCreate.getIntelligence();
        Integer intelligence1 = new Integer(intelligence);
        statCreate.trueRandomStats();

        StrDisplay.setText(strength1.toString());
        DexDisplay.setText(dexterity1.toString());
        ConDisplay.setText(constitution1.toString());
        ChaDisplay.setText(charisma1.toString());
        WisDisplay.setText(wisdom1.toString());
        IntDisplay.setText(intelligence1.toString());

    }
}
