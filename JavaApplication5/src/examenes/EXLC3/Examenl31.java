/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.EXLC3;

import examenes.EXLC2.*;
import examenes.EXLC1.*;
import examenes.Lec1;
import examenes.pantalla_bienvenida;
import examenes.rampan;
import examenes.rampan1;
import javax.swing.JOptionPane;

/**
 *
 * @author kosmo
 */
public class Examenl31 extends javax.swing.JFrame {

    /**
     * Creates new form Examenl11
     */
    public Examenl31() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Respuesta1 = new javax.swing.ButtonGroup();
        Respuesta2 = new javax.swing.ButtonGroup();
        Respuesta3 = new javax.swing.ButtonGroup();
        Respuesta4 = new javax.swing.ButtonGroup();
        Respuesta5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        Correcto1 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        Correcto2 = new javax.swing.JRadioButton();
        Correcto3 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Correcto4 = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Correcto5 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Opción Multiple");

        jLabel2.setText("1.- Es proporcionada por un servidor Web y utilizada por usuarios que se Conectan desde");

        Respuesta1.add(jRadioButton1);
        jRadioButton1.setText("Navegador ");

        Respuesta1.add(jRadioButton2);
        jRadioButton2.setText("Internet");

        Respuesta1.add(jRadioButton3);
        jRadioButton3.setText("Correo Electronico");

        Respuesta1.add(Correcto1);
        Correcto1.setText("Aplicacion WEB");

        Respuesta2.add(jRadioButton5);
        jRadioButton5.setText("Aplicacion WEB");

        Respuesta2.add(jRadioButton6);
        jRadioButton6.setText("Cliente/Servidor");

        jLabel3.setText("requerimientos son hechos a través de una conexión de red, y para ello se usa el protocolo HTTP.");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Respuesta2.add(jRadioButton7);
        jRadioButton7.setText("Correo Electronico");

        Respuesta2.add(Correcto2);
        Correcto2.setText("Servidor WEB");

        Correcto3.setText("Navegadores");

        jRadioButton10.setText("Correos Electronicos");

        jLabel4.setText("3.- Estos piden páginas (almacenadas o creadas dinámicamente) con información a los ");

        jRadioButton11.setText("Servidores WEB");

        jRadioButton12.setText("Aplicaciones WEB");

        jRadioButton13.setText("Alamacenamiento de datos");

        jRadioButton14.setText("Internet");

        jLabel5.setText("4.- Caracteristica principal del modelo de 2 capas");

        Correcto4.setText("Cliente/Servidor");

        no.setText("Servidor WEB");

        jRadioButton17.setText("Modelo de 2 capas");

        jRadioButton18.setText("Servidor Web");

        jLabel6.setText("5.- Está diseñada para superar las limitaciones de las arquitecturas ajustadas al modelo de dos capas");

        Correcto5.setText("Modelos 3 Capas");

        jRadioButton20.setText("Cliente/servidor");

        jButton1.setText("Calificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("2.- Distribuye páginas de información formateada a los clientes que las solicitan. Los");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel8.setText("servidores Web ");

        jLabel11.setText(" cualquier punto vía clientes Web ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton20)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton17)
                        .addGap(18, 18, 18)
                        .addComponent(Correcto5)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton18))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addGap(18, 18, 18)
                                .addComponent(Correcto2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton6))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton11)
                                        .addGap(34, 34, 34)
                                        .addComponent(jRadioButton12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Correcto3))
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Correcto1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Correcto4)
                                        .addGap(18, 18, 18)
                                        .addComponent(no)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton14))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton1)))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(Correcto1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(Correcto2)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton10)
                    .addComponent(Correcto3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correcto4)
                    .addComponent(no)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton17)
                    .addComponent(Correcto5)
                    .addComponent(jRadioButton18))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(542, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public  Lec1 objg= new Lec1();
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int NCORRECTAS=0;
        
        
         if (Correcto1.isSelected()) {
            NCORRECTAS=NCORRECTAS+2;
        }
         if(Correcto2.isSelected()){
            NCORRECTAS=NCORRECTAS+2;
        }
        if(Correcto3.isSelected()){
         NCORRECTAS=NCORRECTAS+2;
        }
        if(Correcto4.isSelected()){
            NCORRECTAS=NCORRECTAS+2;
        }
        if(Correcto5.isSelected()){
          NCORRECTAS=NCORRECTAS+2;
        }
        
        if (NCORRECTAS<7) {
            JOptionPane.showMessageDialog(this, "Has reprobado, vuelve intentarlo \nTu calificacion es de: "+(NCORRECTAS));
            rampan1 g=new rampan1();
            g.prueba();
            rampan.intentos =rampan.intentos+1;
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Has Aprobado, \nTu calificacion es de: "+(NCORRECTAS));
             pantalla_bienvenida obj = new pantalla_bienvenida();
       obj.show();
        }
        
        
        System.out.println(""+NCORRECTAS);
        this.show(false);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Examenl31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examenl31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examenl31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examenl31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examenl31().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Correcto1;
    private javax.swing.JRadioButton Correcto2;
    private javax.swing.JRadioButton Correcto3;
    private javax.swing.JRadioButton Correcto4;
    private javax.swing.JRadioButton Correcto5;
    private javax.swing.ButtonGroup Respuesta1;
    private javax.swing.ButtonGroup Respuesta2;
    private javax.swing.ButtonGroup Respuesta3;
    private javax.swing.ButtonGroup Respuesta4;
    private javax.swing.ButtonGroup Respuesta5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton no;
    // End of variables declaration//GEN-END:variables
}
