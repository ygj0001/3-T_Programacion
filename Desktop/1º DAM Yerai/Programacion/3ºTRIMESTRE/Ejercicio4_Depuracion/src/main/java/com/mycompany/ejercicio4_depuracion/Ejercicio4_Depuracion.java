package com.mycompany.ejercicio4_depuracion;

import java.util.Scanner;

public class Ejercicio4_Depuracion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = new int[5];
        int suma = 0;

        System.out.println("Introduce 5 notas (de 0 a 10):");

        for (int i = 0; i < notas.length; i++) { //Hace una repeticion mas
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
            suma += notas[i];  // ← ¿Qué pasa aquí? El += estaba escrito al reves
        }

        double media = (float)suma / notas.length; //float para que pueda salir decimal

        System.out.println("La media es: " + media);
    }
}
