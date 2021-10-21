package com.example.endassignment;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.JMetroStyleClass;
import jfxtras.styles.jmetro.Style;


public class HelloApplication extends Application {
    private final User_Service userService = new User_Service();

    public static void main(String[] args)
    {
        launch();
    }
    @Override
    public void start(Stage stage)
    {
        //Setting up the diameters of the windows form
        stage.setHeight(200);
        stage.setWidth(350);
        stage.setTitle("Fabulous Cinema -- Login");

        //Creating a GridPane layout
        GridPane myGrid = new GridPane();
        Scene scene = new Scene(myGrid);
        myGrid.setPadding(new Insets(10,10,10,10));
        myGrid.setVgap(10);
        myGrid.setHgap(8);

        //Using JMetro for the colour to the login screen
        JMetro jMetro = new JMetro(Style.DARK);
        myGrid.getStyleClass().add(JMetroStyleClass.BACKGROUND);
        jMetro.setScene(scene);

        //username label and textfield
        Label usernameLabel = new Label("Username:");
        myGrid.add(usernameLabel,0,0);
        TextField userName = new TextField();
        userName.setPromptText("username");
        myGrid.add(userName,1,0);

        //password label and it's field
        Label passwordLabel = new Label("Password:");
        myGrid.add(passwordLabel,0,1);
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("enter password");
        myGrid.add(passwordField,1,1);

        //validation label that shows if the password satisfies all the criteria for a "strong" password
        Label validation = new Label();
        myGrid.add(validation,0,3);

        //login button
        Button loginButton = new Button("Log in");
        loginButton.setVisible(true);
        myGrid.add(loginButton,0,2);



        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!userName.getText().isEmpty() && !passwordField.getText().isEmpty()) {
                    User user = userService.validateUser(userName.getText(),passwordField.getText());
                    Purchase_Tickets purchase_tickets = new Purchase_Tickets(user);
                    stage.close();
                }
            }
        });

        stage.setScene(scene);
        stage.show();
    }


}