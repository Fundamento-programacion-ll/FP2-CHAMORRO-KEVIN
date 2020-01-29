package com.mepe.vista;

import com.mepe.modelo.Usuario;
import com.mepe.servicio.UsuarioServ;
import javax.swing.JOptionPane;

public class ModificaUsuario extends javax.swing.JFrame {
    private char permi;
    Usuario usuario=null;
    public ModificaUsuario() {
        initComponents();
        rdb_admin.setSelected(true);
        //busca el id de la persona seleccionada en la fila de la pantalla datos
        //y los carga en cada componente para modificar
        DatosUsuarios dato = new DatosUsuarios();
        int id = dato.codigo;
        usuario = new UsuarioServ().BuscarUsuarioId(id);
        txt_usu.setText(usuario.getUsuario());
        txt_nombre.setText(usuario.getNombre());
        txt_clave.setText(usuario.getClave());
    }
    //metodo para limpiar pantalla
    public void LimpiarPantalla(){
        txt_usu.setText(null);
        txt_nombre.setText(null);
        txt_clave.setText(null);
        rdb_admin.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txt_usu = new javax.swing.JTextField();
        txt_clave = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        btn_insertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdb_admin = new javax.swing.JRadioButton();
        rdb_cli = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Nombre");

        btn_insertar.setText("Actualizar");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingreso Usuario");

        jLabel3.setText("Usuario");

        jLabel4.setText("Clave");

        jLabel5.setText("Permiso");

        buttonGroup1.add(rdb_admin);
        rdb_admin.setText("Administrador");

        buttonGroup1.add(rdb_cli);
        rdb_cli.setText("Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_insertar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_usu, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_clave, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rdb_admin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rdb_cli))))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdb_admin)
                    .addComponent(rdb_cli))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_insertar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        if (!txt_clave.getText().trim().equals("") && !txt_usu.getText().trim().equals("")
            && !txt_nombre.getText().trim().equals("")
            && JOptionPane.showConfirmDialog(this, "Seguro que desea guardar datos?", "Confirmacion de ingreso",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            if(rdb_admin.isSelected()){
                permi='a';
            }else{
                permi='c';
            }
            Usuario usuario = new Usuario(
                    txt_usu.getText(),
                    txt_clave.getText(),
                    permi,
                    txt_nombre.getText());
            UsuarioServ.ActualizarUsuario(usuario);
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
            //LIMPIAR pantalla
            LimpiarPantalla();
        }
        dispose();
    }//GEN-LAST:event_btn_insertarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_insertar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rdb_admin;
    private javax.swing.JRadioButton rdb_cli;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_usu;
    // End of variables declaration//GEN-END:variables
}
