/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import fonts.Fonts;
import javax.swing.JPanel;
import view.FJaime.bipiramideCuadrada;
import view.FJaime.casqueteEsferico;
import view.FJaime.*;
/**
 *
 * @author JAIMEUNL
 */
public class Menu_Tridi_B_I extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Figuras
     */
    public Menu_Tridi_B_I() {
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
        combo_B_I = new javax.swing.JComboBox<>();
        btn_abrirCalc = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(610, 240));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 20));
        jLabel3.setText("Figuras Tridimensionales");

        btn_Regresar.setText("Regresar");
        btn_Regresar.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 15));
        btn_Regresar.setVisible(false);
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        combo_B_I.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bipirámide cuadrada", "Casquete esférico", "Cilindro", "Cilindro elíptico", "Cilindro hueco", "Cilindro inclinado", "Cono", "Cono oblicuo", "Cubo", "Cuboctaedro", "Dodecaedro (Área)", "Dodecaedro (Volumen)", "Elipsoide", "Esfera hueca", "Esfera inclinada", "Esferoide oblato", "Hemisfera", "Icosaedro (Área)", "Icosaedro (Volumen)" }));
        combo_B_I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_B_IActionPerformed(evt);
            }
        });

        btn_abrirCalc.setText("Abrir Calculadora");
        btn_abrirCalc.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 30));
        btn_abrirCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(combo_B_I, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_abrirCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(btn_Regresar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_B_I, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_abrirCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
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
        Menu_Tridimensionales menu_Tridimensionales = new Menu_Tridimensionales();
        Main_Frame.showPanel(this, menu_Tridimensionales);
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_abrirCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirCalcActionPerformed
        // TODO add your handling code here:
        String figura = combo_B_I.getSelectedItem().toString();
        seleccion(figura);
    }//GEN-LAST:event_btn_abrirCalcActionPerformed
    
    public void regresar(JPanel panel){
        Main_Frame.showPanel(this, panel);
    }
    
    public void seleccion(String figura){
        switch (figura){
            case "Bipirámide cuadrada":
                bipiramideCuadrada BipiramideCuadrada = new bipiramideCuadrada();
                Main_Frame.showPanel(this, BipiramideCuadrada);
                break;
            case "Casquete esférico":
                casqueteEsferico CasqueteEsferico = new casqueteEsferico();
                Main_Frame.showPanel(this, CasqueteEsferico);
                break;
            case "Cilindro":
                Acilindro acilindro = new Acilindro();
                Main_Frame.showPanel(this, acilindro);
                break;
            case "Cilindro elíptico":
                cilindroEliptico CilindroEliptico = new cilindroEliptico();
                Main_Frame.showPanel(this, CilindroEliptico);
                break;
            case "Cilindro hueco":
                cilindroHueco CilindroHueco = new cilindroHueco();
                Main_Frame.showPanel(this, CilindroHueco);
                break;
            case "Cilindro inclinado":
                cilindroInclinado CilindroInclinado = new cilindroInclinado();
                Main_Frame.showPanel(this, CilindroInclinado);
                break;
            case "Cono":
                cono Cono = new cono();
                Main_Frame.showPanel(this, Cono);
                break;
            case "Cono oblicuo":
                conoOblicuo ConoOblicuo = new conoOblicuo();
                Main_Frame.showPanel(this, ConoOblicuo);
                break;
            case "Cubo":
                cubo Cubo = new cubo();
                Main_Frame.showPanel(this, Cubo);
                break;
            case "Cuboctaedro":
                cuboctaedro Cuboctaedro = new cuboctaedro();
                Main_Frame.showPanel(this, Cuboctaedro);
                break;
            case "Dodecaedro (Área)":
                Adodecaedro ADodecaedro = new Adodecaedro();
                Main_Frame.showPanel(this, ADodecaedro);
                break;
            case "Dodecaedro (Volumen)":
                Vdodecaedro VDodecaedro = new Vdodecaedro();
                Main_Frame.showPanel(this, VDodecaedro);
                break;
            case "Elipsoide":
                elipsoide Elipsoide = new elipsoide();
                Main_Frame.showPanel(this, Elipsoide);
                break;
            case "Esfera hueca":
                esferaHueca EsferaHueca = new esferaHueca();
                Main_Frame.showPanel(this, EsferaHueca);
                break;
            case "Esfera inclinada":
                esferaInclinada EsfeInclinada = new esferaInclinada();
                Main_Frame.showPanel(this, EsfeInclinada);
                break;
            case "Esferoide oblato":
                esferoideOblato EsferoideOblato = new esferoideOblato();
                Main_Frame.showPanel(this, EsferoideOblato);
                break;
            case "Hemisfera":
                hemisfera Hemisfera = new hemisfera();
                Main_Frame.showPanel(this, Hemisfera);
                break;
            case "Icosaedro (Área)":
                Aicosaedro aicosaedro = new Aicosaedro();
                Main_Frame.showPanel(this, aicosaedro);
                break;
            case "Icosaedro (Volumen)":
                Vicosaedro vicosaedro = new Vicosaedro();
                Main_Frame.showPanel(this, vicosaedro);
                break;
        }
                
    }
    
    private void combo_B_IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_B_IActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_B_IActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_abrirCalc;
    private javax.swing.JComboBox<String> combo_B_I;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
