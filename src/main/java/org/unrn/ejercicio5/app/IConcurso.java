package org.unrn.ejercicio5.app;

import java.time.LocalDate;

public interface IConcurso {
    void inscribirParticipante(String nombre, LocalDate fechaInsc);
}
