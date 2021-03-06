/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CorteSucursalDetalles.java
 *
 * Created on 28/02/2009, 09:04:31 PM
 */

package omoikane.formularios;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import omoikane.sistema.*;
/**
 *
 * @author Usuario
 */
public class CorteMovimientoDetalles extends javax.swing.JInternalFrame {

    BufferedImage fondo;
    /** Creates new form CorteSucursalDetalles */
    public CorteMovimientoDetalles() {
        initComponents();
        //Instrucciones para el funcionamiento del fondo semistransparente
        this.setOpaque(false);
        ((JPanel)this.getContentPane()).setOpaque(false);
        this.getLayeredPane().setOpaque(false);
        this.getRootPane().setOpaque(false);
        this.generarFondo(this);

        Herramientas.centrarVentana(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRetiros = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDepositos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtImpuestos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDescuentos = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtVentas = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNVentas = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();

        setTitle("Movimientos de Caja");

        btnAceptar.setText("Aceptar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Importe:");

        txtTotal.setBackground(new java.awt.Color(0, 0, 0));
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setText("0.00");
        txtTotal.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha:");

        txtRetiros.setBackground(new java.awt.Color(0, 0, 0));
        txtRetiros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtRetiros.setForeground(new java.awt.Color(255, 255, 255));
        txtRetiros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtRetiros.setText("0.00");
        txtRetiros.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Autorizado:");

        txtDepositos.setBackground(new java.awt.Color(0, 0, 0));
        txtDepositos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDepositos.setForeground(new java.awt.Color(255, 255, 255));
        txtDepositos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtDepositos.setText("0.00");
        txtDepositos.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Almacen:");

        txtImpuestos.setBackground(new java.awt.Color(0, 0, 0));
        txtImpuestos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtImpuestos.setForeground(new java.awt.Color(255, 255, 255));
        txtImpuestos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtImpuestos.setText("0.00");
        txtImpuestos.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cajero:");

        txtSubtotal.setBackground(new java.awt.Color(0, 0, 0));
        txtSubtotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        txtSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSubtotal.setText("0.00");
        txtSubtotal.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Caja:");

        txtDescuentos.setBackground(new java.awt.Color(0, 0, 0));
        txtDescuentos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDescuentos.setForeground(new java.awt.Color(255, 255, 255));
        txtDescuentos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtDescuentos.setText("0.00");
        txtDescuentos.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Id de movimiento :");

        txtVentas.setBackground(new java.awt.Color(0, 0, 0));
        txtVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVentas.setForeground(new java.awt.Color(255, 255, 255));
        txtVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtVentas.setText("0.00");
        txtVentas.setOpaque(true);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<html><head><style type='text/css'>body { font-family: 'Roboto Thin'; font-size: 28px; }</style></head>\n<body>\nMovimientos de Caja\n</body></html>");

        txtNVentas.setBackground(new java.awt.Color(0, 0, 0));
        txtNVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNVentas.setForeground(new java.awt.Color(255, 255, 255));
        txtNVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNVentas.setText("0");
        txtNVentas.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tipo de movimiento :");

        btnImprimir.setText("Imprimir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                        .addComponent(btnAceptar))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtImpuestos, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(txtDescuentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDepositos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRetiros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtImpuestos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescuentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubtotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDepositos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRetiros)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnImprimir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel txtDepositos;
    public javax.swing.JLabel txtDescuentos;
    public javax.swing.JLabel txtImpuestos;
    public javax.swing.JLabel txtNVentas;
    public javax.swing.JLabel txtRetiros;
    public javax.swing.JLabel txtSubtotal;
    public javax.swing.JLabel txtTotal;
    public javax.swing.JLabel txtVentas;
    // End of variables declaration//GEN-END:variables

    public void paintComponent(Graphics g)
    {
      Graphics2D g2d = (Graphics2D) g;
      g2d.drawImage(fondo, 0, 0, null);

    }
    public void generarFondo(Component componente)
    {
      Rectangle areaDibujo = this.getBounds();
      BufferedImage tmp;
      GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();

      tmp = gc.createCompatibleImage(areaDibujo.width, areaDibujo.height,BufferedImage.TRANSLUCENT);
      Graphics2D g2d = (Graphics2D) tmp.getGraphics();
      g2d.setColor(new Color(0,0,0,165));
      g2d.fillRect(0,0,areaDibujo.width,areaDibujo.height);
      fondo = tmp;
    }

    /**
     * @return the btnAceptar
     */
    public javax.swing.JButton getBtnAceptar() {
        return btnAceptar;
    }

    /**
     * @param btnAceptar the btnAceptar to set
     */
    public void setBtnAceptar(javax.swing.JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    /**
     * @return the txtDescuentos
     */
    public javax.swing.JLabel getTxtDescuentos() {
        return txtDescuentos;
    }

    /**
     * @param txtDescuentos the txtDescuentos to set
     */
    public void setTxtDescuentos(javax.swing.JLabel txtDescuentos) {
        this.txtDescuentos = txtDescuentos;
    }

    /**
     * @return the txtImpuestos
     */
    public javax.swing.JLabel getTxtImpuestos() {
        return txtImpuestos;
    }

    /**
     * @param txtImpuestos the txtImpuestos to set
     */
    public void setTxtImpuestos(javax.swing.JLabel txtImpuestos) {
        this.txtImpuestos = txtImpuestos;
    }

    /**
     * @return the txtDepositos
     */
    public javax.swing.JLabel getTxtDepositos() {
        return txtDepositos;
    }

    /**
     * @param txtIngresos the txtDepositos to set
     */
    public void setTxtDepositos(javax.swing.JLabel txtIngresos) {
        this.txtDepositos = txtIngresos;
    }

    /**
     * @return the txtRetiros
     */
    public javax.swing.JLabel getTxtRetiros() {
        return txtRetiros;
    }

    /**
     * @param txtRetiros the txtRetiros to set
     */
    public void setTxtRetiros(javax.swing.JLabel txtRetiros) {
        this.txtRetiros = txtRetiros;
    }

    /**
     * @return the txtSubtotal
     */
    public javax.swing.JLabel getTxtSubtotal() {
        return txtSubtotal;
    }

    /**
     * @param txtSubtotal the txtSubtotal to set
     */
    public void setTxtSubtotal(javax.swing.JLabel txtSubtotal) {
        this.txtSubtotal = txtSubtotal;
    }

    /**
     * @return the txtTotal
     */
    public javax.swing.JLabel getTxtTotal() {
        return txtTotal;
    }

    /**
     * @param txtTotal the txtTotal to set
     */
    public void setTxtTotal(javax.swing.JLabel txtTotal) {
        this.txtTotal = txtTotal;
    }

    /**
     * @return the txtVentas
     */
    public javax.swing.JLabel getTxtVentas() {
        return txtVentas;
    }

    /**
     * @param txtVentas the txtVentas to set
     */
    public void setTxtVentas(javax.swing.JLabel txtVentas) {
        this.txtVentas = txtVentas;
    }

    /**
     * @return the txtNVentas
     */
    public javax.swing.JLabel getTxtNVentas() {
        return txtNVentas;
    }

    /**
     * @param txtNVentas the txtNVentas to set
     */
    public void setTxtNVentas(javax.swing.JLabel txtNVentas) {
        this.txtNVentas = txtNVentas;
    }
}
