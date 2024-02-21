package Clases;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class RellenarJFrame extends JPanel {
    // metodos
    private Image imagen;
    private String rutaImagen;
    
    // constructor 
    public RellenarJFrame() {
        // Especifica la ruta completa de la imagen
        String rutaCompleta = "C:\\Users\\ChiquitoS11\\Desktop\\GAME-2D\\src\\main\\resources\\isaacFondo.jpg";

        try {
            // Carga la imagen utilizando File
            imagen = new ImageIcon(new File(rutaCompleta).toURI().toURL()).getImage();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    // metodos
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Dibuja la imagen
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}