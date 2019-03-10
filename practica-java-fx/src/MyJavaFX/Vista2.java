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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author smondragon
 */
public class Vista2 {
    private GridPane pane;
    private TextArea campo_texto;
    private Button boton;
    private Scene scene;
    
    public Vista2() {
        this.pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(15);
        pane.setVgap(15);
        this.campo_texto = new TextArea();
        this.boton = new Button("Regresar");
        this.campo_texto.setMaxWidth(Double.MAX_VALUE);
        this.campo_texto.setMaxHeight(Double.MAX_VALUE);
        this.boton.setAlignment(Pos.CENTER);
        pane.add(this.campo_texto, 0, 0);
        pane.add(this.boton, 0, 1);
        
        scene = new Scene(pane, 300,300);
    }

   public void show(Stage stage) {
      stage.setTitle("Vista 2");
      stage.setScene(scene);
      stage.show();
   }

    public GridPane getPane() {
        return pane;
    }

    public TextArea getCampo_texto() {
        return campo_texto;
    }

    public Button getBotonBack() {
        return boton;
    }

    public Scene getScene() {
        return scene;
    }
    
    
}
