package Player;

/**
 * Created by Spencer on 2/1/2017.
 */
import java.util.Random;

//provides multiple functions for generating ability scores
public class statRolls {
    Random stat = new Random();
    int rollCount = 0;
    int rollOne,rollTwo,rollThree,rollFour;

    //TODO remove System.outs on release.
    //rolls 3d6 seven times
    public void roll6(){
        while (rollCount < 6){
            rollOne = stat.nextInt(6) + 1;
            rollTwo = stat.nextInt(6) + 1;
            rollThree = stat.nextInt(6) + 1;
            System.out.println("Roll 6: You rolled: " + rollOne + " " + rollTwo + " " + rollThree);

            rollCount++;
        }
        rollCount = 0;

    }
    //rolls 7 and takes the highest 6 rolls
    public void roll7(){
        while (rollCount < 7){
            rollOne = stat.nextInt(6) + 1;
            rollTwo = stat.nextInt(6) + 1;
            rollThree = stat.nextInt(6) + 1;
            System.out.println("Roll 7: You rolled: " + rollOne + " " + rollTwo + " " + rollThree);

            rollCount++;
        }
        rollCount = 0;
    }
    //rolls 4d6 taking the highest 3, 6 times
    public void roll4SixTimes(){
        while (rollCount < 6){
            rollOne = stat.nextInt(6) + 1;
            rollTwo = stat.nextInt(6) + 1;
            rollThree = stat.nextInt(6) + 1;
            rollFour = stat.nextInt(6) + 1;
            System.out.println("Roll 4d6 x 6: You rolled: " + rollOne + " " + rollTwo + " " + rollThree + " " + rollFour);

            rollCount++;
        }
        rollCount = 0;

    }
    //rolls 4d6 taking the highest 3, 7 times
    public void roll4SevenTimes(){
        while (rollCount < 7){
            rollOne = stat.nextInt(6) + 1;
            rollTwo = stat.nextInt(6) + 1;
            rollThree = stat.nextInt(6) + 1;
            rollFour = stat.nextInt(6) + 1;
            System.out.println("Roll 4d6 x 7: You rolled: " + rollOne + " " + rollTwo + " " + rollThree + " " + rollFour);

            rollCount++;
        }
        rollCount = 0;

    }
    //lists all options for the default point buy system.
    public void displayPointBuy(){

    }
}
