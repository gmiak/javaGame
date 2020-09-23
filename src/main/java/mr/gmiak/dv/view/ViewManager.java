package mr.gmiak.dv.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewManager {
    //private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 700;
    //constructor
    public ViewManager() throws IOException {
        //mainPane = new AnchorPane();
        Parent mainPane = FXMLLoader.load(getClass().getClassLoader().getResource("startMenu.fxml"));
        mainScene = new Scene(mainPane, WIDTH, HEIGHT);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
    }
    //return the main stage
    public Stage getMainStage() {return mainStage;}
}
