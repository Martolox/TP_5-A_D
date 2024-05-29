package org.unrn.ejercicio2.figuras;

import org.unrn.ejercicio2.Coordenada;
import org.unrn.ejercicio2.Figura;
import org.unrn.ejercicio2.Panel;

public class Circulo implements Figura {
    private final int radio;
    private final Coordenada coordenada;

    public Circulo(Coordenada coordenada, int radio) {
        this.radio = radio;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarCirculo(coordenada, radio);
    }
}
