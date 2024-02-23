package Clases;

import FINAL_GAME.Juego;
import javax.swing.JLabel;

/**
 *
 * @author ChiquitoS11
 */
public class Personaje {

    // atributos
    private final Juego jg;
    private int velocidadMovimiento = 5;
    private JLabel test;
    
    // constructor
    public Personaje(Juego juego, JLabel test) {
        this.jg = juego;
        this.test = test;
//        Sonido saltar = new Sonido(getClass().getResource("/resources/salto.wav"));
//        Sonido bajar = new Sonido(getClass().getResource("/resources/onichan.wav"));

    }
    
    /*
    getX and getY
    una especie de contructor para las coordenadas del Label 
    donde esta el personaje
    */
    public int getX() {
        
        return test.getX();
    }

    public int getY() {
        return test.getY();
    }
    
    // metodos
    public void moverArriba() {
        test.setLocation(getX(), (getY() - velocidadMovimiento));
        jg.repaint();
    }

    public void moverAbajo() {
        test.setLocation(getX(), (getY() + velocidadMovimiento));
        jg.repaint();
    }

    public void moverIzquierda() {
        test.setLocation((getX() - velocidadMovimiento), (getY()));
        jg.repaint();
    }

    public void moverDerecha() {
        test.setLocation((getX() + velocidadMovimiento), (getY()));
        jg.repaint();
    }
    
}
