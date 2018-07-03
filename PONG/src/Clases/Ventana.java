/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JFrame;

/**
 *
 * @author kosmo
 */
public class Ventana extends JFrame{
     private Tablero_Juego lamina;
     private Hilo hilo;
    private final int ancho=800 ,alto=500;
    public Ventana(){
        setTitle("PONG en RED");
        setSize(ancho,alto);
        setLocationRelativeTo(null);//se ubica la pantalla a la mitad
        setResizable(false);
        lamina=new Tablero_Juego();
        add(lamina);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hilo = new Hilo(lamina);
        hilo.start();
        
               }

}
