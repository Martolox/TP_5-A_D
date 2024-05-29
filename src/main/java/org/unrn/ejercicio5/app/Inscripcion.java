package org.unrn.ejercicio5.app;

import java.time.LocalDate;


public class Inscripcion {
    private final String nombre;
    private final String nomConcurso;
    private final LocalDate fechaInsc;

    public Inscripcion(String nombre, String nomConcurso, LocalDate fechaInsc) {
        this.nombre = nombre;
        this.nomConcurso = nomConcurso;
        this.fechaInsc = fechaInsc;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInsc() {
        return fechaInsc;
    }
}
