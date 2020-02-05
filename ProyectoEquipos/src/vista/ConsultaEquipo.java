package vista;

import controlador.ControladorEquipo;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Equipo;

public class ConsultaEquipo extends javax.swing.JFrame {
    
    private DefaultTableModel dtm;
    List<Equipo> listaEquipo= null;
    public static int idEquipo =1;
    ControladorEquipo ce= new ControladorEquipo();
    Equipo eq= new Equipo();
    public ConsultaEquipo() {
        initComponents();
        ///////////////////////////////
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("Ingreso Jugador");
        //setIconImage(new ImageIcon(getClass().getResource("/img/fondo1.jpg")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/img/fondo1.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        ///////////////////////////////
        cmb_filtro.setSelectedItem("Todos");
        try {
            listaEquipo=ce.obtenerDatos();
            for (Equipo equipo : listaEquipo) {
                cmb_filtro.addItem(String.valueOf(equipo.getIdEquipo()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaEquipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargarTabla(listaEquipo);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ConsultaDatos = new javax.swing.JTable();
        btn_cerrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmb_filtro = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_ConsultaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDEquipo", "NombreEquipo", "Liga", "NumeroInternacionales", "FechaCreacion", "CampeonActual"
            }
        ));
        jScrollPane2.setViewportView(tbl_ConsultaDatos);

        btn_cerrar1.setText("Cerrar");
        btn_cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("          Informacion De Equipos");

        cmb_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos" }));

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Id del Equipo: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cerrar1)
                .addContainerGap(19, Short.MAX_VALUE))
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
    public void cargarTabla(List<Equipo> equipos) {
        dtm = (DefaultTableModel) tbl_ConsultaDatos.getModel();
        for (Equipo equipo : equipos) {
            Vector fila = new Vector();
            fila.add(equipo.getIdEquipo());
            fila.add(equipo.getNombreEquipo());
            fila.add(equipo.getLiga());
            fila.add(equipo.getNumeroInter());
            fila.add(equipo.getFechaCreacion());
            fila.add(equipo.isCampeonActual());
            dtm.addRow(fila);
        }
    }
    public void cargaTablaBusqueda(int id) {
        ce.BuscarEquipoId(id);
        dtm = (DefaultTableModel) tbl_ConsultaDatos.getModel();
        Vector fila = new Vector();
        fila.add(eq.getIdEquipo());
        fila.add(eq.getNombreEquipo());
        fila.add(eq.getLiga());
        fila.add(eq.getNumeroInter());
        fila.add(eq.getFechaCreacion());
        fila.add(eq.isCampeonActual());
        dtm.addRow(fila);
    }
    private void btn_cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrar1ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        limpiarTabla();
        if (cmb_filtro.getSelectedItem() == "Todos") {
            try {
                listaEquipo = ce.obtenerDatos();
                cargarTabla(listaEquipo);
            } catch (SQLException ex) {
                Logger.getLogger(ConsultaEquipo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            cargaTablaBusqueda(cmb_filtro.getSelectedIndex());
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar1;
    private javax.swing.JComboBox cmb_filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tbl_ConsultaDatos;
    // End of variables declaration//GEN-END:variables
}
