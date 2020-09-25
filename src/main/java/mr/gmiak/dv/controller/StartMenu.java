package mr.gmiak.dv.controller;

import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.scene.SubScene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.util.Duration;
import mr.gmiak.dv.model.ButtonGameSelect;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StartMenu {
    public AnchorPane subSceneMenu;
    public AnchorPane subSceneMenu1;

    public ImageView buttonBreakout;
    public ImageView buttonSpacerunner;
    public AnchorPane breakoutGameSelect;
    public AnchorPane spacerunnerGameSelect;

    public ButtonGameSelect buttonGameSelect;

    private boolean isHidden;
    private boolean isHidden1;
    //constructor
    public StartMenu() throws IOException {
        isHidden=true;
        isHidden1=true;
        buttonGameSelect = new ButtonGameSelect();
    }
    //on click exit
    public void onClickedExit(MouseEvent mouseEvent) {
        System.exit(0);
    }
    //on click play
    public void onClickedPlay(MouseEvent mouseEvent) {
        moveSubscene();
    }
    //on click options
    public void onClickedOptions(MouseEvent mouseEvent) {
        moveSubscene1();
    }
    //mouve subscene play
    private void moveSubscene() {
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
    //mouve subscene options
    private void moveSubscene1() {
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
    /** When the user choose a game (in subscene play) --------------------------------------------- **/
    //1. Breakout
    public void onSelectedBreakout(MouseEvent mouseEvent) throws IOException {
        buttonGameSelect.selectedEffect(buttonBreakout);
    }
    public void onExitedBreakout(MouseEvent mouseEvent) throws IOException {
        buttonGameSelect.exitedEffect(buttonBreakout);
    }
    //2. Space runner
    public void onSelectedSpacerunner(MouseEvent mouseEvent) throws IOException {
        buttonGameSelect.selectedEffect(buttonSpacerunner);
    }
    public void onExitedSpacerunner(MouseEvent mouseEvent) throws IOException {
        buttonGameSelect.exitedEffect(buttonSpacerunner);
    }

    /** --------------------------------------------------------------------------------------------- **/



}
