package mr.gmiak.dv.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ViewManager {
    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 700;
    //constructor
    public ViewManager() throws IOException {
        //mainPane = new AnchorPane();
        mainPane = FXMLLoader.load(getClass().getClassLoader().getResource("startMenu.fxml"));
        mainScene = new Scene(mainPane, WIDTH, HEIGHT);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
        createBackground();
    }
    //return the main stage
    public Stage getMainStage() {return mainStage;}
    //add background image
    private void createBackground() throws IOException {
        InputStream inStream = Files.newInputStream(Paths.get("src/main/resources/bc1.jpg"));
        Image backgroundImage = new Image(inStream, 1000, 700, false, true);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, null);
        mainPane.setBackground(new Background(background));

    }
}
