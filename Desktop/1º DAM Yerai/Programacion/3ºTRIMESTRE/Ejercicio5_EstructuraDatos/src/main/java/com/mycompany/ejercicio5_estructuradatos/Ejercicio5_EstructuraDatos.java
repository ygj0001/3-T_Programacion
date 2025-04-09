

package com.mycompany.ejercicio5_estructuradatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5_EstructuraDatos {

    public static void main(String[] args) {
        
        ArrayList<String> listaTareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
      

        do{
              try {
            System.out.println("Bienbenido");
            System.out.println("1. añadir tareas");
            System.out.println("2. ver todas las tareas");
            System.out.println("3. eliminar una tarea por numero");
            System.out.println("4. Salir");
            System.out.print("Elija una opción (1-4): ");

          
                opcion = Integer.parseInt(scanner.nextLine());  

                switch (opcion) {
                    case 1:
                        listaTareas.add("Comprar churros");
                        break;

                    case 2:
                        for (int i = 0; i <listaTareas.size(); i++) {
                            System.out.println(listaTareas.get(i));
                        }
                        break;

                    case 3:
                        int numTarea = Integer.parseInt(scanner.nextLine());
                        listaTareas.remove(numTarea);
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

