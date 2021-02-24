package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PracticeMenuButton extends Application {
    // Fields
    ImageView ImgView;
    Image img1;
    Image img2;
    Image img3;
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        // Set Program Title
        primaryStage.setTitle("MenuButton Trial");
        // ImageView
        FileInputStream input1 = new FileInputStream("C:/Users/Alonso/IdeaProjects/UserInterface/images/bao.PNG");
        FileInputStream input2 = new FileInputStream("C:/Users/Alonso/IdeaProjects/UserInterface/images/flag.jfif");
        FileInputStream input3 = new FileInputStream("C:/Users/Alonso/IdeaProjects/UserInterface/images/bell.jpg");
        img1 = new Image(input1);
        img2 = new Image(input2);
        img3 = new Image(input3);
        ImgView = new ImageView(img1);
        // Drop Down Menu Items
        MenuItem menuItem1 = new MenuItem("Bao");
        MenuItem menuItem2 = new MenuItem("Flag");
        MenuItem menuItem3 = new MenuItem("Bell");
        // Create MenuButton
        MenuButton menuButton = new MenuButton("Bao Button", ImgView, menuItem1, menuItem2, menuItem3);
        menuItem1.setOnAction(actionEvent -> { userClickedItem1(); });
        menuItem2.setOnAction(actionEvent -> { userClickedItem2(); });
        menuItem3.setOnAction(actionEvent -> { userClickedItem3(); });
        // Creates HBox and Display MenuButton
        HBox hbox = new HBox(menuButton);
        // Display Scene
        Scene scene = new Scene(hbox, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // Launch Application
    public static void main(String[] args) {
        Application.launch(args);
    }
    // print in Console "Nice" when Option1 is clicked
    private void userClickedItem1() {
        System.out.println("You click Option 1! Nice");
        ImgView.setImage(img1);
    }
    // print in Console "Cool" when Option2 is clicked
    private void userClickedItem2() {
        System.out.println("You click Option 2! Cool");
        ImgView.setImage(img2);
    }
    // print in Console "Sweet" when Option3 is clicked
    private void userClickedItem3() {
        System.out.println("You click Option 3! Sweet");
        ImgView.setImage(img3);
    }
}