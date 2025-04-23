

package com.mycompany.proyectofinal;


public class Habitacion {
    private int numero;
    private String tipo;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Habitación " + numero + " - Tipo: " + tipo;
    }
}
