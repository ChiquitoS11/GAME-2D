package FINAL_GAME;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *es
 * @author ChiquitoS11
 */
public class MainFINAL{

    public static void main(String[] args) {
        
        
        
        JuegoMenu jm = new JuegoMenu();
        jm.setVisible(true);
        jm.setResizable(false);
        jm.setLocationRelativeTo(null);
        
        Border bordePersonalizado = BorderFactory.createLineBorder(Color.BLACK, 2);
        jm.getRootPane().setBorder(bordePersonalizado);
        
//        finalTEST ft = new finalTEST();
//        ft.setVisible(true);
//        ft.setFocusable(false);

                
//        Juego juego = new Juego();
//        juego.setVisible(true);
//        juego.setResizable(false);
//        juego.setLocationRelativeTo(null);
    }
}

// java.awt.graphics2d.getbounds.intersects(getbounds());