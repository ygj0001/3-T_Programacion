

package com.mycompany.proyectofinal;

import java.util.ArrayList;

public class GestorReservas {
    private ArrayList<Reserva> reservas;

    public GestorReservas() {
        reservas = new ArrayList<>();
    }

    public void anadirReserva(Reserva r) throws ConflictoReservaException {
        if (hayConflicto(r)) {
            throw new ConflictoReservaException("Conflicto: La habitación ya está reservada para esa fecha.");
        }
        reservas.add(r);
    }

    public boolean hayConflicto(Reserva r) {
        for (Reserva reservaExistente : reservas) {
            if (reservaExistente.getHabitacion().getNumero() == r.getHabitacion().getNumero()
                    && reservaExistente.getFechaReserva().equals(r.getFechaReserva())) {
                return true;
            }
        }
        return false;
    }

    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas.");
        } else {
            for (Reserva r : reservas) {
                System.out.println(r);
            }
        }
    }
}