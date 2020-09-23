package mr.gmiak.dv;

import javafx.application.Application;
import javafx.stage.Stage;
import mr.gmiak.dv.view.ViewManager;

/**
 * Hello world!
 *
 */
public class App extends Application {
    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewManager viewManager = new ViewManager();
        primaryStage = viewManager.getMainStage();
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
