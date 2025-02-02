/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.FJaime;

import controller.F_Jaime;
import fonts.Fonts;
import utiles.Utiles;
import view.Main_Frame;
import view.Menu_Tridi_B_I;

/**
 *
 * @author JAIMEUNL
 */
public class elipsoide extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Figuras
     */
    public elipsoide() {
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

        jSeparator1 = new javax.swing.JSeparator();
        bg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();
        txt_mayor = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        btnAreaOctaedro = new javax.swing.JButton();
        txt_menor = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Result = new javax.swing.JLabel();
        txt_altura = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(610, 240));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("AREA ELIPSOIDE");

        btn_Regresar.setText("Regresar");
        btn_Regresar.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 15));
        btn_Regresar.setVisible(false);
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        txt_mayor.setBackground(new java.awt.Color(153, 153, 255));
        txt_mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mayorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESE EL VALOR DEL  LARGO:");

        btnAreaOctaedro.setBackground(new java.awt.Color(0, 102, 255));
        btnAreaOctaedro.setText("GENERAR");
        btnAreaOctaedro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaOctaedroActionPerformed(evt);
            }
        });

        txt_menor.setBackground(new java.awt.Color(153, 153, 255));
        txt_menor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_menorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INGRESE EL VALOR DEL LA ALTURA:");

        jLabel5.setText("RESULTADO:");

        txt_Result.setText("...");

        txt_altura.setBackground(new java.awt.Color(153, 153, 255));
        txt_altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alturaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("INGRESE EL VALOR DEL ANCHO:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elipsoide.png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(txt_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txt_menor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnAreaOctaedro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(txt_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Regresar)))
                .addGap(46, 46, 46))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btn_Regresar))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnAreaOctaedro))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(1, 1, 1)
                                .addComponent(txt_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(2, 2, 2)
                                .addComponent(txt_menor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txt_Result))
                            .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        // TODO add your handling code here:
        Menu_Tridi_B_I menu_Tridi_B_I = new Menu_Tridi_B_I();
        Main_Frame.showPanel(bg, menu_Tridi_B_I);
        
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void txt_mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mayorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_mayorActionPerformed

    private void btnAreaOctaedroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaOctaedroActionPerformed
        // TODO add your handling code here:
        
        if(Utiles.validate(txt_mayor.getText()) && Utiles.validate(txt_menor.getText()) && Utiles.validate(txt_altura.getText())){
            Float resultado = F_Jaime.ejecutarElipsoide(Utiles.transformStringFloat(txt_mayor.getText()), Utiles.transformStringFloat(txt_menor.getText()), Utiles.transformStringFloat(txt_altura.getText()));
            txt_Result.setText(resultado.toString());
        }
        
    }//GEN-LAST:event_btnAreaOctaedroActionPerformed

    private void txt_menorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_menorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_menorActionPerformed

    private void txt_alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAreaOctaedro;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txt_Result;
    private java.awt.TextField txt_altura;
    private java.awt.TextField txt_mayor;
    private java.awt.TextField txt_menor;
    // End of variables declaration//GEN-END:variables
}
