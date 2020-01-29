package com.mepe.vista;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mepe.dao.ConexionJDBC;
import com.mepe.servicio.ReporteServ;
import com.mepe.modelo.Reporte;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReporteVista extends javax.swing.JInternalFrame {
    
List<Reporte> clientes = ReporteServ.Ireporte();
private DefaultTableModel dtm;
    private Connection conn;

    public ReporteVista() {
        initComponents();
        JPanel.setVisible(true);
        if (conn==null)
        conn=ConexionJDBC.getConnection();
    }
    
    private void closeConection(){
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println("No se pudo cerrar la conexion");
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_direccion = new javax.swing.JTextField();
        btn_generar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JPanel = new javax.swing.JTextArea();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_direccion.setEditable(false);

        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        JPanel.setEditable(false);
        JPanel.setColumns(20);
        JPanel.setRows(5);
        jScrollPane1.setViewportView(JPanel);

        btn_salir.setText("Cerrar");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btn_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_generar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        JFileChooser dlg = new JFileChooser();
        int option = dlg.showSaveDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            File f= dlg.getSelectedFile();
            String dir= f.toString();
            txt_direccion.setText(dir);
            btn_generar.setVisible(true);
            String sqlRep = "{call registroMedicinas}";
        CallableStatement csMed = null;
        ResultSet rsMed = null;
             try {                
                csMed = conn.prepareCall(sqlRep);
                rsMed = csMed.executeQuery(sqlRep);
                while(rsMed.next()){
                    String nomc= rsMed.getString("nombre");
                    String apell= rsMed.getString("apellido");
                    String med= rsMed.getString("nombre_med");
                    String dosis = rsMed.getString("dosis");
                    JPanel.append("\nNombres:"+nomc+" "+apell+"\nMedicamento: "+med+"\nDosis: "+dosis);
                } 
                csMed.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
                }
        String text= JPanel.getText();
        try {
            FileOutputStream archivo = new FileOutputStream(txt_direccion.getText()+".pdf");
            Document doc = new Document();
            
            try {
                PdfWriter.getInstance(doc, archivo);
            } catch (DocumentException ex) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            doc.open();
            try {
                doc.add(new Paragraph(text));
            } catch (DocumentException ex) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            doc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this,"PDF generado con exito", "EXITO", JOptionPane.INFORMATION_MESSAGE);

        }
        btn_generar.setEnabled(false);
    }//GEN-LAST:event_btn_generarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JPanel;
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_direccion;
    // End of variables declaration//GEN-END:variables
}
