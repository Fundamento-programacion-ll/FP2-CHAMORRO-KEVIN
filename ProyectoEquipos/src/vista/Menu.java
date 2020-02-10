package vista;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //para vizualizar en toda la pantalla
        men_consultas.setEnabled(false); //inhabilita las opciones del cliente
        men_Ingre.setEnabled(false);//inhabilita las opciones del cliente
    }

    public JMenuItem getjConsultaE() {
        return jConsultaE;
    }

    public void setjConsultaE(JMenuItem jConsultaE) {
        this.jConsultaE = jConsultaE;
    }

    public JMenuItem getjConsultaJ() {
        return jConsultaJ;
    }

    public void setjConsultaJ(JMenuItem jConsultaJ) {
        this.jConsultaJ = jConsultaJ;
    }

    public JMenuItem getjConsultaU() {
        return jConsultaU;
    }

    public void setjConsultaU(JMenuItem jConsultaU) {
        this.jConsultaU = jConsultaU;
    }

    public JMenuItem getjIngreE() {
        return jIngreE;
    }

    public void setjIngreE(JMenuItem jIngreE) {
        this.jIngreE = jIngreE;
    }

    public JMenuItem getjIngreJ() {
        return jIngreJ;
    }

    public void setjIngreJ(JMenuItem jIngreJ) {
        this.jIngreJ = jIngreJ;
    }

    public JMenuItem getjIngreU() {
        return jIngreU;
    }

    public void setjIngreU(JMenuItem jIngreU) {
        this.jIngreU = jIngreU;
    }

    public JMenuItem getjLogin() {
        return jLogin;
    }

    public void setjLogin(JMenuItem jLogin) {
        this.jLogin = jLogin;
    }

    public JMenuItem getjLogout() {
        return jLogout;
    }

    public void setjLogout(JMenuItem jLogout) {
        this.jLogout = jLogout;
    }


    public JMenu getMen_Ingre() {
        return men_Ingre;
    }

    public void setMen_Ingre(JMenu men_Ingre) {
        this.men_Ingre = men_Ingre;
    }

    public JMenu getMen_consultas() {
        return men_consultas;
    }

    public void setMen_consultas(JMenu men_consultas) {
        this.men_consultas = men_consultas;
    }

    public JMenu getMen_sistema() {
        return men_sistema;
    }

    public void setMen_sistema(JMenu men_sistema) {
        this.men_sistema = men_sistema;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        men_sistema = new javax.swing.JMenu();
        jLogin = new javax.swing.JMenuItem();
        jLogout = new javax.swing.JMenuItem();
        men_Ingre = new javax.swing.JMenu();
        jIngreJ = new javax.swing.JMenuItem();
        jIngreE = new javax.swing.JMenuItem();
        jIngreU = new javax.swing.JMenuItem();
        men_consultas = new javax.swing.JMenu();
        jConsultaJ = new javax.swing.JMenuItem();
        jConsultaE = new javax.swing.JMenuItem();
        jConsultaU = new javax.swing.JMenuItem();

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
            .addGap(0, 281, Short.MAX_VALUE)
        );

        men_sistema.setText("Sistema");

        jLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jLogin.setText("Login");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });
        men_sistema.add(jLogin);

        jLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jLogout.setText("Logout");
        jLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutActionPerformed(evt);
            }
        });
        men_sistema.add(jLogout);

        jMenuBar1.add(men_sistema);

        men_Ingre.setText("Ingresos");

        jIngreJ.setText("Jugador");
        jIngreJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngreJActionPerformed(evt);
            }
        });
        men_Ingre.add(jIngreJ);

        jIngreE.setText("Equipo");
        jIngreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngreEActionPerformed(evt);
            }
        });
        men_Ingre.add(jIngreE);

        jIngreU.setText("Usuario para el sistema");
        jIngreU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngreUActionPerformed(evt);
            }
        });
        men_Ingre.add(jIngreU);

        jMenuBar1.add(men_Ingre);

        men_consultas.setText("Consultas/Manejo Datos");

        jConsultaJ.setText("Jugador");
        jConsultaJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaJActionPerformed(evt);
            }
        });
        men_consultas.add(jConsultaJ);

        jConsultaE.setText("Equipo");
        jConsultaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaEActionPerformed(evt);
            }
        });
        men_consultas.add(jConsultaE);

        jConsultaU.setText("Usuarios del sisitema");
        jConsultaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaUActionPerformed(evt);
            }
        });
        men_consultas.add(jConsultaU);

        jMenuBar1.add(men_consultas);

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
    
    private void jLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutActionPerformed
        if( JOptionPane.showConfirmDialog(this, "¿Seguro que desea guardar datos?", "Confirmacion de ingreso",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0){
            men_consultas.setEnabled(false); //inhabilita las opciones del cliente
            men_Ingre.setEnabled(false);//inhabilita las opciones del cliente
            jLogin.setEnabled(true);// volver a loguear
        }
    }//GEN-LAST:event_jLogoutActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        Loguin login = new Loguin( this );
        showJInternalFrameCenterPosition(login);
    }//GEN-LAST:event_jLoginActionPerformed

    private void jIngreJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngreJActionPerformed
        IngresoJugador jugador = new IngresoJugador();
        showJInternalFrameCenterPosition(jugador);
    }//GEN-LAST:event_jIngreJActionPerformed

    private void jIngreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngreEActionPerformed
        IngresoEquipo equipo = new IngresoEquipo();
        showJInternalFrameCenterPosition(equipo);
    }//GEN-LAST:event_jIngreEActionPerformed

    private void jConsultaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaEActionPerformed
        ConsultaEquipo ce = new ConsultaEquipo();
        showJInternalFrameCenterPosition(ce);
    }//GEN-LAST:event_jConsultaEActionPerformed

    private void jConsultaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaUActionPerformed
        
    }//GEN-LAST:event_jConsultaUActionPerformed

    private void jIngreUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngreUActionPerformed
        IngresoUsuario usuario = new IngresoUsuario();
        showJInternalFrameCenterPosition(usuario);
    }//GEN-LAST:event_jIngreUActionPerformed

    private void jConsultaJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaJActionPerformed
        ConsultaJugador cj = new ConsultaJugador();
        showJInternalFrameCenterPosition(cj);
    }//GEN-LAST:event_jConsultaJActionPerformed

   
    
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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jConsultaE;
    private javax.swing.JMenuItem jConsultaJ;
    private javax.swing.JMenuItem jConsultaU;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JMenuItem jIngreE;
    private javax.swing.JMenuItem jIngreJ;
    private javax.swing.JMenuItem jIngreU;
    private javax.swing.JMenuItem jLogin;
    private javax.swing.JMenuItem jLogout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu men_Ingre;
    private javax.swing.JMenu men_consultas;
    private javax.swing.JMenu men_sistema;
    // End of variables declaration//GEN-END:variables

}
