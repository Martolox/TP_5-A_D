package org.unrn.ejercicio3;

import java.io.File;

public class ReporteSinSobreescritura implements Reporte {
    private Reporte reporte;

    public ReporteSinSobreescritura(Reporte reporte) {
        this.reporte = reporte;
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