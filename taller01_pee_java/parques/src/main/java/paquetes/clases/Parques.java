
package paquetes.clases;

import java.util.Random;
import java.util.Scanner;

public class Parques {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char volver;
        int cont, dado1, dado2;

        do {
          
            System.out.print("\033[H\033[2J");
            System.out.flush();
          
            System.out.println("gira los dados para avanzar"
                    + "");

           
            volver = ' ';
            cont = 0;
            
          
            while (cont < 3) {
               
                System.out.println("\nLanzamiento " + (cont + 1) + ". Presione ENTER");
                scanner.nextLine();
                
              
                dado1 = random.nextInt(6) + 1;
                dado2 = random.nextInt(6) + 1;
                
           
                if (dado1 == dado2) {
          
                    cont++;
                    
             
                    System.out.println("Ha sacado par de " + dado1);
                    
                
                    if (cont == 3) {
                        System.out.println("\n¡Saca una ficha!");
                    }
                } else {
                
                    System.out.println("Ha sacado " + dado1 + " y " + dado2 + ". Lanza de nuevo");
                    cont = 3; // Terminar el ciclo
                }
            }

       
            System.out.println("\nPara repetir digite < s >, para salir cualquier tecla:");
            volver = scanner.next().charAt(0);

        } while (volver == 's');

        scanner.close(); // 
    }
}
