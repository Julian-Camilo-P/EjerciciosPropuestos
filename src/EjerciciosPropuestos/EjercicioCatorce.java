
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioCatorce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de carro:");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");

        int tipoCarro = scanner.nextInt();

        String tipoCarroSeleccionado = "";
        switch (tipoCarro) {
            case 1:
                tipoCarroSeleccionado = "Auto";
                break;
            case 2:
                tipoCarroSeleccionado = "SUV";
                break;
            case 3:
                tipoCarroSeleccionado = "Camioneta";
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        System.out.println("Seleccione el color:");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");

        int color = scanner.nextInt();

        String colorSeleccionado = "";
        switch (color) {
            case 1:
                colorSeleccionado = "Negro";
                break;
            case 2:
                colorSeleccionado = "Blanco";
                break;
            case 3:
                colorSeleccionado = "Rojo";
                break;
            default:
                System.out.println("Opción no valida");
                return;
        }

        System.out.println("La seleccion realizada es: " + tipoCarroSeleccionado + " de color " + colorSeleccionado);
    }
}
