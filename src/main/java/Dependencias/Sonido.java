package Dependencias;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Sonido{

    // atributos
    private Clip musica;
    private URL rutaMusica;
    
    // constructor
    public Sonido(URL rutaMusica) {
        this.rutaMusica = rutaMusica;
        this.musica = convertirClip();
    }
    
    // metodos
    private Clip convertirClip() {
        Clip convertir = null;
        
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(rutaMusica);
            convertir = AudioSystem.getClip();
            convertir.open(audioInputStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
        
        return convertir;
    }
    
    public void reproducirAudio() {
            if (musica.isRunning()) {
                musica.stop();
            }
            musica.setFramePosition(0);
            musica.start();
    }
    
    public void pararAudio(){
        musica.stop();
    }
}
