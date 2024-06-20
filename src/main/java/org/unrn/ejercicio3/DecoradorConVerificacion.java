package org.unrn.ejercicio3;

import java.io.File;

public class DecoradorConVerificacion extends Decorador {

    public DecoradorConVerificacion(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        reporte.export(file);
    }
}
