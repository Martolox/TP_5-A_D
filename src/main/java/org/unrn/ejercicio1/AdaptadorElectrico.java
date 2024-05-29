package org.unrn.ejercicio1;

public class AdaptadorElectrico implements Motor {

    private final MotorElectrico motorElectrico = new MotorElectrico();

    @Override
    public void arrancar() {
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        motorElectrico.detener();
    }
}
