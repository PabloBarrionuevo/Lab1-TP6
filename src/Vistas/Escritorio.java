package Vistas;

public class Escritorio extends javax.swing.JFrame {
    //constructor
    public Escritorio() {
        iniciar();
    }
    //Código auto generado por el editor
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ventanas = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Directorio Telefónico de Clientes");
        setBackground(java.awt.Color.darkGray);
        setForeground(java.awt.Color.white);
        setName(""); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 800));

        Ventanas.setBackground(java.awt.Color.darkGray);
        Ventanas.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout VentanasLayout = new javax.swing.GroupLayout(Ventanas);
        Ventanas.setLayout(VentanasLayout);
        VentanasLayout.setHorizontalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        VentanasLayout.setVerticalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(java.awt.Color.darkGray);
        jMenuBar1.setForeground(java.awt.Color.white);

        jMenu1.setBackground(java.awt.Color.darkGray);
        jMenu1.setForeground(java.awt.Color.white);
        jMenu1.setText("Clientes");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Buscar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Borrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(java.awt.Color.darkGray);
        jMenu2.setForeground(java.awt.Color.white);
        jMenu2.setText("Pruebas");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Generar Clientes");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator3);

        jMenuItem7.setText("Guardar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem6.setText("Cargar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(java.awt.Color.darkGray);
        jMenu3.setForeground(java.awt.Color.white);
        jMenu3.setText("Ventanas");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ventanas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ventanas)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodos para eventos de acciones ..........................................
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        nuevaVentana(new AgregarClientes());
    }//GEN-LAST:event_jMenuItem1ActionPerformed
	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        nuevaVentana(new BuscarClientes());
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        nuevaVentana(new BorrarCliente());
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        barrionuevo.tp6.DirectorioTel.dir.agregarCliente(2664123456L, 29456789L, "Julian", "Martinez", "San Luis", "España 2020");
        Clientes.Tabla.agregar(new String[]{"2664123456", "29456789", "Julian", "Martinez", "San Luis", "España 2020"});
        barrionuevo.tp6.DirectorioTel.dir.agregarCliente(2664123236L, 30456789L, "Marcos", "Torres", "San Luis", "España 2021");
        Clientes.Tabla.agregar(new String[]{"2664123236", "30456789", "Marcos", "Torres", "San Luis", "España 2021"});
        barrionuevo.tp6.DirectorioTel.dir.agregarCliente(2664198766L, 31456789L, "Carlos", "Cabrera", "La Punta", "España 2022");
        Clientes.Tabla.agregar(new String[]{"2664198766", "31456789", "Carlos", "Cabrera", "La Punta", "España 2022"});
        barrionuevo.tp6.DirectorioTel.dir.agregarCliente(2664789456L, 32456789L, "Pedro", "Lucero", "Villa Mercedes", "España 2023");
        Clientes.Tabla.agregar(new String[]{"2664789456", "32456789", "Pedro", "Lucero", "Villa Mercedes", "España 2023"});
        barrionuevo.tp6.DirectorioTel.dir.agregarCliente(2664891456L, 33456789L, "Jose", "Torres", "La Punta", "España 2024");
        Clientes.Tabla.agregar(new String[]{"2664891456", "33456789", "Jose", "Torres", "La Punta", "España 2024"});
        Clientes.actualizartxt();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            guardar();
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error al guardar...", "Error", 0);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            cargar();
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            javax.swing.JOptionPane.showMessageDialog(null, "Error al cargar...", "Error", 0);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Ventanas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
    
    //Mis variables, abiertas para el menu Ventanas, y una vista Clientes para incluir como fija
    private final java.util.List<javax.swing.JMenuItem> abiertas = new java.util.ArrayList<>();
    
    //Mis funciones o métodos
    public static void nuevo(){
        java.awt.EventQueue.invokeLater(() -> new Escritorio().setVisible(true));
    }
    private void iniciar(){
        initComponents();
        //inserto la vista de Clientes en el escritorio
        nuevaVentana(new Clientes());
        jMenu3.add(new javax.swing.JPopupMenu.Separator());
    }

    private void nuevaVentana(javax.swing.JInternalFrame ventana) {
        javax.swing.JMenuItem jM = new javax.swing.JMenuItem();
        int i = abiertas.size();
        jM.setText(ventana.getTitle() +" -InternalFrame "+ i);
        jM.addActionListener((java.awt.event.ActionEvent evt) -> ventana.toFront());
        ventana.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter(){
            @Override
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent e) {
                jMenu3.remove(jM);
                abiertas.remove(jM);
                Ventanas.remove(ventana);
            }
        });
        jMenu3.add(jM);
        abiertas.add(jM);
        Ventanas.add(ventana);
        ventana.setVisible(true);
        ventana.toFront();
    }

    private void guardar() throws java.io.IOException {
        try (java.io.FileWriter archivo = new java.io.FileWriter("./archivo.txt"); java.io.PrintWriter escritor = new java.io.PrintWriter(archivo)) {
            String texto = barrionuevo.tp6.DirectorioTel.dir.toStringGuardar().replace("[", "").replaceAll(".\\n, ", "\n").replace("]","");
            escritor.println(texto);
        }
    }

    private void cargar() throws java.io.FileNotFoundException, java.io.IOException {
        java.io.File archivo = new java.io.File("./archivo.txt");
        try (java.io.FileReader lector = new java.io.FileReader(archivo)) {
            java.io.BufferedReader buffer = new java.io.BufferedReader(lector);
            String linea;
            while((linea = buffer.readLine()) != null){
                if(linea.length() > 0){
                    String[] textos = linea.split(",");
                    barrionuevo.tp6.DirectorioTel.dir.agregarCliente(Long.parseLong(textos[0]),Long.parseLong(textos[1]),textos[2],textos[3],textos[4],textos[5]);
                    //actualizar Clientes
                    Clientes.Tabla.agregar(textos);
                }
            }
        }
        Clientes.actualizartxt();
    }
}
