package parques;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MantenimientoParques extends javax.swing.JFrame {

    public MantenimientoParques() {
        initComponents();
        conexionBD();
        cargarBox();
    }

    public boolean conexionBD() {
        boolean resultado = false;

        try {
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                resultado = true;
                this.labelConexion.setText("Conexión Establecida");
            }
        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }
        return resultado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        campoName = new javax.swing.JTextField();
        campoExtension = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonNew = new javax.swing.JButton();
        botonDelete = new javax.swing.JButton();
        botonEdit = new javax.swing.JButton();
        labelConexion = new javax.swing.JLabel();
        labelException = new javax.swing.JLabel();
        botonCargaDatos = new javax.swing.JButton();
        comboBoxComunidad = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiento de Parques");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Id Parque");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre Parque");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Extensión");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Código de Comunidad");

        campoID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        campoName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        campoExtension.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Km2");

        botonNew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonNew.setText("New");
        botonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNewActionPerformed(evt);
            }
        });

        botonDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonDelete.setText("Delete");
        botonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeleteActionPerformed(evt);
            }
        });

        botonEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonEdit.setText("Edit");
        botonEdit.setEnabled(false);
        botonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditActionPerformed(evt);
            }
        });

        labelConexion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        botonCargaDatos.setText("Cargar Datos");
        botonCargaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargaDatosActionPerformed(evt);
            }
        });

        comboBoxComunidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoName, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(campoCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(campoExtension, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel5))
                                    .addComponent(comboBoxComunidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(123, 123, 123))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                                .addComponent(botonCargaDatos)
                                .addGap(30, 30, 30))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelException, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelConexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonNew)
                        .addGap(71, 71, 71)
                        .addComponent(botonDelete)
                        .addGap(61, 61, 61)
                        .addComponent(botonEdit)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargaDatos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoExtension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNew)
                    .addComponent(botonDelete)
                    .addComponent(botonEdit))
                .addGap(38, 38, 38)
                .addComponent(labelConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(labelException, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNewActionPerformed
        try {
            String sql = "Insert into parque(nombre,extension,idcomunidad)"
                    + "values(?,?,?)";

            PreparedStatement pi = conn.prepareStatement(sql);
            pi.setString(1, this.campoName.getText());
            pi.setDouble(2, Double.parseDouble(this.campoExtension.getText()));
            pi.setInt(3, Integer.parseInt(this.campoCodigo.getText()));
            int numFilas = pi.executeUpdate();

            String id = "select id from parque where nombre= ?";
            PreparedStatement pid = conn.prepareStatement(id);
            pid.setString(1, this.campoName.getText());

            ResultSet numID = pid.executeQuery();
            numID.next();
            int numeroid = numID.getInt("id");
            if (numFilas == 1) {
                JOptionPane.showMessageDialog(this, "Insertado correctamente.\nSe han insertado " + numFilas + " El id del parque és: " + numeroid, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Fallo al insertar.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }
    }//GEN-LAST:event_botonNewActionPerformed

    private void botonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditActionPerformed
        try {
            if (this.campoName.getText().isEmpty() == false && this.campoCodigo.getText().isEmpty() == false && this.campoExtension.getText().isEmpty() == false) {
                String consulta = "UPDATE PARQUE SET nombre = ?,extension = ?, idcomunidad= ? WHERE id = ? ";

                PreparedStatement pu = conn.prepareStatement(consulta);
                pu.setString(1, this.campoName.getText());
                pu.setDouble(2, Double.parseDouble(this.campoExtension.getText()));
                pu.setInt(3, Integer.parseInt(this.campoCodigo.getText()));
                pu.setInt(4, Integer.parseInt(this.campoID.getText()));

                int numFilasUpdate = pu.executeUpdate();
                JOptionPane.showMessageDialog(this, "Actualizado correctamente. \n Se han actualizado" + numFilasUpdate, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacíos", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }
    }//GEN-LAST:event_botonEditActionPerformed

    private void botonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeleteActionPerformed
        try {
            int numFilasDelete;
            if (this.campoName.getText().isEmpty() == false && this.campoID.getText().isEmpty() == true) {
                String consultaBorrado = "DELETE FROM PARQUE WHERE nombre = ? ";
                PreparedStatement pd = conn.prepareStatement(consultaBorrado);
                pd.setString(1, this.campoName.getText());
                numFilasDelete = pd.executeUpdate();
            } else {
                String consultaBorrado = "DELETE FROM PARQUE WHERE id = ? ";
                PreparedStatement pd = conn.prepareStatement(consultaBorrado);
                pd.setInt(1, Integer.parseInt(this.campoID.getText()));
                numFilasDelete = pd.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Borrado correctamente. \n Se han borrado" + numFilasDelete, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }

    }//GEN-LAST:event_botonDeleteActionPerformed

    private void botonCargaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargaDatosActionPerformed
        try {
            if (this.campoID.getText().isEmpty() == false) {
                String datos = " Select * from parque where id= ?";
                PreparedStatement ps = conn.prepareStatement(datos);
                ps.setInt(1, Integer.parseInt(this.campoID.getText()));
                ResultSet rs = ps.executeQuery();
                rs.next();

                String nombreP = rs.getString("nombre");
                Double numext = rs.getDouble("extension");
                String idcomunidad = rs.getString("idcomunidad");

                this.campoName.setText(rs.getString("nombre"));
                this.campoExtension.setText(numext.toString());
                this.campoCodigo.setText(rs.getString("idcomunidad"));

                this.botonEdit.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "EL campo ID no puede estar vacío", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }

    }//GEN-LAST:event_botonCargaDatosActionPerformed

    public void cargarBox() {
        try {
            String sentencia = "Select * from comunidad";

            PreparedStatement ps = conn.prepareStatement(sentencia);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                this.comboBoxComunidad.addItem(nombre);
            }

        } catch (SQLException ex) {
            this.labelException.setText("Error: " + ex.getMessage() + " " + ex.getErrorCode());
        }

    }

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
            java.util.logging.Logger.getLogger(MantenimientoParques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoParques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoParques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoParques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoParques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargaDatos;
    private javax.swing.JButton botonDelete;
    private javax.swing.JButton botonEdit;
    private javax.swing.JButton botonNew;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoExtension;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoName;
    private javax.swing.JComboBox comboBoxComunidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelConexion;
    private javax.swing.JLabel labelException;
    // End of variables declaration//GEN-END:variables
    static String bd = "parques";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/" + bd;
    private Connection conn;
    private PreparedStatement pi;
    private PreparedStatement pu;
    private PreparedStatement pd;
    private ResultSet rs;

}
