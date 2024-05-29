package org.unrn.ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReporteSimple implements Reporte {
    private final String reporte;

    public ReporteSimple(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(reporte);
            writer.close();
            System.out.println("Reporte exportado exitosamente a: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al exportar el reporte: " + e.getMessage());
        }
    }
}