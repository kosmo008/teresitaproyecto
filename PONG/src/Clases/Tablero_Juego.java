
package Clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author kosmo
 */
public class Tablero_Juego extends JPanel {
  
    
    public Tablero_Juego(){
        setBackground(Color.black);
    }
    
    Pelota pelota =new Pelota(0, 0);
    Raqueta p1 = new Raqueta(10, 200);
    Raqueta p2 = new Raqueta(794-10- Raqueta.ancho, 200);
    
    public void paintComponent(Graphics g){
    
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        //dibujar pelota
        g2.setColor(Color.white);
        //g2.fill(new Rectangle2D.Double(0, 0, 20, 20));
        dibujar(g2);
        actualizar();
 
    }
    
    
    public void dibujar(Graphics2D g){
        g.fill(pelota.getPelota());
        g.fill(p1.getRaqueta() );
        g.fill(p2.getRaqueta() );
        
        
    }
    public void actualizar(){
        pelota.mover(getBounds());
        
        
    }
    
    public void itererjuego(){
    
    while(true){
    repaint();
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tablero_Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    
}
