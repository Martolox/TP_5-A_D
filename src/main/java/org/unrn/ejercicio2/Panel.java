package org.unrn.ejercicio2;

public interface Panel {
    void dibujarCirculo(Coordenada coordenada, int radio);

    void dibujarLinea(Coordenada coordenada, int longitud);

    void dibujarTexto(Coordenada coordenada, String texto);
}
