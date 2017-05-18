package main;
import IO.Saving;
import Player.*;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * Created by Spencer on 1/24/2017.
 */
public class main extends Application{

    //TODO handle sizing, get monitor size and fit to it. And set up preference options for users.
    @Override
    public void start(Stage primaryStage) {
        try {
            VBox page = FXMLLoader.load(main.class.getResource("Dungeon_Sheets_Gui.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            this.getClass().getClassLoader().getResourceAsStream("main/res/dungeonsheetsico.png");
            primaryStage.getIcons().add(new Image(main.class.getResourceAsStream("res/dungeonsheetsico.png")));
            primaryStage.setTitle("Dungeon Sheets ALPHA 0.3.3");
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void haveMeCallMain(){
        Saving test = new Saving();
        test.storeStage(start());
    }
    public static void main(String[] args){
        launch(args);
    }

}
