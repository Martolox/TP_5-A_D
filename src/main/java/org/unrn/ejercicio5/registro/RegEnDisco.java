package org.unrn.ejercicio5.registro;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class RegEnDisco implements RegInscripciones {
    private static OutputStream archivo;

    public void guardar(String texto) {
        try {
            archivo = new FileOutputStream("output.txt", true);
            archivo.write(texto.getBytes());
            archivo.close();
        } catch (IOException e) {
            throw new RuntimeException("Problema al guardar archivo");
        }
    }

    public void vaciar(String nomArchivo) {
        try {
            archivo = new FileOutputStream(nomArchivo);
            archivo.flush();
            archivo.close();
        } catch (IOException e) {
            throw new RuntimeException("Problema al vaciar archivo");
        }
    }
}
