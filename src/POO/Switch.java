
package POO;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Switch {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Areas");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.println("4. Trapecio");
        System.out.println("5. Salir");
        System.out.println("Seleccione una opcion");
        op=sc.nextInt();
       /* if(op==1){
            System.out.println("Opción área rectángulo");
        }
        else if(op==2){
            System.out.println("Opción área triángulo");
        }
    }
*/
       switch(op){
           case 1:
               System.out.println("Opción area rectangulo");
               double lado1, lado2;
               System.out.println("Ingrese el valor de un lado");
               lado1=sc.nextInt();
               System.out.println("Ingrese el valor del otro lado");
               lado2=sc.nextInt();
               double area=lado1*lado2;
               System.out.println("El area del rectangulo es: "+area);
               break;
           case 2:
               System.out.println("Opcion area triangulo");
               double base1, altura1;
               System.out.println("Ingrese el valor de la base");
               base1=sc.nextInt();
               System.out.println("Ingrese el valor de la altura");
               altura1=sc.nextInt();
               double area1=(base1*altura1)/2;
               System.out.println("El area del triangulo es: "+area1);
               break;
           case 3:
               System.out.println("Opcion area circulo");
               double radio1;
               System.out.println("Ingrese el valor del radio");
               radio1=sc.nextInt();
               double area2=(radio1*radio1)*Math.PI;
               System.out.println("El area del circulo es: "+area2);
               break;
            case 4:
               System.out.println("Opcion area trapecio");
               double baseM, baseMenor, altura;
               System.out.println("Ingrese el valor de la base mayor");
               baseM = sc.nextDouble();
               System.out.println("Ingrese el valor de la base menor");
               baseMenor = sc.nextDouble();
               System.out.println("Ingrese el valor de la altura");
               altura = sc.nextDouble();
               double areaTrapecio = ((baseM + baseMenor) / 2) * altura;
               System.out.println("El area del trapecio es: " + areaTrapecio);
               break;
            case 5:
                System.out.println("Salida...");
                break;
            default:
                System.out.println("Opcion equivocada!");
           
}
    }}
    

