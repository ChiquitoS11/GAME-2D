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
    
    public int width;
    public int height;
    public boolean haciaArriba = false;
    public boolean haciaAbajo = false;
    public boolean haciaIzquierda = false;
    public boolean haciaDerecha = false;
    
    private int velocidadMovimiento = 4;
    private JLabel labelCharacter;
    
    // constructor
    public Personaje(Juego juego, JLabel labelCharacter) {
        this.jg = juego;
        this.labelCharacter = labelCharacter;
//        Sonido saltar = new Sonido(getClass().getResource("/resources/salto.wav"));
//        Sonido bajar = new Sonido(getClass().getResource("/resources/onichan.wav"));
        this.height = labelCharacter.getHeight();
        this.width = labelCharacter.getWidth();
    }
    
    /**
     * Posicion en el plano X de donde esta el personaje
     * @return {@code int}
     */
    public int getX() {
        return labelCharacter.getX();
    }

    /**
     * Posicion en el plano Y de donde esta el personaje
     * @return {@code int}
     */
    public int getY() {
        return labelCharacter.getY();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    
    // metodos
    
    /**
     * mueve el personaje hacia arriba
     */
    public void moverArriba() throws InterruptedException {
        do {
            movimiento(1);
        } while (haciaArriba);
    }
    
    /**
     * mueve el personaje hacia abajo
     */
    public void moverAbajo() {
        do {
            movimiento(2);
        } while (haciaAbajo);
    }
    
    /**
     * mueve el personaje a la izquierda
     */
    public void moverIzquierda() {
        movimiento(3);
    }
    
    /**
     * mueve el personaje a la derecha
     */
    public void moverDerecha() {
        movimiento(4);
    }
    
    /**
     * encargado de realizar el movimiento <P>
     * con un poco de logica, vemos como reposiciona <P>
     * en personaje sumando o restando la velocidad de movimiento <P>
     * @param {@code}
     */
    private void movimiento(int opcion) {
        switch(opcion){
            case 1 -> labelCharacter.setLocation(getX(), (getY() - velocidadMovimiento));
            case 2 -> labelCharacter.setLocation(getX(), (getY() + velocidadMovimiento));
            case 3 -> labelCharacter.setLocation((getX() - velocidadMovimiento), (getY()));
            case 4 -> labelCharacter.setLocation((getX() + velocidadMovimiento), (getY()));
        }
        
        jg.repaint();
    }
}
