package org.unrn.ejercicio1;

public class Main {
    public static void main(String[] args) {
        var motorComun = new MotorComun();
        var motorEconomico = new MotorEconomico();
        var motorElectrico = new AdaptadorElectrico();

        motorEconomico.arrancar();
        motorComun.arrancar();
        motorElectrico.arrancar();
    }
}
