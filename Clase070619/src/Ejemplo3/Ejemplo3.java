/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo3;

import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class Ejemplo3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] vocales = {"A", "E", "I", "O", "U"};
        int[] contador = new int[5];
        String palabra = "";
        int seguir;
        boolean bandera = true;
        String reporteFinal = "";

        while (bandera == true) {
            System.out.printf("Ingrese una Palabra: ");
            palabra = entrada.nextLine();

            char vocalp = palabra.charAt(0);

            switch (vocalp) {
                case 'a':
                case 'A':
                    contador[0] = contador[0] + 1;
                    break;

                case 'e':
                case 'E':
                    contador[1] = contador[1] + 1;
                    break;

                case 'i':
                case 'I':
                    contador[2] = contador[2] + 1;
                    break;

                case 'o':
                case 'O':
                    contador[3] = contador[3] + 1;
                    break;

                case 'u':
                case 'U':
                    contador[4] = contador[4] + 1;
                    break;

                default:
                    System.out.printf("LA PALABRA COMIENZA COMO CONSONANTE "
                            + ", NO CONTABILIZA\n");
            }

            System.out.printf("Desea salir del ciclo, ingrese el número 0: ");
            seguir = entrada.nextInt();

            if (seguir == 0) {
                bandera = false;
            }

            entrada.nextLine();

        }

        reporteFinal = String.format("\n%sREPORTE DE NOTAS\n", reporteFinal);

        for (int i = 0; i < contador.length; i++) {
            reporteFinal = String.format("%s VOCAL %s - NUMERO DE VECES USADA:"
                    + " %s\n", reporteFinal, vocales[i], contador[i]);
        }
        System.out.printf("%s\n", reporteFinal);
    }
}
//GENERAR UN PROGRAMA QUE PERMITA DETERMINAR EL NUMERO DE VOCALES 
//UTILIZADAS POR UN USUARIO, EN UN CONJUNTO DE PALBARAS
//DE ACUERDO AL PRIMER CARACTER

//VOCAL a - NUMERO DE VECES USASDA: ?
//VOCAL e - NUMERO DE VECES USASDA: ?
//VOCAL i - NUMERO DE VECES USASDA: ?
//VOCAL o - NUMERO DE VECES USASDA: ?
//VOCAL u - NUMERO DE VECES USASDA: ?

