package com.mepe.vista;

import com.mepe.modelo.Medicina;
import com.mepe.modelo.Per_Med;
import com.mepe.modelo.Persona;
import com.mepe.servicio.MedicinaServ;
import com.mepe.servicio.Per_MedServ;
import com.mepe.servicio.PersonaServ;
import java.util.List;
import javax.swing.JOptionPane;

public class IngresoMedicina extends javax.swing.JInternalFrame {
    List<Persona> personas = null;
    public IngresoMedicina() {
        initComponents();
        personas=PersonaServ.ListarPersonas();
        cargarComboPersona(personas);
        cmb_cood.setVisible(false);
    }
    //metodo para limpiar pantalla
    public void LimpiarPantalla(){
        txt_codigo.setText(null);
        txt_nombre.setText(null);
        txt_dosis.setText(null);
        jca_fecha.setDate(null);
        txt_medtra.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_dosis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_insertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_medtra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmb_personas = new javax.swing.JComboBox<>();
        btn_cerrar1 = new javax.swing.JButton();
        jca_fecha = new com.toedter.calendar.JDateChooser();
        cmb_cood = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_dosis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dosisKeyTyped(evt);
            }
        });

        jLabel7.setText("Dosis");

        btn_insertar.setText("Insertar");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingreso Medicina");

        jLabel3.setText("Codigo");

        jLabel4.setText("Nombre");

        jLabel5.setText("Fecha vencimiento");

        jLabel6.setText("Medico Tratante");

        txt_medtra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_medtraKeyTyped(evt);
            }
        });

        jLabel2.setText("Persona");

        btn_cerrar1.setText("Cerrar");
        btn_cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_cerrar1)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_insertar))
                                .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_dosis, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_medtra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(cmb_personas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_cood, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jca_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jca_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_medtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_cood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar1)
                    .addComponent(btn_insertar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void cargarComboPersona(List<Persona> persona) {
        for (Persona p : personas) {
            cmb_personas.addItem(p.getNombre()+" "+p.getApellido());
            cmb_cood.addItem(Integer.toString(p.getId()));
        }
    }
    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed

        if (!txt_nombre.getText().trim().equals("") && !txt_codigo.getText().trim().equals("")
            && !txt_dosis.getText().trim().equals("")&& !jca_fecha.getDate().toString().equals(null)
            && !txt_medtra.getText().trim().equals("")
            && JOptionPane.showConfirmDialog(this, "Seguro que desea guardar datos?", "Confirmacion de ingreso",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            cmb_cood.setSelectedIndex(cmb_personas.getSelectedIndex());
            Medicina medicina = new Medicina(
                    txt_codigo.getText(),
                    txt_nombre.getText(),
                    txt_dosis.getText(), 
                    jca_fecha.getDate(),
                    txt_medtra.getText());
            Per_Med perMed= new Per_Med(
                    cmb_cood.getSelectedIndex(),
                    txt_codigo.getText());
            MedicinaServ.InsertarMedicina(medicina);
            Per_MedServ.InsertarPerMed(perMed);
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
            //LIMPIAR pantalla
            LimpiarPantalla();
        }
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void btn_cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrar1ActionPerformed

    private void txt_medtraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_medtraKeyTyped
        char c=evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
        String Caracteres = txt_medtra.getText(); 
        if(Caracteres.length()>40){ 
            evt.consume(); 
        } 
    }//GEN-LAST:event_txt_medtraKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        String Caracteres = txt_nombre.getText(); 
        if(Caracteres.length()>40){ 
            evt.consume(); 
        } 
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_dosisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dosisKeyTyped
String Caracteres = txt_dosis.getText(); 
        if(Caracteres.length()>50){ 
            evt.consume(); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txt_dosisKeyTyped

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        String Caracteres = txt_dosis.getText(); 
        if(Caracteres.length()>5){ 
            evt.consume();
        }
    }//GEN-LAST:event_txt_codigoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar1;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JComboBox<String> cmb_cood;
    private javax.swing.JComboBox<String> cmb_personas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.calendar.JDateChooser jca_fecha;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_dosis;
    private javax.swing.JTextField txt_medtra;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
