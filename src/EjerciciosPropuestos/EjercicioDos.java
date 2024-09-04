
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cuantas llantas desea comprar: ");
        int numeroLlantas  = scanner.nextInt();
        
        double precioUnidad = 0;
        
        if (numeroLlantas < 5){
        precioUnidad = 100;}
        
        else if (numeroLlantas >= 5 && numeroLlantas <= 10){
        precioUnidad = 75;}
        
        else if (numeroLlantas > 10){
        precioUnidad = 50;
        }
        
        double precioTotal = numeroLlantas * precioUnidad;
        
        System.out.println("Precio Unidad: U$ " + precioUnidad);
        System.out.println("Precio total: U$ " + precioTotal);
                       
    }
}
