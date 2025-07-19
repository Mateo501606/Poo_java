import java.util.Scanner;

public class EstructurasOrdenamiento {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char volver;
            
            do {
                // Limpiar pantalla (simulado con saltos de línea)
                for (int i = 0; i < 30; i++) System.out.println();
               
                // Declaración e inicialización de variables
                int num1 = 0, num2 = 0, num3 = 0, aux, menuEnt = 0;
                String menu;
                
                // Entrada de datos
                System.out.print("\nDigite el valor del primer número: ");
                num1 = scanner.nextInt();
                
                System.out.print("Digite el valor del segundo número: ");
                num2 = scanner.nextInt();
                
                System.out.print("Digite el valor del tercer número: ");
                num3 = scanner.nextInt();
                
                // Ordenamiento tipo burbuja simplificado (2 iteraciones)
                for (int i = 0; i < 2; i++) {
                    if (num1 >= num2) {
                        aux = num1; num1 = num2; num2 = aux;
                    }
                    if (num2 >= num3) {
                        aux = num2; num2 = num3; num3 = aux;
                    }
                }
                
                // Menú para elegir ordenamiento
                do {
                    System.out.println("\n----- Ordenamiento -----");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Descendente");
                    System.out.print("\nDigite una opción del menú, de lo contrario cualquier tecla para salir: ");
                    
                    menu = scanner.next();
                    
                    if (menu.equals("1") || menu.equals("2")) {
                        menuEnt = Integer.parseInt(menu);
                        switch (menuEnt) {
                            case 1 -> {
                                System.out.println("\nNúmeros en orden ascendente:");
                                System.out.println(num1 + " - " + num2 + " - " + num3);
                            }
                            case 2 -> {
                                System.out.println("\nNúmeros en orden descendente:");
                                System.out.println(num3 + " - " + num2 + " - " + num1);
                            }
                        }
                    } else {
                        // Salir del menú si la opción no es 1 ni 2
                        menuEnt = 0;
                    }
                } while (menuEnt == 1 || menuEnt == 2);
                
                // Preguntar si desea repetir el programa
                System.out.print("\nPara repetir digite < s >, para salir cualquier tecla: ");
                volver = scanner.next().toLowerCase().charAt(0);
                
            } while (volver == 's');
        }
        System.out.println("\n¡Programa finalizado!");
    }
}
