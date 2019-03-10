/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaFX;

import javafx.stage.Stage;

/**
 *
 * @author smondragon
 */
public class Singleton {
    private Stage stage;
    private static Singleton singleton = null;

    public static Singleton getSingleton() {
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    public Stage getStage() {
        return stage;
    }

    public static void setSingleton(Singleton singleton) {
        Singleton.singleton = singleton;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
    
}
