
package paquetes.clases;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        char volver;
        int i, cant, acum, anterior, posterior;

        do {
           
            System.out.print("\033[H\033[2J");
            System.out.flush();

         
            System.out.println("que se desea ver de la serie de Fibonacci (sucesion de Fibonacci).");

      
            anterior = 0;
            posterior = 1;
            acum = 0;
            cant = 0;

            
            System.out.print("\nIngrese la cantidad de numeros de la serie Fibonacci: ");
            cant = scanner.nextInt();

            
            System.out.println();
            for (i = 0; i < cant; i++) {
               
                System.out.print(anterior + " ");

                
                acum = anterior + posterior;
                posterior = anterior;
                anterior = acum;
            }

           
            System.out.print("\n\nPara repetir digite < s >, para salir cualquier tecla: ");
            volver = scanner.next().charAt(0);

        } while (volver == 's'); 

        scanner.close(); 
    }
}
