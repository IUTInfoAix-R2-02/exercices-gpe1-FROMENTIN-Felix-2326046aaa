package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {


    @Override
    public void start(Stage primaryStage) {
        /*
        BorderPane b = new BorderPane();
        Button myButton1 = new Button("a");
        Button myButton2 = new Button("b");
        Button myButton3 = new Button("c");

        VBox V = new VBox(myButton1,myButton2,myButton3);
        b.setLeft(V);
        Scene myScene = new Scene (b, 300,300);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("EN SILENCE");
        primaryStage.show();
         */
        /*
        BorderPane root = new BorderPane();
        root.setLeft(new Button("Left"));
        root.setRight(new Button("Right"));
        root.setTop(new Button("Top"));
        root.setBottom(new Button("Bottom"));
        root.setCenter(new Button("Center"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("EN SILENCE");
        primaryStage.show();
         */
        //Menu
        MenuBar menu = new MenuBar();
        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Options");
        Menu menu3 = new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);
        MenuItem menu11 = new MenuItem("New");
        MenuItem menu12 = new MenuItem("Open");
        MenuItem menu13 = new MenuItem("Save");
        MenuItem menu14 = new MenuItem("Close");

        MenuItem menu21 = new MenuItem("Cut");
        MenuItem menu22 = new MenuItem("Copy");
        MenuItem menu23 = new MenuItem("Paste");

        menu1.getItems().add(menu11);
        menu1.getItems().add(menu12);
        menu1.getItems().add(menu13);
        menu1.getItems().add(menu14);

        menu2.getItems().add(menu21);
        menu2.getItems().add(menu22);
        menu2.getItems().add(menu23);

        //Gridpane
        GridPane gridpane = new GridPane();
        gridpane.add(new Label("Name :  "), 0, 1);
        gridpane.add(new Label("Email :  "), 0, 2);
        gridpane.add(new Label("Password :  "), 0, 3);
        gridpane.add(new TextField(""), 1, 1);
        gridpane.add(new TextField(""), 1, 2);
        gridpane.add(new TextField(""), 1, 3);
        Button submitBtn = new Button("Submit");
        Button confirmBtn  = new Button("Cancel");
        gridpane.add(new HBox(5, submitBtn, confirmBtn), 1, 4);

        gridpane.setHgap(10);
        gridpane.setVgap(10);


        BorderPane borderPane = new BorderPane();

        //Texte
        Label text1 = new Label("Boutons :");
        Label text2 = new Label("Ceci est un label de bas de page");
        //Boutons
        Button button1 = new Button("bouton1");
        Button button2 = new Button("bouton2");
        Button button3 = new Button("bouton3");


        //separators
        Separator separatorLeft = new Separator(Orientation.VERTICAL);
        Separator separatorBottom = new Separator(Orientation.HORIZONTAL);
        //Vbox et Hbox
        VBox vboxLeft = new VBox(5);
        HBox hboxLeft = new HBox(5, vboxLeft,separatorLeft);
        VBox vboxBottom = new VBox(separatorBottom,text2);
        vboxLeft.getChildren().addAll(text1,button1,button2,button3);


        menu.isUseSystemMenuBar();
        borderPane.setLeft(hboxLeft);
        borderPane.setTop(menuBar);
        borderPane.setBottom(vboxBottom);
        borderPane.setCenter(gridpane);

        vboxBottom.setAlignment(Pos.CENTER);
        vboxLeft.setAlignment(Pos.CENTER_LEFT);
        gridpane.setAlignment(Pos.CENTER);

        Scene myScene = new Scene (borderPane, 600,350);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

    }
}
