
package paquetes;

import java.util.Scanner;

public class clase {

 
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int n1;
        int n2;
        int resultado;
        
        System.out.println("Digite el primer numero");
        
        n1 = obj.nextInt();
        
        System.out.println("Digite el segundo numero");
        
        n2 = obj.nextInt();
        
        resultado = n1 - n2;
        
        System.out.println("La diferencia del numero uno y numero dos es "+resultado);
       
    }
    
}
