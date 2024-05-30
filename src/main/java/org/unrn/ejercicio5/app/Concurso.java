package org.unrn.ejercicio5.app;

import org.unrn.ejercicio5.registro.RegInscripciones;

import java.time.LocalDate;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

import static java.time.format.DateTimeFormatter.ofLocalizedDate;

public class Concurso implements IConcurso {
    private final String nomConcurso;
    private final LocalDate fechaInicio;
    private final LocalDate fechaCierre;
    private final RegInscripciones regInsc;
    private final List<Participante> participantes = new ArrayList<>();
    private final List<Inscripcion> inscripciones = new ArrayList<>();

    public Concurso(String nomConcurso, LocalDate fechaInicio, LocalDate fechaCierre,
                    RegInscripciones regInsc) {
        this.nomConcurso = nomConcurso;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.regInsc = regInsc;
    }

    @Override
    public void inscribirParticipante(String nombre, LocalDate fechaInsc) {
        verificarInscripcionEnFecha(fechaInsc);
        agregarParticipante(nombre, fechaInsc);
        inscripciones.add(new Inscripcion(nombre, nomConcurso, fechaInsc));
        guardarInscripcion(nombre, nomConcurso, fechaInsc);
    }

    private void verificarInscripcionEnFecha(LocalDate fechaInsc) {
        if (!puedeInscribirse(fechaInsc)) {
            throw new RuntimeException("Inscripción fuera de rango");
        }
    }

    private boolean puedeInscribirse(LocalDate fechaInsc) {
        return (fechaInsc.isBefore(fechaCierre.plusDays(1)) &&
                fechaInsc.isAfter(fechaInicio.minusDays(1)));
    }

    private void agregarParticipante(String nombre, LocalDate fechaInsc) {
        if (esPrimerDia(fechaInsc)) {
            participantes.add(new Participante(nombre, 10));
        } else {
            participantes.add(new Participante(nombre, 0));
        }
    }

    private boolean esPrimerDia(LocalDate fechaInsc) {
        return fechaInsc.isEqual(fechaInicio);
    }

    private void guardarInscripcion(String nombre, String nomConcurso, LocalDate fechaInsc) {
        String texto = fechaInsc.format(ofLocalizedDate(FormatStyle.SHORT)) +
                ", " + nombre + ", " + nomConcurso + "\n";
        regInsc.guardar(texto);
    }

    public boolean isInscripcion(String nombre, LocalDate fechaInsc) {
        for (Inscripcion i : inscripciones) {
            if (i.getNombre().equals(nombre) && i.getFechaInsc().equals(fechaInsc))
                return true;
        }
        return false;
    }

    public int getPuntaje(String nombre) {
        for (Participante p : participantes)
            if (p.getNombre().equals(nombre))
                return p.getScore();
        return -1;
    }

    public boolean isParticipante(String nombre) {
        for (Participante p : participantes)
            if (p.getNombre().equals(nombre)) return true;
        return false;
    }
}

