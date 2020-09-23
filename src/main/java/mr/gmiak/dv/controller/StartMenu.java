package mr.gmiak.dv.controller;

import javafx.animation.TranslateTransition;
import javafx.scene.SubScene;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class StartMenu {
    public SubScene subSceneMenu;
    private boolean isHidden;
    //constructor
    public StartMenu() {
        isHidden=true;
    }
    //on click exit
    public void onClickedExit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void onClickedPlay(MouseEvent mouseEvent) {
        moveSubscene();
    }

    public void onClickedOptions(MouseEvent mouseEvent) {
    }
    //mouve subscene
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
}
