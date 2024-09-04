
package EjerciciosPropuestos;

import java.util.Scanner;
/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioDiez {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de horas trabajadas por el obrero:");
        int horasTrabajadas = scanner.nextInt();
        
        double salario = 0;
        
        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 5000;
        } else {
            salario = 40 * 5000; // pago por las primeras 40 horas
            int horasExtra = horasTrabajadas - 40;
            double pagoHorasExtra = horasExtra * 5000 * 1.20; // aumento del 20% por hora extra
            salario += pagoHorasExtra;
        }

        System.out.println("El salario semanal del obrero es: $" + salario);
    }
}
