
package sistema;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.sql.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JTextField;
        
public class Sistema extends javax.swing.JFrame{

    ConexionSQL conect = new ConexionSQL();
    java.sql.Connection con = conect.conexion(); 
    
    
    public Sistema() {
        initComponents();
        setLocationRelativeTo(null);
        llenerarticulo();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        list1 = new java.awt.List();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        btnEnviarDb = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtvendedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtprecioUnidad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        generadordereporte = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        generoBox = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        comboTipCompra = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JTextField();
        Jfecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        AgregarProducto = new javax.swing.JButton();
        Jboxarticulos = new javax.swing.JComboBox<>();

        jTextField3.setText("jTextField3");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jRadioButton1.setText("jRadioButton1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        label1.setText("label1");

        label2.setText("label2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 145, 110));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula:");

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });

        btnEnviarDb.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviarDb.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviarDb.setText("Enviar");
        btnEnviarDb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarDbActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("COMPRA");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vendedor:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Articulo:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("precio de unidad:");

        txtprecioUnidad.setEditable(false);
        txtprecioUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioUnidadActionPerformed(evt);
            }
        });
        txtprecioUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioUnidadKeyTyped(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cantidad: ");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("CLIENTE");

        generadordereporte.setForeground(new java.awt.Color(0, 0, 0));
        generadordereporte.setText("Generar Reporte");
        generadordereporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generadordereporteActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Direccion:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Genero:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Casado/a", "Soltero/a", "Viudo/a" }));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado: ");

        generoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Masculino ", "Femenino", "No binario" }));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipo de compra:");

        comboTipCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Tarjeta Credito/Debito", "Efectivo", "Pago por Cheque", " " }));
        comboTipCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipCompraActionPerformed(evt);
            }
        });

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        Jfecha.setDateFormatString("d/MM/YYYY");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        AgregarProducto.setText("Agregar Producto");
        AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductoActionPerformed(evt);
            }
        });

        Jboxarticulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        Jboxarticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JboxarticulosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnEnviarDb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(generadordereporte)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtprecioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTipCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jboxarticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jLabel8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(AgregarProducto)
                                    .addComponent(Jboxarticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(generoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(txtprecioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12)
                                            .addComponent(comboTipCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(194, 194, 194))))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviarDb)
                    .addComponent(generadordereporte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductoActionPerformed
        
        this.setVisible(false);
        Articulos_nuevos arts = new Articulos_nuevos(); 
        arts.setVisible(true);
        
        

    }//GEN-LAST:event_AgregarProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fecha();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <=57;

        if(!numero)
        {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void comboTipCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipCompraActionPerformed

    private void generadordereporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generadordereporteActionPerformed
        try {
            generarArchivoPdf();
        } catch (SQLException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_generadordereporteActionPerformed

    private void txtprecioUnidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioUnidadKeyTyped
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <= 57;

        if(!numero)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtprecioUnidadKeyTyped

    private void btnEnviarDbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarDbActionPerformed

        insertarDatosCliente();

    }//GEN-LAST:event_btnEnviarDbActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed

    }//GEN-LAST:event_txtnombreActionPerformed

    
    
    private void txtprecioUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioUnidadActionPerformed

    }//GEN-LAST:event_txtprecioUnidadActionPerformed

    private void JboxarticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JboxarticulosActionPerformed
        try {
            Statement st = con.createStatement();
            ResultSet rst = st.executeQuery("select precio from listadeproductos where producto='" + this.Jboxarticulos.getSelectedItem() + "'");
            rst.next(); 
            this.txtprecioUnidad.setText(rst.getString("precio"));
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_JboxarticulosActionPerformed
       
    public void fecha() 
    {
        Calendar dia = new GregorianCalendar();
        Jfecha.setCalendar(dia);   
    }
    
    public void llenerarticulo()
    {
        
        String sql = "select producto from listadeproductos";
        
        try {
//            articuloCombo.removeAll();
            ResultSet rs; 
            PreparedStatement pst = con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            while(rs.next())
            {
                Jboxarticulos.addItem(rs.getString("producto"));
            }
            
            
        } catch (Exception e) {
            
        }
    }
    
    
 // Method to create an PDF file with the data put on the program.   
public void generarArchivoPdf() throws SQLException
{
        
    File file = new File("C:\\Users\\diego\\OneDrive\\Desktop\\Proyecto Exoneracion\\Reportes-PDF\\ReportePDF.pdf"); 
        try {
            FileOutputStream archivo = new FileOutputStream(file);
            Document doc = new Document(); 
            PdfWriter.getInstance(doc, archivo);
            doc.open(); 
            // Creating an object type Paragraph to create an format and to give a Header to our File
            Paragraph p = new Paragraph(10);
            Font fuente  = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
            p.add(Chunk.NEWLINE);
            p.add(" TABLA DE DATOS ");
            p.add(Chunk.NEWLINE);
            p.add(Chunk.NEWLINE);
            p.setAlignment(Element.ALIGN_CENTER);
            doc.add(p);
            
            // Creates an object type pdfTable called tbd 
            PdfPTable tbd = new PdfPTable(9);
            
            // Sets the width of the table
            tbd.setWidthPercentage(111);
            
            // Creates, gives names and format to each cell needed
            PdfPCell cel1 = new PdfPCell(new Phrase("ID", fuente));
            PdfPCell cel2 = new PdfPCell(new Phrase("Fecha", fuente));
            PdfPCell cel3 = new PdfPCell(new Phrase("Nombre de Cliente", fuente));
            PdfPCell cel4 = new PdfPCell(new Phrase("Cedula de Cliente", fuente));
            PdfPCell cel5 = new PdfPCell(new Phrase("Vendedor", fuente));
            PdfPCell cel6 = new PdfPCell(new Phrase("Tipo de Compra", fuente));
            PdfPCell cel7 = new PdfPCell(new Phrase("Cantidad", fuente));
            PdfPCell cel8 = new PdfPCell(new Phrase("Precio por Unidad", fuente));
            PdfPCell cel9 = new PdfPCell(new Phrase("Monto", fuente));
            
            // Centers each cell 
            cel1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel8.setHorizontalAlignment(Element.ALIGN_CENTER);
            cel9.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            // Sets the background color of the cells to light gray 
            cel1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cel2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cel3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cel4.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cel5.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cel6.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cel7.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cel8.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cel9.setBackgroundColor(BaseColor.LIGHT_GRAY);
  
            // Adding every cell to the table then to the document
            tbd.addCell(cel1);
            tbd.addCell(cel2);
            tbd.addCell(cel3);
            tbd.addCell(cel4);
            tbd.addCell(cel5);
            tbd.addCell(cel6);
            tbd.addCell(cel7);
            tbd.addCell(cel8);
            tbd.addCell(cel9);
            
            
              
    
  
    // Makes connection to the databse and the table on which the data is going to be retrieved
    
            String sql = "select * from  tabladedatos";
            PreparedStatement pst = con.prepareStatement(sql);
            java.sql.Connection co = conect.conexion();
            DefaultTableModel model = new DefaultTableModel();

            

            String[] data = new String[9];
            try {
                pst = co.prepareStatement(sql);
                ResultSet rs = pst.executeQuery(sql);

            /* While conditional that asks every time if there is data in every column of the table,
                if there is, it adds it to the cells and continues asking until there is no more */ 
            
                while (rs.next()) {
                    tbd.addCell(data[0] = rs.getString(1));
                    tbd.addCell(data[1] = rs.getString(2));
                    tbd.addCell(data[2] = rs.getString(3));
                    tbd.addCell(data[3] = rs.getString(4));
                    tbd.addCell(data[4] = rs.getString(5));
                    tbd.addCell(data[5] = rs.getString(6));
                    tbd.addCell(data[6] = rs.getString(7));
                    tbd.addCell(data[7] = rs.getString(8));
                    tbd.addCell(data[8] = rs.getString(9));
                    model.addRow(data);

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex.toString());
            }
            
            // Everything goes well it add the table to the document.
            doc.add(tbd);
            
            
            doc.close(); 
            archivo.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado Exitosamente ");
            // Opens the document automatically and present it to you.   
            Desktop.getDesktop().open(file);
            
            
        } catch (FileNotFoundException ex) {    
           JOptionPane.showMessageDialog(null, ex.getMessage() + "No se pudo crear el Archivo");
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "No se pudo crear el Documento");
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage() + "Error de IO");
        }

}


    // Method to insert data into a DB
    public void insertarDatosCliente()
    {
        try {
            // Begging of Script to automate the totality to pay for a product
            String cadena1, cadena2, cadena3; 
            int numero1, numero2, numero3, numero4; 
            
            cadena1 = cantidad.getText(); 
            cadena2 = txtprecioUnidad.getText(); 
            numero1 = Integer.parseInt(cadena1); 
            numero2 = Integer.parseInt(cadena2);
            numero3 = numero1 * numero2; 
            cadena1 = Integer.toString(numero3); 
           // Ending of Script
            
           
         // Code to insert the data into de database called "tabladedatos" with all of its columns  
        String SQL = "Insert into tabladedatos (nombre, cedula,fecha,vendedor, tipoCompra, cantidad,precioUnidad, monto) values (?,?,?,?,?,?,?,?)";
                   
            PreparedStatement pst= con.prepareStatement(SQL);
            pst.setString(1, txtnombre.getText());
            pst.setString(2, txtcedula.getText());
            pst.setString(3, ((JTextField)Jfecha.getDateEditor().getUiComponent()).getText());
            pst.setString(4, txtvendedor.getText());
            int tipcom = comboTipCompra.getSelectedIndex();
            pst.setString(5, comboTipCompra.getItemAt(tipcom));
            pst.setString(6, cantidad.getText());
            pst.setString(7, txtprecioUnidad.getText()); 
            pst.setString(8, cadena1);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Datos registrados");
            
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Los datos no han podido ser registrados: " + ex.getMessage());
        }
    }
  
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProducto;
    private javax.swing.JComboBox<String> Jboxarticulos;
    private com.toedter.calendar.JDateChooser Jfecha;
    private javax.swing.JButton btnEnviarDb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox<String> comboTipCompra;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton generadordereporte;
    private javax.swing.JComboBox<String> generoBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.List list1;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecioUnidad;
    private javax.swing.JTextField txtvendedor;
    // End of variables declaration//GEN-END:variables
}
