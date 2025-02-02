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
public class octaedroV extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Figuras
     */
    public octaedroV() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtarista = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        btnVolumenOctaedro = new javax.swing.JButton();
        btn_Regresar1 = new javax.swing.JButton();
        txt_Result = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/octaedro.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("VOLUMEN OCTAEDRO");

        txtarista.setBackground(new java.awt.Color(255, 153, 102));
        txtarista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaristaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LONGITUD DEL LADO:");

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

        txt_Result.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TOTAL:");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(530, Short.MAX_VALUE)
                .addComponent(btn_Regresar1)
                .addGap(19, 19, 19))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(btnVolumenOctaedro, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(txtarista, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addContainerGap(165, Short.MAX_VALUE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(133, 133, 133))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Regresar1)
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtarista, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(btnVolumenOctaedro)
                        .addGap(45, 45, 45))))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void txtaristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaristaActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_Regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Regresar1ActionPerformed
        // TODO add your handling code here:
        Menu_Tridi_O_T  menu_Tridi_O_T = new Menu_Tridi_O_T ();
        Main_Frame.showPanel(bg, menu_Tridi_O_T);
    }//GEN-LAST:event_btn_Regresar1ActionPerformed

    private void btnVolumenOctaedroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumenOctaedroActionPerformed
        // TODO add your handling code here:
        if(Utiles.validate(txtarista.getText()) && Utiles.validate(txtarista.getText())){
            Float resultado = F_Soledad.ejecutarOctaedroVolumen(Utiles.transformStringFloat(txtarista.getText()));
            txt_Result.setText(resultado.toString());
        }
    }//GEN-LAST:event_btnVolumenOctaedroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnVolumenOctaedro;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_Regresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txt_Result;
    private java.awt.TextField txtarista;
    // End of variables declaration//GEN-END:variables
}
