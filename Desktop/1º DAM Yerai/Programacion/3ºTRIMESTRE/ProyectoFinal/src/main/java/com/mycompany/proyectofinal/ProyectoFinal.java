

package com.mycompany.proyectofinal;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ProyectoFinal {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        GestorReservas gestor = new GestorReservas();

        // Habitaciones
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(new Habitacion(101, "individual"));
        habitaciones.add(new Habitacion(102, "doble"));
        habitaciones.add(new Habitacion(201, "suite"));

        // Clientes
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Ana", "12345678A"));
        clientes.add(new Cliente("Luis", "87654321B"));

        try {
            System.out.println("--- Realizar nueva reserva ---");
            System.out.print("Nombre del cliente: ");
            String nombre = sc.nextLine();
            System.out.print("DNI del cliente: ");
            String dni = sc.nextLine();
            Cliente nuevoCliente = new Cliente(nombre, dni);

            System.out.println("Habitaciones disponibles:");
            for (Habitacion h : habitaciones) {
                System.out.println(h.getNumero() + ": " + h.getTipo());
            }

            System.out.print("Número de habitación: ");
            int numHabitacion = sc.nextInt();
            sc.nextLine(); 

            Habitacion habitacionElegida = null;
            for (Habitacion h : habitaciones) {
                if (h.getNumero() == numHabitacion) {
                    habitacionElegida = h;
                    break;
                }
            }

            if (habitacionElegida == null) {
                System.out.println("Habitación no encontrada.");
                return;
            }

            System.out.print("Fecha de reserva (yyyy-MM-dd): ");
            String fechaTexto = sc.nextLine();
            LocalDate fechaReserva = LocalDate.parse(fechaTexto);

            Reserva nuevaReserva = new Reserva(nuevoCliente, habitacionElegida, fechaReserva);
            gestor.anadirReserva(nuevaReserva);

            System.out.println("Reserva añadida correctamente.");
            System.out.println();
            gestor.mostrarReservas();

        } catch (DateTimeParseException e) {
            System.out.println("Error en el formato de la fecha. Usa yyyy-MM-dd.");
        } catch (InputMismatchException e) {
            System.out.println("Error de entrada de datos.");
        } catch (ConflictoReservaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}

