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
public class prismaHexagonal extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Figuras
     */
    public prismaHexagonal() {
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

        btn_Regresar = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtlado = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        btnVolumenOctaedro = new javax.swing.JButton();
        btn_Regresar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtaltura = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_Result = new javax.swing.JLabel();

        btn_Regresar.setText("Regresar");
        btn_Regresar.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 15));
        btn_Regresar.setVisible(false);
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        setPreferredSize(new java.awt.Dimension(610, 240));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PRISMA HEXAGONAL");

        txtlado.setBackground(new java.awt.Color(255, 153, 102));
        txtlado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtladoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LONGITUD DE UN LADO:");

        btnVolumenOctaedro.setBackground(new java.awt.Color(0, 102, 255));
        btnVolumenOctaedro.setText("GENERAR");
        btnVolumenOctaedro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumenOctaedroActionPerformed(evt);
            }
        });

        btn_Regresar1.setText("Regresar");
        btn_Regresar.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 15));
        btn_Regresar.setVisible(false);
        btn_Regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Regresar1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LONGITUD DE LA  ALTURA:");

        txtaltura.setBackground(new java.awt.Color(255, 153, 102));
        txtaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalturaActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hexa.jpg"))); // NOI18N

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
                        .addGap(136, 136, 136)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_Regresar1))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(txtlado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnVolumenOctaedro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btn_Regresar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(txt_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVolumenOctaedro)))
                    .addComponent(jLabel4))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtladoActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_Regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Regresar1ActionPerformed
        // TODO add your handling code here:
        Menu_Tridi_O_T  menu_Tridi_O_T = new Menu_Tridi_O_T ();
        Main_Frame.showPanel(bg, menu_Tridi_O_T);
    }//GEN-LAST:event_btn_Regresar1ActionPerformed

    private void txtalturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalturaActionPerformed

    private void btnVolumenOctaedroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumenOctaedroActionPerformed
        // TODO add your handling code here:
         if(Utiles.validate(txtlado.getText()) && Utiles.validate(txtaltura.getText())){
            Float resultado = F_Soledad.ejecutarPrismaHexagonal (Utiles.transformStringFloat(txtlado.getText()),Utiles.transformStringFloat(txtaltura.getText()));
            txt_Result.setText(resultado.toString());
        }
    }//GEN-LAST:event_btnVolumenOctaedroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnVolumenOctaedro;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_Regresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txt_Result;
    private java.awt.TextField txtaltura;
    private java.awt.TextField txtlado;
    // End of variables declaration//GEN-END:variables
}
