package main;
import Player.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Spencer on 1/24/2017.
 */
public class main extends Application{

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox page = FXMLLoader.load(main.class.getResource("Dungeon_Sheets_Gui.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            this.getClass().getClassLoader().getResourceAsStream("main/res/dungeonsheetsico.png");
            primaryStage.getIcons().add(new Image(main.class.getResourceAsStream("res/dungeonsheetsico.png")));
            primaryStage.setTitle("Dungeon Sheets ALPHA 0.3.0");
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args){
        statRolls playerRolls = new statRolls();
        background interact = new background(); //background extends StatGen so we get the same access
        launch(args);
    }

}
