import java.util.Scanner;

public class Ejercicio2_19_Vector {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char volver;
            String menu;
            int[] vector = new int[3];
            int aux;
            
            do {
                // Objetivo del programa
                System.out.println("Diseñe un programa que por teclado solicite tres números y que según ");
                System.out.println("la decisión del usuario los organice de forma ascendente o descendente.\n");
                
                // Entrada de datos
                for (int i = 0; i < 3; i++) {
                    System.out.print("Digite el valor " + (i + 1) + ": ");
                    vector[i] = sc.nextInt();
                }
                
                // Ordenar el vector de forma ascendente (burbuja)
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (vector[j] > vector[j + 1]) {
                            aux = vector[j];
                            vector[j] = vector[j + 1];
                            vector[j + 1] = aux;
                        }
                    }
                }
                
                // Selección de ordenamiento
                do {
                    System.out.println("\n----- Ordenamiento -----");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");
                    System.out.print("Digite una opción del menú, de lo contrario cualquier otra tecla: ");
                    menu = sc.next();
                    
                    switch (menu) {
                        case "1" -> {
                            System.out.println("\nOrden Ascendente:");
                            for (int i = 0; i < 3; i++) {
                                System.out.print(vector[i] + " ");
                            }
                            System.out.println();
                        }
                        case "2" -> {
                            System.out.println("\nOrden Descendente:");
                            for (int i = 2; i >= 0; i--) {
                                System.out.print(vector[i] + " ");
                            }
                            System.out.println();
                        }
                        default -> System.out.println("Opción no válida.");
                    }
                } while (!menu.equals("1") && !menu.equals("2"));
                
                // Preguntar si quiere repetir
                System.out.print("\nSi desea volver a escribir los números digite (s), de lo contrario cualquier tecla: ");
                volver = sc.next().toLowerCase().charAt(0);
                
                System.out.println("\n-----------------------------------\n");
            } while (volver == 's');
        }
    }
}
