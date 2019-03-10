/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import ch.aplu.turtle.*;


/**
 *
 * @author Santiago Mondragón G
 */
public class TortugaPeroMejor extends Turtle{
    
    public void hacerRectangulo(int x, int y){
        
        for(int i=0; i<4; i++){
            this.forward(y);
            this.right(90);
        }
        
    }
    public void hacerCirculo(double r){
        for(int i=0; i<20; i++){
            this.right(18);
            this.forward(r);
        }
        
    }
    
    public void hacerTriangulo(){
        //todavía no lo hago funcionar
    }
}
