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
    // - - -
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        // Set Program Title
        primaryStage.setTitle("MenuButton Trial");
        // ImageView
        FileInputStream input = new FileInputStream("C:/Users/Alonso/IdeaProjects/UserInterface/images/bao.PNG");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        // Drop Down Menu Items
        MenuItem menuItem1 = new MenuItem("Option 1");
        MenuItem menuItem2 = new MenuItem("Option 2");
        MenuItem menuItem3 = new MenuItem("Option 3");
        // Create MenuButton
        MenuButton menuButton = new MenuButton("Bao Button", imageView, menuItem1, menuItem2, menuItem3);
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
    private void userClickedItem1() { System.out.println("You click Option 1! Nice"); }
    // print in Console "Cool" when Option2 is clicked
    private void userClickedItem2() { System.out.println("You click Option 2! Cool"); }
    // print in Console "Sweet" when Option3 is clicked
    private void userClickedItem3() { System.out.println("You click Option 3! Sweet"); }
}