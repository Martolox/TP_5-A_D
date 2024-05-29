package org.unrn.ejercicio3;

import java.io.File;

public class ReporteConVerificacion implements Reporte {
    private Reporte reporte;

    public ReporteConVerificacion(Reporte reporte) {
        this.reporte = reporte;
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
