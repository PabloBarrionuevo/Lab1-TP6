package Vistas;

import barrionuevo.tp6.DirectorioTel;

public class BuscarClientes extends javax.swing.JInternalFrame {
    public BuscarClientes() {
        iniciar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        lBuscar = new javax.swing.JLabel();
        ltexto = new javax.swing.JLabel();
        ladv = new javax.swing.JLabel();
        cbBuscar = new javax.swing.JComboBox<>();
        txtbuscar = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();

        setBackground(java.awt.Color.darkGray);
        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        lTitulo.setBackground(java.awt.Color.darkGray);
        lTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lTitulo.setForeground(java.awt.Color.white);
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Buscar Clientes");

        lBuscar.setBackground(java.awt.Color.darkGray);
        lBuscar.setForeground(java.awt.Color.white);
        lBuscar.setText("Buscar por: ");

        ltexto.setBackground(java.awt.Color.darkGray);
        ltexto.setForeground(java.awt.Color.white);
        ltexto.setText("Texto a buscar:");

        ladv.setBackground(java.awt.Color.darkGray);
        ladv.setForeground(java.awt.Color.white);
        ladv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ladv.setText("(Presione <ENTER> para buscar)");

        cbBuscar.setBackground(java.awt.Color.darkGray);
        cbBuscar.setForeground(java.awt.Color.white);
        cbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teléfono", "Apellido", "Ciudad" }));

        txtbuscar.setBackground(java.awt.Color.darkGray);
        txtbuscar.setForeground(java.awt.Color.white);
        txtbuscar.setText("...");
        txtbuscar.setToolTipText("Presiona <ENTER> para buscar");
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        btnSalir.setBackground(java.awt.Color.darkGray);
        btnSalir.setForeground(java.awt.Color.white);
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(java.awt.Color.darkGray);
        jScrollPane2.setForeground(java.awt.Color.white);

        lista.setModel(new javax.swing.DefaultListModel());
        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lista);

        jLabel1.setBackground(java.awt.Color.darkGray);
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("D. N. I. Nº: ");

        jLabel2.setBackground(java.awt.Color.darkGray);
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Apellido/s: ");

        jLabel3.setBackground(java.awt.Color.darkGray);
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Nombre/s: ");

        jLabel4.setBackground(java.awt.Color.darkGray);
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Ciudad: ");

        jLabel5.setBackground(java.awt.Color.darkGray);
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Dirección: ");

        txtdni.setEditable(false);
        txtdni.setBackground(java.awt.Color.darkGray);
        txtdni.setForeground(java.awt.Color.white);

        txtapellido.setEditable(false);
        txtapellido.setBackground(java.awt.Color.darkGray);
        txtapellido.setForeground(java.awt.Color.white);

        txtnombre.setEditable(false);
        txtnombre.setBackground(java.awt.Color.darkGray);
        txtnombre.setForeground(java.awt.Color.white);

        txtciudad.setEditable(false);
        txtciudad.setBackground(java.awt.Color.darkGray);
        txtciudad.setForeground(java.awt.Color.white);

        txtdireccion.setEditable(false);
        txtdireccion.setBackground(java.awt.Color.darkGray);
        txtdireccion.setForeground(java.awt.Color.white);

        jLabel6.setBackground(java.awt.Color.darkGray);
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Teléfono: ");

        txttelefono.setEditable(false);
        txttelefono.setBackground(java.awt.Color.darkGray);
        txttelefono.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ladv, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ltexto)
                            .addComponent(lBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbuscar)))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdni)
                            .addComponent(txtapellido)
                            .addComponent(txtnombre)
                            .addComponent(txtciudad)
                            .addComponent(txtdireccion)
                            .addComponent(txttelefono)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBuscar)
                    .addComponent(cbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ltexto)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ladv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            buscar();
        }
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            buscar();
        }
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        llenarDatos();
    }//GEN-LAST:event_listaValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lBuscar;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel ladv;
    private javax.swing.JList<String> lista;
    private javax.swing.JLabel ltexto;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
    //Mis metodos
    private void iniciar() {
        initComponents();
    }
    private void buscar(){
        java.util.List<recursos.Cliente> resultadoLista;
        recursos.Cliente resultadoCliente;
        javax.swing.DefaultListModel lm = (javax.swing.DefaultListModel) lista.getModel();
        lm.removeAllElements();
        switch(cbBuscar.getSelectedIndex()){
            case 0: 
                resultadoCliente = DirectorioTel.dir.buscarCliente(Long.parseLong(txtbuscar.getText()));
                if(resultadoCliente != null)
                    lm.addElement(resultadoCliente.toString());
                break;
            case 1: 
                resultadoLista = DirectorioTel.dir.buscarPorApellidos(txtbuscar.getText());
                if(resultadoLista.size() > 0)
                    resultadoLista.forEach(cliente -> lm.addElement(cliente.toString()));
                break;
            case 2: 
                resultadoLista = DirectorioTel.dir.buscarClientes(txtbuscar.getText());
                if(resultadoLista.size() > 0)
                    resultadoLista.forEach(cliente -> lm.addElement(cliente.toString()));
                break;
        }
    }

    private void llenarDatos() {
        recursos.Cliente cliente;
        long telefono;
        String valorSeleccionado = lista.getSelectedValue();
        String[] separador;
        if(valorSeleccionado != null && !valorSeleccionado.isEmpty()){//primer control que no sea vacio la lista seleccionada
            separador = valorSeleccionado.split(",");
            if(separador.length > 0 && separador[0].contains("Cliente: teléfono Nº ")){//segundo control, que se pueda separar para encontrar el telefono
                telefono = Long.parseLong(separador[0].substring("Cliente: teléfono Nº ".length()));
                cliente = DirectorioTel.dir.buscarCliente(telefono);
                if(cliente.getDni() != 0L){//tercer control, que dni no sea default
                    txtdni.setText(String.valueOf(cliente.getDni()));
                    txtapellido.setText(cliente.getApellido());
                    txtnombre.setText(cliente.getNombre());
                    txtciudad.setText(cliente.getCiudad());
                    txtdireccion.setText(cliente.getDireccion());
                    txttelefono.setText(String.valueOf(cliente.getTelefono()));
                }
            }
        }
    }
}
