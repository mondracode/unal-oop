/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaFX;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author smondragon
 */
public class Vista1 {
    private GridPane pane;
    private Button boton_sig;
    private TextField campo_nombre;
    private TextField campo_apellido;
    private Scene scene;
    
    public Vista1() {
        this.pane = new GridPane();
        this.pane.setAlignment(Pos.CENTER);
        this.pane.setPadding(new Insets(11, 12, 13, 14));
        this.pane.setHgap(15);
        this.pane.setVgap(15);
        this.campo_nombre = new TextField();
        this.campo_apellido = new TextField();
        pane.add(new Label("Nombre:"),0,0);
        pane.add(campo_nombre,1,0);
        pane.add(new Label("Apellido:"),0,1);
        pane.add(campo_apellido,1,1);
        this.boton_sig = new Button("Siguiente");
        pane.add(boton_sig, 0, 2);
        
        scene = new Scene(pane, 300, 300);
    }
    
   public void show(Stage stage) {
      stage.setTitle("Vista 1");
      stage.setScene(scene);
      stage.show();
   }

    public GridPane getPane() {
        return pane;
    }

    public Button getBoton_sig() {
        return boton_sig;
    }

    public TextField getCampo_nombre() {
        return campo_nombre;
    }

    public TextField getCampo_apellido() {
        return campo_apellido;
    }

    public Scene getScene() {
        return scene;
    }
   
   
}
