

package com.mycompany.ejercicio1_excepciones;

import java.util.Scanner;

public class Ejercicio1_Excepciones {

public class CalculoMediaClase {
    public static void main(String[] args) {
        // Solicitar el número total de estudiantes
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar el número total de estudiantes
            System.out.print("Ingrese el número total de estudiantes: ");
            int numEstudiantes = scanner.nextInt();
            // Inicializar variables para el cálculo de la media
            int sumaNotas = 0;
            int numNotasValidas = 0;
            // Bucle para ingresar las notas de cada estudiante
            for (int i = 1; i <= numEstudiantes; i++) {
                System.out.print("Ingrese la nota del estudiante " + i + ": ");
                scanner.nextLine();  // Limpiar el buffer del scanner
                String entrada = scanner.nextLine();
                
                try {
                    // Intentar convertir la entrada a número entero
                    int nota = Integer.parseInt(entrada);
                    
                    // Comprobar si la nota está en el rango permitido
                    if (nota < 0 || nota > 10) {
                        throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
                    }
                    
                    // Si la nota es válida, sumar a la media
                    sumaNotas += nota;
                    numNotasValidas++;
                } catch (NumberFormatException e) {
                    System.out.println("Error: La entrada no es un número entero válido.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }   // Calcular y mostrar la media
            if (numNotasValidas > 0) {
                double media = (double) sumaNotas / numNotasValidas;
                System.out.println("La media de las notas válidas es: " + media);
            } else {
                System.out.println("No se han ingresado notas válidas.");
            }
            // Cerrar el scanner
        }
    }
}

}
