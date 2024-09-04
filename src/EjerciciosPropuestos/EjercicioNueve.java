
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el salario mensual del trabajador: ");
        double salarioMensual = scanner.nextDouble();

        System.out.println("Ingrese la antiguedad del trabajador en la empresa (en años): ");
        int antiguedad = scanner.nextInt();

        double utilidad = 0;

        if (antiguedad < 1) {
            utilidad = salarioMensual * 0.05;
        } else if (antiguedad >= 1 && antiguedad < 2) {
            utilidad = salarioMensual * 0.07;
        } else if (antiguedad >= 2 && antiguedad < 5) {
            utilidad = salarioMensual * 0.10;
        } else if (antiguedad >= 5 && antiguedad < 10) {
            utilidad = salarioMensual * 0.15;
        } else if (antiguedad >= 10) {
            utilidad = salarioMensual * 0.20;
        }

        System.out.println("La utilidad anual del trabajador es: $" + utilidad);
    }
}
