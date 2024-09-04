
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioOnce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto total de la compra: ");
        double montoTotal = scanner.nextDouble();

        double inversionPropia = 0;
        double prestamoBanco = 0;
        double creditoFabricante = 0;
        double intereses = 0;

        if (montoTotal > 500000) {
            inversionPropia = montoTotal * 0.55;
            prestamoBanco = montoTotal * 0.30;
            creditoFabricante = montoTotal * 0.15;
            intereses = creditoFabricante * 0.20;
        } else {
            inversionPropia = montoTotal * 0.70;
            creditoFabricante = montoTotal * 0.30;
            intereses = creditoFabricante * 0.20;
        }

        System.out.println("Inversion propia: $" + inversionPropia);
        System.out.println("Prestamo al banco: $" + prestamoBanco);
        System.out.println("Credito al fabricante: $" + creditoFabricante);
        System.out.println("Intereses: $" + intereses);
    }
}