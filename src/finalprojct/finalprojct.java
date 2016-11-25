package finalprojct;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class finalprojct extends javax.swing.JFrame { //javax.swing.JFrame es para la interfaz visual
    // Propiedades
    private Inventario memoria;
    private HistorialVentas memoriaVentas;
    private ArrayList<HistorialVentas> globalVentas;
    //DefautltTableModel es una clase que contiene todos los metodos necesarios 
    public DefaultTableModel tableModel; //para modificar datos en su interior,
    public DefaultTableModel tableModelVenta;//añadir filas o columnas y darle a cada columna el nombre que desee
    private Note creadorDeNotas;

    /**
     * Creates new form finalprojct
     */
    public finalprojct() {
        initComponents(); //Parte de la interfaz visual
        this.memoria = new Inventario();
        this.memoriaVentas = new HistorialVentas();
        this.globalVentas = new ArrayList();
        this.creadorDeNotas = new Note();
        // Se agrega los titulos de las columnas a la tabla
        //Se crea un arreglo String que contiene clave, precio y cantidad
        String col[] = {"clave", "precio","cantidad"}; 
        // Se agrega los titulos de las columnas a la tabla venta
        //Se crea un arreglo String que contiene clave, precio, cantidad e importe
        String colVenta[] = {"clave", "precio","cantidad", "importe"};

        this.tableModel = new DefaultTableModel(col, 0);
        this.tableModelVenta = new DefaultTableModel(colVenta, 0);
        //setModel es para modificar el modelo de la tabla
        this.table.setModel(this.tableModel);
        this.tableVenta.setModel(this.tableModelVenta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() { //ESTO EN NETBEANS SALE COMO "GENERATED CODE"

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableVenta = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        claveVenta = new javax.swing.JTextField();
        vender = new javax.swing.JButton();
        mensajeVenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        claveCantidad = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        descripcionVenta = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        guardar = new javax.swing.JButton();
        message = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cierre de venta", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        tableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableVenta);

        jLabel5.setText("Clave de producto");

        claveVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveVentaActionPerformed(evt);
            }
        });

        vender.setText("Vender");
        vender.setEnabled(false);
        vender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                venderMouseClicked(evt);
            }
        });

        mensajeVenta.setEnabled(false);

        jLabel6.setText("Clave y Cantidad");

        claveCantidad.setEnabled(false);

        total.setText("0");
        total.setEnabled(false);

        jLabel7.setText("Total");

        jButton1.setText("terminar venta");
        jButton1.setEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });

        jLabel8.setText("Descripción");

        descripcionVenta.setColumns(20);
        descripcionVenta.setRows(5);
        descripcionVenta.setEnabled(false);
        jScrollPane4.setViewportView(descripcionVenta);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(claveCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(claveVenta, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 10, Short.MAX_VALUE)
                                        .addComponent(mensajeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(vender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                        .addGap(10, 10, 10))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mensajeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(vender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Venta", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setText("Precio");

        jLabel2.setText("Clave");

        jLabel3.setText("Cantidad");

        jLabel4.setText("Descripción");

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        guardar.setBackground(new java.awt.Color(153, 153, 153));
        guardar.setText("Guardar");
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        message.setEnabled(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(message, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(cantidad)
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(guardar)))
                .addGap(18, 18, 18)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inventario", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents //AQUI TERMINA EL GENERATED CODE

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        // se optiene los valores de la forma (clave, precio, cantidad, descripcion)
        String c = this.clave.getText();//getText te devuelve el texto escrito en el componente
        String p = this.precio.getText();
        String q = this.cantidad.getText();
        String d = this.descripcion.getText();
        // Si pudimos insertar el nuevo Item, entonces asignamos mensaje de agredado
        if (this.memoria.addItem(new Item(c, Double.parseDouble(p), Integer.parseInt(q), d))) {
            //setText es para poner texto en el componente
            this.message.setText("Producto con clave " + c + " agredado");
            Object [] data = {c,p,q};
            this.tableModel.addRow(data);
            this.limpiarFormaDeInventario();
        } else {// si no pudimos insertar, entonces enviamos el mensaje de que el producto ya existe
            this.message.setText("Product con clave " + c + " ya existe");
        }
    }//GEN-LAST:event_guardarMouseClicked
    //limpiarFormaDeInventario pone en blanco donde se introducen los datos
    private void limpiarFormaDeInventario () {
        this.clave.setText("");
        this.precio.setText("");
        this.cantidad.setText("");
        this.descripcion.setText("");
    }
    private void venderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venderMouseClicked
        // Obtiene el valor escrito en el campo claveCantidad
        String claveCantidad = this.claveCantidad.getText();
        // Definimos el separador para el formato (cantidad*clave)
        String separador = "*";
        // Declaramos formato para almacenar la cantidad y la clave al dividor claveCantidad
        String [] formato;
        // cantidad
        int cantidad;
        // Si claveCantidad contiene el separador, entonces separamos claveCantidad
        // las almacenamos en cantidad (posición 0 en formato) y clave (posición 1 e formato)
        // Si no contiene el separador, entonces asignamos cantidad a 1  y clave a claveCantidad
        if (claveCantidad.contains(separador)) {
            formato = claveCantidad.split("\\"+separador);
         //split es un metodo que nos permite dividir una cadena en 
         //base a las ocurrencias de una expresion regular definida dentro
            cantidad = Integer.parseInt(formato[0]);
        } else {
            cantidad = 1;
        }
       
        // Optenemos el index del item que se desea vender
        int index = this.memoria.findClave(this.claveVenta.getText());
        
        // Optenemos la cantidad existente del item que buscamos
        int cantidadExistente = this.memoria.getItemAt(index).getCantidad();
        
        // Si la cantidad que se desea es mayor,  entonces enviamos mensaje,
        // si no disminuimos la cantidad del item en el invetario 
        // y actualizamos la tabla de inventario
        if (cantidadExistente < cantidad) {
            this.mensajeVenta.setText("No podemos suplir esa cantidad");
        } else {
            // calcular nueva cantidad
            int nuevaCantidad = cantidadExistente - cantidad;
            
            // actualizar cantidad del item almacenado en la memoria
            this.memoria.getItemAt(index).setCantidad(nuevaCantidad);
            
            //Actualizar la tabla de inventario
            this.actualizarTablaDeInventario(nuevaCantidad, index);
            
            //despliega mensaje
            this.mensajeVenta.setText("Venta exitosa");
            
            //calculamos el importe
            double importe = this.memoria.getItemAt(index).getPrecio() * cantidad;
            
            //creamos un record para la tabla de ventas
            Object [] data = {
                this.claveVenta.getText(), 
                this.memoria.getItemAt(index).getPrecio(), 
                cantidad,
                importe
            };
            // Crear un item
            Venta v = new Venta(this.claveVenta.getText(), this.memoria.getItemAt(index).getPrecio(), this.descripcionVenta.getText(), cantidad, importe);
            //calculamos el total de la venta
            this.total.setText(Double.toString(Double.parseDouble(this.total.getText()) + importe));
            
            //agregamos una nueva venta a la memoria de ventas
            this.memoriaVentas.agregarVenta(v);
            
            //agregamos el record de venta a la tabla de ventas
            this.tableModelVenta.addRow(data);
            
        }
        
    }//GEN-LAST:event_venderMouseClicked

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        // obtenemos la clave que escribio el usuario en el campo claveVenta
        String c = this.claveVenta.getText();
        // Verificamos SI  la clave existe en el  memoria, si existe habilitamos campos de captura
        // si no, desplegamos mensaje
        if (this.memoria.findClave(this.claveVenta.getText()) > -1) {
            this.toggleEnabledCamposDeCaptura(true);       
        } else {
            this.mensajeVenta.setText("El producto " + c + " no exite");
        }
    }//GEN-LAST:event_buscarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Deshabilita campos de captura para la venta
        this.toggleEnabledCamposDeCaptura(false);
        // Limpia los valores ingresados en los campos de venta
        this.limpiarCamposDeCaptura();
        //Crear archivo con las ventas
        //this.creadorDeNotas.crearNotaDeVenta(this.memoriaVentas);
        //this.globalVentas.add(this.memoriaVentas);
        
        //this.memoriaVentas.clear();
    }//GEN-LAST:event_jButton1MouseClicked

    private void claveVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveVentaActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarActionPerformed
    private void limpiarTablaDeventas(int size){
        for( int i = 1; i <= size ; i++ ) {
            this.tableModelVenta.removeRow(i);
        }
    }
    /**
     * 
     * Actualiza la tabla de inventario
     * @param nuevaCantidad int 
     * @param index int
     */
    private void actualizarTablaDeInventario (int nuevaCantidad,int index) {
        this.tableModel.setValueAt( nuevaCantidad, index, 2);
    }
    
    /**
     * habilita o deshabilita los campos claveCantidad
     * descripcionVenta, claveVenta, el botón buscar, el botón vender y el botón terminar venta
     * @param flag boolean (true para habilitar y false para deshabitar)
     */
    private void toggleEnabledCamposDeCaptura (boolean flag) {
        this.claveCantidad.setEnabled(flag);
        this.descripcionVenta.setEnabled(flag);
        this.claveVenta.setEnabled(!flag);
        this.buscar.setEnabled(!flag);
        this.vender.setEnabled(flag);
        //Button de terminar ventar
        this.jButton1.setEnabled(flag);
    }
    /**
     * @param flag boolean (true para habilitar y false para deshabitar)
     */
    private void limpiarCamposDeCaptura () {
        this.claveCantidad.setText("");
        this.descripcionVenta.setText("");
        this.claveVenta.setText("");
        this.total.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { //ESTO TAMBIEN SALE COMO "GENERATED CODE"
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(finalprojct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(finalprojct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(finalprojct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(finalprojct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>//AQUI TERMINA EL GENERATED CODE

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new finalprojct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField claveCantidad;
    private javax.swing.JTextField claveVenta;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextArea descripcionVenta;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mensajeVenta;
    private javax.swing.JTextField message;
    private javax.swing.JTextField precio;
    private javax.swing.JTable table;
    private javax.swing.JTable tableVenta;
    private javax.swing.JTextField total;
    private javax.swing.JButton vender;
    // End of variables declaration//GEN-END:variables
}
