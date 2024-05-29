package org.unrn.ejercicio4;

public abstract class Combo {
    protected String descripcion = "...";
    protected int precio = 0;

    public String mostrarDescripcion() {
        return descripcion;
    }

    public int mostrarPrecio() {
        return precio;
    }
}
