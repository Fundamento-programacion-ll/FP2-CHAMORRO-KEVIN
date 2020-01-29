package com.mepe.vista;


import com.mepe.modelo.Usuario;
import com.mepe.servicio.UsuarioServ;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ConsultaUsuario extends javax.swing.JInternalFrame {
    //variable para modelo de la tabla
    private DefaultTableModel dtm;

    public ConsultaUsuario() {
        initComponents();
        // SELECCIONAR UN RDB
        rdb_id.setSelected(true);
        cargarTabla();
    }
    public void cargarTabla(){
        //mostrar datos en la tabla
        List<Usuario> usuarios = UsuarioServ.ListarUsuario();
        //recoge el modelo de la tabla 
        dtm = (DefaultTableModel) tbl_ConsultaPersonas.getModel();
        //ingresa informacion en la tabla 
        for (Usuario u : usuarios) {
            Vector fila = new Vector();
            fila.add(u.getId());
            fila.add(u.getUsuario());
            fila.add(u.getClave());
            fila.add(u.getPermiso());
            fila.add(u.getNombre());            
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
    public void Busqueda(){
        dtm = (DefaultTableModel) tbl_ConsultaPersonas.getModel();
        limpiarTabla();
            Vector fila = new Vector();
            //busqueda por id
            if(rdb_id.isSelected()==true){
                Usuario u = new UsuarioServ().BuscarUsuarioId(Integer.parseInt(txt_busqueda.getText()));
                fila.add(u.getId());
                fila.add(u.getUsuario());
                fila.add(u.getClave());
                fila.add(u.getPermiso());
                fila.add(u.getNombre());  
            }
            //busqueda por nombre de usuario
            if(rdb_usu.isSelected()==true){
                Usuario u = new UsuarioServ().BuscarUsuarioUsu(txt_busqueda.getText());
                fila.add(u.getId());
                fila.add(u.getUsuario());
                fila.add(u.getClave());
                fila.add(u.getPermiso());
                fila.add(u.getNombre());  
            }
            //busqueda por nombre
            if(rdb_nombre.isSelected()==true){
                Usuario u = new UsuarioServ().BuscarUsuarioNombre(txt_busqueda.getText());
                fila.add(u.getId());
                fila.add(u.getUsuario());
                fila.add(u.getClave());
                fila.add(u.getPermiso());
                fila.add(u.getNombre());  
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
        rdb_usu = new javax.swing.JRadioButton();
        rdb_nombre = new javax.swing.JRadioButton();
        rdb_id = new javax.swing.JRadioButton();
        btn_Consulta = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_todo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consulta Datos Usuario");

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
                "ID", "Usuario", "Clave", "Permiso", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_ConsultaPersonas);

        btgBusqueda.add(rdb_usu);
        rdb_usu.setText("Buscara por usuario");

        btgBusqueda.add(rdb_nombre);
        rdb_nombre.setText("Buscar por nombre");

        btgBusqueda.add(rdb_id);
        rdb_id.setText("Buscar por ID");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdb_id)
                                .addGap(67, 67, 67)
                                .addComponent(rdb_usu)
                                .addGap(54, 54, 54)
                                .addComponent(rdb_nombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(150, 150, 150)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Consulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_usu)
                    .addComponent(rdb_nombre)
                    .addComponent(rdb_id))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Consulta)
                    .addComponent(btn_todo))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btn_cerrar)
                .addGap(20, 20, 20))
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
    private javax.swing.JRadioButton rdb_id;
    private javax.swing.JRadioButton rdb_nombre;
    private javax.swing.JRadioButton rdb_usu;
    private javax.swing.JTable tbl_ConsultaPersonas;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
