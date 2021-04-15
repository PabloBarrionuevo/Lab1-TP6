package Vistas;

public class Clientes extends javax.swing.JInternalFrame {

    public Clientes() {
        iniciar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtclientes = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tTabla = new javax.swing.JTable();

        txtclientes.setEditable(false);
        txtclientes.setBackground(java.awt.Color.darkGray);
        txtclientes.setForeground(java.awt.Color.white);
        jScrollPane1.setViewportView(txtclientes);

        setBackground(java.awt.Color.darkGray);
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setForeground(java.awt.Color.white);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        tTabla.setBackground(java.awt.Color.darkGray);
        tTabla.setForeground(java.awt.Color.white);
        tTabla.setModel(new javax.swing.table.DefaultTableModel());
        tTabla.setEnabled(false);
        tTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        setLocation(0, 0);
    }//GEN-LAST:event_formComponentMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tTabla;
    public static javax.swing.JTextPane txtclientes;
    // End of variables declaration//GEN-END:variables
    private void iniciar(){
        initComponents();
        setSize(788, 500);
        setLocation(1, 1);
        actualizartxt();
        Tabla.iniciar();
    }
    public static void actualizartxt(){
        if(barrionuevo.tp6.DirectorioTel.dir.getKeys().length > 0){
            txtclientes.setText(barrionuevo.tp6.DirectorioTel.dir.toString());
        }else{
            txtclientes.setText("Directorio Vacio");
        }
    }
    public String getTxt(){
        return txtclientes.getText();
    }

    static class Tabla {
        private static void iniciar() {
            javax.swing.table.DefaultTableModel d = ((javax.swing.table.DefaultTableModel) tTabla.getModel());
                d.addColumn("Teléfono");d.addColumn("DNI");
                d.addColumn("Nombre");d.addColumn("Apellido");
                d.addColumn("Ciudad");d.addColumn("Dirección");
        }
        private static int buscar(String aBuscar, String donde){
            javax.swing.table.DefaultTableModel d = (javax.swing.table.DefaultTableModel) tTabla.getModel();
            int respuesta = -1;
            for(int i = 0, j = d.getRowCount(); i<j; i++){
                int columna = tTabla.getColumnModel().getColumnIndex(donde);//igual no funciona si se mueve el index
                if(d.getValueAt(i, columna).equals(aBuscar))respuesta = i;
            }
            return respuesta;
        }
        static void agregar(String[] fila) {
            javax.swing.table.DefaultTableModel d = (javax.swing.table.DefaultTableModel) tTabla.getModel();
            int indice = buscar(fila[0],"Teléfono");
            if(indice == -1)
                d.addRow(fila);
        }
        static void borrar(String dni) {
            javax.swing.table.DefaultTableModel d = (javax.swing.table.DefaultTableModel) tTabla.getModel();
            int indice;
            if(d.getRowCount() > 0){
                indice = buscar(dni,"DNI");
                if(indice > -1)
                    d.removeRow(indice);
            }
        }
    }
}
