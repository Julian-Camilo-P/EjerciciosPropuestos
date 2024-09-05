
package POO;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class WhileAndFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean correcto = true;
        while (correcto == true) {
            System.out.print("Ingrese un numero entre 1 y 10: ");

            int numero = scanner.nextInt();
            if (numero > 0 && numero <= 10)
            {
                correcto = false;
                System.out.println("Tabla del " + numero);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + "*" + i + "=" + (numero * i));
                }
            }else {
                    System.out.println("Numero invalido. Intente nuevamente");
                    }

        }
    }
}
