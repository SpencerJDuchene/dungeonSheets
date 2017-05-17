package main;
/**
 * 'Dungeon_Sheets_Gui.fxml' Controller Class
 */


import IO.Saving;
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
    private Label strModArea,dexModArea,conModArea,chaModArea,wisModArea,intModArea;
    @FXML
    private Label strSave,dexSave,conSave,chaSave,wisSave,intSave;
    @FXML
    private Label acroLabel, AnmlLabel,ArcanaLabel,athlLabel,DecepLabel,HistLabel,InsightLabel,IntimidLabel;
    @FXML
    private Label InvestLabel,MediLabel,NatureLabel,PercepLabel,PerformLabel,PersuadeLabel,ReliLabel;
    @FXML
    private Label SleightLabel,StealthLabel,SurviveLabel;
    @FXML
    public Label levelLabel, profLabel;
    @FXML
    private CheckBox acroProf, anmlProf, arcanaProf,athletProf,decepProf,natureProf,percepProf, performProf, persuaProf;
    @FXML
    private CheckBox histProf,insightProf,investProf,mediProf,reliProf,sohProf,stealthProf,surviveProf, initimiProf;
    @FXML
    private CheckBox strProf,dexProf,conProf,chaProf,wisProf,intProf;
    @FXML
    private MenuItem saveToFile;


    //takes the event from the update button and updates stats when pressed
    //figure out how to update stats when focus is lost, need to fix the loader to update independently of other stats
    @FXML
    void buttonPressed() {
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
     //set the modifier text areas
        strModArea.setText(((Integer) statCreate.getStrength_Mod()).toString());
        dexModArea.setText(((Integer) statCreate.getDexterity_Mod()).toString());
        conModArea.setText(((Integer) statCreate.getConstitution_Mod()).toString());
        chaModArea.setText(((Integer) statCreate.getCharisma_Mod()).toString());
        wisModArea.setText(((Integer) statCreate.getWisdom_Mod()).toString());
        intModArea.setText(((Integer) statCreate.getIntelligence_Mod()).toString());

        Integer level = statCreate.getPlayer_Level();
        Integer proficiency = statCreate.getProficiency();
        levelLabel.setText(level.toString());
        profLabel.setText(proficiency.toString());
        updateCheck();
    }
    //I would honestly love a way to shorten this, it feels excessive.
    @FXML
    void updateCheck(){
        Integer alter = 0;
        if(strProf.isSelected()){
            alter = statCreate.getStrength_Mod() + statCreate.getProficiency();
            strSave.setText(alter.toString());
        }
        if(dexProf.isSelected()){
            alter = statCreate.getDexterity_Mod() + statCreate.getProficiency();
            dexSave.setText(alter.toString());
        }
        if(conProf.isSelected()){
            alter = statCreate.getConstitution_Mod() + statCreate.getProficiency();
            conSave.setText(alter.toString());
        }
        if(chaProf.isSelected()){
            alter = statCreate.getCharisma_Mod() + statCreate.getProficiency();
            chaSave.setText(alter.toString());
        }
        if(wisProf.isSelected()){
            alter = statCreate.getWisdom_Mod() + statCreate.getProficiency();
            wisSave.setText(alter.toString());
        }
        if(intProf.isSelected()){
            alter = statCreate.getIntelligence_Mod() + statCreate.getProficiency();
            intSave.setText(alter.toString());
        }
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
        if(strProf.isSelected() == false){
            alter = statCreate.getStrength_Mod();
            strSave.setText(alter.toString());
        }
        if(dexProf.isSelected()== false){
            alter = statCreate.getDexterity_Mod();
            dexSave.setText(alter.toString());
        }
        if(conProf.isSelected()== false){
            alter = statCreate.getConstitution_Mod();
            conSave.setText(alter.toString());
        }
        if(chaProf.isSelected()== false){
            alter = statCreate.getCharisma_Mod();
            chaSave.setText(alter.toString());
        }
        if(wisProf.isSelected()== false){
            alter = statCreate.getWisdom_Mod();
            wisSave.setText(alter.toString());
        }
        if(intProf.isSelected()== false){
            alter = statCreate.getIntelligence_Mod();
            intSave.setText(alter.toString());
        }
        //undo prof. bonus when unchecked

        }
    @FXML
    void save() {
        Saving savePlayer = new Saving();
        savePlayer.writeToFile(statCreate);
    }
    }
