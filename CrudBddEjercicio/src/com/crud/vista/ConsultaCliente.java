/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.vista;

import com.crud.modelo.Cliente;
import com.crud.servicio.ClienteServ;
import static com.crud.vista.DatosCliente.tbl_ConsultaDatos;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Choppy
 */
public class ConsultaCliente extends javax.swing.JInternalFrame {

    private DefaultTableModel dtm;

    public ConsultaCliente() {
        initComponents();
        List<Cliente> clientes = ClienteServ.ListarClientes();
        dtm = (DefaultTableModel) tbl_ConsultaClientes.getModel();

        for (Cliente c : clientes) {
            Vector fila = new Vector();
            fila.add(c.getCedula());
            fila.add(c.getNombre() + "" + c.getApellido());
            fila.add(c.getNacimiento());
            fila.add(c.getNumHijos());
            fila.add(c.getEstatura());
            dtm.addRow(fila);
        }
    }

    public void limpiarDatos() {
        int num = tbl_ConsultaClientes.getRowCount();
        for (int i = 0; i < num; i++) {
            tbl_ConsultaClientes.remove(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Cedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ConsultaClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consulta Datos Cliente");

        jLabel2.setText("Cédula Estudiante:");

        txt_Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CedulaKeyPressed(evt);
            }
        });

        tbl_ConsultaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Fecha_Nac", "# Hijos", "Estatura"
            }
        ));
        jScrollPane1.setViewportView(tbl_ConsultaClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_CedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CedulaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Cliente cliente = new ClienteServ().BuscarClienteCedula(txt_Cedula.getText());
            dtm = (DefaultTableModel) tbl_ConsultaClientes.getModel();
            Vector fila = new Vector();
            fila.add(cliente.getCedula());
            fila.add(cliente.getNombre() + "" + cliente.getApellido());
            fila.add(cliente.getNacimiento());
            fila.add(cliente.getNumHijos());
            fila.add(cliente.getEstatura());
            dtm.addRow(fila);
            tbl_ConsultaClientes.setModel(dtm);
        }
    }//GEN-LAST:event_txt_CedulaKeyPressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ConsultaClientes;
    private javax.swing.JTextField txt_Cedula;
    // End of variables declaration//GEN-END:variables
}
