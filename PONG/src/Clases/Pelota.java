/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author kosmo
 */
public class Pelota {
    private int x;
    private int y;
    private  int dx=1;
    private  int dy=1;
    private final int ancho=15,alto=15;
    
    
    
    public Pelota (int x, int y){
    this.x=x;
    this.y=y;
    }
    
    
    
    public Rectangle2D getPelota(){
        return new Rectangle2D.Double(x,y,ancho,alto);

}
    
    public void mover(Rectangle limite){
    x=x+dx;
    y=y+dy;
        if (x>limite.getMaxX()) {
         dx=-dx;   
        }
        if (y>limite.getMaxY()) {
         dy=-dy;   
        }
        if (x<0) {
            dx=-dx;
        }
        if (y<0) {
            dy=-dy;
        }
        
        
        
        
        
    }
    
}
