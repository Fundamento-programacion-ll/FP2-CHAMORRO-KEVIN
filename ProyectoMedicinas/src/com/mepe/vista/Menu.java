package com.mepe.vista;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //para vizualizar en toda la pantalla
        men_ModEli.setEnabled(false);
        men_consultas.setEnabled(false); //inhabilita las opciones del cliente
        men_Ingre.setEnabled(false);//inhabilita las opciones del cliente
        men_Reporte.setEnabled(false);
    }

    //genero los set y get SOLO de las opciones del menu

    public JMenu getMen_Reporte() {
        return men_Reporte;
    }

    public void setMen_Reporte(JMenu men_Reporte) {
        this.men_Reporte = men_Reporte;
    }
    

    public JMenuItem getjLogin() {
        return jLogin;
    }

    public void setjLogin(JMenuItem jLogin) {
        this.jLogin = jLogin;
    }

    public JMenu getMen_Ingre() {
        return men_Ingre;
    }

    public void setMen_Ingre(JMenu men_Ingre) {
        this.men_Ingre = men_Ingre;
    }

    public JMenu getMen_ModEli() {
        return men_ModEli;
    }

    public void setMen_ModEli(JMenu men_ModEli) {
        this.men_ModEli = men_ModEli;
    }

    public JMenu getMen_consultas() {
        return men_consultas;
    }

    public void setMen_consultas(JMenu men_consultas) {
        this.men_consultas = men_consultas;
    }

    public JMenuItem getjConsultaM() {
        return jConsultaM;
    }

    public void setjConsultaM(JMenuItem jConsultaM) {
        this.jConsultaM = jConsultaM;
    }

    public JMenuItem getjConsultaU() {
        return jConsultaU;
    }

    public void setjConsultaU(JMenuItem jConsultaU) {
        this.jConsultaU = jConsultaU;
    }

   
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        men_sistema = new javax.swing.JMenu();
        jLogin = new javax.swing.JMenuItem();
        jLogout = new javax.swing.JMenuItem();
        men_consultas = new javax.swing.JMenu();
        jConsultaP = new javax.swing.JMenuItem();
        jConsultaM = new javax.swing.JMenuItem();
        jConsultaU = new javax.swing.JMenuItem();
        men_Ingre = new javax.swing.JMenu();
        jIngreP = new javax.swing.JMenuItem();
        jIngreM = new javax.swing.JMenuItem();
        jIngreU = new javax.swing.JMenuItem();
        men_ModEli = new javax.swing.JMenu();
        jDatosP = new javax.swing.JMenuItem();
        jDatosM = new javax.swing.JMenuItem();
        jDatosU = new javax.swing.JMenuItem();
        men_Reporte = new javax.swing.JMenu();
        jReporte = new javax.swing.JMenuItem();

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

        men_consultas.setText("Consultas");

        jConsultaP.setText("Consulta Personas");
        jConsultaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaPActionPerformed(evt);
            }
        });
        men_consultas.add(jConsultaP);

        jConsultaM.setText("Consulta Medicinas");
        jConsultaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaMActionPerformed(evt);
            }
        });
        men_consultas.add(jConsultaM);

        jConsultaU.setText("Consulta Usuarios del sisitema");
        jConsultaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaUActionPerformed(evt);
            }
        });
        men_consultas.add(jConsultaU);

        jMenuBar1.add(men_consultas);

        men_Ingre.setText("Ingresos");

        jIngreP.setText("Ingreso Persona");
        jIngreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngrePActionPerformed(evt);
            }
        });
        men_Ingre.add(jIngreP);

        jIngreM.setText("Ingreso Medicina");
        jIngreM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngreMActionPerformed(evt);
            }
        });
        men_Ingre.add(jIngreM);

        jIngreU.setText("Ingreso usuarios para el sistema");
        jIngreU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngreUActionPerformed(evt);
            }
        });
        men_Ingre.add(jIngreU);

        jMenuBar1.add(men_Ingre);

        men_ModEli.setText("Modificar/Eliminar");

        jDatosP.setText("Personas");
        jDatosP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatosPActionPerformed(evt);
            }
        });
        men_ModEli.add(jDatosP);

        jDatosM.setText("Medicinas");
        jDatosM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatosMActionPerformed(evt);
            }
        });
        men_ModEli.add(jDatosM);

        jDatosU.setText("Usuarios del sistema");
        jDatosU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatosUActionPerformed(evt);
            }
        });
        men_ModEli.add(jDatosU);

        jMenuBar1.add(men_ModEli);

        men_Reporte.setText("Reporte");

        jReporte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jReporte.setText("Imprimir reporte");
        jReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReporteActionPerformed(evt);
            }
        });
        men_Reporte.add(jReporte);

        jMenuBar1.add(men_Reporte);

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

    private void jConsultaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaPActionPerformed
        ConsultaPersona cp= new ConsultaPersona();
        showJInternalFrameCenterPosition(cp);
    }//GEN-LAST:event_jConsultaPActionPerformed

    private void jLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutActionPerformed
        men_ModEli.setEnabled(false);
        men_consultas.setEnabled(false); //inhabilita las opciones del cliente
        men_Ingre.setEnabled(false);//inhabilita las opciones del cliente
        jLogin.setEnabled(true);// volver a loguear
        men_Reporte.setEnabled(false);
    }//GEN-LAST:event_jLogoutActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        Loguin login = new Loguin( this );
        showJInternalFrameCenterPosition(login);
    }//GEN-LAST:event_jLoginActionPerformed

    private void jIngrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngrePActionPerformed
       IngresoPersona ip= new IngresoPersona();
        showJInternalFrameCenterPosition(ip);
    }//GEN-LAST:event_jIngrePActionPerformed

    private void jIngreMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngreMActionPerformed
        IngresoMedicina im = new IngresoMedicina();
        showJInternalFrameCenterPosition(im);
    }//GEN-LAST:event_jIngreMActionPerformed

    private void jConsultaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaMActionPerformed
        ConsultaMedicina cm= new ConsultaMedicina();
        showJInternalFrameCenterPosition(cm);
    }//GEN-LAST:event_jConsultaMActionPerformed

    private void jConsultaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaUActionPerformed
        ConsultaUsuario cu=new ConsultaUsuario();
        showJInternalFrameCenterPosition(cu);
    }//GEN-LAST:event_jConsultaUActionPerformed

    private void jIngreUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngreUActionPerformed
        IngresoUsuario iu= new IngresoUsuario();
        showJInternalFrameCenterPosition(iu);
    }//GEN-LAST:event_jIngreUActionPerformed

    private void jDatosPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatosPActionPerformed
        DatosPersonas dp= new DatosPersonas();
        showJInternalFrameCenterPosition(dp);
    }//GEN-LAST:event_jDatosPActionPerformed

    private void jDatosMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatosMActionPerformed
        DatosMedicina dm= new DatosMedicina();
        showJInternalFrameCenterPosition(dm);
    }//GEN-LAST:event_jDatosMActionPerformed

    private void jDatosUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatosUActionPerformed
        DatosUsuarios du= new DatosUsuarios();
        showJInternalFrameCenterPosition(du);
    }//GEN-LAST:event_jDatosUActionPerformed

    private void jReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReporteActionPerformed
        ReporteVista rv= new ReporteVista();
        showJInternalFrameCenterPosition(rv);
    }//GEN-LAST:event_jReporteActionPerformed

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
    private javax.swing.JMenuItem jConsultaM;
    private javax.swing.JMenuItem jConsultaP;
    private javax.swing.JMenuItem jConsultaU;
    private javax.swing.JMenuItem jDatosM;
    private javax.swing.JMenuItem jDatosP;
    private javax.swing.JMenuItem jDatosU;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JMenuItem jIngreM;
    private javax.swing.JMenuItem jIngreP;
    private javax.swing.JMenuItem jIngreU;
    private javax.swing.JMenuItem jLogin;
    private javax.swing.JMenuItem jLogout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jReporte;
    private javax.swing.JMenu men_Ingre;
    private javax.swing.JMenu men_ModEli;
    private javax.swing.JMenu men_Reporte;
    private javax.swing.JMenu men_consultas;
    private javax.swing.JMenu men_sistema;
    // End of variables declaration//GEN-END:variables
}
