package com.mycompany.ejercicio7_estructuradatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7_EstructuraDatos {

   static ArrayList<Usuario> usuarios = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
           
            System.out.println("--- Sistema de Login ---");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Mostrar usuarios registrados");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

           
            while (true) {
                try {
                    opcion = Integer.parseInt(scanner.nextLine());
                    break; 
                } catch (NumberFormatException e) {
                    System.out.print("Entrada inválida. Por favor, introduce un número: ");
                }
            }

            switch (opcion) {
                case 1: 
                    System.out.print("Introduce el nombre de usuario: ");
                    String nombreUsuarioRegistro = scanner.nextLine();

                
                    boolean usuarioExiste = false;
                    for (Usuario usuario : usuarios) {
                        if (usuario.nombreUsuario.equals(nombreUsuarioRegistro)) {
                            usuarioExiste = true;
                            break;
                        }
                    }

                    if (usuarioExiste) {
                        System.out.println("El nombre de usuario ya está en uso.");
                    } else {
                        System.out.print("Introduce la contraseña: ");
                        String contrasenaRegistro = scanner.nextLine();
                        usuarios.add(new Usuario(nombreUsuarioRegistro, contrasenaRegistro));
                        System.out.println("Usuario registrado correctamente.");
                    }
                    break;

                case 2: 
                    System.out.print("Introduce el nombre de usuario: ");
                    String nombreUsuarioLogin = scanner.nextLine();
                    System.out.print("Introduce la contraseña: ");
                    String contrasenaLogin = scanner.nextLine();

                    Usuario usuarioEncontrado = null;
                    for (Usuario usuario : usuarios) {
                        if (usuario.nombreUsuario.equals(nombreUsuarioLogin)) {
                            usuarioEncontrado = usuario;
                            break;
                        }
                    }

                    if (usuarioEncontrado != null && usuarioEncontrado.contrasena.equals(contrasenaLogin)) {
                        System.out.println("¡Inicio de sesión correcto!");
                    } else {
                        System.out.println("Nombre de usuario o contraseña incorrectos.");
                    }
                    break;

                case 3: 
                    if (usuarios.isEmpty()) {
                        System.out.println("No hay usuarios registrados.");
                    } else {
                        System.out.println("Usuarios registrados:");
                        for (Usuario usuario : usuarios) {
                            System.out.println("- " + usuario.nombreUsuario);
                        }
                    }
                    break;

                case 4: 
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }

            System.out.println(); 

        } while (opcion != 4); 
    }
}
