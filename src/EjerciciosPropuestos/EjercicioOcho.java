
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la antiguedad en el empleo de la persona (en años): ");
        int antiguedad = scanner.nextInt();

        String tipoJubilacion = "";

        if (edad >= 60 && antiguedad < 25) {
            tipoJubilacion = "por edad";
        } else if (edad < 60 && antiguedad >= 25) {
            tipoJubilacion = "por antiguedad joven";
        } else if (edad >= 60 && antiguedad >= 25) {
            tipoJubilacion = "por antiguedad adulta";
        } else {
            tipoJubilacion = "No cumple con los requisitos para jubilarse";
        }

        System.out.println("La persona se jubilara " + tipoJubilacion);
    }
}
