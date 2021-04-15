package Vistas;

import barrionuevo.tp6.DirectorioTel;

public class AgregarClientes extends javax.swing.JInternalFrame {

    public AgregarClientes() {
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        lDni = new javax.swing.JLabel();
        lApellido = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lCiudad = new javax.swing.JLabel();
        lDireccion = new javax.swing.JLabel();
        lTelefono = new javax.swing.JLabel();
        lRequerido = new javax.swing.JLabel();
        lRequerido1 = new javax.swing.JLabel();
        lRequerido2 = new javax.swing.JLabel();
        lRequerido3 = new javax.swing.JLabel();
        lRequerido4 = new javax.swing.JLabel();
        txtdni = new javax.swing.JFormattedTextField();
        txtapellido = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JFormattedTextField();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agregar Cliente");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        setVisible(true);

        lTitulo.setBackground(java.awt.Color.darkGray);
        lTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lTitulo.setForeground(java.awt.Color.white);
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Agregar un Cliente Nuevo (completa el formulario)");

        lDni.setBackground(java.awt.Color.darkGray);
        lDni.setForeground(java.awt.Color.white);
        lDni.setText("D.N.I. Nº: ");

        lApellido.setBackground(java.awt.Color.darkGray);
        lApellido.setForeground(java.awt.Color.white);
        lApellido.setText("Apellido/s: ");

        lNombre.setBackground(java.awt.Color.darkGray);
        lNombre.setForeground(java.awt.Color.white);
        lNombre.setText("Nombre/s: ");

        lCiudad.setBackground(java.awt.Color.darkGray);
        lCiudad.setForeground(java.awt.Color.white);
        lCiudad.setText("Ciudad: ");

        lDireccion.setBackground(java.awt.Color.darkGray);
        lDireccion.setForeground(java.awt.Color.white);
        lDireccion.setText("Dirección: ");

        lTelefono.setBackground(java.awt.Color.darkGray);
        lTelefono.setForeground(java.awt.Color.white);
        lTelefono.setText("Teléfono: ");

        lRequerido.setForeground(new java.awt.Color(255, 0, 0));
        lRequerido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lRequerido.setText("(*) Información Requerida.");

        lRequerido1.setForeground(new java.awt.Color(255, 0, 0));
        lRequerido1.setText("*");

        lRequerido2.setForeground(new java.awt.Color(255, 0, 0));
        lRequerido2.setText("*");

        lRequerido3.setForeground(new java.awt.Color(255, 0, 0));
        lRequerido3.setText("*");

        lRequerido4.setForeground(new java.awt.Color(255, 0, 0));
        lRequerido4.setText("*");

        txtdni.setBackground(java.awt.Color.darkGray);
        txtdni.setForeground(java.awt.Color.white);
        txtdni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        txtdni.setToolTipText("");

        txtapellido.setBackground(java.awt.Color.darkGray);
        txtapellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtapellido.setForeground(java.awt.Color.white);

        txtnombre.setBackground(java.awt.Color.darkGray);
        txtnombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtnombre.setForeground(java.awt.Color.white);

        txtciudad.setBackground(java.awt.Color.darkGray);
        txtciudad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtciudad.setForeground(java.awt.Color.white);

        txtdireccion.setBackground(java.awt.Color.darkGray);
        txtdireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtdireccion.setForeground(java.awt.Color.white);

        txttelefono.setBackground(java.awt.Color.darkGray);
        txttelefono.setForeground(java.awt.Color.white);
        txttelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        btnSalir.setBackground(java.awt.Color.darkGray);
        btnSalir.setForeground(java.awt.Color.white);
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(java.awt.Color.darkGray);
        btnGuardar.setForeground(java.awt.Color.white);
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(java.awt.Color.darkGray);
        btnNuevo.setForeground(java.awt.Color.white);
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lRequerido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lDni)
                                .addGap(18, 18, 18)
                                .addComponent(lRequerido1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdni))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lRequerido2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lDireccion)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lTelefono)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lRequerido4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                    .addComponent(txttelefono)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lCiudad)
                                        .addGap(22, 22, 22)
                                        .addComponent(lRequerido3))
                                    .addComponent(lNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre)
                                    .addComponent(txtciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))))
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lDni)
                        .addComponent(lRequerido1))
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lApellido)
                    .addComponent(lRequerido2)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCiudad)
                    .addComponent(lRequerido3)
                    .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDireccion)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefono)
                    .addComponent(lRequerido4)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lRequerido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar(); habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lApellido;
    private javax.swing.JLabel lCiudad;
    private javax.swing.JLabel lDireccion;
    private javax.swing.JLabel lDni;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lRequerido;
    private javax.swing.JLabel lRequerido1;
    private javax.swing.JLabel lRequerido2;
    private javax.swing.JLabel lRequerido3;
    private javax.swing.JLabel lRequerido4;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JFormattedTextField txtdni;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JFormattedTextField txttelefono;
    // End of variables declaration//GEN-END:variables
    //Mis métodos o funciones
    private void iniciar() {
        initComponents();
        deshabilitar();
    }
    private void limpiar() {
        txtdni.setText("");
        txtapellido.setText("");
        txtnombre.setText("");
        txtciudad.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
    }
    private void habilitar(){
        txtdni.setEnabled(true);
        txtapellido.setEnabled(true);
        txtnombre.setEnabled(true);
        txtciudad.setEnabled(true);
        txtdireccion.setEnabled(true);
        txttelefono.setEnabled(true);
        btnGuardar.setEnabled(true);
    }
    private void deshabilitar(){
        txtdni.setEnabled(false);
        txtapellido.setEnabled(false);
        txtnombre.setEnabled(false);
        txtciudad.setEnabled(false);
        txtdireccion.setEnabled(false);
        txttelefono.setEnabled(false);
        btnGuardar.setEnabled(false);
    }
    private void guardar() {
        if(txtdni.getText().isEmpty() || txtapellido.getText().isEmpty() || txtciudad.getText().isEmpty() || txttelefono.getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null, "Complete la informacion requerida...", "Error", 0);
        }else{
            DirectorioTel.dir.agregarCliente(
                txttelefono.getText(),txtdni.getText(),
                txtnombre.getText(),txtapellido.getText(),
                txtciudad.getText(),txtdireccion.getText());
            //Actualizar la vista de Clientes
            Clientes.actualizartxt();
            Clientes.Tabla.agregar(new String[]{
                txttelefono.getText(),txtdni.getText(),
                txtnombre.getText(),txtapellido.getText(),
                txtciudad.getText(),txtdireccion.getText()});
            deshabilitar();
            javax.swing.JOptionPane.showMessageDialog(null, "Cliente guardado en el directorio", "Información", 1);
            
        }
    }
}
