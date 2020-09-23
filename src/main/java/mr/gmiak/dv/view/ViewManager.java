package mr.gmiak.dv.view;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewManager {
    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 700;
    //constructor
    public ViewManager() {
        mainPane = new AnchorPane();
        mainScene = new Scene(mainPane, WIDTH, HEIGHT);
        mainStage = new Stage();
        mainStage.setScene(mainScene);
    }
    //return the main stage
    public Stage getMainStage() {return mainStage;}
}
