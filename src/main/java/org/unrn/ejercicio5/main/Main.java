package org.unrn.ejercicio5.main;

import org.unrn.ejercicio5.app.Concurso;
import org.unrn.ejercicio5.app.MailDecorator;
import org.unrn.ejercicio5.mail.Emisor;
import org.unrn.ejercicio5.mail.EmisorDeMail;
import org.unrn.ejercicio5.registro.RegEnDisco;
import org.unrn.ejercicio5.registro.RegInscripciones;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RegInscripciones regInsc = new RegEnDisco();
        Emisor emisor = new EmisorDeMail();
        Concurso c = new Concurso("Concurso 1",
                LocalDate.now().minusDays(1),
                LocalDate.now().plusDays(10),
                regInsc);

        // Borrar archivo si existe
        regInsc.vaciar("output.txt");

        // Registrar sin enviar mail
        c.inscribirParticipante("Juan", LocalDate.now());
        c.inscribirParticipante("Lucas", LocalDate.now().minusDays(1));

        // Registrar enviando mail
        var m = new MailDecorator(c, emisor);
        m.inscribirParticipante("Pedro", LocalDate.now());
    }
}