package parques;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static parques.TestBDA.url;

public class Comunidades extends javax.swing.JFrame {

    public Comunidades() {
        initComponents();
        conexionBD();
    }

    public boolean conexionBD() {
        boolean resultado = false;

        try {

            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                resultado = true;
                this.labelConexionEstablecida.setText("Conexión Establecida");

                ps = conn.prepareStatement("Select * from comunidad", ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);

                rs = ps.executeQuery();
                rs.next();

                obtenerDatos();

            }
        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }
        return resultado;
    }

    public void obtenerDatos() {
        try {
            id = rs.getInt("id");
            nombre = rs.getString("nombre");

            this.campoIDCiudad.setText(id.toString());
            this.campoNameComunidad.setText(nombre);

        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoIDCiudad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoNameComunidad = new javax.swing.JTextField();
        botonPrimero = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        botonAdelante = new javax.swing.JButton();
        botonUltimo = new javax.swing.JButton();
        labelConexionEstablecida = new javax.swing.JLabel();
        labelException = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ficha de Comunidades");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("id Ciudad");

        campoIDCiudad.setBackground(new java.awt.Color(153, 255, 153));
        campoIDCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre Comunidad");

        campoNameComunidad.setBackground(new java.awt.Color(153, 255, 153));
        campoNameComunidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        botonPrimero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonPrimero.setText("|<");
        botonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrimeroActionPerformed(evt);
            }
        });

        botonAtras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonAtras.setText("<<");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        botonAdelante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonAdelante.setText(">>");
        botonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdelanteActionPerformed(evt);
            }
        });

        botonUltimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonUltimo.setText(">|");
        botonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonAtras)
                .addGap(61, 61, 61)
                .addComponent(botonAdelante)
                .addGap(55, 55, 55)
                .addComponent(botonUltimo)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonPrimero)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(campoIDCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(campoNameComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelConexionEstablecida, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelException, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoIDCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(campoNameComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPrimero)
                    .addComponent(botonAtras)
                    .addComponent(botonAdelante)
                    .addComponent(botonUltimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(labelConexionEstablecida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelException, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrimeroActionPerformed
        try {
            rs.first();
            obtenerDatos();
        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }
    }//GEN-LAST:event_botonPrimeroActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        try {
            if (rs.isFirst() == false) {
                rs.previous();
            } else {
                rs.last();

            }
            obtenerDatos();
        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdelanteActionPerformed
        try {
            if (rs.isLast() == false) {
                rs.next();
            } else {
                rs.first();

            }
            obtenerDatos();
        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }
    }//GEN-LAST:event_botonAdelanteActionPerformed

    private void botonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUltimoActionPerformed
        try {
            rs.last();
            obtenerDatos();
        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }
    }//GEN-LAST:event_botonUltimoActionPerformed

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
            java.util.logging.Logger.getLogger(Comunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comunidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comunidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdelante;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonPrimero;
    private javax.swing.JButton botonUltimo;
    private javax.swing.JTextField campoIDCiudad;
    private javax.swing.JTextField campoNameComunidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelConexionEstablecida;
    private javax.swing.JLabel labelException;
    // End of variables declaration//GEN-END:variables
    static String bd = "parques";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/" + bd;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private Integer id;
    private String nombre;
}
