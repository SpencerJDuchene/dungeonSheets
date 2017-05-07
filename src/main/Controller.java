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
    public CheckBox acroProf, anmlProf, arcanaProf,athletProf,decepProf,natureProf,percepProf, performProf, persuaProf;
    @FXML
    public CheckBox histProf,insightProf,initimiProf,investProf,mediProf,reliProf,sohProf,stealthProf,surviveProf;
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
    void updateCheck(ActionEvent blah){
        if(acroProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(anmlProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(arcanaProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(athletProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(decepProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(natureProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(percepProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(performProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(persuaProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(histProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(insightProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(initimiProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(investProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(mediProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(reliProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(sohProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(stealthProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }if(surviveProf.isSelected()){
            statCreate.setAcrobatics(statCreate.getAcrobatics()+ statCreate.getProficiency());
        }

        //undo the profficeny bonus when unchecks

        if(acroProf.isSelected() == false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(anmlProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(arcanaProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(athletProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(decepProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(natureProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(percepProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(performProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(persuaProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(histProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(insightProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(initimiProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(investProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(mediProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(reliProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(sohProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(stealthProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }if(surviveProf.isSelected()== false ){
            statCreate.setAcrobatics(statCreate.getAcrobatics()- statCreate.getProficiency());
        }
        }
    }
