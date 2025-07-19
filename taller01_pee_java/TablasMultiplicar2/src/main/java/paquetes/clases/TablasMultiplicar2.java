
package paquetes.clases;

import java.util.Scanner;

public class TablasMultiplicar2 {
    public static void main(String[] args) {
        // Crear el objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);
        char volver;
        int res;

        do {
            
            System.out.print("\033[H\033[2J");
            System.out.flush();

          
            volver = ' ';
            res = 0;

            
            System.out.println();
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                   
                    res = i * j;
                  
                    System.out.printf("%d x %d = %d%n", i, j, res);
                }
                System.out.println(); 
            }

            
            System.out.print("\nDigite < s > para repetir. Para salir, cualquier tecla: ");
            volver = scanner.next().charAt(0);

        } while (volver == 's'); 

        scanner.close(); 
    }
}
