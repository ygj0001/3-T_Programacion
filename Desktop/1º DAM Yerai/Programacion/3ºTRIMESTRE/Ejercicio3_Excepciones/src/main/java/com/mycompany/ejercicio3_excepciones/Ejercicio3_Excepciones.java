/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3_excepciones;

import java.util.Scanner;
public class Ejercicio3_Excepciones {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

       
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez");
        
        int opcion;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Bienvenido al sistema bancario de " + cuenta.getTitular());
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción (1-4): ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());  

                switch (opcion) {
                    case 1:
                        // Ingresar dinero
                        System.out.print("Introduzca la cantidad a ingresar: ");
                        double cantidadIngreso = Double.parseDouble(scanner.nextLine());
                        cuenta.ingresar(cantidadIngreso);
                        break;

                    case 2:
                        // Retirar dinero
                        System.out.print("Introduzca la cantidad a retirar: ");
                        double cantidadRetiro = Double.parseDouble(scanner.nextLine());
                        cuenta.retirar(cantidadRetiro);
                        break;

                    case 3:
                        // Consultar saldo
                        cuenta.consultarSaldo();
                        break;

                    case 4:
                        System.out.println("Saliendo del sistema bancario.");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida, por favor elija una opción entre 1 y 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (SaldoInsuficienteException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error desconocido: " + e.getMessage());
            }
        }
        
        scanner.close();  
    }
    }

