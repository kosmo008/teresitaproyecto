/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.EXLC3;

import examenes.EXLC2.*;
import examenes.EXLC1.*;
import examenes.pantalla_bienvenida;
import examenes.rampan;
import examenes.rampan1;
import javax.swing.JOptionPane;

/**
 *
 * @author kosmo
 */
public class Examenl32 extends javax.swing.JFrame {

    /**
     * Creates new form Examenl12
     */
    public Examenl32() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        D = new javax.swing.JTextField();
        E = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        C = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Relaciona las columnas");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("A)Distribuye páginas de información formateada a los clientes \nque las solicitan. Los requerimientos son hechos a través de \nuna conexión de red, y para ello se usa el protocolo HTTP. \nUna vez que se solicita esta petición mediante el protocolo \nHTTP y la recibe el servidor Web, éste localiza la página Web \nen su sistema de archivos y la envía de vuelta al navegador\nque la solicitó.");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("B)... es proporcionada por un servidor Web y utilizada por \nusuarios que se Conectan desde cualquier punto vía clientes\nWeb (browsers o navegadores). La arquitectura de un Sitio \nWeb tiene tres componentes principales:\n•\t  Un servidor Web\n•\t  Una conexión de red\n•\t  Uno o más clientes\n");
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("C) piden páginas (almacenadas o creadas dinámicamente) con \ninformación a los servidores Web. En algunos ambientes de \ndesarrollo de aplicaciones Web, las páginas contienen código\nHTML y scripts dinámicos, que son ejecutados por el servidor\nantes de entregar la página.\n");
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("D) \n1.  Lógica de negocio.\n     Parte más importante de la aplicación.\n     Define los procesos que involucran a la aplicación.\n     Conjunto de operaciones requeridas para proveer el \n     servicio.\n\n2.  Administración de los datos.\n     Manipulación de BD y archivos.\n\n3.  Interfaz\n      Los usuarios acceden a través de navegadores, móviles, PDAs, etc.\n      Funcionalidad accesible a través del navegador.\n      Limitada y dirigida por la aplicación.\n");
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("E)Está diseñada para superar las limitaciones de las \narquitecturas ajustadas al modelo de dos capas, introduce \nuna capa intermedia (la capa de proceso) Entre presentación\ny los datos, los procesos pueden ser manejados de forma \nseparada a la interfaz de usuario y a los datos, esta capa \nintermedia centraliza la lógica de negocio, haciendo la \nadministración más sencilla, los datos se pueden integrar \nde múltiples fuentes, las aplicaciones web actuales se \najustan a este modelo.");
        jScrollPane5.setViewportView(jTextArea5);

        jButton1.setText("Calificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        D.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        E.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        A.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        C.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel2.setText("Modelos 3 capas");

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel3.setText("Componentes de la Aplicacion WEB");

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel4.setText("Servidor Web");

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel5.setText("Navegador WEB");

        jLabel6.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel6.setText("Aplicaicon WEB");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addComponent(jButton1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(948, 691));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String a="",b="",c="",d="",e="";
        a=A.getText().toLowerCase();
        b=B.getText().toLowerCase();
        c=C.getText().toLowerCase();
        d=D.getText().toLowerCase();
        e=E.getText().toLowerCase();
      
        int buenas=0;
        
        if (a.equals("a")) {
            buenas=buenas+2;
        }
        if (b.equals("b")) {
            buenas=buenas+2;
        }
        if (c.equals("c")) {
            buenas=buenas+2;
        }
        if (d.equals("d")) {
            buenas=buenas+2;
        }
        if (e.equals("e")) {
            buenas=buenas+2;
        }
        
        System.out.println(""+ buenas);
        
          if (buenas<7 && rampan.intentos<3) {
            JOptionPane.showMessageDialog(this, "Has reprobado, vuelve intentarlo \nTu calificacion es de: "+(buenas));
            rampan1 gr=new rampan1();
            gr.prueba();
            rampan.intentos =rampan.intentos+1;
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Has Aprobado, \nTu calificacion es de: "+(buenas));
        
        }
        
        
        this.show(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public rampan gr=new rampan();
    
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
            java.util.logging.Logger.getLogger(Examenl32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examenl32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examenl32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examenl32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Examenl32().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JTextField C;
    private javax.swing.JTextField D;
    private javax.swing.JTextField E;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}
