package org.unrn.ejercicio2;

import java.awt.*;

public class AdapterPanel implements Panel {
    private Graphics2D g2d;

    public AdapterPanel(Graphics2D g2d) {
        this.g2d = g2d;
    }

    @Override
    public void dibujarCirculo(Coordenada coordenada, int radio) {
        g2d.drawOval(coordenada.x() - radio,
                coordenada.y() - radio,
                radio * 2,
                radio * 2);
    }

    @Override
    public void dibujarLinea(Coordenada coordenada, int longitud) {
        g2d.drawLine(coordenada.x(), coordenada.y(), coordenada.x() + longitud, coordenada.y());
    }

    @Override
    public void dibujarTexto(Coordenada coordenada, String texto) {
        g2d.drawString(texto, coordenada.x(), coordenada.y());
    }
}
