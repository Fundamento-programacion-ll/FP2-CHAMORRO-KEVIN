package com.mepe.vista;

import com.mepe.modelo.Medicina;
import com.mepe.servicio.MedicinaServ;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DatosMedicina extends javax.swing.JInternalFrame {
private DefaultTableModel dtm;
    List<Medicina> medicinas = null;
    public static String codigo ="";

    public DatosMedicina() {
        initComponents();
        cmb_filtro.setSelectedItem("Todos");
        medicinas = MedicinaServ.ListarMedicinas();
        cargarTabla(medicinas);
        cargarComboCod(medicinas);
    }

    public void cargarTabla(List<Medicina> medicina) {
        dtm = (DefaultTableModel) tbl_ConsultaMedicinas.getModel();
        for (Medicina m : medicinas) {
            Vector fila = new Vector();
            fila.add(m.getCodigo());
            fila.add(m.getNombre_med());
            fila.add(m.getDosis());
            fila.add(m.getFecha_ven());
            fila.add(m.getMedico_trat());
            dtm.addRow(fila);
        }
    }

    public void cargarComboCod(List<Medicina> medicina) {
        for (Medicina m : medicinas) {
            cmb_filtro.addItem(m.getCodigo());
        }
    }

    public void cargaTablaBusqueda(String cod) {
        Medicina m= new MedicinaServ().BuscarMedicinaCod(cod);
        dtm = (DefaultTableModel) tbl_ConsultaMedicinas.getModel();
        Vector fila = new Vector();
        fila.add(m.getCodigo());
        fila.add(m.getNombre_med());
        fila.add(m.getDosis());
        fila.add(m.getFecha_ven());
        fila.add(m.getMedico_trat());
        dtm.addRow(fila);
    }
    //Metodo para borrar datos de la tabla 
    public void limpiarTabla(){ 
        try{
            DefaultTableModel dtm = (DefaultTableModel) tbl_ConsultaMedicinas.getModel();
            int a = tbl_ConsultaMedicinas.getRowCount()-1;
            for (int i = a; i >= 0; i--) {           
                dtm.removeRow(dtm.getRowCount()-1);
            } 
        }catch(Exception ex){
            System.out.println("Error al limpiar tabla");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmb_filtro = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ConsultaMedicinas = new javax.swing.JTable();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Manejo de Datos Medicina");

        cmb_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos" }));

        jLabel2.setText("Còdigo :");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        tbl_ConsultaMedicinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre_Med", "Dosis", "Fecha _Ven", "Medico_trat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_ConsultaMedicinas);

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)))
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btn_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btn_buscar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int filaSeleccionada = tbl_ConsultaMedicinas.getSelectedRow();
        if (filaSeleccionada >= 0 && JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar datos?", "Confirmacion de ingreso",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0){
            DefaultTableModel modelo = (DefaultTableModel) tbl_ConsultaMedicinas.getModel();
            codigo = (String) modelo.getValueAt(filaSeleccionada,0);
            MedicinaServ.EliminarPersona(codigo);
            JOptionPane.showMessageDialog(null, "Fila eliminada con exito !!");
            limpiarTabla();
            medicinas = MedicinaServ.ListarMedicinas();
            cargarTabla(medicinas);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a modificar");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        limpiarTabla();
        if (cmb_filtro.getSelectedItem() == "Todos") {
            medicinas = MedicinaServ.ListarMedicinas();
            cargarTabla(medicinas);
        } else {
            String identi = cmb_filtro.getSelectedItem().toString();
            cargaTablaBusqueda(identi); 
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int filaSeleccionada = tbl_ConsultaMedicinas.getSelectedRow();
        if (filaSeleccionada >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tbl_ConsultaMedicinas.getModel();
            codigo = (String) modelo.getValueAt(filaSeleccionada, 0);
            System.out.println(codigo);
            ModificaMedicina mm= new ModificaMedicina();
            mm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a modificar");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox cmb_filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ConsultaMedicinas;
    // End of variables declaration//GEN-END:variables
}
