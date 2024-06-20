package org.unrn.ejercicio3;

import java.io.File;

public abstract class Decorador implements Reporte {
    protected Reporte reporte;

    public Decorador(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {}
}
