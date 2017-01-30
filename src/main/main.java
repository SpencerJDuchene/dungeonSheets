package main;
import Player.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Spencer on 1/24/2017.
 */
public class main extends Application{

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox page = (VBox) FXMLLoader.load(main.class.getResource("Dungeon_Sheets_Gui.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("FXML is Simple");
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args){
        background interact = new background(); //background extends StatGen so we get the same access
        System.out.println("Welcome to Dungeon Sheets, here are some random stats");
        interact.trueRandomStats();
        interact.currentStats();
        interact.raceSelection();
        interact.currentStats();
        interact.statModGen();
        interact.skills();
        launch(args);
    }

}
