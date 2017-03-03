package main;
/**
 * 'Dungeon_Sheets_Gui.fxml' Controller Class
 */


import javafx.event.ActionEvent;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import Player.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    //cant remember if making this global is bad or not
    StatGen statCreate = new StatGen();
    int count = 0;
    @FXML
    private TextField StrDisplay, DexDisplay,ConDisplay,ChaDisplay,WisDisplay,IntDisplay;
    @FXML
    private TextField StrDisplay1, DexDisplay1,ConDisplay1,ChaDisplay1,WisDisplay1,IntDisplay1;
    @FXML
    private Label strModArea,dexModArea,conModArea,chaModArea,wisModArea,intModArea;
    @FXML
    private Label acroLabel, AnmlLabel,ArcanaLabel,athlLabel,DecepLabel,HistLabel,InsightLabel,IntimidLabel;
    @FXML
    private Label InvestLabel,MediLabel,NatureLabel,PercepLabel,PerformLabel,PersuadeLabel,ReliLabel;
    @FXML
    private Label SleightLabel,StealthLabel,SurviveLabel;
    @FXML
    public Label playerRaceLabel,playerSubRaceLabel;
    @FXML
    public RadioMenuItem Aasimar,Dragonborn,Dwarf,Elf,Firebolg,Genasi,Gnome,Goblin,Goliath;
    @FXML
    public RadioMenuItem Halfling,halfElf,halfOrc,Hobgoblin,Human,Kenku,Kobold,Lizardfolk;
    @FXML
    public RadioMenuItem Orc,Tabaxi,Tiefling,Triton,Yuan;
    @FXML
    public RadioMenuItem subRace1,subRace2,subRace3,subRace4,subRace5,subRace6,subRace7,subRace8,subRace9;
    @FXML
    private TextField strEdit,dexEdit,conEdit,chaEdit,wisEdit,intEdit;
    @FXML
    private javafx.scene.control.Button updateButton;



    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resourceBundle;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    //takes the event from the update button and updates stats when pressed
    @FXML
    //update when focus lost
    void buttonPressed(ActionEvent updateButton) {
        while (count < 1) {

                try {
                    statCreate.setStrength(Integer.parseInt(StrDisplay.getText()));
                    statCreate.setDexterity(Integer.parseInt(DexDisplay.getText()));
                    statCreate.setConstitution(Integer.parseInt(ConDisplay.getText()));
                    statCreate.setIntelligence(Integer.parseInt(IntDisplay.getText()));
                    statCreate.setCharisma(Integer.parseInt(ChaDisplay.getText()));
                    statCreate.setWisdom(Integer.parseInt(WisDisplay.getText()));
                    statCreate.GenAll();
                    refresh();
                    //System.out.println("test");
                }
                catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Non-numeric character exists");
                }
            count++;
            }
        count = 0;
        }
    //refreshes all fields for the entire gui.
    @FXML
    void handleRace(ActionEvent updateRace){
        String race;
        //defaults the first choice to be selected

        subRace1.setSelected(true);
        if(Aasimar.isSelected()) {
            race = "Aasimar";
            playerRaceLabel.setText(race);
            //by doing this we allow the menu to change based on the base race selection
            subRace1.setVisible(true);
            subRace2.setVisible(true);
            subRace3.setVisible(true);
            subRace4.setVisible(true);
            subRace1.setText("None");
            subRace2.setText("Protector");
            subRace3.setText("Scourge");
            subRace4.setText("Fallen");
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
        }
        if(Dragonborn.isSelected()){
            race = "Dragonborn";
            subRace1.setVisible(true);
            subRace1.setText("None");
            subRace2.setVisible(false);
            subRace3.setVisible(false);
            subRace4.setVisible(false);
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
            playerRaceLabel.setText(race);
        }
        if(Dwarf.isSelected()) {
            race = "Dwarf";
            subRace1.setVisible(true);
            subRace2.setVisible(true);
            subRace3.setVisible(true);
            subRace1.setText("Hill");
            subRace2.setText("Mountain");
            subRace3.setText("Grey (Duergar)");
            subRace4.setVisible(false);
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
            playerRaceLabel.setText(race);
        }
        if(Elf.isSelected()) {
            race = "Elf";
            subRace1.setVisible(true);
            subRace2.setVisible(true);
            subRace3.setVisible(true);
            subRace4.setVisible(true);
            subRace1.setText("High");
            subRace2.setText("Wood");
            subRace3.setText("Drow");
            subRace4.setText("Eladrin");
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
            playerRaceLabel.setText(race);
        }
        if(Firebolg.isSelected()) {
            race = "Firebolg";
            subRace1.setVisible(true);
            subRace1.setText("None");
            subRace2.setVisible(false);
            subRace3.setVisible(false);
            subRace4.setVisible(false);
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
            playerRaceLabel.setText(race);
        }
        if(Genasi.isSelected()) {
            race = "Genasi";
            subRace1.setVisible(true);
            subRace2.setVisible(true);
            subRace3.setVisible(true);
            subRace4.setVisible(true);
            subRace1.setText("Air");
            subRace2.setText("Earth");
            subRace3.setText("Fire");
            subRace4.setText("Water");
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
            playerRaceLabel.setText(race);
        }
        if(Gnome.isSelected()) {
            race = "Gnome";
            subRace1.setVisible(true);
            subRace2.setVisible(true);
            subRace3.setVisible(true);
            //subRace1.set
            subRace4.setVisible(false);
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
            playerRaceLabel.setText(race);
        }
        if(Goblin.isSelected()) {
            race = "Goblin";
            playerRaceLabel.setText(race);
        }
        if(Goliath.isSelected()) {
            race = "Goliath";
            playerRaceLabel.setText(race);
        }
        if(Halfling.isSelected()) {
            race = "Halfling";
            playerRaceLabel.setText(race);
        }
        if(halfElf.isSelected()) {
            race = "halfElf";
            playerRaceLabel.setText(race);
        }
        if(halfOrc.isSelected()) {
            race = "halfOrc";
            playerRaceLabel.setText(race);
        }
        if(Hobgoblin.isSelected()) {
            race = "Hobgoblin";
            playerRaceLabel.setText(race);
        }
        if(Human.isSelected()) {
            race = "Human";
            playerRaceLabel.setText(race);
        }
        if(Kenku.isSelected()) {
            race = "Kenku";
            playerRaceLabel.setText(race);
        }
        if(Kobold.isSelected()) {
            race = "Kobold";
            playerRaceLabel.setText(race);
        }
        if(Lizardfolk.isSelected()) {
            race = "Lizardfolk";
            playerRaceLabel.setText(race);
        }
        if(Orc.isSelected()) {
            race = "Orc";
            playerRaceLabel.setText(race);
        }
        if(Tabaxi.isSelected()) {
            race = "Tabaxi";
            playerRaceLabel.setText(race);
        }
        if(Tiefling.isSelected()) {
            race = "Tiefling";
            playerRaceLabel.setText(race);
        }
        if(Triton.isSelected()) {
            race = "Triton";
            playerRaceLabel.setText(race);
        }
        if(Yuan.isSelected()) {
            race = "Yuan";
            playerRaceLabel.setText(race);
        }



        //handle all menu item selections


    }

    @FXML
    void refresh(){
        int strength, dexterity,constitution,charisma,wisdom,intelligence;

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
        //sets the base stats
        StrDisplay.setText(strength1.toString());
        DexDisplay.setText(dexterity1.toString());
        ConDisplay.setText(constitution1.toString());
        ChaDisplay.setText(charisma1.toString());
        WisDisplay.setText(wisdom1.toString());
        IntDisplay.setText(intelligence1.toString());



        //set the modifier text areas
        Integer StrMod = new Integer(statCreate.getStrength_Mod());
        strModArea.setText(StrMod.toString());
        Integer DexMod = new Integer(statCreate.getDexterity_Mod());
        dexModArea.setText(DexMod.toString());
        Integer ConMod = new Integer(statCreate.getConstitution_Mod());
        conModArea.setText(ConMod.toString());
        Integer ChaMod = new Integer(statCreate.getCharisma_Mod());
        chaModArea.setText(ChaMod.toString());
        Integer WisMod = new Integer(statCreate.getWisdom_Mod());
        wisModArea.setText(WisMod.toString());
        Integer IntMod = new Integer(statCreate.getIntelligence_Mod());
        intModArea.setText(IntMod.toString());

        //do this for all skills later
        acroLabel.setText(DexMod.toString());
        AnmlLabel.setText(ChaMod.toString());
        ArcanaLabel.setText(IntMod.toString());
        athlLabel.setText(StrMod.toString());
        DecepLabel.setText(ChaMod.toString());
        HistLabel.setText(IntMod.toString());
        InsightLabel.setText(WisMod.toString());
        IntimidLabel.setText(ChaMod.toString());
        InvestLabel.setText(IntMod.toString());
        MediLabel.setText(IntMod.toString());
        NatureLabel.setText(WisMod.toString());
        PercepLabel.setText(WisMod.toString());
        PerformLabel.setText(ChaMod.toString());
        PersuadeLabel.setText(ChaMod.toString());
        ReliLabel.setText(WisMod.toString());
        SleightLabel.setText(DexMod.toString());
        StealthLabel.setText(DexMod.toString());
        SurviveLabel.setText(WisMod.toString());
    }

}
