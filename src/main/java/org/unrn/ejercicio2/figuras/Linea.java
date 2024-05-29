package org.unrn.ejercicio2.figuras;

import org.unrn.ejercicio2.Coordenada;
import org.unrn.ejercicio2.Figura;
import org.unrn.ejercicio2.Panel;

public class Linea implements Figura {
    private final Coordenada coordenada;
    private final int longitud;

    public Linea(Coordenada coordenada, int longitud) {
        this.longitud = longitud;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarLinea(coordenada, longitud);
    }
}
