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
    @FXML
    private TextField strModArea,dexModArea,conModArea,chaModArea,wisModArea,intModArea;
    @FXML
    private Label acroLabel, AnmlLabel,ArcanaLabel,athlLabel,DecepLabel,HistLabel,InsightLabel,IntimidLabel;
    @FXML
    private Label InvestLabel,MediLabel,NatureLabel,PercepLabel,PerformLabel,PersuadeLabel,ReliLabel;
    @FXML
    private Label SleightLabel,StealthLabel,SurviveLabel;




    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resourceBundle;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        int strength, dexterity,constitution,charisma,wisdom,intelligence;
        int strengthMod, dexterityMod,constitutionMod,charismaMod,wisdomMod,intelligenceMod;


        StatGen statCreate = new StatGen();

        //use a method to let players pick stats
        //TODO change trueRandomStats to be 3 randoms 1-6 then add to get statistics right.
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
        //sets the base stats
        StrDisplay.setText(strength1.toString());
        DexDisplay.setText(dexterity1.toString());
        ConDisplay.setText(constitution1.toString());
        ChaDisplay.setText(charisma1.toString());
        WisDisplay.setText(wisdom1.toString());
        IntDisplay.setText(intelligence1.toString());
        //loads the statMods
        strengthMod = statCreate.getStrength_Mod();
        dexterityMod = statCreate.getDexterity_Mod();
        constitutionMod = statCreate.getConstitution_Mod();
        charismaMod = statCreate.getCharisma_Mod();
        wisdomMod = statCreate.getWisdom_Mod();
        intelligenceMod = statCreate.getIntelligence_Mod();

        //set the modifier text areas
        Integer StrMod = new Integer(strengthMod);
        strModArea.setText(StrMod.toString());
        Integer DexMod = new Integer(dexterityMod);
        dexModArea.setText(DexMod.toString());
        Integer ConMod = new Integer(constitutionMod);
        conModArea.setText(ConMod.toString());
        Integer ChaMod = new Integer(charismaMod);
        chaModArea.setText(ChaMod.toString());
        Integer WisMod = new Integer(wisdomMod);
        wisModArea.setText(WisMod.toString());
        Integer IntMod = new Integer(intelligenceMod);
        intModArea.setText(IntMod.toString());
    }
}
