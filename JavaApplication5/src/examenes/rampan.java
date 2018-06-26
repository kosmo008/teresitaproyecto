/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes;

import examenes.EXLC1.Examenl11;
import examenes.EXLC1.Examenl12;
import examenes.EXLC1.Examenl13;
import examenes.EXLC1.Examenl14;
import examenes.EXLC1.Examenl15;
import java.util.Random;

/**
 *
 * @author kosmo
 */
public class rampan {
    
    
        public int generarRandom(){
    
        Random aleatorio = new Random();
        int intAletorio = aleatorio.nextInt(5);
            System.out.println("aleatorio: "+intAletorio);
    return intAletorio;
    }
    
    public static int intentos=0;
    
        public void prueba(){
       int a;
      a=generarRandom();
        if (a==0) {
            a=a+1;
        }
        System.out.println(""+a);
        
        switch(a){
        
            case 1:
                Examenl11 obj1 = new Examenl11();
                obj1.show();
                
                break;
                
            case 2:
                Examenl12 obj2 =new Examenl12();
                obj2.show();
               
                break;
    
            case 3:
                Examenl13 obj3= new Examenl13();
                obj3.show();
                
                break;
                
            case 4:
                Examenl14 obj4= new Examenl14();
                obj4.show();
               
                break;
                
            case 5:
                Examenl15 obj5 = new Examenl15();
                obj5.show();
                
                break;
            default:
                break;
        
        }  
        
        
}
}
