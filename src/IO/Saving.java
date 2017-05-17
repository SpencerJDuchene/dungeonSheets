package IO;

import java.io.*;
import main.Controller;
import main.*;
/**
 * Created by Spencer on 3/1/2017.
 */
public class Saving{

    public void writeToFile(Object playerInstance){
        try{
            FileOutputStream savePlayer = new FileOutputStream();
            ObjectOutputStream writePlayer = new ObjectOutputStream(savePlayer);
            writePlayer.writeObject(playerInstance);
            writePlayer.close();
            savePlayer.close();
            System.out.println("Saved");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
