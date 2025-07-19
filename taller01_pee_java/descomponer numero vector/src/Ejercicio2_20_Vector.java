import java.util.Scanner;

public class Ejercicio2_20_Vector {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char volver;
            int num, cant, temp;
            int[] vector = new int[10];
            do {
                // Reiniciar variables
                num = 0;
                temp = 0;
                cant = 0;
                
                // Objetivo del programa
                System.out.println("Diseñe un programa que solicite un número por teclado, encuentre cuántos dígitos tiene,");
                System.out.println("lo descomponga y muestre en pantalla.\n");
                
                // Entrada de datos
                System.out.print("Escribir un número entero: ");
                num = sc.nextInt();
                
                // Contar dígitos
                temp = num;
                if (temp == 0) {
                    // Caso especial si el número es 0
                    cant = 1;
                    vector[0] = 0;
                } else {
                    while (temp > 0) {
                        temp /= 10;
                        cant++;
                    }
                    
                    // Descomponer número en dígitos
                    temp = num;
                    for (int i = cant - 1; i >= 0; i--) {
                        vector[i] = temp % 10;
                        temp /= 10;
                    }
                }
                
                // Mostrar resultados
                System.out.println("El número tiene " + cant + " dígitos y se descompone así:");
                for (int i = 0; i < cant; i++) {
                    System.out.print(" - " + vector[i]);
                }
                System.out.println("\n");
                
                // Preguntar si quiere repetir
                System.out.print("Si desea volver digite (s), de lo contrario cualquier tecla: ");
                volver = sc.next().toLowerCase().charAt(0);
                
                System.out.println("\n-----------------------------------\n");
            } while (volver == 's');
        }
    }
}
