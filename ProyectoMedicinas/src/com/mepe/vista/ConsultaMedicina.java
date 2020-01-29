package com.mepe.vista;

import com.mepe.modelo.Medicina;
import com.mepe.servicio.MedicinaServ;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ConsultaMedicina extends javax.swing.JInternalFrame {
    //variable para modelo de la tabla
    private DefaultTableModel dtm;

    public ConsultaMedicina() {
        initComponents();
        // SELECCIONAR IN RDB
        rdb_codigo.setSelected(true);
        cargarTabla();
       
    }
     public void cargarTabla(){
       //listar datos de medicinas
        List<Medicina> medicinas = MedicinaServ.ListarMedicinas();
        //recoge el modelo de la tabla 
        dtm = (DefaultTableModel) tbl_ConsultaMedicinas.getModel();
        //ingresa informacion en la tabla 
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
    private void Busqueda(){
        limpiarTabla();
            dtm = (DefaultTableModel) tbl_ConsultaMedicinas.getModel();
            Vector fila = new Vector();
            //busqueda por id
            if(rdb_codigo.isSelected()){
                Medicina m = new MedicinaServ().BuscarMedicinaCod(txt_busqueda.getText());
                tbl_ConsultaMedicinas.setModel(dtm);
                fila.add(m.getCodigo());
                fila.add(m.getNombre_med());
                fila.add(m.getDosis());
                fila.add(m.getFecha_ven());
                fila.add(m.getMedico_trat());
            }
            //busqueda por nombre
            if(rdb_nombre.isSelected()){
                Medicina m = new MedicinaServ().BuscarMedicinaNombre(txt_busqueda.getText());
                fila.add(m.getCodigo());
                fila.add(m.getNombre_med());
                fila.add(m.getDosis());
                fila.add(m.getFecha_ven());
                fila.add(m.getMedico_trat());
            }
            //busqueda por apellido
            if(rdb_venci.isSelected()){
                Medicina m = new MedicinaServ().BuscarMedicinaCod(txt_busqueda.getText());
                fila.add(m.getCodigo());
                fila.add(m.getNombre_med());
                fila.add(m.getDosis());
                fila.add(m.getFecha_ven());
                fila.add(m.getMedico_trat());
            }
            //busqueda por tratamiento
            if(rdb_trat.isSelected()){
                Medicina m = new MedicinaServ().BuscarMedicoTratante(txt_busqueda.getText());
                fila.add(m.getCodigo());
                fila.add(m.getNombre_med());
                fila.add(m.getDosis());
                fila.add(m.getFecha_ven());
                fila.add(m.getMedico_trat());
            }
            dtm.addRow(fila);
            tbl_ConsultaMedicinas.setModel(dtm);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBusqueda = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ConsultaMedicinas = new javax.swing.JTable();
        rdb_nombre = new javax.swing.JRadioButton();
        rdb_venci = new javax.swing.JRadioButton();
        rdb_trat = new javax.swing.JRadioButton();
        rdb_codigo = new javax.swing.JRadioButton();
        btn_Consulta = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_todo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consulta Datos Medicina");

        jLabel2.setText("Ingrese informacion");

        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyPressed(evt);
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

        btgBusqueda.add(rdb_nombre);
        rdb_nombre.setText("Buscara por nombre");

        btgBusqueda.add(rdb_venci);
        rdb_venci.setText("Buscar fecha de vencimiento");

        btgBusqueda.add(rdb_trat);
        rdb_trat.setText("Buscar por mèdico tratante");

        btgBusqueda.add(rdb_codigo);
        rdb_codigo.setText("Buscar por codigo");

        btn_Consulta.setText("Consultar");
        btn_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultaActionPerformed(evt);
            }
        });

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        btn_todo.setText("Todo");
        btn_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_todoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(rdb_codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdb_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdb_venci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdb_trat)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_cerrar)
                        .addGap(62, 62, 62))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_Consulta)
                        .addGap(18, 18, 18)
                        .addComponent(btn_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_nombre)
                    .addComponent(rdb_venci)
                    .addComponent(rdb_trat)
                    .addComponent(rdb_codigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Consulta)
                    .addComponent(btn_todo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Busqueda();
        }
    }//GEN-LAST:event_txt_busquedaKeyPressed

    private void btn_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultaActionPerformed
            Busqueda();
    }//GEN-LAST:event_btn_ConsultaActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_todoActionPerformed
        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_btn_todoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBusqueda;
    private javax.swing.JButton btn_Consulta;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_todo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb_codigo;
    private javax.swing.JRadioButton rdb_nombre;
    private javax.swing.JRadioButton rdb_trat;
    private javax.swing.JRadioButton rdb_venci;
    private javax.swing.JTable tbl_ConsultaMedicinas;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
