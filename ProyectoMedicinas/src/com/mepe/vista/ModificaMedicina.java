package com.mepe.vista;

import com.mepe.modelo.Medicina;
import com.mepe.servicio.MedicinaServ;
import javax.swing.JOptionPane;

public class ModificaMedicina extends javax.swing.JFrame {

    Medicina medicina = null;

    public ModificaMedicina() {
        initComponents();      
        //busca el codigo de la medicina seleccionada en la fila de la pantalla datos
        //y los carga en cada componente para modificar
        DatosMedicina dato = new DatosMedicina();
        String cod = dato.codigo;
        medicina = new MedicinaServ().BuscarMedicinaCod(cod);
        txt_nombre.setText(medicina.getNombre_med());
        jca_fecha.setDate(medicina.getFecha_ven());
        txt_dosis.setText(medicina.getDosis());
        txt_medtra.setText(medicina.getMedico_trat());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_actualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_medtra = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_dosis = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jca_fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingreso Medicina");

        jLabel4.setText("Nombre");

        jLabel5.setText("Fecha Vencimiento");

        jLabel6.setText("Medico Tratante");

        txt_medtra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_medtraKeyTyped(evt);
            }
        });

        jLabel7.setText("Dosis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombre)
                            .addComponent(txt_dosis)
                            .addComponent(txt_medtra)
                            .addComponent(jca_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_actualizar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
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
                .addComponent(btn_actualizar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (!txt_nombre.getText().trim().equals("")&& !txt_dosis.getText().trim().equals("")
                && !jca_fecha.getDate().toString().equals(null)
                && !txt_medtra.getText().trim().equals("")
                && JOptionPane.showConfirmDialog(this, "Seguro que desea guardar datos?", "Confirmacion de ingreso",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {

            Medicina medicina = new Medicina(
                txt_nombre.getText(),
                txt_dosis.getText(),
                jca_fecha.getDate(),
                txt_medtra.getText());

            MedicinaServ.ActualizarMedicina(medicina);
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
            //LIMPIAR pantalla
        }
        dispose();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_medtraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_medtraKeyTyped
         char c=evt.getKeyChar();
        if (Character.isAlphabetic(c) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_medtraKeyTyped
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.calendar.JDateChooser jca_fecha;
    private javax.swing.JTextField txt_dosis;
    private javax.swing.JTextField txt_medtra;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
