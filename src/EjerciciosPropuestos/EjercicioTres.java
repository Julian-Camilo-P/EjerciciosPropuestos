
package EjerciciosPropuestos;

import java.util.Scanner;

/**
 *
 * @author JULIAN PEÑA 20241221582
 */
public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del reproductor: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Ingrese la marca del reproductor: ");
        String marca = scanner.next();
        
        double descuento = 0;
        
        if (precio >= 500){
            descuento = precio * 0.10;
        }
        
        if (marca.equals("NOSY")){
            descuento = precio * 0.05;
        }
        
        double precioConDescuento = precio - descuento;
        double iva = precioConDescuento * 0.19;
        double precioFinal = precioConDescuento + iva;
        
        System.out.println("Precio original: U$ " + precio);
        System.out.println("Descuento: U$ " + descuento);
        System.out.println("Precio con descuentos: U$ " + precioConDescuento);
        System.out.println("IVA: U$ " + iva);
        System.out.println("Precio final: U$ " + precioFinal);
        
    }
}
