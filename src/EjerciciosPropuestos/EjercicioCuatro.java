
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de kilos de manzanas que desea comprar: ");
        double kilosManzanas = scanner.nextDouble();

        double precioUnitario = 100; // precio unitario por kilo de manzanas
        double descuento = 0;

        if (kilosManzanas <= 2) {
            descuento = 0;
        } else if (kilosManzanas > 2 && kilosManzanas <= 5) {
            descuento = precioUnitario * kilosManzanas * 0.10;
        } else if (kilosManzanas > 5 && kilosManzanas <= 10) {
            descuento = precioUnitario * kilosManzanas * 0.15;
        } else if (kilosManzanas > 10) {
            descuento = precioUnitario * kilosManzanas * 0.20;
        }

        double precioConDescuento = precioUnitario * kilosManzanas - descuento;

        System.out.println("Precio original: U$" + precioUnitario * kilosManzanas);
        System.out.println("Descuento: U$" + descuento);
        System.out.println("Precio con descuento: U$" + precioConDescuento);
    }
}
