package org.unrn.ejercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class TestExportacion {
    static final String RUTA_VALIDA = "src/main/resources/archivo.txt";
    private ReporteSimple reporteSimple;

    @BeforeEach
    public void setup() {
        reporteSimple = new ReporteSimple("Texto de prueba...");
    }

    @Test
    public void archivoNulo_DebeDevolverNullPointerEx() {
        assertThrows(NullPointerException.class, () -> reporteSimple.export(null));
    }

    @Test
    public void archivoNulo_DebeDevolverErrorVerificado() {
        var reporteComp = new ReporteConVerificacion(reporteSimple);
        var e = assertThrows(IllegalArgumentException.class, () -> reporteComp.export(null));
        assertEquals("File es NULL; no puedo exportar...", e.getMessage());

        assertDoesNotThrow(() -> reporteComp.export(new File(RUTA_VALIDA)));
    }

    @Test
    public void archivoNuevo_DebeExportarArchivo() {
        File targetFile = new File(RUTA_VALIDA);
        targetFile.delete();
        reporteSimple.export(new File(RUTA_VALIDA));
    }

    @Test
    public void archivoExiste_DebeSobreescribirlo() {
        assertDoesNotThrow(() -> reporteSimple.export(new File(RUTA_VALIDA)));
    }

    @Test
    public void archivoExiste_DebeDevolverError() {
        var reporteComp = new ReporteSinSobreescritura(reporteSimple);
        var e = assertThrows(IllegalArgumentException.class, () -> reporteComp.export(new File(RUTA_VALIDA)));
        assertEquals("El archivo ya existe...", e.getMessage());

        File targetFile = new File(RUTA_VALIDA);
        targetFile.delete();
        assertDoesNotThrow(() -> reporteComp.export(new File(RUTA_VALIDA)));
    }
}
