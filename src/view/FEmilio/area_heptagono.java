/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.FEmilio;

import controller.F_Emilio;
import fonts.Fonts;
import utiles.Utiles;
import view.Main_Frame;
import view.Menu_Bidi_A_O;

/**
 *
 * @author JAIMEUNL
 */
public class area_heptagono extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Figuras
     */
    public area_heptagono() {
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

        bg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_heptagono = new javax.swing.JButton();
        txt_r_heptagono = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_total = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(610, 240));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(610, 240));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Area Heptágono");

        btn_Regresar.setText("Regresar");
        btn_Regresar.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 15));
        btn_Regresar.setVisible(false);
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESE LA LONGITUD DEL RADIO INSCRITO EN LA FIGURA:");

        btn_heptagono.setBackground(new java.awt.Color(0, 102, 255));
        btn_heptagono.setText("GENERAR");
        btn_heptagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_heptagonoActionPerformed(evt);
            }
        });

        txt_r_heptagono.setBackground(new java.awt.Color(153, 153, 255));
        txt_r_heptagono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_r_heptagonoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/heptagono.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TOTAL: ");

        txt_total.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_total.setForeground(new java.awt.Color(0, 0, 0));
        txt_total.setText("...");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(txt_r_heptagono, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 67, Short.MAX_VALUE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_heptagono, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Regresar)
                        .addGap(40, 40, 40))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Regresar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(txt_r_heptagono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_total)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_heptagono))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(143, 143, 143))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        // TODO add your handling code here:
        Menu_Bidi_A_O menu_back = new Menu_Bidi_A_O();
        Main_Frame.showPanel(this, menu_back);
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_heptagonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_heptagonoActionPerformed
        // TODO add your handling code here:
        if (Utiles.validate(txt_r_heptagono.getText())) {
            Float r = Utiles.transformStringFloat(txt_r_heptagono.getText());
            Float resultado = F_Emilio.Ejecutar_Heptagono(r);
            txt_total.setText(resultado.toString());
        }

    }//GEN-LAST:event_btn_heptagonoActionPerformed

    private void txt_r_heptagonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_r_heptagonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_r_heptagonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_heptagono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.TextField txt_r_heptagono;
    private javax.swing.JLabel txt_total;
    // End of variables declaration//GEN-END:variables
}
