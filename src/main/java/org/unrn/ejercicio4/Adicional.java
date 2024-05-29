package org.unrn.ejercicio4;

abstract class Adicional extends Combo {
    protected Combo combo;

    public Adicional(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String mostrarDescripcion() {
        return this.combo.mostrarDescripcion() + " + " + descripcion;
    }

    @Override
    public int mostrarPrecio() {
        return this.combo.mostrarPrecio() + precio;
    }
}
