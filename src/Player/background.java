package Player;

import java.util.*;

import main.main;
import main.main.*;
import sun.security.jca.GetInstance;

/**
 * Created by Spencer on 1/24/2017.
 */
public class background extends StatGen{
    public void raceSelection(){
        //use buffered in later
        Scanner racePick = new Scanner(System.in);
        System.out.println("Please enter your race");
        /*TODO replace with check against a document list
        *   If in sheet return race found and apply info, else return sheet not available and produce help text
        */
        String human = "human"; String half_elf = "half_elf";
        String raceEntered = racePick.next();
        //TODO add all classes after implementing the GUI
            if(raceEntered.equalsIgnoreCase(human)){
                System.out.println("You've picked human");
                Strength = getStrength() + 1;
                    setStrength(Strength);
                Dexterity = getDexterity() + 1;
                    setDexterity(Dexterity);
                Constitution = getConstitution() + 1;
                    setConstitution(Constitution);
                Charisma = getCharisma() + 1;
                    setCharisma(Charisma);
                Wisdom = getWisdom() + 1;
                    setWisdom(Wisdom);
                Intelligence = getIntelligence() + 1;
                    setIntelligence(Intelligence);
                //setters cant do math, gotta be a cleaner way to do this without calling 1 by one, method to call methods?
                //method that does above but with a variable in place of 1 this allows increase/decrease of these ints
            }
            else if (raceEntered.equalsIgnoreCase(half_elf)){
                System.out.println("Youve picked half-elf");
                Dexterity = getDexterity() + 2;
                    setDexterity(Dexterity);
                Wisdom = getWisdom() + 1;
                    setWisdom(Wisdom);
            }
            else{
                System.out.println("Invalid race");
            }
    }


}
