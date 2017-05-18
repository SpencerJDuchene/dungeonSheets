package IO;

import Player.StatGen;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Saving{
    public Desktop desktop = Desktop.getDesktop();

    public void storeStage(Stage primaryStage) {

    }

    public void openFile(File file){
        try{
            desktop.open(file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

