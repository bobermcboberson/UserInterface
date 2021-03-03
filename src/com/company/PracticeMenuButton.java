package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PracticeMenuButton extends Application {
    // Fields
    ImageView ImgView1;
    ImageView ImgView2;
    Image img1;
    Image img2;
    Image img3;
    Image img4;
    Image img5;
    ToggleButton toggleImage;
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        // Set Program Title
        primaryStage.setTitle("MenuButton Trial");
        // ImageView
        FileInputStream input1 = new FileInputStream("C:/Users/Alonso/IdeaProjects/UserInterface/images/bao.PNG");
        FileInputStream input2 = new FileInputStream("C:/Users/Alonso/IdeaProjects/UserInterface/images/flag.jfif");
        FileInputStream input3 = new FileInputStream("C:/Users/Alonso/IdeaProjects/UserInterface/images/bell.jpg");
        FileInputStream input4 = new FileInputStream("C:/Users/Alonso/IdeaProjects/UserInterface/images/cat.jfif");
        FileInputStream input5 = new FileInputStream("C:/Users/Alonso/IdeaProjects/UserInterface/images/dog.jfif");
        img1 = new Image(input1);
        img2 = new Image(input2);
        img3 = new Image(input3);
        img4 = new Image(input4);
        img5 = new Image(input5);
        ImgView1 = new ImageView(img1);
        ImgView1.setFitHeight(200);
        ImgView1.setFitWidth(200);
        ImgView2 = new ImageView(img5);
        ImgView2.setFitHeight(200);
        ImgView2.setFitWidth(200);
        // Drop Down Menu Items
        MenuItem menuItem1 = new MenuItem("Bao");
        MenuItem menuItem2 = new MenuItem("Flag");
        MenuItem menuItem3 = new MenuItem("Bell");
        // Create MenuButton
        MenuButton menuButton = new MenuButton("Bao Button", ImgView1, menuItem1, menuItem2, menuItem3);
        menuItem1.setOnAction(actionEvent -> { userClickedItem1(); });
        menuItem2.setOnAction(actionEvent -> { userClickedItem2(); });
        menuItem3.setOnAction(actionEvent -> { userClickedItem3(); });
        // Create ToggleButton
        toggleImage = new ToggleButton("Switch Cat/Dog");
        toggleImage.setOnAction(actionEvent -> { userClickedItem4(); });
        // Create ToggleGroup
        final  ToggleGroup group = new ToggleGroup();
        group.getToggles().addAll(toggleImage);
        // Creates HBox and Display MenuButton+ToggleButton
        HBox hbox = new HBox(menuButton, toggleImage, ImgView2);
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
        ImgView1.setImage(img1);
        ImgView1.setFitHeight(200);
        ImgView1.setFitWidth(200);
    }
    // print in Console "Cool" when Option2 is clicked
    private void userClickedItem2() {
        System.out.println("You click Option 2! Cool");
        ImgView1.setImage(img2);
        ImgView1.setFitHeight(200);
        ImgView1.setFitWidth(200);
    }
    // print in Console "Sweet" when Option3 is clicked
    private void userClickedItem3() {
        System.out.println("You click Option 3! Sweet");
        ImgView1.setImage(img3);
        ImgView1.setFitHeight(200);
        ImgView1.setFitWidth(200);
    }
    // print in Console "CAT v. DOG" and changes image of Cat/Dog when toggled
    private void userClickedItem4() {
        System.out.println("You toggled Option 4! CAT v. DOG");
        boolean isSelected = toggleImage.isSelected();
        // IF BUTTON IS TOGGLED, DISPLAY CAT
        // IF BUTTON IS NOT TOGGLED, DISPLAY DOG
        if (isSelected) {
            ImgView2.setImage(img4);
            ImgView2.setFitHeight(200);
            ImgView2.setFitWidth(200);
        } else {
            ImgView2.setImage(img5);
            ImgView2.setFitHeight(200);
            ImgView2.setFitWidth(200);
        }
    }
}