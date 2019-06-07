package Ejemplo1;

import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        double promedio = 0;
        int[] partidos = new int[7];

        // String [] dias = new String[7];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
            "Sábado", "Domingo"};

        // proceso para llenar los datos al arreglo de partidos
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("Número de partidos jugados el día %s\n",
                    dias[i]);
            partidos[i] = entrada.nextInt();
        }

        System.out.println("--------------------------------");

        for (int i = 0; i < dias.length; i++) {
            System.out.printf("Partidos jugados el día %s fue %s\n", dias[i],
                    partidos[i]);

        }

        // proceso para encontrar el promedio de partidos a la semana
        for (int i = 0; i < partidos.length; i++) {
            suma = suma + partidos[i];
        }
        promedio = (double) suma / partidos.length;
        System.out.printf("El promedio de partidos jugados es %.2f\n",
                promedio);

    }
}

/**
 * ARREGLOS (Existen 2 arreglos, por defecto tiene un valor de 0) Partidos
 * (tiene un tamaño de 7) dias (tienes un tamaño de 7, porque ya declara los
 * valores)
 *
 * syst (dia [0], partidos [0])
 */
