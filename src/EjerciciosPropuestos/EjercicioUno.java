
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cuantas computadoras desea comprar?: ");
        int numeroComputadores = scanner.nextInt();
        
        double precioUnidad = 500;
        double totalCompra = numeroComputadores * precioUnidad;
        double descuento = 0;
        
                
        if (numeroComputadores < 5){
            descuento = totalCompra * 0.10;}
        
        else if (numeroComputadores >= 5 && numeroComputadores < 10){
            descuento = totalCompra * 0.20;
        }
        
        else if (numeroComputadores >= 10){
            descuento = totalCompra * 0.40;
        }
        
        double totalPagar = totalCompra - descuento;
        
        System.out.println("Total de compra es: U$ " + totalCompra);
        System.out.println("Descuento: U$ " + descuento);
        System.out.println("Precio a pagar: U$ " + totalPagar);
        
        
    }
 
       
    
}
