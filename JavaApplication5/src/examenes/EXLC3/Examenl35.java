/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.EXLC3;

import examenes.EXLC2.*;
import examenes.EXLC1.*;
import examenes.rampan;
import examenes.rampan1;
import javax.swing.JOptionPane;

/**
 *
 * @author kosmo
 */
public class Examenl35 extends javax.swing.JFrame {

    /**
     * Creates new form Examenl11
     */
    public Examenl35() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rb3 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rb4 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Falso o Verdadero");

        jLabel2.setText("1.-Una aplicación Web es proporcionada por un servidor Web y utilizada por usuarios que se Conectan desde cualquier punto ");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Falso");

        buttonGroup1.add(rb1);
        rb1.setText("Verdadero");

        buttonGroup2.add(rb2);
        rb2.setText("Falso");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Verdadero");

        jLabel3.setText("2.-El servidor Web distribuye páginas de información formateada a los clientes que las solicitan.");

        buttonGroup3.add(rb3);
        rb3.setText("Falso");

        buttonGroup3.add(jRadioButton6);
        jRadioButton6.setText("Verdadero");

        jLabel4.setText("3.-Los browsers piden páginas (almacenadas o creadas dinámicamente) con información a los equipos personales ");

        buttonGroup4.add(rb4);
        rb4.setText("Falso");

        buttonGroup4.add(jRadioButton8);
        jRadioButton8.setText("Verdadero");

        jLabel5.setText("4.-Las caracteristicas del modelo de capa 2 son: ");

        buttonGroup5.add(jRadioButton9);
        jRadioButton9.setText("Falso");

        buttonGroup5.add(rb5);
        rb5.setText("Verdadero");

        jLabel6.setText("5.-Las aplicaciones web se modelan mediante lo que se conoce como modelo de capas, estas capas son:");

        jButton1.setText("Calificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("•\t  Almacena los datos •\t  Recupera datos •\t  Mantiene los datos •\t  segura la integridad de los datos ");

        jLabel9.setText("* Modelo de dos capas: La información atraviesa dos capas entre la interfaz y la administración de los datos.");

        jLabel10.setText("*Modelo de n-capas: La información atraviesa varias capas, el más habitual es el modelo de tres capas.");

        jLabel12.setText("vía clientes Web (browsers o navegadores)");

        jLabel13.setText(" Los requerimientos son hechos a través de una conexión de local ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(rb1))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton6))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rb4)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton9)
                                .addGap(18, 18, 18)
                                .addComponent(rb5))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(rb1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb2)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb3)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb4)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(rb5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(679, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int aciertos=0;
        if (rb1.isSelected()) {
            aciertos = aciertos+1;
        }
        if (rb2.isSelected()) {
            aciertos = aciertos+1;
        }
        if (rb3.isSelected()) {
            aciertos = aciertos+1;
        }
        if (rb4.isSelected()) {
            aciertos = aciertos+1;
        }
        if (rb5.isSelected()) {
            aciertos = aciertos+1;
        }
        System.out.println(""+ aciertos);
        
          if (aciertos<7 && rampan.intentos<3) {
            JOptionPane.showMessageDialog(this, "Has reprobado, vuelve intentarlo \nTu calificacion es de: "+(aciertos*2));
            rampan1 gr=new rampan1();
            gr.prueba();
            rampan.intentos =rampan.intentos+1;
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Has Aprobado, \nTu calificacion es de: "+(aciertos*2));
        
        }
        
        
        this.show(false);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
public rampan grac=new rampan();
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
            java.util.logging.Logger.getLogger(Examenl35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examenl35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examenl35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examenl35.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Examenl35().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    // End of variables declaration//GEN-END:variables
}
