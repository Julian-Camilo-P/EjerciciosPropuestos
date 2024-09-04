
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioCinco {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el saldo actual de la empresa: ");
        double saldoActual = scanner.nextDouble();

        double saldoNuevo = 0;
        double prestamo = 0;

        if (saldoActual < 0) {
            saldoNuevo = 10000;
            prestamo = saldoNuevo - saldoActual;
        } else if (saldoActual > 0 && saldoActual < 20000) {
            saldoNuevo = 20000;
            prestamo = saldoNuevo - saldoActual;
        } else {
            saldoNuevo = saldoActual;
        }

        double presupuesto = saldoNuevo;
        double equipoComputo = 5000;
        double mobiliario = 2000;
        double resto = presupuesto - equipoComputo - mobiliario;
        double insumos = resto / 2;
        double incentivos = resto / 2;

        System.out.println("Saldo actual: U$" + saldoActual);
        System.out.println("Saldo nuevo: U$" + saldoNuevo);
        if (prestamo > 0) {
            System.out.println("Prestamo bancario: U$" + prestamo);
        }
        System.out.println("Presupuesto para equipo de computo: U$" + equipoComputo);
        System.out.println("Presupuesto para mobiliario: U$" + mobiliario);
        System.out.println("Presupuesto para insumos: U$" + insumos);
        System.out.println("Presupuesto para incentivos al personal: U$" + incentivos);
    }
}
