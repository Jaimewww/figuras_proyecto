/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.F_Soledad;
import javax.swing.UIManager;
import fonts.Fonts;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import utiles.MusicLoader;
import utiles.Utiles;
import javax.swing.*;
/**
 *
 * @author JAIMEUNL
 */
public class Main_Frame extends javax.swing.JFrame {
    Fonts tipoFuente = new Fonts();
    /**
     * Creates new form Main_Frame
     */
    public Main_Frame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_mute = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clippy_Panel = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        main_MenuPanel = new javax.swing.JPanel();
        btn_iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_mute.setText("🔇");
        btn_mute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_muteActionPerformed(evt);
            }
        });

        jLabel1.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 35));
        jLabel1.setText("Area70.java");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_mute, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mute, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/clippy.png"))); // NOI18N
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 106, 100));

        clippy_Panel.setEditable(false);
        clippy_Panel.setColumns(20);
        clippy_Panel.setRows(5);
        clippy_Panel.setText("Hola, soy Clippy, bienvenido a Area70.Java. !Este es un programa para calcular el área de\n70 figuras geométricas!\n¿Que tal si empezamos? Puedes darle click al botón de Iniciar ;)");
        jScrollPane1.setViewportView(clippy_Panel);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 490, 73));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 93, 608, 10));

        main_MenuPanel.setBackground(new java.awt.Color(255, 255, 255));

        btn_iniciar.setText("INICIAR");
        btn_iniciar.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 30));
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_MenuPanelLayout = new javax.swing.GroupLayout(main_MenuPanel);
        main_MenuPanel.setLayout(main_MenuPanelLayout);
        main_MenuPanelLayout.setHorizontalGroup(
            main_MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_MenuPanelLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(btn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        main_MenuPanelLayout.setVerticalGroup(
            main_MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_MenuPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        bg.add(main_MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 610, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        // TODO add your handling code here:
        //dispose();
        
        //Menu_Frame menu_Frame = new Menu_Frame();
        //musicLoader.detenerMusica();
        //menu_Frame.setVisible(true);
        Menu_Figuras menu_Figuras = new Menu_Figuras();
        showPanel(main_MenuPanel, menu_Figuras);
        clippy_Panel.setText("Muy bien, aquí puedes escoger entre figuras bidimensionales y tridimensionales");
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_muteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_muteActionPerformed
        // TODO add your handling code here:
        if(btn_mute.isSelected()){
            MusicLoader.detenerMusica();    
        }else{
            MusicLoader.bucleMusica("src/resources/music_background.wav");
        }
        
    }//GEN-LAST:event_btn_muteActionPerformed

    public static void showPanel(JPanel elim, JPanel p) {
        if (elim == null || p == null) {
            throw new IllegalArgumentException("Los paneles no pueden ser nulos");
        }

        SwingUtilities.invokeLater(() -> {
            elim.removeAll();

            if (!(elim.getLayout() instanceof BorderLayout)) {
                elim.setLayout(new BorderLayout());
            }

            elim.add(p, BorderLayout.CENTER);

            elim.revalidate();
            elim.repaint();

            p.revalidate();
            p.repaint();
        });
    }
    
    public void setClippyText(String text){
        clippy_Panel.setText(text);
        
    }
    
    /**
     * @param args the command line arguments
     */
    


    public static void main(String[] args) {
        // Configurar Windows Classic Look and Feel
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Crear y mostrar el formulario
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Frame().setVisible(true);
            }
        });

        // Cargar música de fondo
        try {
            MusicLoader.bucleMusica("src/resources/music_background.wav");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JToggleButton btn_mute;
    private javax.swing.JTextArea clippy_Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel main_MenuPanel;
    // End of variables declaration//GEN-END:variables

}
