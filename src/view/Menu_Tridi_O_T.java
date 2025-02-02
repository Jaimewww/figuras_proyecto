/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import fonts.Fonts;
import javax.swing.JPanel;
import view.FSoledad.Atetraedro;
import view.FSoledad.Vtetraedro;
import view.FSoledad.octaedro;
import view.FSoledad.octaedroV;
import view.FSoledad.ortoedro;
import view.FSoledad.paralelepipedo;
import view.FSoledad.piramideCuadrada;
import view.FSoledad.piramideDodecagonal;
import view.FSoledad.piramideHexagonal;
import view.FSoledad.piramideOblicua;
import view.FSoledad.piramidePentagonal;
import view.FSoledad.piramideTriangular;
import view.FSoledad.piramideTruncada;
import view.FSoledad.prismaDodecagonal;
import view.FSoledad.prismaHexagonal;
import view.FSoledad.prismaPentagonal;
import view.FSoledad.prismaRectangular;
import view.FSoledad.prismaTriangular;
import view.FSoledad.semiesfera;
import view.Main_Frame;

/**
 *
 * @author JAIMEUNL
 */
public class Menu_Tridi_O_T extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Figuras
     */
    public Menu_Tridi_O_T() {
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
        combo_O_T = new javax.swing.JComboBox<>();
        btn_abrirCalc = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(610, 240));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Figuras Tridimensionales");

        btn_Regresar.setText("Regresar");
        btn_Regresar.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 15));
        btn_Regresar.setVisible(false);
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        combo_O_T.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Octaedro (Área)", "Octaedro (Volumen)", "Ortoedro", "Paralelepípedo", "Pirámide cuadrada", "Pirámide dodecagonal", "Pirámide hexagonal", "Pirámide oblicua", "Pirámide pentagonal", "Pirámide triangular", "Pirámide truncada", "Prisma dodecagonal", "Prisma hexagonal", "Prisma pentagonal", "Prisma rectangular", "Prisma triangular", "Semiesfera", "Tetraedro (Área)", "Tetraedro (Volumen)", "Toroide" }));
        combo_O_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_O_TActionPerformed(evt);
            }
        });

        btn_abrirCalc.setForeground(new java.awt.Color(0, 0, 0));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_Regresar))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(combo_O_T, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btn_abrirCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_abrirCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_O_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        Main_Frame.showPanel(bg, menu_Tridimensionales);
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void btn_abrirCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirCalcActionPerformed
        // TODO add your handling code here:
       seleccion(combo_O_T.getSelectedItem().toString());
    }                                             
    
    public void regresar(JPanel panel){
        Main_Frame.showPanel(this, panel);
    }
    
    public void seleccion(String figura){
        switch (figura){
            case "Octaedro (Área)":
                octaedro octaedro = new octaedro();
                Main_Frame.showPanel(bg, octaedro);
                break;
            case "Octaedro (Volumen)":
                octaedroV octaedroV = new octaedroV();
                Main_Frame.showPanel(bg, octaedroV);
                break;
            case "Ortoedro":
                ortoedro ortoedro = new ortoedro();
                Main_Frame.showPanel(bg, ortoedro);
                break;
            case "Paralelepípedo":
                paralelepipedo paralelepipedo = new paralelepipedo();
                Main_Frame.showPanel(bg, paralelepipedo);
                break;
            case "Pirámide cuadrada":
                piramideCuadrada piramideCuadrada = new piramideCuadrada();
                Main_Frame.showPanel(bg, piramideCuadrada);
                break;
            case "Pirámide dodecagonal":
                piramideDodecagonal piramideDodecagonal = new piramideDodecagonal();
                Main_Frame.showPanel(bg, piramideDodecagonal);
                break;
            case "Pirámide hexagonal":
                piramideHexagonal piramideHexagonal = new piramideHexagonal();
                Main_Frame.showPanel(bg, piramideHexagonal);
                break;
            case "Pirámide oblicua":
                piramideOblicua piramideOblicua = new piramideOblicua();
                Main_Frame.showPanel(bg, piramideOblicua);
                break;
            case "Pirámide pentagonal":
                piramidePentagonal piramidePentagonal = new piramidePentagonal();
                Main_Frame.showPanel(bg, piramidePentagonal);
                break;
            case "Pirámide triangular":
                piramideTriangular piramideTriangular = new piramideTriangular();
                Main_Frame.showPanel(bg, piramideTriangular);
                break;
            case "Pirámide truncada":
                piramideTruncada piramideTruncada = new  piramideTruncada();
                Main_Frame.showPanel(bg,  piramideTruncada);
                break;
            case "Prisma dodecagonal":
                prismaDodecagonal prismaDodecagonal  = new  prismaDodecagonal ();
                Main_Frame.showPanel(bg,  prismaDodecagonal );
                break;
            case "Prisma hexagonal":
                prismaHexagonal prismaHexagonal = new  prismaHexagonal ();
                Main_Frame.showPanel(bg,  prismaHexagonal );
                break;
            case "Prisma pentagonal":
                prismaPentagonal prismaPentagonal = new  prismaPentagonal ();
                Main_Frame.showPanel(bg,prismaPentagonal );
                break;
            case "Prisma rectangular":
                prismaRectangular prismaRectangular = new  prismaRectangular ();
                Main_Frame.showPanel(bg,prismaRectangular);
                break;
            case "Prisma triangular":
                prismaTriangular prismaTriangular = new prismaTriangular();
                Main_Frame.showPanel(bg,prismaTriangular);
                break;
            case "Area Tetraedro":
                Atetraedro Atetraedro = new Atetraedro();
                Main_Frame.showPanel(bg,Atetraedro);
                break;
            case "Volumen Tetraedro":
                Vtetraedro Vtetraedro = new Vtetraedro();
                Main_Frame.showPanel(bg,Vtetraedro);
                break;
            case "Toroide":
                
            case "Semiesfera":
                semiesfera semiesfera  = new semiesfera ();
                Main_Frame.showPanel(bg,semiesfera );
                break;
        
        }
    }//GEN-LAST:event_btn_abrirCalcActionPerformed

    private void combo_O_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_O_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_O_TActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_abrirCalc;
    private javax.swing.JComboBox<String> combo_O_T;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
