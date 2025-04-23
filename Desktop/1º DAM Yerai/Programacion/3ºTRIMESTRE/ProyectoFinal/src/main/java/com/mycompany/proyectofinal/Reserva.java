
package com.mycompany.proyectofinal;

import java.time.LocalDate;


public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fecha;

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fecha) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Reserva de " + cliente + " - " + habitacion + " - Fecha: " + fecha;
    }

    Object getFechaReserva() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
