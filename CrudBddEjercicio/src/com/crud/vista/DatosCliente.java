package com.crud.vista;

import com.crud.modelo.Cliente;
import com.crud.servicio.ClienteServ;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DatosCliente extends javax.swing.JInternalFrame {
    
    private DefaultTableModel dtm;
    List<Cliente> clientes = null;
    public static String codCedula = "";

    public DatosCliente() {
        initComponents();
        cmb_filtro.setSelectedItem("Todos");
        clientes = ClienteServ.ListarClientes();
        cargarTabla(clientes);
        cargarComboCedula(clientes);
    }

    public void cargarTabla(List<Cliente> clientes) {
        dtm = (DefaultTableModel) tbl_ConsultaDatos.getModel();
        for (Cliente c : clientes) {
            Vector fila = new Vector();
            fila.add(c.getCedula());
            fila.add(c.getNombre() + " " + c.getApellido());
            fila.add(c.getNacimiento());
            fila.add(c.getNumHijos());
            fila.add(c.getEstatura());
            dtm.addRow(fila);
        }
    }

    public void cargarComboCedula(List<Cliente> clientes) {
        for (Cliente c : clientes) {
            cmb_filtro.addItem(c.getCedula());
        }
    }

    public void cargaTablaBusqueda(String cedula) {
        Cliente cliente = new ClienteServ().BuscarClienteCedula(cedula);
        dtm = (DefaultTableModel) tbl_ConsultaDatos.getModel();
        Vector fila = new Vector();
        fila.add(cliente.getCedula());
        fila.add(cliente.getNombre() + "" + cliente.getApellido());
        fila.add(cliente.getNacimiento());
        fila.add(cliente.getNumHijos());
        fila.add(cliente.getEstatura());
        dtm.addRow(fila);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ConsultaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmb_filtro = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ConsultaDatos = new javax.swing.JTable();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        tbl_ConsultaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Fecha_Nac", "# Hijos", "Estatura"
            }
        ));
        jScrollPane1.setViewportView(tbl_ConsultaClientes);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Manejo de Datos");

        cmb_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos" }));

        jLabel2.setText("Cedula :");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tbl_ConsultaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Fecha_Nac", "# Hijos", "Estatura"
            }
        ));
        jScrollPane2.setViewportView(tbl_ConsultaDatos);

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_buscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar)
                        .addGap(62, 62, 62)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if (cmb_filtro.getSelectedItem() == "Todos") {
            clientes = ClienteServ.ListarClientes();
            cargarTabla(clientes);
        } else {
            String cedula = cmb_filtro.getSelectedItem().toString();
            cargaTablaBusqueda(cedula);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        int filaSeleccionada = tbl_ConsultaDatos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tbl_ConsultaDatos.getModel();
            codCedula = (String) modelo.getValueAt(filaSeleccionada, 0);

            ModificaCliente mc = new ModificaCliente();
            mc.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a modificar");
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int filaSeleccionada = tbl_ConsultaDatos.getSelectedRow();

        if (filaSeleccionada >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tbl_ConsultaDatos.getModel();
            codCedula = (String) modelo.getValueAt(filaSeleccionada, 0);
            ClienteServ.EliminarCliente(codCedula);
            JOptionPane.showMessageDialog(null, "Fila eliminada con exito !!");
            
            clientes = ClienteServ.ListarClientes();
            cargarTabla(clientes);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione la fila a modificar");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JComboBox cmb_filtro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_ConsultaClientes;
    public static javax.swing.JTable tbl_ConsultaDatos;
    // End of variables declaration//GEN-END:variables
}
