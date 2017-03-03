package Player;

import java.util.*;
/**
 * Created by Spencer on 1/23/2017.
 *
 * This class handles the default generation of player stats, and handles the math
 *      controlling the stats dependent on them. Including: Skills, Saving Throws, Modifiers, HP, TEMP HP
 *      HIT Dice, Death Saves, Proficiency,Initiative, Armor Class, Speed, ETC...
 */ public class StatGen {
    protected int Strength,Dexterity,Constitution,Wisdom,Intelligence,Charisma;
    protected int Acrobatics, Animal_Handling, Arcana, Athletics, Deception, History;
    protected int Insight, Intimidation,Investigation,Medicine,Nature,Perception,Performance;
    protected int Persuasion,Religion,Sleight_of_Hand,Stealth,Survival;
    protected int Player_Level = 1;
    protected int Hit_Dice, Initiative, Armor_Class, Speed, experience;
    protected int proficiency;
    protected int Strength_Mod, Dexterity_Mod,Constitution_Mod,Wisdom_Mod,Intelligence_Mod,Charisma_Mod;
    protected int baseStrength,baseDexterity,baseConstitution,baseWisdom,baseCharisma,baseIntelligence;


    public void statInitialize(){
        initialiazeNonBaseStats();
        GenAll();
    }
    public void GenAll(){
        statModGen();
        getSkills();
        getProficiency();
        getArmor_Class();
        getInitiative();
    }
    //gets, and updates if need be, the Modifiers for the base player stats.
    public void statModGen(){
        //this class gets the modifiers of stat
        //mod = 1/2 Stat  - 5
        Strength_Mod = ((getStrength()/2) - 5);
        Dexterity_Mod = ((getDexterity()/2) - 5);
        Constitution_Mod = ((getConstitution()/2) - 5);
        Charisma_Mod = ((getCharisma()/2) - 5);
        Wisdom_Mod = ((getWisdom()/2) - 5);
        Intelligence_Mod = ((getIntelligence()/2) - 5);
    }
    //handles skill stat generation
    public void getSkills(){
        //TODO create loop to check for proffiecency in a skill; do this in another method
        //TODO verify that the proper stat mods are used for skills
        Acrobatics = getDexterity_Mod();
        Animal_Handling = getCharisma_Mod();
        Arcana = getIntelligence_Mod();
        Athletics = getStrength_Mod();
        Deception = getCharisma_Mod();
        History = getIntelligence_Mod();
        Insight = getWisdom_Mod();
        Intimidation = getCharisma_Mod();
        Investigation = getIntelligence_Mod();
        Medicine = getIntelligence_Mod();
        Nature = getWisdom_Mod();
        Perception = getWisdom_Mod();
        Performance = getCharisma_Mod();
        Persuasion = getCharisma_Mod();
        Religion = getWisdom_Mod();
        Sleight_of_Hand = getDexterity_Mod();
        Stealth = getDexterity_Mod();
        Survival = getWisdom_Mod();

    }
    //sets the stats to be the base stats
    public void initialiazeNonBaseStats(){
        setStrength(getBaseStrength());
        setDexterity(getBaseDexterity());
        setConstitution(getBaseConstitution());
        setCharisma(getBaseCharisma());
        setWisdom(getBaseWisdom());
        setIntelligence(getBaseIntelligence());
    }
    //allows users to use the point buy system in character creation
    public void purchaseSystem(){
        //requires userinput to handle ex) please pick a number to choose your point buy system 1 15 14 13 10 9 8
        //full choice list located here https://www.reddit.com/r/DnD/comments/2epkdi/5e_here_is_a_complete_list_of_valid_ability_score/
    }
    //recommends point allocations based on users race and/or class, maybe also subclass if selected early
    public void recomendationSystem(){
        //getClassclass to check player class, then get getRace to check race, use this to suggest best for class or
        //to suggest best for balanced stats.
    }

    public int getBaseStrength() {
        return baseStrength;
    }

    public void setBaseStrength(int baseStrength) {
        this.baseStrength = baseStrength;
    }

    public int getBaseDexterity() {
        return baseDexterity;
    }

    public void setBaseDexterity(int baseDexterity) {
        this.baseDexterity = baseDexterity;
    }

    public int getBaseConstitution() {
        return baseConstitution;
    }

    public void setBaseConstitution(int baseConstitution) {
        this.baseConstitution = baseConstitution;
    }

    public int getBaseWisdom() {
        return baseWisdom;
    }

    public void setBaseWisdom(int baseWisdom) {
        this.baseWisdom = baseWisdom;
    }

    public int getBaseCharisma() {
        return baseCharisma;
    }

    public void setBaseCharisma(int baseCharisma) {
        this.baseCharisma = baseCharisma;
    }

    public int getBaseIntelligence() {
        return baseIntelligence;
    }

    public void setBaseIntelligence(int baseIntelligence) {
        this.baseIntelligence = baseIntelligence;
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
        //get player size. Need to handle race
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }
    //finds player proffiency, this calculation loads players level and checks it against a math formula
    public void getProficiency(){
        int level = getPlayer_Level();
        proficiency = 2;
        while ((level - 4) > 0){
            proficiency++;
            level = level - 4;
            if (level == 0){
                break;
            }
        }


    }
}
