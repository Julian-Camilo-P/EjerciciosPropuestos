
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el promedio del alumno: ");
        double promedio = scanner.nextDouble();

        System.out.println("Ingrese el tipo de carrera del alumno (1 para tecnologia, 2 para profesional): ");
        int carrera = scanner.nextInt();

        System.out.println("Ingrese el numero de materias reprobadas del alumno (solo para tecnologia): ");
        int materiasReprobadas = scanner.nextInt();

        int creditos = 0;
        double descuento = 0;
        double valorMatricula = 0;

        if (carrera == 1) { // Tecnología
            if (promedio >= 9.5) {
                creditos = 55;
                descuento = 0.25;
                valorMatricula = 18000;
            } else if (promedio >= 9 && promedio < 9.5) {
                creditos = 50;
                descuento = 0.10;
                valorMatricula = 18000;
            } else if (promedio > 7 && promedio < 9) {
                creditos = 50;
                descuento = 0;
                valorMatricula = 18000;
            } else if (promedio <= 7 && materiasReprobadas >= 0 && materiasReprobadas <= 3) {
                creditos = 45;
                descuento = 0;
                valorMatricula = 18000;
            } else if (promedio <= 7 && materiasReprobadas >= 4) {
                creditos = 40;
                descuento = 0;
                valorMatricula = 18000;
            }
        } else if (carrera == 2) { // Profesional
            if (promedio >= 9.5) {
                creditos = 55;
                descuento = 0.20;
                valorMatricula = 30000;
            } else {
                creditos = 55;
                descuento = 0;
                valorMatricula = 30000;
            }
        }

        double totalPagar = (creditos / 5) * valorMatricula * (1 - descuento);

        System.out.println("El total que tendra que pagar el alumno es: $" + totalPagar);
    }
}
