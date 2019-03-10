/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaFX;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author smondragon
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) 
            throws Exception {
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        Modelo modelo = new Modelo();
        
        ControladorVista1 controlador1 = new ControladorVista1(modelo);
        ControladorVista2 controlador2 = new ControladorVista2(modelo);
       
        controlador1.mostrarVista();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * @param args the command line arguments
     */
    
}
