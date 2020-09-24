package mr.gmiak.dv.controller;

import javafx.animation.TranslateTransition;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.util.Duration;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StartMenu {
    public AnchorPane subSceneMenu;
    public AnchorPane subSceneMenu1;
    public ImageView breakout;
    public ImageView spacerunner;
    private boolean isHidden;
    private boolean isHidden1;
    //constructor
    public StartMenu() throws IOException {
        isHidden=true;
        isHidden1=true;
    }
    //on click exit
    public void onClickedExit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void onClickedPlay(MouseEvent mouseEvent) {
        moveSubscene();
    }

    public void onClickedOptions(MouseEvent mouseEvent) {
        moveSubscene1();
    }
    //mouve subscene-menu
    public void moveSubscene() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.3));
        transition.setNode(subSceneMenu);
        if (isHidden) {
            transition.setToX(-650);
            isHidden = false;
        } else {
            transition.setToX(0);
            isHidden = true;
        }
        transition.play();
    }
    //mouve subscene-menu1
    public void moveSubscene1() {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(0.3));
        transition.setNode(subSceneMenu1);
        if (isHidden1) {
            transition.setToY(-500);
            isHidden1 = false;
        } else {
            transition.setToY(0);
            isHidden1 = true;
        }
        transition.play();
    }

    public void onMouseClickedGame(MouseEvent mouseEvent) {
    }

    public void onMouseReleasedGame(MouseEvent mouseEvent) {
    }
}
