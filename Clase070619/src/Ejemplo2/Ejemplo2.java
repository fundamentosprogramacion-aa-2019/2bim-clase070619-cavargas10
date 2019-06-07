package Ejemplo2;

import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String[] rangos = {"   0 - 10", "10.1 - 12", "12.1 - 15", "15.1 - 18",
            "18.1 - 20"};
        double[] numCalificaciones = new double[5];
        boolean bandera = true;
        int seguir;
        double calificacion;
        String reporteFinal = "";

        while (bandera == true) {
            System.out.printf("Ingrese una calificacion para clasificarla: ");
            calificacion = entrada.nextDouble();

            if ((calificacion >= 0) && (calificacion <= 10)) {
                numCalificaciones[0] = numCalificaciones[0] + 1;
            } else if ((calificacion >= 10.1) && (calificacion <= 12)) {
                numCalificaciones[1] = numCalificaciones[1] + 1;
            } else if ((calificacion >= 12.1) && (calificacion <= 15)) {
                numCalificaciones[2] = numCalificaciones[2] + 1;
            } else if ((calificacion >= 15.1) && (calificacion <= 18)) {
                numCalificaciones[3] = numCalificaciones[3] + 1;
            } else if ((calificacion >= 18.1) && (calificacion <= 20)) {
                numCalificaciones[4] = numCalificaciones[4] + 1;
            }           

            System.out.printf("Desea salir del ciclo, ingrese el numero '0': ");
            seguir = entrada.nextInt();

            if (seguir == 0) {
                bandera = false;
            }
        }
        
        reporteFinal = String.format("%sREPORTE DE NOTAS\n", reporteFinal);
        
        for (int i = 0; i < numCalificaciones.length; i++) {
                    reporteFinal = String.format("%s %s: %.2f\n", 
                    reporteFinal, rangos[i], numCalificaciones[i]);
        }
        
        System.out.printf("%s\n", reporteFinal);
        
    }
}

/**
 * Taller
 * rangos = {"0 - 10", "10.1 - 12", "12.1 - 15", "15.1 - 18", "18.1 - 20"}
 * numCalificaciones = 5
 * 
 * El usuario ingrasa notas hasta q el quiera
 * Ejemplo: 
 * 11
 * 12
 * 5
 * 7
 * 8
 * 20
 * 
 * RESULTAD QUE TIENE QUE MOSTRAR 
 * -----------------------------
 * 
 * RESUMEN DE NOTAS
 * Rango 0 - 10, numero de notas: 3
 * Rango 10.1 - 12, numero de notas: 2
 * Rango 12.1 - 15, numero de notas: 0
 * Rango 15.1 - 18, numero de notas: 0 
 * Rango 18.1 - 20, numero de notas: 1
 */

