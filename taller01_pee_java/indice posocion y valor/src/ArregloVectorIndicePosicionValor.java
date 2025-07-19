import java.util.Random;
import java.util.Scanner;

public class ArregloVectorIndicePosicionValor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            char volver;
            
            do {
                // Limpiar pantalla simulada
                for (int i = 0; i < 30; i++) System.out.println();
                
                System.out.println("Diseñe un algoritmo que llene un vector de 10 posiciones con un ciclo for,");
                System.out.println("luego imprima con otro ciclo el vector mostrando el índice, la posición y el valor.");
                System.out.println();
                
                int[] vector = new int[10];
                
                // Llenar el vector con valores aleatorios entre 0 y 99
                for (int i = 0; i < 10; i++) {
                    vector[i] = random.nextInt(100);
                }
                
                // Mostrar los valores con índice, posición y valor
                System.out.println("Contenido del vector:");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Índice: " + i + ". Posición: " + (i + 1) + ". Valor: " + vector[i]);
                }
                
                System.out.println();
                System.out.print("Para repetir digite <s>, para salir cualquier tecla: ");
                String input = scanner.nextLine().toLowerCase();
                volver = input.isEmpty() ? ' ' : input.charAt(0);
                
            } while (volver == 's');
            
            System.out.println("\nPrograma finalizado.");
        }
    }
}
