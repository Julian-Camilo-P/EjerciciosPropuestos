
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona (en años): ");
        double edad = scanner.nextDouble();

        System.out.println("Ingrese el sexo de la persona (1 para hombre, 2 para mujer): ");
        int sexo = scanner.nextInt();

        System.out.println("Ingrese el nivel de hemoglobina de la persona (en g%): ");
        double hemoglobina = scanner.nextDouble();

        boolean anemia = false;

        if (edad <= 0.08) { // 0 - 1 mes
            if (hemoglobina < 13 || hemoglobina > 26) {
                anemia = true;
            }
        } else if (edad > 0.08 && edad <= 0.5) { // > 1 y <= 6 meses
            if (hemoglobina < 10 || hemoglobina > 18) {
                anemia = true;
            }
        } else if (edad > 0.5 && edad <= 1) { // > 6 y <= 12 meses
            if (hemoglobina < 11 || hemoglobina > 15) {
                anemia = true;
            }
        } else if (edad > 1 && edad <= 5) { // > 1 y <= 5 años
            if (hemoglobina < 11.5 || hemoglobina > 15) {
                anemia = true;
            }
        } else if (edad > 5 && edad <= 10) { // > 5 y <= 10 años
            if (hemoglobina < 12.6 || hemoglobina > 15.5) {
                anemia = true;
            }
        } else if (edad > 10 && edad <= 15) { // > 10 y <= 15 años
            if (hemoglobina < 13 || hemoglobina > 15.5) {
                anemia = true;
            }
        } else if (sexo == 2) { // Mujeres > 15 años
            if (hemoglobina < 12 || hemoglobina > 16) {
                anemia = true;
            }
        } else if (sexo == 1) { // Hombres > 15 años
            if (hemoglobina < 14 || hemoglobina > 18) {
                anemia = true;
            }
        }

        if (anemia) {
            System.out.println("La persona tiene anemia.");
        } else {
            System.out.println("La persona no tiene anemia.");
        }
    }
}
