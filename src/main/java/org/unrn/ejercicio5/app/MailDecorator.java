package org.unrn.ejercicio5.app;

import org.unrn.ejercicio5.mail.Emisor;

import java.time.LocalDate;

public class MailDecorator implements IConcurso {
    private final Emisor emisor;
    private IConcurso concurso;

    public MailDecorator(IConcurso concurso, Emisor emisor) {
        this.concurso = concurso;
        this.emisor = emisor;
    }

    @Override
    public void inscribirParticipante(String nombre, LocalDate fechaInsc) {
        concurso.inscribirParticipante(nombre, fechaInsc);
        enviarMail();
    }

    private void enviarMail() {
        emisor.enviarMail("Se registró correctamente al participante");
    }
}
