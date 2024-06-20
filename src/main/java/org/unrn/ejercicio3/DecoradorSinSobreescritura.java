package org.unrn.ejercicio3;

import java.io.File;

public class DecoradorSinSobreescritura extends Decorador {

    public DecoradorSinSobreescritura(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        reporte.export(file);
    }
}