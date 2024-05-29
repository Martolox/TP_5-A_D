package org.unrn.ejercicio5;

import org.unrn.ejercicio5.mail.Emisor;

public class MockEmisor implements Emisor {
    @Override
    public void enviarMail(String texto) {
        System.out.println("Email enviado satisfactoriamente");
    }
}
