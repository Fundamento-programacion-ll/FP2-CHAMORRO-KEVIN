package com.mepe.vista;

import com.mepe.modelo.Persona;
import com.mepe.servicio.PersonaServ;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ConsultaPersona extends javax.swing.JInternalFrame{
    //variable para modelo de la tabla
    private DefaultTableModel dtm;

    public ConsultaPersona() {
        initComponents();
        // SELECCIONAR IN RDB
        rdb_id.setSelected(true);
        cargarTabla();        
    }
    public void cargarTabla(){
       //mostrar datos en la tabla
        List<Persona> personas = PersonaServ.ListarPersonas();
        //recoge el modelo de la tabla 
        dtm = (DefaultTableModel) tbl_ConsultaPersonas.getModel();
        //ingresa informacion en la tabla 
        for (Persona p : personas) {
            Vector fila = new Vector();
            fila.add(p.getId());
            fila.add(p.getNombre());
            fila.add(p.getApellido());
            fila.add(p.getFecha_nac());
            fila.add(p.getTratamiento());
            fila.add(p.getEdad());
            dtm.addRow(fila);
        }

    }
    public void limpiarTabla(){ 
        try{
            DefaultTableModel dtm = (DefaultTableModel) tbl_ConsultaPersonas.getModel();
            int a = tbl_ConsultaPersonas.getRowCount()-1;
            for (int i = a; i >= 0; i--) {           
                dtm.removeRow(dtm.getRowCount()-1);
            } 
        }catch(Exception ex){
            System.out.println("Error al limpiar tabla");
        }
    }
    private void Busqueda(){
        limpiarTabla();
            dtm = (DefaultTableModel) tbl_ConsultaPersonas.getModel();
            Vector fila = new Vector();
            //busqueda por id
            if(rdb_id.isSelected()){
                Persona p = new PersonaServ().BuscarPersonaID(Integer.parseInt(txt_busqueda.getText()));
                fila.add(p.getId());
                fila.add(p.getNombre());
                fila.add(p.getApellido());
                fila.add(p.getFecha_nac());
                fila.add(p.getTratamiento());
                fila.add(p.getEdad());
            }
            //busqueda por nombre
            if(rdb_nombre.isSelected()){

                Persona p = new PersonaServ().BuscarPersonaNombre(txt_busqueda.getText());
                fila.add(p.getId());
                fila.add(p.getNombre());
                fila.add(p.getApellido());
                fila.add(p.getFecha_nac());
                fila.add(p.getTratamiento());
                fila.add(p.getEdad());
            }
            //busqueda por apellido
            if(rdb_apellido.isSelected()){

                Persona p = new PersonaServ().BuscarPersonaApellido(txt_busqueda.getText());
                fila.add(p.getId());
                fila.add(p.getNombre());
                fila.add(p.getApellido());
                fila.add(p.getFecha_nac());
                fila.add(p.getTratamiento());
                fila.add(p.getEdad());
            }
            //busqueda por tratamiento
            if(rdb_tratamiento.isSelected()){
                Persona p = new PersonaServ().BuscarPersonaTratamiento(txt_busqueda.getText());
                fila.add(p.getId());
                fila.add(p.getNombre());
                fila.add(p.getApellido());
                fila.add(p.getFecha_nac());
                fila.add(p.getTratamiento());
                fila.add(p.getEdad());
            }
            dtm.addRow(fila);
            tbl_ConsultaPersonas.setModel(dtm);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBusqueda = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ConsultaPersonas = new javax.swing.JTable();
        rdb_nombre = new javax.swing.JRadioButton();
        rdb_apellido = new javax.swing.JRadioButton();
        rdb_tratamiento = new javax.swing.JRadioButton();
        rdb_id = new javax.swing.JRadioButton();
        btn_Consulta = new javax.swing.JButton();
        btn_cerrar1 = new javax.swing.JButton();
        btn_todo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consulta Datos Persona");

        jLabel2.setText("Ingrese informacion");

        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyPressed(evt);
            }
        });

        tbl_ConsultaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Fecha Nacimiento", "Tratamiento", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_ConsultaPersonas);

        btgBusqueda.add(rdb_nombre);
        rdb_nombre.setText("Buscara por nombre");

        btgBusqueda.add(rdb_apellido);
        rdb_apellido.setText("Buscar por apellido");

        btgBusqueda.add(rdb_tratamiento);
        rdb_tratamiento.setText("Buscar por tratamiento");

        btgBusqueda.add(rdb_id);
        rdb_id.setText("Buscar por ID");

        btn_Consulta.setText("Consultar");
        btn_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultaActionPerformed(evt);
            }
        });

        btn_cerrar1.setText("Cerrar");
        btn_cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar1ActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn_Consulta)
                                .addGap(18, 18, 18)
                                .addComponent(btn_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdb_id)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdb_nombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdb_apellido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdb_tratamiento))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cerrar1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_nombre)
                    .addComponent(rdb_apellido)
                    .addComponent(rdb_tratamiento)
                    .addComponent(rdb_id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Consulta)
                    .addComponent(btn_todo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar1)
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void btn_cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrar1ActionPerformed

    private void btn_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_todoActionPerformed
        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_btn_todoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBusqueda;
    private javax.swing.JButton btn_Consulta;
    private javax.swing.JButton btn_cerrar1;
    private javax.swing.JButton btn_todo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb_apellido;
    private javax.swing.JRadioButton rdb_id;
    private javax.swing.JRadioButton rdb_nombre;
    private javax.swing.JRadioButton rdb_tratamiento;
    private javax.swing.JTable tbl_ConsultaPersonas;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
