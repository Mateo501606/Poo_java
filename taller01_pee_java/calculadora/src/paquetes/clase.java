
package paquetes;
import java.util.Scanner

public class clase {

   
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu de operaciones:");
            System.out.println("1  Suma");
            System.out.println("2  Resta");
            System.out.println("3  Multiplicacion");
            System.out.println("4  Division");
            System.out.println("5  Modulo (resto)");
            System.out.println("6  Cuadrado de un numero");
            System.out.println("7  Raiz cuadrada");
            System.out.println("8  Potencia (base^exponente)");
            System.out.println("9  Porcentaje (parte de un total)");
            System.out.println("10  Numero aleatorio (0.0‑1.0)");
            System.out.println("0  Salir");
            System.out.print("Seleccione opcion (del 0 al 10): ");
           
            while (!sc.hasNextInt()) {
                System.out.print("Debe digitar un numero entre 0 y 10: ");
                sc.next();
            }
            opcion = sc.nextInt();
           
            if (opcion < 0 || opcion > 10) {
                System.out.println("Opción invalida. Intentalo de nuevo.");
                continue;
            }
           
            double a, b, resultado;
            switch (opcion) {
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                case 1:
                    System.out.print("Primer sumando: "); a = sc.nextDouble();
                    System.out.print("Segundo sumando: "); b = sc.nextDouble();
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.print("Minuendo: "); a = sc.nextDouble();
                    System.out.print("Sustraendo: "); b = sc.nextDouble();
                    System.out.println("Resultado: " + (a - b));
                    break;
                case 3:
                    Scanner leer = new Scanner (System.in);
        int num1, num2, res=0;
       
        System.out.println("Digite el primer numero");
        num1 = leer.nextInt();
        System.out.println("Digite el segundo numero numero");
        num2 = leer.nextInt();
       
       
        res= num1 * num2;
       
        System.out.println("El producto del numero 1 y numero dos es:"+res);
                    break;
                case 4:
                    System.out.print("Dividendo: "); a = sc.nextDouble();
                    System.out.print("Divisor: "); b = sc.nextDouble();
                    if (b == 0) System.out.println("Error: division por cero no permitida.");
                    else System.out.println("Resultado: " + (a / b));
                    break;
                case 5:
                    System.out.print("Operación modulo — dividendo: "); a = sc.nextDouble();
                    System.out.print("Divisor: "); b = sc.nextDouble();
                    if (b == 0) System.out.println("Error: modulo por cero no permitido.");
                    else System.out.println("Resto: " + (a % b));
                    break;
                case 6:
                    System.out.print("Numero a elevar al cuadrado: "); a = sc.nextDouble();
                    System.out.println("Resultado: " + Math.pow(a, 2));
                    break;
                case 7:
                    System.out.print("Numero para raíz cuadrada: "); a = sc.nextDouble();
                    if (a < 0) System.out.println("Error: numero negativo no válido.");
                    else System.out.println("Resultado: " + Math.sqrt(a));
                    break;
                case 8:
                    System.out.print("Base: "); a = sc.nextDouble();
                    System.out.print("Exponente: "); b = sc.nextDouble();
                    System.out.println("Resultado: " + Math.pow(a, b));
                    break;
                case 9:
                    System.out.print("Parte: "); a = sc.nextDouble();
                    System.out.print("Total: "); b = sc.nextDouble();
                    if (b == 0) System.out.println("Error: total no puede ser cero.");
                    else System.out.println("Porcentaje: " + (a * 100 / b) + "%");
                    break;
                case 10:
                    System.out.println("Aleatorio: " + Math.random());
                    break;
                default:
                    System.out.println("Opcion desconocida.");
            }
        } while (opcion != 0);
        sc.close();
        
    }
    
}
