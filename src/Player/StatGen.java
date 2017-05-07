package Player;

import java.util.*;
/**
 * Created by Spencer on 1/23/2017.
 *
 * This class handles the default generation of player stats, and handles the math
 *      controlling the stats dependent on them. Including: Skills, Saving Throws, Modifiers, HP, TEMP HP
 *      HIT Dice, Death Saves, Proficiency,Initiative, Armor Class, Speed, ETC...
 */ public class StatGen {
     //Minimize editing of "Base" stats in order to keep data more consistent across the app.
    protected int BaseStrength,BaseDexterity,BaseConstitution,BaseWisdom,BaseIntelligence,BaseCharisma;
    //Initialize these with the base stats, then update with other data.
    protected int Strength,Dexterity,Constitution,Wisdom,Intelligence,Charisma;
    protected int Strength_Mod, Dexterity_Mod,Constitution_Mod,Wisdom_Mod,Intelligence_Mod,Charisma_Mod;
    protected int Acrobatics, Animal_Handling, Arcana, Athletics, Deception, History;
    protected int Insight, Intimidation,Investigation,Medicine,Nature,Perception,Performance;
    protected int Persuasion,Religion,Sleight_of_Hand,Stealth,Survival;
    //This data will need to change on a character load.
    protected int Player_Level = 1;
    protected int Hit_Dice, Initiative, Armor_Class, Speed, experience, proficiency;


    //This function will create 1 random stat, (a 3d6 roll)
    int threeDSix(){
        Random roll = new Random();
        int first = roll.nextInt(6);
        int second = roll.nextInt(6);
        int third = roll.nextInt(6);
        return (first + second + third);
    }
    // this function will load all stats to a random number 3-18
    void randomStats(){
        setBaseStrength(threeDSix());
        setBaseDexterity(threeDSix());
        setBaseConstitution(threeDSix());
        setBaseCharisma(threeDSix());
        setBaseIntelligence(threeDSix());
        setBaseWisdom(threeDSix());
    }
    //This function initializes the primary stats
    void primaryStatLoader(){
        Strength = getBaseStrength();
        Dexterity = getBaseDexterity();
        Constitution = getBaseConstitution();
        Charisma = getBaseCharisma();
        Wisdom = getBaseWisdom();
        Intelligence = getBaseIntelligence();
    }
    //this function initializes all the modifiers
    void modifierLoader(){

        Strength_Mod = (getBaseStrength()/2) - 5;
        Dexterity_Mod = (getBaseDexterity()/2) - 5;
        Constitution_Mod = (getBaseConstitution()/2) - 5;
        Charisma_Mod = (getBaseCharisma()/2) - 5;
        Wisdom_Mod = (getBaseWisdom()/2) - 5;
        Intelligence_Mod = (getBaseIntelligence()/2) - 5;
    }
    //this function initializes all the skills
    void skillLoader(){
        //add a profficiency check call into this
        Acrobatics = getDexterity_Mod();
        Animal_Handling = getWisdom_Mod();
        Arcana = getIntelligence_Mod();
        Athletics = getStrength_Mod();
        Deception = getCharisma_Mod();
        History = getIntelligence_Mod();
        Insight = getWisdom_Mod();
        Intimidation = getCharisma_Mod();
        Investigation = getIntelligence_Mod();
        Medicine = getWisdom_Mod();
        Nature = getIntelligence_Mod();
        Perception = getWisdom_Mod();
        Performance = getCharisma_Mod();
        Persuasion = getCharisma_Mod();
        Religion = getIntelligence_Mod();
        Sleight_of_Hand = getDexterity_Mod();
        Stealth = getDexterity_Mod();
        Survival = getWisdom_Mod();
    }
    //This function will call all initialization functions
    public void fullIntialize(){
        primaryStatLoader();
        modifierLoader();
        skillLoader();
    }


    //GETTERS AND SETTERS

    public int getBaseStrength() {
        return BaseStrength;
    }

    public void setBaseStrength(int baseStrength) {
        BaseStrength = baseStrength;
    }

    public int getBaseDexterity() {
        return BaseDexterity;
    }

    public void setBaseDexterity(int baseDexterity) {
        BaseDexterity = baseDexterity;
    }

    public int getBaseConstitution() {
        return BaseConstitution;
    }

    public void setBaseConstitution(int baseConstitution) {
        BaseConstitution = baseConstitution;
    }

    public int getBaseWisdom() {
        return BaseWisdom;
    }

    public void setBaseWisdom(int baseWisdom) {
        BaseWisdom = baseWisdom;
    }

    public int getBaseIntelligence() {
        return BaseIntelligence;
    }

    public void setBaseIntelligence(int baseIntelligence) {
        BaseIntelligence = baseIntelligence;
    }

    public int getBaseCharisma() {
        return BaseCharisma;
    }

    public void setBaseCharisma(int baseCharisma) {
        BaseCharisma = baseCharisma;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public void setDexterity(int dexterity) {
        Dexterity = dexterity;
    }

    public int getConstitution() {
        return Constitution;
    }

    public void setConstitution(int constitution) {
        Constitution = constitution;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public int getCharisma() {
        return Charisma;
    }

    public void setCharisma(int charisma) {
        Charisma = charisma;
    }

    public int getStrength_Mod() {
        return Strength_Mod;
    }

    public void setStrength_Mod(int strength_Mod) {
        Strength_Mod = strength_Mod;
    }

    public int getDexterity_Mod() {
        return Dexterity_Mod;
    }

    public void setDexterity_Mod(int dexterity_Mod) {
        Dexterity_Mod = dexterity_Mod;
    }

    public int getConstitution_Mod() {
        return Constitution_Mod;
    }

    public void setConstitution_Mod(int constitution_Mod) {
        Constitution_Mod = constitution_Mod;
    }

    public int getWisdom_Mod() {
        return Wisdom_Mod;
    }

    public void setWisdom_Mod(int wisdom_Mod) {
        Wisdom_Mod = wisdom_Mod;
    }

    public int getIntelligence_Mod() {
        return Intelligence_Mod;
    }

    public void setIntelligence_Mod(int intelligence_Mod) {
        Intelligence_Mod = intelligence_Mod;
    }

    public int getCharisma_Mod() {
        return Charisma_Mod;
    }

    public void setCharisma_Mod(int charisma_Mod) {
        Charisma_Mod = charisma_Mod;
    }

    public int getAcrobatics() {
        return Acrobatics;
    }

    public void setAcrobatics(int acrobatics) {
        Acrobatics = acrobatics;
    }

    public int getAnimal_Handling() {
        return Animal_Handling;
    }

    public void setAnimal_Handling(int animal_Handling) {
        Animal_Handling = animal_Handling;
    }

    public int getArcana() {
        return Arcana;
    }

    public void setArcana(int arcana) {
        Arcana = arcana;
    }

    public int getAthletics() {
        return Athletics;
    }

    public void setAthletics(int athletics) {
        Athletics = athletics;
    }

    public int getDeception() {
        return Deception;
    }

    public void setDeception(int deception) {
        Deception = deception;
    }

    public int getHistory() {
        return History;
    }

    public void setHistory(int history) {
        History = history;
    }

    public int getInsight() {
        return Insight;
    }

    public void setInsight(int insight) {
        Insight = insight;
    }

    public int getIntimidation() {
        return Intimidation;
    }

    public void setIntimidation(int intimidation) {
        Intimidation = intimidation;
    }

    public int getInvestigation() {
        return Investigation;
    }

    public void setInvestigation(int investigation) {
        Investigation = investigation;
    }

    public int getMedicine() {
        return Medicine;
    }

    public void setMedicine(int medicine) {
        Medicine = medicine;
    }

    public int getNature() {
        return Nature;
    }

    public void setNature(int nature) {
        Nature = nature;
    }

    public int getPerception() {
        return Perception;
    }

    public void setPerception(int perception) {
        Perception = perception;
    }

    public int getPerformance() {
        return Performance;
    }

    public void setPerformance(int performance) {
        Performance = performance;
    }

    public int getPersuasion() {
        return Persuasion;
    }

    public void setPersuasion(int persuasion) {
        Persuasion = persuasion;
    }

    public int getReligion() {
        return Religion;
    }

    public void setReligion(int religion) {
        Religion = religion;
    }

    public int getSleight_of_Hand() {
        return Sleight_of_Hand;
    }

    public void setSleight_of_Hand(int sleight_of_Hand) {
        Sleight_of_Hand = sleight_of_Hand;
    }

    public int getStealth() {
        return Stealth;
    }

    public void setStealth(int stealth) {
        Stealth = stealth;
    }

    public int getSurvival() {
        return Survival;
    }

    public void setSurvival(int survival) {
        Survival = survival;
    }

    public int getPlayer_Level() {
        return Player_Level;
    }

    public void setPlayer_Level(int player_Level) {
        Player_Level = player_Level;
    }

    public int getHit_Dice() {
        return Hit_Dice;
    }

    public void setHit_Dice(int hit_Dice) {
        Hit_Dice = hit_Dice;
    }

    public int getInitiative() {
        return Initiative;
    }

    public void setInitiative(int initiative) {
        Initiative = initiative;
    }

    public int getArmor_Class() {
        return Armor_Class;
    }

    public void setArmor_Class(int armor_Class) {
        Armor_Class = armor_Class;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getProficiency() {
        int level = getPlayer_Level();
        int proficiency = 0;
        while (level >= 1){
            proficiency = proficiency + 1;
            level = level - 4;
        }
        return proficiency;
    }

    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }
}
