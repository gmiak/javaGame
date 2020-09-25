package mr.gmiak.dv.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ButtonGameSelect {
    //constructor
    public ButtonGameSelect(){

    }
    //On selected any game
    public void selectedEffect(ImageView image) throws IOException {
        InputStream inStream = Files.newInputStream(Paths.get("src/main/resources/grey_button13.png"));
        Image img = new Image(inStream);
        inStream.close();
        image.setImage(img);
        image.setFitHeight(196);
        image.setLayoutY(image.getLayoutY()+4);
    }
    //On exited any game
    public void exitedEffect(ImageView image) throws IOException {
        InputStream inStream = Files.newInputStream(Paths.get("src/main/resources/grey_button12.png"));
        Image img = new Image(inStream);
        inStream.close();
        image.setImage(img);
        image.setFitHeight(200);
        image.setLayoutY(image.getLayoutY()-4);
    }
}
