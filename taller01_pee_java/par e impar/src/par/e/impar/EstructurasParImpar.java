package par.e.impar;

import java.util.Scanner;

public class EstructurasParImpar {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char volver;
            
            do {
                // Limpiar pantalla simulada
                for (int i = 0; i < 30; i++) System.out.println();
                
                System.out.println("Diseñe un programa que solicite 2 números por teclado,");
                System.out.println("luego indique al usuario si desea la serie par o impar,");
                System.out.println("y muestre en pantalla la serie según la elección desde el menor hasta el mayor número.");
                System.out.println();
                
                int num1, num2, aux;
                char menu;
                int menuEnt;
                
                System.out.print("Digite el primer número: ");
                num1 = scanner.nextInt();
                
                System.out.print("Digite el segundo número: ");
                num2 = scanner.nextInt();
                
                // Mientras los números sean iguales, pedir nuevamente num2
                while (num1 == num2) {
                    System.out.println("Digite nuevamente el segundo número, ya que no puede ser igual al primero");
                    num2 = scanner.nextInt();
                }
                
                // Si num1 es mayor que num2, intercambiar
                if (num1 > num2) {
                    aux = num1;
                    num1 = num2;
                    num2 = aux;
                }
                
                scanner.nextLine(); // limpiar buffer
                
                do {
                    menuEnt = 0;
                    
                    System.out.println("\n----- Series -----");
                    System.out.println("1. Impar");
                    System.out.println("2. Par");
                    System.out.print("Digite una opción del menú, de lo contrario cualquier otra tecla para salir: ");
                    
                    String menuStr = scanner.nextLine();
                    
                    if (menuStr.length() == 1 && (menuStr.charAt(0) == '1' || menuStr.charAt(0) == '2')) {
                        menuEnt = Integer.parseInt(menuStr);
                        
                        switch (menuEnt) {
                            case 1:
                                System.out.println("\nSerie Impar");
                                for (int i = num1; i <= num2; i++) {
                                    if (i % 2 != 0) {
                                        System.out.print(" - " + i);
                                    }
                                }
                                System.out.println();
                                break;
                                
                            case 2:
                                System.out.println("\nSerie Par");
                                for (int i = num1; i <= num2; i++) {
                                    if (i % 2 == 0) {
                                        System.out.print(" - " + i);
                                    }
                                }
                                System.out.println();
                                break;
                        }
                    } else {
                        // Salir del ciclo si la opción no es 1 ni 2
                        break;
                    }
                    
                } while (true);
                
                System.out.print("\nPara repetir digite < s >, para salir cualquier tecla: ");
                String input = scanner.nextLine().toLowerCase();
                volver = input.isEmpty() ? ' ' : input.charAt(0);
                
            } while (volver == 's');
            
            System.out.println("\nPrograma finalizado.");
        }
    }
}
