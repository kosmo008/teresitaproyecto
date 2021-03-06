/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes;
import java.math.*;
/**
 *
 * @author kosmo
 */
public class Lec3 extends javax.swing.JFrame {

    /**
     * Creates new form Lec1
     */
    public Lec3() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(5);
        jTextArea1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Para desarrollar una web, lo primero que necesitamos es un Sistema Operativo, como es lógico, \ny su elección no es tan trivial. Hay que tener en cuenta las aplicaciones de las que dispone el \nSistema Operativo y sus costes.\n \nPor ejemplo, tenemos Microsoft Windows, cuyas aplicaciones son muy caras, como Photoshop, \nDreamweaver, Fireworks, ASP .NET… Y por otro lado tenemos GNU/Linux, con GIMP, Inkscape, \nAmaya, Aptana, PHP (aunque todos ellos también están disponibles en Windows). \n \nOtra característica a tener en cuenta es las facilidades que el Sistema Operativo aporta al\ndesarrollador, y en este sentido GNU/Linux se lleva de calle a Windows. \nY esto es porque Windows no fue diseñado para los desarrolladores, sino para personas que \nno tienen muchos conocimientos sobre informática.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Introduccion", jPanel1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Para elegir las herramientas a utilizar, antes debemos identificar las fases del proceso que \nforman el ciclo de vida de un desarrollo web.\n\nDiseño:\nEl diseño consiste en crear esbozos de la web final mediante una herramienta gráfica, como \nPhotoshop, GIMP o Inkscape.\n\nMaquetación HTML/CSS:\nLa maquetación consiste en convertir los esbozos creados en la fase anterior en plantillas HTML,\nsu respectiva hoja de estilos, y las imágenes usadas. Es posible saltarse la fase anterior para \ncomenzar directamente con esta fase, dependiendo de si dominamos herramientas como \nPhotoshop o no.\n\nProgramación cliente:\nLa programación cliente consiste básicamente en Javascript. Una web puede no tener necesidad \nde hacer programación cliente, como puede ser una pequeña web corporativa con poca \ninformación estática, o puede que requiera enormes esfuerzos en esta fase, como ocurre con los\nproyectos Web 2.0.\n\nProgramación servidor:\nEn esta fase, que se desarrolla junto con la anterior, crearemos la aplicación web en un lenguaje\nde servidor, como puede ser PHP, ASP .NET, Python, Perl, etc.\n\nDepuración:\nEsta fase enlaza la anterior con la siguiente, y es donde haremos las pruebas unitarias, \naserciones, trazas, etc.\n\nPruebas en local:\nEn nuestro servidor local haremos todas las pruebas posibles.\n\nSubir ficheros al hosting:\nUna vez nuestra web esté completada y bien testeada en nuestro servidor local (desarrollo), \nla subiremos al servidor del hosting elegido (producción). Dependiendo del hosting, \npodremos usar FTP, SFTP (SSH), WebDAV, o incluso Subversión.\n\nPruebas en hosting:\nRealizaremos las últimas pruebas en el servidor del hosting para comprobar que el cambio de \nservidor no ha afectado a nada. Para evitar problemas, nuestro servidor local debe tener \nexactamente la misma configuración que el servidor del hosting.\n");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fases de desarrollo web", jPanel2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Desarrollo en PHP\n\nA continuación se enumeran las herramientas básicas para el desarrollo de una web en PHP, \nen sus diferentes fases de diseño e implementación.\n\nFases: diseño y maquetación\n\n    ·        Adobe PhotoShop\n    ·        GIMP:\n    ·        Inkscape\n    ·        Adobe Fireworks\n    ·        Dreamweaver, Aptana, Amaya:\n    ·\n\n\nFases: maquetación, programación cliente\n\nFase: programación servidor\nCon él crearemos fácilmente la aplicación web en PHP. Aunque podremos usar igualmente \ncualquier editor. Una muy buena alternativa es Eclipse con el plugin PHP.\n\nOtra aplicación muy útil que está muy ligada a Zend Studio es Zend Platform, un módulo para \nApache que permite depurar una web directamente en el navegador,\nademás de otras funciones más complejas, como alertas configurables para que nos envíe un \nemail por cada error ocurrido en la web, o cuando un script sobrepase un tiempo determinado \nde ejecución, por ejemplo.\n\nFase: prueba local\n\n    ·        Apache\n    ·        Firefox / Firebug / Web Developer Extension\n\nFases: pruebas en local, depuración\n\nCon Firebug podremos depurar Javascript, editar HTML y CSS en la misma página para ver los\ncambios en tiempo real, consultar los tiempos de carga de la página en conjunto, de las imágenes,\njavascripts, hojas de estilo, etc, así como sus tamaños, etc. Y Web Developer nos ofrece \nherramientas muy útiles como ver las cookies de la web, ocultar imágenes, cambiar el tamaño del \nnavegador a resoluciones estándar, etc.\n\nSubir ficheros al servidor del hosting\nUna vez hayamos concluido todas las fases anteriores, y nuestro proyecto esté listo, deberemos \nsubirlo al servidor del hosting.\n\nLa herramienta a utilizar dependerá de las opciones que nos ofrezca el hosting, que \ndesgraciadamente en la mayoría de los casos es solamente el antiguo FTP (FileZilla). \nEn Dreamweaver y Zend Studio tenemos un cliente FTP y SFTP (SSH), y la tarea consistirá \nsimplemente en configurar el FTP y copiar y pegar los directorios que queramos subir.\n");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Herramientas", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Tecnologias para el desarrollo de las aplicaciones web");

        jButton1.setText("Realizar Evaluacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(678, 366));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      
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
            java.util.logging.Logger.getLogger(Lec3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lec3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lec3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lec3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lec3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
