package org.unrn.ejercicio2.figuras;

import org.unrn.ejercicio2.Coordenada;
import org.unrn.ejercicio2.Figura;
import org.unrn.ejercicio2.Panel;

public class Texto implements Figura {
    private final Coordenada coordenada;
    private final String texto;

    public Texto(Coordenada coordenada, String texto) {
        this.texto = texto;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarTexto(coordenada, texto);
    }
}
