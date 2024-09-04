
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioTrece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su genero (H/M): ");
        String genero = scanner.nextLine().toUpperCase();

        System.out.println("Ingrese el numero de la bolita: ");
        int numeroBolita = scanner.nextInt();

        String premio = "";

        switch (genero) {
            case "H":
                switch (numeroBolita) {
                    case 1:
                        premio = "Desodorante";
                        break;
                    case 2:
                        premio = "Six-Pack de cerveza";
                        break;
                    case 3:
                        premio = "Camiseta";
                        break;
                    case 4:
                        premio = "Pantaloneta";
                        break;
                    case 5:
                        premio = "Sudadera";
                        break;
                    default:
                        premio = "No hay premio";
                        break;
                }
                break;
            case "M":
                switch (numeroBolita) {
                    case 1:
                        premio = "Lociun";
                        break;
                    case 2:
                        premio = "Bikini";
                        break;
                    case 3:
                        premio = "Crema para la cara";
                        break;
                    case 4:
                        premio = "Plancha para el cabello";
                        break;
                    case 5:
                        premio = "Esmalte de uñas";
                        break;
                    default:
                        premio = "No hay premio";
                        break;
                }
                break;
            default:
                premio = "No hay premio";
                break;
        }

        System.out.println("Su premio es: " + premio);
    }
}
