package org.unrn.ejercicio2;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private final java.util.List<Figura> figuras;

    public Canvas() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        var panel = new AdapterPanel(g2d);
        for (Figura figura : figuras) {
            figura.dibujar(panel);
        }
    }
}
