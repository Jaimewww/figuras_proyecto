/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import fonts.Fonts;
import view.FEmilio.*;

/**
 *
 * @author JAIMEUNL
 */
public class Menu_Bidi_A_O extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Figuras
     */
    public Menu_Bidi_A_O() {
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
        btn_p_t = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JButton();
        cbx_A_O = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(610, 240));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(610, 240));

        btn_p_t.setText("Abrir Calculadora");
        btn_p_t.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 30));
        btn_p_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_tActionPerformed(evt);
            }
        });

        jLabel3.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 20));
        jLabel3.setText("Figuras Bidimensionales");

        btn_Regresar.setText("Regresar");
        btn_Regresar.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 15));
        btn_Regresar.setVisible(false);
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        cbx_A_O.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arco circular", "Círculo", "Círculo concéntrico", "Corona circular", "Corazón", "Decágono", "Dodecágono", "Elipse", "Eneágono", "Estrella de 5 puntas", "Estrella de 6 puntas", "Heptágono", "Hexágono", "Octágono", "Octágono regular con apotema" }));
        cbx_A_O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_A_OActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(cbx_A_O, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_p_t, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(btn_Regresar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_p_t, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_A_O, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
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

    private void btn_p_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_tActionPerformed
        // TODO add your handling code here:
        String figura = cbx_A_O.getSelectedItem().toString();
        seleccion(figura);
    }//GEN-LAST:event_btn_p_tActionPerformed

    public void seleccion(String figura) {
        switch (figura) {
            case "Arco circular":
                area_Arco_circular AC = new area_Arco_circular();
                Main_Frame.showPanel(this, AC);
                break;
            case "Círculo":
                area_Circulo C = new area_Circulo();
                Main_Frame.showPanel(this, C);
                break;
            case "Círculo concéntrico":
                area_Circulo_Concentrico CC = new area_Circulo_Concentrico();
                Main_Frame.showPanel(this, CC);
                break;
            case "Corona circular":
                area_Corona_circular CCir = new area_Corona_circular();
                Main_Frame.showPanel(this, CCir);
                break;
            case "Corazón":
                area_Corazon Co = new area_Corazon();
                Main_Frame.showPanel(this, Co);
                break;
            case "Dodecágono":
                area_Dodecagono D = new area_Dodecagono();
                Main_Frame.showPanel(this, D);
                break;
            case "Elipse":
                area_Elipse E = new area_Elipse();
                Main_Frame.showPanel(this, E);
                break;
            case "Eneágono":
                area_Eneágono En = new area_Eneágono();
                Main_Frame.showPanel(this, En);
                break;
            case "Estrella de 5 puntas":
                area_Estrella_5_Puntas E5 = new area_Estrella_5_Puntas();
                Main_Frame.showPanel(this, E5);
                break;
            case "Estrella de 6 puntas":
                area_Estrella_6_Puntas E6 = new area_Estrella_6_Puntas();
                Main_Frame.showPanel(this, E6);
                break;
            case "Heptágono":
                area_heptagono H = new area_heptagono(); 
                Main_Frame.showPanel(this, H);
                break;
            case "Hexágono":
                area_Hexagono Hex = new area_Hexagono(); 
                Main_Frame.showPanel(this, Hex);
                break;
            case "Octágono":
                area_Octagono O = new area_Octagono(); 
                Main_Frame.showPanel(this, O);
                break;
            case "Octágono regular con apotema":
                area_Octagono_regular_AP ORAp = new area_Octagono_regular_AP(); 
                Main_Frame.showPanel(this, ORAp);
                break;
            case "Decágono":
                area_Decagono De = new area_Decagono(); 
                Main_Frame.showPanel(this, De);
                break;
        }
    }

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        // TODO add your handling code here:
        Menu_Bidimensionales menu_Bidimensionales = new Menu_Bidimensionales();
        Main_Frame.showPanel(bg, menu_Bidimensionales);
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void cbx_A_OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_A_OActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_A_OActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_p_t;
    private javax.swing.JComboBox<String> cbx_A_O;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
