package com.crud.vista;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //para vizualizar en toda la pantalla
        jCliente.setEnabled(false); //inhabilita las opciones del cliente
        jAdmin.setEnabled(false);//inhabilita las opciones del cliente
    }

    //genero los set y get SOLO de las opciones del menu

    public JMenu getjAdmin() {
        return jAdmin;
    }

    public void setjAdmin(JMenu jAdmin) {
        this.jAdmin = jAdmin;
    }

    public JMenu getjCliente() {
        return jCliente;
    }

    public void setjCliente(JMenu jCliente) {
        this.jCliente = jCliente;
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jSistema = new javax.swing.JMenu();
        jLogin = new javax.swing.JMenuItem();
        jLogout = new javax.swing.JMenuItem();
        jCliente = new javax.swing.JMenu();
        jConsulta = new javax.swing.JMenuItem();
        jAdmin = new javax.swing.JMenu();
        jDatos = new javax.swing.JMenuItem();
        jIngreso = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPanel.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jSistema.setText("Sistema");

        jLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jLogin.setText("Login");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });
        jSistema.add(jLogin);

        jLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jLogout.setText("Logout");
        jLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutActionPerformed(evt);
            }
        });
        jSistema.add(jLogout);

        jMenuBar1.add(jSistema);

        jCliente.setText("Cliente");

        jConsulta.setText("Consulta");
        jConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaActionPerformed(evt);
            }
        });
        jCliente.add(jConsulta);

        jMenuBar1.add(jCliente);

        jAdmin.setText("Admin");

        jDatos.setText("Datos");
        jDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatosActionPerformed(evt);
            }
        });
        jAdmin.add(jDatos);

        jIngreso.setText("Ingreso Datos");
        jIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngresoActionPerformed(evt);
            }
        });
        jAdmin.add(jIngreso);

        jMenuBar1.add(jAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaActionPerformed
        ConsultaCliente consulta = new ConsultaCliente();
        showJInternalFrameCenterPosition(consulta);
    }//GEN-LAST:event_jConsultaActionPerformed

    private void jLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutActionPerformed
        System.exit(NORMAL);
    }//GEN-LAST:event_jLogoutActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        Loguin login = new Loguin( this );
        showJInternalFrameCenterPosition(login);
    }//GEN-LAST:event_jLoginActionPerformed

    private void jDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatosActionPerformed
       DatosCliente datos = new DatosCliente();
       showJInternalFrameCenterPosition(datos);
    }//GEN-LAST:event_jDatosActionPerformed

    private void jIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngresoActionPerformed
        IngresoCliente ingreso = new IngresoCliente();
        showJInternalFrameCenterPosition(ingreso);
    }//GEN-LAST:event_jIngresoActionPerformed

    private void showJInternalFrameCenterPosition(JInternalFrame jInternalFrame) {
        jDesktopPanel.add(jInternalFrame);
        Dimension componentDim = jInternalFrame.getSize();
        Dimension desktopDim = jDesktopPanel.getSize();
        int width = (int) (desktopDim.getWidth() - componentDim.getWidth()) / 2;
        int heigth = (int) (desktopDim.getHeight() - componentDim.getHeight()) / 2;
        Dimension positionDim = new Dimension(width, heigth);
        jInternalFrame.setBounds((int) positionDim.getWidth(), (int) positionDim.getHeight(), jInternalFrame.getWidth(), jInternalFrame.getHeight());
        jInternalFrame.setVisible(true);
    }
    
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
                if ("Windows Vista".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jAdmin;
    private javax.swing.JMenu jCliente;
    private javax.swing.JMenuItem jConsulta;
    private javax.swing.JMenuItem jDatos;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JMenuItem jIngreso;
    private javax.swing.JMenuItem jLogin;
    private javax.swing.JMenuItem jLogout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jSistema;
    // End of variables declaration//GEN-END:variables
}
