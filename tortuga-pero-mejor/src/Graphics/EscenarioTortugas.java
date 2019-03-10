/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

/**
 *
 * @author Estudiante
 */
public class EscenarioTortugas extends TurtleFrame{
    TortugaPeroMejor tortuga1 = null;
    
    public EscenarioTortugas() {
      this.tortuga1 = new TortugaPeroMejor();
    }
    
    public void iniciar(){
       HiloBase hilo = new HiloBase(tortuga1);
       hilo.start();
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();
        
    }
}
