package org.unrn.ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCombos {
    @Test
    public void comboBasico() {
        Combo combo = new ComboBasico();
        assertEquals("Combo básico", combo.mostrarDescripcion());
        assertEquals(100, combo.mostrarPrecio());
    }

    @Test
    public void comboBasicoConTomate() {
        Combo combo = new ComboBasico();
        Combo adicional = new AdicionalTomate(combo);
        assertEquals("Combo básico + Tomate", adicional.mostrarDescripcion());
        assertEquals(110, adicional.mostrarPrecio());
    }

    @Test
    public void comboBasicoConTomateYPapas() {
        Combo combo = new ComboBasico();
        Combo adicional = new AdicionalTomate(combo);
        Combo adicional2 = new AdicionalPapas(adicional);
        assertEquals("Combo básico + Tomate + Papas", adicional2.mostrarDescripcion());
        assertEquals(130, adicional2.mostrarPrecio());
    }

    @Test
    public void comboBasicoConTomateYTomate() {
        Combo combo = new ComboBasico();
        Combo adicional = new AdicionalTomate(combo);
        Combo adicional2 = new AdicionalTomate(adicional);
        assertEquals("Combo básico + Tomate + Tomate", adicional2.mostrarDescripcion());
        assertEquals(120, adicional2.mostrarPrecio());
    }

    @Test
    public void builder() {
        var builder = new ComboBuilder(new ComboBasico());
        builder.conTomate();
        builder.conPapas();
        var resultado = builder.build();

        assertEquals("Combo básico + Tomate + Papas", resultado.mostrarDescripcion());
        assertEquals(130, resultado.mostrarPrecio());
    }
}
