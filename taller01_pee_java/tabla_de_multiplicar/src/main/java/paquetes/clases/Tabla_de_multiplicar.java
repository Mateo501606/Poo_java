
package paquetes.clases;
 import java.util.Scanner;

public class Tabla_de_multiplicar {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        char volver;
        int tabla, res;
        
        do {
            
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
           
            System.out.println(" recuerda colocar un numero en el rango (del 1 al 10)");
            
         
            volver = ' ';
            tabla = 0;
            res = 0;
            
            
            System.out.print("\nDigite la tabla de multiplicar que desea visualizar: ");
            while (!scanner.hasNextInt()) { 
                System.out.println("Por favor, ingrese un numero válido entre 1 y 10.");
                scanner.next(); 
            }
            tabla = scanner.nextInt();
            
            
            if (tabla < 1 || tabla > 10) {
                System.out.println("El número ingresado no está en el rango de 1 a 10.");
                continue; 
            }
            
           
            System.out.println();
            for (int i = 1; i <= 10; i++) {
               
                res = i * tabla;
               
                System.out.printf("%d X %d = %d%n", tabla, i, res);
            }
            
           
            System.out.print("\nPara repetir digite < s >, para salir cualquier tecla: ");
            volver = scanner.next().charAt(0);
            
        } while (volver == 's'); 
        
        scanner.close(); 
    }
}
