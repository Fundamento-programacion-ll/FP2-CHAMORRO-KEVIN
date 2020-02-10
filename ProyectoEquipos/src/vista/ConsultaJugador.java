package vista;

import controlador.ControladorJugador;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Jugador;

public class ConsultaJugador extends javax.swing.JInternalFrame {
    
    private DefaultTableModel dtm;
    List<Jugador> listaJugador= null;
    public static int idJugador =1;
    /*ControladorEquipo ce= new ControladorEquipo();
    Equipo eq= new Equipo();*/
    ControladorJugador cj= new ControladorJugador();
    Jugador ju= new Jugador();
    public ConsultaJugador() {
        initComponents();
        ///////////////////////////////////
        //setIconImage(new ImageIcon(getClass().getResource("/img/fondo1.jpg")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/img/fondo1.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        //////////////////////////////////////
        try { 
            cargarTabla(cj.ObtenerDatosJugador());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaJugador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBusqueda = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ConsultaDatos = new javax.swing.JTable();
        btn_cerrar1 = new javax.swing.JButton();
        rdbIdEquipo = new javax.swing.JRadioButton();
        rdbNombre = new javax.swing.JRadioButton();
        rdbGoles = new javax.swing.JRadioButton();
        rdbId = new javax.swing.JRadioButton();
        btn_Consulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        rdbTodo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_ConsultaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDJugador", "IDEquipo", "Nombre", "NumeroCamiseta", "NombreCamiseta", "FechaIngreso", "NumeroGoles"
            }
        ));
        jScrollPane2.setViewportView(tbl_ConsultaDatos);

        btn_cerrar1.setText("Cerrar");
        btn_cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar1ActionPerformed(evt);
            }
        });

        btgBusqueda.add(rdbIdEquipo);
        rdbIdEquipo.setText("Buscara por ID Equipo");

        btgBusqueda.add(rdbNombre);
        rdbNombre.setText("Buscar por Nombre");
        rdbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNombreActionPerformed(evt);
            }
        });

        btgBusqueda.add(rdbGoles);
        rdbGoles.setText("Buscar por Numero de goles");

        btgBusqueda.add(rdbId);
        rdbId.setText("Buscar por ID");

        btn_Consulta.setText("Consultar");
        btn_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consulta Datos Jugador");

        jLabel2.setText("Ingrese informacion");

        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyPressed(evt);
            }
        });

        btgBusqueda.add(rdbTodo);
        rdbTodo.setText("Todo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_Consulta)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rdbTodo)
                        .addGap(18, 18, 18)
                        .addComponent(rdbId)
                        .addGap(4, 4, 4)
                        .addComponent(rdbIdEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbNombre)
                        .addGap(18, 18, 18)
                        .addComponent(rdbGoles)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbNombre)
                    .addComponent(rdbGoles)
                    .addComponent(rdbId)
                    .addComponent(rdbIdEquipo)
                    .addComponent(rdbTodo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Consulta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cerrar1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void limpiarTabla(){ 
        try{
            DefaultTableModel dtm = (DefaultTableModel) tbl_ConsultaDatos.getModel();
            int a = tbl_ConsultaDatos.getRowCount()-1;
            for (int i = a; i >= 0; i--) {           
                dtm.removeRow(dtm.getRowCount()-1);
            } 
        }catch(Exception ex){
            System.out.println("Error al limpiar tabla");
        }
    }
    public void cargarTabla(List<Jugador> jugadores) {
        dtm = (DefaultTableModel) tbl_ConsultaDatos.getModel();
        for (Jugador jugador : jugadores) {
            Vector fila = new Vector();
            fila.add(jugador.getIdJugador());
            fila.add(jugador.getIdEquipo());
            fila.add(jugador.getNombreJugador());
            fila.add(jugador.getNombreCamiseta());
            fila.add(jugador.getNumeroCamiseta());
            fila.add(jugador.getFechaIngreso());
            fila.add(jugador.getGoles());
            dtm.addRow(fila);
        }
    }
    public void cargaTablaBusqueda() {
        limpiarTabla();
        dtm = (DefaultTableModel) tbl_ConsultaDatos.getModel();
        Vector fila = new Vector();
        if (rdbId.isSelected()) {
            cj.BuscarJugadorId(Integer.parseInt(txt_busqueda.getText()));    
        }
        if (rdbIdEquipo.isSelected()) {
            cj.BuscarJugadorIdEquipo(Integer.parseInt(txt_busqueda.getText()));
        }
        if (rdbNombre.isSelected()) {
            cj.BuscarJugadorNombre(txt_busqueda.getText());
        }
        if (rdbGoles.isSelected()) {
            cj.BuscarJugadorGoles(Integer.parseInt(txt_busqueda.getText()));
        }
        fila.add(ju.getIdJugador());
        fila.add(ju.getIdEquipo());
        fila.add(ju.getNombreJugador());
        fila.add(ju.getNombreCamiseta());
        fila.add(ju.getNumeroCamiseta());
        fila.add(ju.getFechaIngreso());
        fila.add(ju.getGoles());    
        dtm.addRow(fila);
        tbl_ConsultaDatos.setModel(dtm);
        if(rdbTodo.isSelected()){
            try {
                cargarTabla(cj.ObtenerDatosJugador());
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void btn_cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrar1ActionPerformed

    private void btn_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultaActionPerformed
        cargaTablaBusqueda();
    }//GEN-LAST:event_btn_ConsultaActionPerformed

    private void txt_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            cargaTablaBusqueda();
        }
    }//GEN-LAST:event_txt_busquedaKeyPressed

    private void rdbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNombreActionPerformed

    }//GEN-LAST:event_rdbNombreActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBusqueda;
    private javax.swing.JButton btn_Consulta;
    private javax.swing.JButton btn_cerrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbGoles;
    private javax.swing.JRadioButton rdbId;
    private javax.swing.JRadioButton rdbIdEquipo;
    private javax.swing.JRadioButton rdbNombre;
    private javax.swing.JRadioButton rdbTodo;
    public static javax.swing.JTable tbl_ConsultaDatos;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
