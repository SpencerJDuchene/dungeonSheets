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
    String race;
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
                    statCreate.setBaseStrength(Integer.parseInt(StrDisplay.getText()));
                    statCreate.setBaseDexterity(Integer.parseInt(DexDisplay.getText()));
                    statCreate.setBaseConstitution(Integer.parseInt(ConDisplay.getText()));
                    statCreate.setBaseIntelligence(Integer.parseInt(IntDisplay.getText()));
                    statCreate.setBaseCharisma(Integer.parseInt(ChaDisplay.getText()));
                    statCreate.setBaseWisdom(Integer.parseInt(WisDisplay.getText()));
                    statCreate.statInitialize();
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
    //updates the subrace menu based on selections
    @FXML
    void handleRace(ActionEvent updateRace){
        //defaults the first choice to be selected
        //find way to impliment the default stats if this is to remain
        //subRace1.setSelected(true);

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
            subRace1.setText("Forest");
            subRace2.setText("Rock");
            subRace3.setText("Deep");
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
        if(Goliath.isSelected()) {
            race = "Goliath";
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
        if(Halfling.isSelected()) {
            race = "Halfling";
            subRace1.setVisible(true);
            subRace2.setVisible(true);
            subRace3.setVisible(true);
            subRace1.setText("Lightfoot");
            subRace2.setText("Stout");
            subRace3.setText("Ghostwise");
            subRace4.setVisible(false);
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
            playerRaceLabel.setText(race);

        }
        if(halfElf.isSelected()) {
            race = "halfElf";
            subRace1.setVisible(true);
            subRace2.setVisible(true);
            subRace3.setVisible(true);
            subRace4.setVisible(true);
            subRace1.setText("Half-Wood");
            subRace2.setText("Half-Moon/Sun");
            subRace3.setText("Half-Drow");
            subRace4.setText("Half-Aquatic");
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
            playerRaceLabel.setText(race);

        }
        if(halfOrc.isSelected()) {
            race = "halfOrc";
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
        if(Hobgoblin.isSelected()) {
            race = "Hobgoblin";
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
        if(Human.isSelected()) {
            race = "Human";
            subRace1.setVisible(true);
            subRace2.setVisible(true);
            subRace1.setText("None");
            subRace2.setText("Variant");
            subRace3.setVisible(false);
            subRace4.setVisible(false);
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
            playerRaceLabel.setText(race);

        }
        if(Kenku.isSelected()) {
            race = "Kenku";
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
        if(Kobold.isSelected()) {
            race = "Kobold";
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
        if(Lizardfolk.isSelected()) {
            race = "Lizardfolk";
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
        if(Orc.isSelected()) {
            race = "Orc";
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
        if(Tabaxi.isSelected()) {
            race = "Tabaxi";
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
        if(Tiefling.isSelected()) {
            race = "Tiefling";
            subRace1.setVisible(true);
            subRace2.setVisible(true);
            subRace3.setVisible(true);
            subRace1.setText("None");
            subRace2.setText("Variant");
            subRace3.setText("Feral");
            subRace4.setVisible(false);
            subRace5.setVisible(false);
            subRace6.setVisible(false);
            subRace7.setVisible(false);
            subRace8.setVisible(false);
            subRace9.setVisible(false);
            playerRaceLabel.setText(race);

        }
        if(Triton.isSelected()) {
            race = "Triton";
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
        if(Yuan.isSelected()) {
            race = "Yuan";
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



        //handle all menu item selections


    }
    //updates the players race bonuses and information based on selections
    @FXML
    void handleSubRace(ActionEvent updateSubRace){
        int strength,dexterity,constitution,charisma,wisdom,intelligence;
        if(race == "Aasimar"){
            if(subRace1.isSelected()){ //base
                //reset all stats to base stats.
                statCreate.initialiazeNonBaseStats();
                //TODO fix issue where updating the stat after changing the race can allow stats to increment
                increaseCharisma(2);
                statCreate.GenAll();
                refresh();
            }
            if(subRace2.isSelected()){ //protector
                //reset all stats to base stats.
                statCreate.initialiazeNonBaseStats();
                increaseCharisma(2);
                increaseWisdom(1);
                statCreate.GenAll();
                refresh();
            }
            if(subRace3.isSelected()){ //scourge
                //reset all stats to base stats.
                statCreate.initialiazeNonBaseStats();
                increaseCharisma(2);
                increaseConstitution(1);
                statCreate.GenAll();
                refresh();
            }
            if(subRace4.isSelected()){ //fallen
                //reset all stats to base stats.
                statCreate.initialiazeNonBaseStats();
                increaseCharisma(2);
                increaseStrength(1);
                statCreate.GenAll();
                refresh();
            }
        }
        if(race == "Dragonborn"){}
        if(race == "Dwarf"){}
        if(race == "Elf"){}
        if(race == "Firebolg"){}
        if(race == "Genasi"){}
        if(race == "Gnome"){}
        if(race == "Goblin"){}
        if(race == "Goliath"){}
        if(race == "Halfling"){}
        if(race == "halfElf"){}
        if(race == "halfOrc"){}
        if(race == "Hobgoblin"){}
        if(race == "Human"){}
        if(race == "Kenku"){}
        if(race == "Kobold"){}
        if(race == "Lizardfolk"){}
        if(race == "Orc"){}
        if(race == "Tabaxi"){}
        if(race == "Tiefling"){}
        if(race == "Triton"){}
        if(race == "Yuan"){}

    }
    //refreshes all fields for the entire gui.
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

    //functions to prevent repetition of the same crap 100 times.
    void increaseStrength(int x){
        int charisma;
        charisma = statCreate.getBaseStrength();
        charisma = charisma + x;
        statCreate.setStrength(charisma);
    }
    void increaseDexterity(int x){
        int charisma;
        charisma = statCreate.getBaseDexterity();
        charisma = charisma + x;
        statCreate.setDexterity(charisma);
    }
    void increaseConstitution(int x){
        int charisma;
        charisma = statCreate.getBaseConstitution();
        charisma = charisma + x;
        statCreate.setConstitution(charisma);
    }
    void increaseCharisma(int x){
        int charisma;
        charisma = statCreate.getBaseCharisma();
        charisma = charisma + x;
        statCreate.setCharisma(charisma);
    }
    void increaseWisdom(int x){
        int charisma;
        charisma = statCreate.getBaseWisdom();
        charisma = charisma + x;
        statCreate.setWisdom(charisma);
    }
    void increaseIntelligence(int x){
        int charisma;
        charisma = statCreate.getBaseIntelligence();
        charisma = charisma + x;
        statCreate.setIntelligence(charisma);
    }

}
