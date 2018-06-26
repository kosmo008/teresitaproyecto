/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes;

import examenes.EXLC2.Examenl21;
import examenes.EXLC2.Examenl22;
import examenes.EXLC2.Examenl23;
import examenes.EXLC2.Examenl24;
import examenes.EXLC2.Examenl25;
import java.util.Random;

/**
 *
 * @author kosmo
 */
public class rampan1 {
    
    
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
                Examenl21 obj1 = new Examenl21();
                obj1.show();
                
                break;
                
            case 2:
                Examenl22 obj2 =new Examenl22();
                obj2.show();
               
                break;
    
            case 3:
                Examenl23 obj3= new Examenl23();
                obj3.show();
                
                break;
                
            case 4:
                Examenl24 obj4= new Examenl24();
                obj4.show();
               
                break;
                
            case 5:
                Examenl25 obj5 = new Examenl25();
                obj5.show();
                
                break;
            default:
                break;
        
        }  
        
        
}
}
