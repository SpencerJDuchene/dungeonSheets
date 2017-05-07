package main;
/**
 * 'Dungeon_Sheets_Gui.fxml' Controller Class
 */


import com.sun.org.apache.regexp.internal.RE;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import Player.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    //cant remember if making this global is bad or not
    @FXML
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
    private CheckBox acroProf, anmlProf, arcanaProf,athletProf,decepProf,natureProf,percepProf, performProf, persuaProf;
    @FXML
    private CheckBox histProf,insightProf,investProf,mediProf,reliProf,sohProf,stealthProf,surviveProf, initimiProf;
    @FXML
    private TextField strEdit,dexEdit,conEdit,chaEdit,wisEdit,intEdit;
    @FXML
    private javafx.scene.control.Button updateButton;
    @FXML
    private javafx.scene.control.CheckBox updateCheck;

    
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resourceBundle;
    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    //takes the event from the update button and updates stats when pressed
    @FXML
    //figure out how to update stats when focus is lost, need to fix the loader to update independently of other stats
    void buttonPressed(ActionEvent update) {
        while (count < 1) {

                try {
                    statCreate.setBaseStrength(Integer.parseInt(StrDisplay.getText()));
                    statCreate.setBaseDexterity(Integer.parseInt(DexDisplay.getText()));
                    statCreate.setBaseConstitution(Integer.parseInt(ConDisplay.getText()));
                    statCreate.setBaseIntelligence(Integer.parseInt(IntDisplay.getText()));
                    statCreate.setBaseCharisma(Integer.parseInt(ChaDisplay.getText()));
                    statCreate.setBaseWisdom(Integer.parseInt(WisDisplay.getText()));
                    statCreate.fullIntialize();
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
    @FXML
    void updateCheck(ActionEvent reNameMe){
        Integer alter = 0;
        if(acroProf.isSelected()){
            alter = statCreate.getDexterity_Mod() + statCreate.getProficiency();
            acroLabel.setText(alter.toString());
        }
        if(anmlProf.isSelected()){
            alter = statCreate.getCharisma_Mod() + statCreate.getProficiency();
            AnmlLabel.setText(alter.toString());
        }
        if(arcanaProf.isSelected()){
            alter = statCreate.getIntelligence_Mod() + statCreate.getProficiency();
            ArcanaLabel.setText(alter.toString());
        }
        if(athletProf.isSelected()){
            alter = statCreate.getStrength_Mod() + statCreate.getProficiency();
            athlLabel.setText(alter.toString());
        }
        if(decepProf.isSelected()){
            alter = statCreate.getCharisma_Mod() + statCreate.getProficiency();
            DecepLabel.setText(alter.toString());
        }
        if(natureProf.isSelected()){
            alter = statCreate.getIntelligence_Mod() + statCreate.getProficiency();
            NatureLabel.setText(alter.toString());
        }
        if(percepProf.isSelected()){
            alter = statCreate.getWisdom_Mod() + statCreate.getProficiency();
            PercepLabel.setText(alter.toString());
        }
        if(performProf.isSelected()){
            alter = statCreate.getCharisma_Mod() + statCreate.getProficiency();
            PerformLabel.setText(alter.toString());
        }
        if(persuaProf.isSelected()){
            alter = statCreate.getCharisma_Mod() + statCreate.getProficiency();
            PersuadeLabel.setText(alter.toString());
        }
        if(histProf.isSelected()){
            alter = statCreate.getIntelligence_Mod() + statCreate.getProficiency();
            HistLabel.setText(alter.toString());
        }
        if(insightProf.isSelected()){
            alter = statCreate.getWisdom_Mod() + statCreate.getProficiency();
            InsightLabel.setText(alter.toString());
        }
        if(initimiProf.isSelected()){
            alter = statCreate.getCharisma_Mod() + statCreate.getProficiency();
            IntimidLabel.setText(alter.toString());
        }
        if(investProf.isSelected()){
            alter = statCreate.getIntelligence_Mod() + statCreate.getProficiency();
            InvestLabel.setText(alter.toString());
        }
        if(mediProf.isSelected()){
            alter = statCreate.getWisdom_Mod() + statCreate.getProficiency();
            MediLabel.setText(alter.toString());
        }
        if(reliProf.isSelected()){
            alter = statCreate.getIntelligence_Mod() + statCreate.getProficiency();
            ReliLabel.setText(alter.toString());
        }
        if(sohProf.isSelected()){
            alter = statCreate.getDexterity_Mod() + statCreate.getProficiency();
            SleightLabel.setText(alter.toString());
        }
        if(stealthProf.isSelected()){
            alter = statCreate.getDexterity_Mod() + statCreate.getProficiency();
            StealthLabel.setText(alter.toString());
        }
        if(surviveProf.isSelected()){
            alter = statCreate.getWisdom_Mod() + statCreate.getProficiency();
            SurviveLabel.setText(alter.toString());
        }
        //Undo the bonus when unchecked
        if(acroProf.isSelected() == false){
            alter = statCreate.getDexterity_Mod();
            acroLabel.setText(alter.toString());
        }
        if(anmlProf.isSelected() == false){
            alter = statCreate.getCharisma_Mod();
            AnmlLabel.setText(alter.toString());
        }
        if(arcanaProf.isSelected() == false){
            alter = statCreate.getIntelligence_Mod();
            ArcanaLabel.setText(alter.toString());
        }
        if(athletProf.isSelected() == false){
            alter = statCreate.getStrength_Mod();
            athlLabel.setText(alter.toString());
        }
        if(decepProf.isSelected() == false){
            alter = statCreate.getCharisma_Mod();
            DecepLabel.setText(alter.toString());
        }
        if(natureProf.isSelected() == false){
            alter = statCreate.getIntelligence_Mod();
            NatureLabel.setText(alter.toString());
        }
        if(percepProf.isSelected() == false){
            alter = statCreate.getWisdom_Mod();
            PercepLabel.setText(alter.toString());
        }
        if(performProf.isSelected() == false){
            alter = statCreate.getCharisma_Mod();
            PerformLabel.setText(alter.toString());
        }
        if(persuaProf.isSelected() == false){
            alter = statCreate.getCharisma_Mod();
            PersuadeLabel.setText(alter.toString());
        }
        if(histProf.isSelected() == false){
            alter = statCreate.getIntelligence_Mod();
            HistLabel.setText(alter.toString());
        }
        if(insightProf.isSelected() == false){
            alter = statCreate.getWisdom_Mod();
            InsightLabel.setText(alter.toString());
        }
        if(initimiProf.isSelected() == false){
            alter = statCreate.getCharisma_Mod();
            IntimidLabel.setText(alter.toString());
        }
        if(investProf.isSelected() == false){
            alter = statCreate.getIntelligence_Mod();
            InvestLabel.setText(alter.toString());
        }
        if(mediProf.isSelected() == false){
            alter = statCreate.getWisdom_Mod();
            MediLabel.setText(alter.toString());
        }
        if(reliProf.isSelected() == false){
            alter = statCreate.getIntelligence_Mod();
            ReliLabel.setText(alter.toString());
        }
        if(sohProf.isSelected() == false){
            alter = statCreate.getDexterity_Mod();
            SleightLabel.setText(alter.toString());
        }
        if(stealthProf.isSelected() == false){
            alter = statCreate.getDexterity_Mod();
            StealthLabel.setText(alter.toString());
        }
        if(surviveProf.isSelected() == false){
            alter = statCreate.getWisdom_Mod();
            SurviveLabel.setText(alter.toString());
        }
        //undo prof. bonus when unchecked

        }
    }
