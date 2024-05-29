package org.unrn.ejercicio1;

public class MotorComun implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Se arranca");
    }

    @Override
    public void acelerar() {
        System.out.println("Se acelera");
    }

    @Override
    public void apagar() {
        System.out.println("Se apaga");
    }
}
