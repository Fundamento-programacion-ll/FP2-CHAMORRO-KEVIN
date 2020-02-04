package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import controlador.ControladorJugador;
import modelo.Jugador;
public class IngresoJugador extends javax.swing.JFrame {
    Jugador ju= new Jugador();
    ControladorJugador cj= new ControladorJugador();
    public IngresoJugador() {
        initComponents();
        //setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Ingreso Equipo");
        //setIconImage(new ImageIcon(getClass().getResource("/img/fondo1.jpg")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/img/fondo1.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdJugador = new javax.swing.JTextField();
        txtNombreJugador = new javax.swing.JTextField();
        txtNumCamiseta = new javax.swing.JTextField();
        txtNombreCamiseta = new javax.swing.JTextField();
        txtNumeroGoles = new javax.swing.JTextField();
        txtFechaIngreso = new com.toedter.calendar.JDateChooser();
        cbIdEquipo = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(408, 332));

        jLabel1.setText("Ingreso Jugador");

        jLabel2.setText("Id Jugador:");

        jLabel3.setText("Id Equipo:");

        jLabel4.setText("Nombre Jugador:");

        jLabel5.setText("Número Camiseta:");

        jLabel6.setText("Fecha de Ingreso:");

        jLabel7.setText("Nombre Camiseta:");

        jLabel8.setText("Número de Goles:");

        cbIdEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Equipo" }));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 255, 51));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdJugador)
                            .addComponent(txtNumeroGoles)
                            .addComponent(txtNombreCamiseta)
                            .addComponent(txtNumCamiseta)
                            .addComponent(txtNombreJugador)
                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbIdEquipo, 0, 150, Short.MAX_VALUE))))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNumCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumeroGoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!txtIdJugador.getText().trim().equals("") && !cbIdEquipo.getSelectedItem().equals("Selecionar Equipo")
            && !txtNombreJugador.getText().trim().equals("")&& !txtNumCamiseta.getText().trim().equals("")
            && !txtNombreCamiseta.getText().trim().equals("") && !txtNumeroGoles.getText().trim().equals("") && 
            !txtFechaIngreso.getDateFormatString().trim().equals("") &&
            JOptionPane.showConfirmDialog(this, "¿Seguro que desea guardar datos?", "Confirmacion de ingreso",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            ju = new Jugador(ERROR, WIDTH, "", SOMEBITS, "", ju.getFechaIngreso(), 6);
            /*ju =new Equipo(Integer.parseInt(txtIdEquipo.getText()),txtNombreEquipo.getText(),
                txtLiga.getText(), txtFechaCreacion.getDate(),Integer.parseInt(txtNumeroInter.getText()) ,campeon);
            ce.ingresarEquipo(eq);
            JOptionPane.showMessageDialog(null,"Datos Ingresados Correctamente");
            LimpiarPantalla();*/
        }else{
            JOptionPane.showMessageDialog(null,"Ingrese Todos Los datos");
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbIdEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser txtFechaIngreso;
    private javax.swing.JTextField txtIdJugador;
    private javax.swing.JTextField txtNombreCamiseta;
    private javax.swing.JTextField txtNombreJugador;
    private javax.swing.JTextField txtNumCamiseta;
    private javax.swing.JTextField txtNumeroGoles;
    // End of variables declaration//GEN-END:variables
}
