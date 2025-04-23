
package com.mycompany.ejercicio6_estructuradatos;

import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio6_EstructuraDatos {

    public static void main(String[] args) {
        HashMap<String, Integer> listaContactos = new HashMap<>();
        
          Scanner scanner = new Scanner(System.in);

        int opcion = 0;
      

        do{
              try {
            System.out.println("Bienbenido");
            System.out.println("1. Añadir un contacto");
            System.out.println("2. Consultar el numero");
            System.out.println("3. Mostrar Todos los contactos");
            System.out.println("4. Eliminar un contacto");
            System.out.println("5. Salir del programa  ");
            System.out.print("Elija una opción (1-4): ");

          
                opcion = Integer.parseInt(scanner.nextLine());  

                switch (opcion) {
                    case 1:
                        
                        break;

                    case 2:
                      
                        break;

                    case 3:
                        
                        break;

                    case 4:
                        System.out.println("Saliendo del programa");
                        break;

                    default:
                        System.out.println("Opción no válida, por favor elija una opción entre 1 y 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ese dato no es numerico");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No se puede borrar esa tarea");
            }  catch (Exception e) {
                System.out.println("Error desconocido: " + e.getMessage());
            }
        } while(opcion !=4);
        
        scanner.close();  
    }
    }

