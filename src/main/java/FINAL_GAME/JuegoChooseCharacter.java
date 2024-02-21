/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FINAL_GAME;

import Dependencias.Imagen;

/**
 *
 * @author ChiquitoS11
 */
public class JuegoChooseCharacter extends javax.swing.JFrame {
    
    private byte personajeElegido;
    
    private byte paginaActual = 1;
    private final byte paginaMaxima = 4;

    boolean fotoMenheraX = true;
    private final Imagen monita1 = new Imagen(getClass().getResource("/resources/mashiroWallpaper.gif"));
    private final Imagen monita2 = new Imagen(getClass().getResource("/resources/asd.jpg"));
    private final Imagen monita3 = new Imagen(getClass().getResource("/resources/monitachina3.jpg"));
    private final Imagen monita4 = new Imagen(getClass().getResource("/resources/monitachina4.jpg"));
    
    
    private final Imagen efim = new Imagen(getClass().getResource("/resources/fondoChooseCharacter.gif"));
    
    
    private final Imagen menheraO = new Imagen(getClass().getResource("/resources/menheraO.png"));
    private final Imagen menheraX = new Imagen(getClass().getResource("/resources/menheraX.png"));

    /**
     * Creates new form NewJFrame
     */
    public JuegoChooseCharacter(JuegoMenu jm) {
        
        this.setContentPane(efim);    // efim
        
        
        initComponents();
        ajustesVisuales();
        System.out.println("\n" + paginaActual);
        System.out.println(paginaMaxima);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombrePersonaje = new javax.swing.JFrame();
        AnteriorPersonaje = new javax.swing.JButton();
        SiguientePersonaje = new javax.swing.JButton();
        SeleccionarPersonaje = new javax.swing.JToggleButton();
        imagenes = new javax.swing.JLabel();
        gotoGame = new javax.swing.JButton();

        javax.swing.GroupLayout NombrePersonajeLayout = new javax.swing.GroupLayout(NombrePersonaje.getContentPane());
        NombrePersonaje.getContentPane().setLayout(NombrePersonajeLayout);
        NombrePersonajeLayout.setHorizontalGroup(
            NombrePersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        NombrePersonajeLayout.setVerticalGroup(
            NombrePersonajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AnteriorPersonaje.setText("Anterior");
        AnteriorPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorPersonajeActionPerformed(evt);
            }
        });

        SiguientePersonaje.setText("Siguiente");
        SiguientePersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguientePersonajeActionPerformed(evt);
            }
        });

        SeleccionarPersonaje.setBackground(new java.awt.Color(204, 204, 204));
        SeleccionarPersonaje.setForeground(new java.awt.Color(0, 255, 0));
        SeleccionarPersonaje.setToolTipText("");
        SeleccionarPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarPersonajeActionPerformed(evt);
            }
        });

        imagenes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        gotoGame.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        gotoGame.setText("Continuar");
        gotoGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(AnteriorPersonaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(SeleccionarPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(SiguientePersonaje))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(gotoGame)))
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(imagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SeleccionarPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gotoGame, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AnteriorPersonaje)
                            .addComponent(SiguientePersonaje))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajustesVisuales() {
        // contenedor-img
        imagenes.setIcon(monita1.imgToContainer(imagenes));
        AnteriorPersonaje.setEnabled(false);
        
        // btn seleccionar
        SeleccionarPersonaje.setIcon(menheraX.imgToContainer(SeleccionarPersonaje));
        
        SeleccionarPersonaje.setFocusPainted(false);
        SeleccionarPersonaje.setBorderPainted(false);
        
        SeleccionarPersonaje.setContentAreaFilled(false);


        // btn anterior
        AnteriorPersonaje.setFocusPainted(false);

        // btn siguiente
        SiguientePersonaje.setFocusPainted(false);
        
        // btn gotoGame
        gotoGame.setEnabled(false);
    }


    private void AnteriorPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorPersonajeActionPerformed
        paginaActual--;
        contenedorImg(paginaActual);
        repaint();
        
        
        
        if (1 < paginaActual) {    
            SiguientePersonaje.setEnabled(true);
        } else {    
            AnteriorPersonaje.setEnabled(false);
        }
    }//GEN-LAST:event_AnteriorPersonajeActionPerformed

    private void SiguientePersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguientePersonajeActionPerformed
        paginaActual++;
        contenedorImg(paginaActual);
        repaint();
        
        if (paginaActual < paginaMaxima) {
            AnteriorPersonaje.setEnabled(true);
        } else {
            SiguientePersonaje.setEnabled(false);
        }
    }//GEN-LAST:event_SiguientePersonajeActionPerformed
    
    private void contenedorImg(int paginaActual) {
        switch(paginaActual) {
            case 1 -> imagenes.setIcon(monita1.imgToContainer(imagenes));
            case 2 -> imagenes.setIcon(monita2.imgToContainer(imagenes));
            case 3 -> imagenes.setIcon(monita3.imgToContainer(imagenes));
            case 4 -> imagenes.setIcon(monita4.imgToContainer(imagenes));
        }
    }
    
    private void SeleccionarPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarPersonajeActionPerformed
        if (fotoMenheraX) {
            SeleccionarPersonaje.setIcon(menheraO.imgToContainer(SeleccionarPersonaje));
            gotoGame.setEnabled(true);
            AnteriorPersonaje.setEnabled(false);
            SiguientePersonaje.setEnabled(false);
            
        }
        
        if (!fotoMenheraX) {
            SeleccionarPersonaje.setIcon(menheraX.imgToContainer(SeleccionarPersonaje));
            gotoGame.setEnabled(false);
            
            if (paginaActual == 1) {
                AnteriorPersonaje.setEnabled(false);
            } else {
                AnteriorPersonaje.setEnabled(true);
            }
            
            if (paginaActual == paginaMaxima) {
                SiguientePersonaje.setEnabled(false);
            } else {
                SiguientePersonaje.setEnabled(true);
            }
        }
            
        fotoMenheraX = !fotoMenheraX;
    }//GEN-LAST:event_SeleccionarPersonajeActionPerformed

    private void gotoGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoGameActionPerformed
        
        Juego j = new Juego(this);
        
        j.setVisible(true);
        j.setResizable(false);
        j.setLocationRelativeTo(null);
        
        NombrePersonaje.setVisible(true);
        
    }//GEN-LAST:event_gotoGameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnteriorPersonaje;
    private javax.swing.JFrame NombrePersonaje;
    public javax.swing.JToggleButton SeleccionarPersonaje;
    private javax.swing.JButton SiguientePersonaje;
    private javax.swing.JButton gotoGame;
    private javax.swing.JLabel imagenes;
    // End of variables declaration//GEN-END:variables
}
