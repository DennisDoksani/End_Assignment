package com.example.endassignment;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.JMetroStyleClass;
import jfxtras.styles.jmetro.Style;

public class Purchase_Tickets {
    Stage window;

    public Purchase_Tickets(com.example.endassignment.User user)
    {
        window = new Stage();

        //Set Window properties
        window.setHeight(800);
        window.setWidth(1024);
        window.setTitle("Fantastic Cinema -- -- purchase tickets -- username: dennis");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        VBox layout = new VBox();
        layout.setPadding((new Insets(10)));

        TableView<User> tableView = new TableView<>();

        MenuBar menubar = new MenuBar();
        Menu adminMenu = new Menu("Admin");
        //Admin's options
        MenuItem menuManageShowing = new MenuItem("Manage showings");
        MenuItem menuManageMovies = new MenuItem("Manage movies");
        adminMenu.getItems().addAll(menuManageMovies,menuManageShowing);

        Menu helpMenu = new Menu("Help");

        //Helps button option
        MenuItem menuAbout = new MenuItem("About");
        helpMenu.getItems().add(menuAbout);

        Menu logoutMenu = new Menu("Logout");
        menubar.getMenus().addAll(adminMenu,helpMenu,logoutMenu);

        HBox form = new HBox();
        form.setPadding(new Insets(10));
        form.setSpacing(10);


        layout.getChildren().add(form);
        layout.getChildren().add(tableView);

        Scene scene = new Scene(menubar);
        window.setScene(scene);

        JMetro jMetro = new JMetro(Style.DARK);
        menubar.getStyleClass().add(JMetroStyleClass.BACKGROUND);
        jMetro.setScene(scene);


        //Set scene
        window.setScene(scene);

        //Showing the window
        window.show();
    }
}
