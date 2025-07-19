import java.util.Scanner;
import java.util.Random;

public class EstructurasBaloto {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            char volver;
            
            do {
                // Simular limpiar pantalla
                for (int i = 0; i < 30; i++) System.out.println();
                

                System.out.println();
                
                System.out.print("Presione Enter para hallar los números del baloto: ");
                scanner.nextLine(); // Esperar tecla (Enter)
                
                int num1, num2, num3, num4, num5, num6, aux;
                
                // Generar num1
                num1 = random.nextInt(45) + 1;
                
                // Generar num2 distinto de num1
                do {
                    num2 = random.nextInt(45) + 1;
                } while (num2 == num1);
                
                // Generar num3 distinto de num1 y num2
                do {
                    num3 = random.nextInt(45) + 1;
                } while (num3 == num1 || num3 == num2);
                
                // Generar num4 distinto de num1, num2 y num3
                do {
                    num4 = random.nextInt(45) + 1;
                } while (num4 == num1 || num4 == num2 || num4 == num3);
                
                // Generar num5 distinto de num1, num2, num3 y num4
                do {
                    num5 = random.nextInt(45) + 1;
                } while (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4);
                
                // Generar num6 distinto de num1, num2, num3, num4 y num5
                do {
                    num6 = random.nextInt(45) + 1;
                } while (num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5);
                
                // Ordenar los números (burbuja simplificada para 6 números)
                for (int i = 0; i < 5; i++) {
                    if (num1 >= num2) { aux = num1; num1 = num2; num2 = aux; }
                    if (num2 >= num3) { aux = num2; num2 = num3; num3 = aux; }
                    if (num3 >= num4) { aux = num3; num3 = num4; num4 = aux; }
                    if (num4 >= num5) { aux = num4; num4 = num5; num5 = aux; }
                    if (num5 >= num6) { aux = num5; num5 = num6; num6 = aux; }
                }
                
                // Mostrar números ordenados
                System.out.println("\nNúmeros generados del baloto (ordenados):");
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num4);
                System.out.println(num5);
                System.out.println(num6);
                
                // Preguntar si repetir
                System.out.print("\nPara repetir digite < s >, para salir cualquier tecla: ");
                String input = scanner.nextLine().toLowerCase();
                volver = input.isEmpty() ? ' ' : input.charAt(0);
                
            } while (volver == 's');
            
            System.out.println("\nPrograma finalizado.");
        }
    }
}
