package Clases;

import FINAL_GAME.Juego;

/**
 *
 * @author ChiquitoS11
 */
public class Personaje {

    // atributos
    private Juego juego;
    private int velocidadMovimiento = 5;
    
    // constructor
    public Personaje(Juego juego) {
        this.juego = juego;
//        Sonido saltar = new Sonido(getClass().getResource("/resources/salto.wav"));
//        Sonido bajar = new Sonido(getClass().getResource("/resources/onichan.wav"));

    }
    
    /*
    getX and getY
    una especie de contructor para las coordenadas del Label 
    donde esta el personaje
    */
    public int getX() {
        return juego.personajeLabel.getX();
    }

    public int getY() {
        return juego.personajeLabel.getY();
    }
    
    // metodos
    public void moverArriba() {
        juego.personajeLabel.setLocation(getX(), (getY() - velocidadMovimiento));
    }

    public void moverAbajo() {
        juego.personajeLabel.setLocation(getX(), (getY() + velocidadMovimiento));
    }

    public void moverIzquierda() {
        juego.personajeLabel.setLocation((getX() - velocidadMovimiento), (getY()));
    }

    public void moverDerecha() {
        juego.personajeLabel.setLocation((getX() + velocidadMovimiento), (getY()));
        juego.personajeLabel.repaint();
    }

}
