/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo4;

import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class Ejemplo4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] peliculas = {"Comedia", "Terror", "Drama", "Familiar"};
        int[] tipopelis = new int[4];
        boolean bandera = true;
        int seguir;
        int tipoPelicula;
        String reporteFinal = "";
        int contador = 0;

        while (bandera == true) {
            System.out.printf("Ingrese el valor del tipo de pelicula "
                    + "('1' Comedia)('2' Terror)('3' Drama)('4' Familiar): ");
            tipoPelicula = entrada.nextInt();

            if (tipoPelicula == 1) {
                tipopelis[0] = tipopelis[0] + 1;
            } else if (tipoPelicula == 2) {
                tipopelis[1] = tipopelis[1] + 1;
            } else if (tipoPelicula == 3) {
                tipopelis[2] = tipopelis[2] + 1;
            } else if (tipoPelicula == 4) {
                tipopelis[3] = tipopelis[3] + 1;
            } else {
                System.out.printf("ESTE NUMERO ES INCORRECTO!\n");
            }

            System.out.printf("Desea salir del ciclo, ingrese el numero '0': ");
            seguir = entrada.nextInt();

            if (seguir == 0) {
                bandera = false;
            }

        }

        reporteFinal = String.format("\n%sREPORTE DE PREFERENCIA DE PELICULAS"
                + "\n", reporteFinal);

        /**
         * Ciclo para que el resultado salga con asteriscos en lugar de numeros
         *
         */
        for (int i = 0; i < tipopelis.length; i++) {

            int p = tipopelis[i];
            String asteriscos = "";

            for (int x = 0; x < p; x++) {
                asteriscos = String.format("%s*", asteriscos);
            }

            reporteFinal = String.format("%s %s: %s\n", reporteFinal,
                    peliculas[i], asteriscos);

        }

        System.out.printf("%s\n", reporteFinal);

    }
}
