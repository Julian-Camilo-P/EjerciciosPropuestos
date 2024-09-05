
package POO;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class Vectores {
    public static void main(String[] args) {
        //Declaración de vectores//
        Scanner scanner = new Scanner(System.in);
     

        //Capturar los datos de 10 notas del curso//
        System.out.println("Cuantos alumnos son?: ");
        int cantAlumnos = scanner.nextInt();
        double[] notas = new double[cantAlumnos];
        //Ciclo para llenar el vector notas//
              for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota # " + (i + 1)+": ");
        notas[i] = scanner.nextDouble();
        }
     //Ciclo para llenar el vector notas//
              for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota # "+(i+1)+": " + notas[i]);
       
        }

    }
}
