/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.FSoledad;

import controller.F_Soledad;
import fonts.Fonts;
import utiles.Utiles;
import view.Main_Frame;
import view.Menu_Tridi_O_T;

/**
 *
 * @author JAIMEUNL
 */
public class prismaTriangular extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Figuras
     */
    public prismaTriangular() {
        initComponents();
        btn_Regresar.setVisible(true);
    }
    
    Fonts tipoFuente = new Fonts();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtaltura = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtlongitud = new java.awt.TextField();
        txtancho = new java.awt.TextField();
        btnOrtoedro = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtalturap = new java.awt.TextField();
        txtladoa = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        btnOrtoedro1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btn_Regresar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtladob = new java.awt.TextField();
        txtladoc = new java.awt.TextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtalturat = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_Result = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("AREA ORTOEDRO");

        btn_Regresar.setText("Regresar");
        btn_Regresar.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 15));
        btn_Regresar.setVisible(false);
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ortoedro-1.gif"))); // NOI18N
        jLabel2.setText("jLabel2");

        txtaltura.setBackground(new java.awt.Color(153, 153, 255));
        txtaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalturaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("INGRESE LA ALTURA:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INGRESE ANCHO:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESE LONGITUD: ");

        txtlongitud.setBackground(new java.awt.Color(153, 153, 255));
        txtlongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlongitudActionPerformed(evt);
            }
        });

        txtancho.setBackground(new java.awt.Color(153, 153, 255));
        txtancho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanchoActionPerformed(evt);
            }
        });

        btnOrtoedro.setBackground(new java.awt.Color(0, 102, 255));
        btnOrtoedro.setText("GENERAR");

        setPreferredSize(new java.awt.Dimension(610, 240));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ALTURA PRISMA:");

        txtalturap.setBackground(new java.awt.Color(153, 153, 255));
        txtalturap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalturapActionPerformed(evt);
            }
        });

        txtladoa.setBackground(new java.awt.Color(153, 153, 255));
        txtladoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtladoaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("LADO A:");

        btnOrtoedro1.setBackground(new java.awt.Color(0, 102, 255));
        btnOrtoedro1.setText("GENERAR");
        btnOrtoedro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrtoedro1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("AREA  PRISMA TRIANGULAR");

        btn_Regresar1.setText("Regresar");
        btn_Regresar.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 15));
        btn_Regresar.setVisible(false);
        btn_Regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Regresar1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("LADO B:");

        txtladob.setBackground(new java.awt.Color(153, 153, 255));
        txtladob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtladobActionPerformed(evt);
            }
        });

        txtladoc.setBackground(new java.awt.Color(153, 153, 255));
        txtladoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtladocActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("LADO C:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ALTURA TRIANGULO:");

        txtalturat.setBackground(new java.awt.Color(153, 153, 255));
        txtalturat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalturatActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/triangular.jpg"))); // NOI18N

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("TOTAL:");

        txt_Result.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtladoa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Regresar1))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtladob, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtladoc, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(txtalturap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtalturat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel10)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(btnOrtoedro1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btn_Regresar1)
                        .addGap(33, 33, 33)))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel13))
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtladoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtladob, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtladoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtalturap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtalturat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txt_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOrtoedro1)
                                .addGap(25, 25, 25))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void txtalturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalturaActionPerformed

    private void txtlongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlongitudActionPerformed

    private void txtanchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanchoActionPerformed

    private void txtalturapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalturapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalturapActionPerformed

    private void txtladoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtladoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtladoaActionPerformed

    private void btn_Regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Regresar1ActionPerformed
        // TODO add your handling code here:
        Menu_Tridi_O_T  menu_Tridi_O_T = new Menu_Tridi_O_T ();
        Main_Frame.showPanel(this, menu_Tridi_O_T);
    }//GEN-LAST:event_btn_Regresar1ActionPerformed

    private void txtladobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtladobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtladobActionPerformed

    private void txtladocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtladocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtladocActionPerformed

    private void txtalturatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalturatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalturatActionPerformed

    private void btnOrtoedro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrtoedro1ActionPerformed
        // TODO add your handling code here:
        if(Utiles.validate(txtladoa.getText()) && Utiles.validate(txtladob.getText())&& Utiles.validate(txtladoc.getText())&& Utiles.validate(txtalturap.getText())&& Utiles.validate(txtalturat.getText())){
            Float resultado = F_Soledad.areaSuperficialPrismaTriangular(Utiles.transformStringFloat(txtladoa.getText()),Utiles.transformStringFloat(txtladob.getText()),Utiles.transformStringFloat(txtladoc.getText()),Utiles.transformStringFloat(txtalturat.getText()),Utiles.transformStringFloat(txtalturat.getText()));
            txt_Result.setText(resultado.toString());
        }
    }//GEN-LAST:event_btnOrtoedro1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnOrtoedro;
    private javax.swing.JButton btnOrtoedro1;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_Regresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txt_Result;
    private java.awt.TextField txtaltura;
    private java.awt.TextField txtalturap;
    private java.awt.TextField txtalturat;
    private java.awt.TextField txtancho;
    private java.awt.TextField txtladoa;
    private java.awt.TextField txtladob;
    private java.awt.TextField txtladoc;
    private java.awt.TextField txtlongitud;
    // End of variables declaration//GEN-END:variables
}
