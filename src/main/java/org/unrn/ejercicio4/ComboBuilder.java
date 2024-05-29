package org.unrn.ejercicio4;

public class ComboBuilder {
    private Combo combo;

    public ComboBuilder(Combo combo) {
        this.combo = combo;
    }

    public void conTomate() {
        this.combo = new AdicionalTomate(combo);
    }

    public void conPapas() {
        this.combo = new AdicionalPapas(combo);
    }

    public void conCarne() {
        this.combo = new AdicionalCarne(combo);
    }

    public void conQueso() {
        this.combo = new AdicionalQueso(combo);
    }

    public Combo build() {
        return combo;
    }
}
