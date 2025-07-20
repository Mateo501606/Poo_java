
package calculadora;

import java.util.Scanner;

public class Calculadora {

   
    public static void main(String[] args) {
        
     Scanner scan = new Scanner(System.in);
        
        int Answer;
        double num1, num2, resultado = 0;
        
        System.out.println("---------------CALCULADORA----------------");
        System.out.println("Indique que operacion quiere hacer: ");
        System.out.println("Suma = 1 ");
        System.out.println("Resta = 2 ");
        System.out.println("Multiplicacion = 3 ");
        System.out.println("Division = 4 ");
        System.out.println("Opcion: ");
        Answer = scan.nextInt();
        
        
        switch(Answer) {
            case 1:
                System.out.println("-------------SUMA-----------");
                System.out.println("Digita los numero que quieras sumar: ");
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                resultado = num1 + num2;
                System.out.println("El resultado de la suma: " + resultado);
                break;
            case 2: 
                System.out.println("-------------RESTA-----------");
                System.out.println("Digita los numeros que quieras restar: ");
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                resultado = num1 - num2;
                System.out.println("El resultado de la resta: " + resultado);
                break;
            case 3:
                System.out.println("---------------Multiplicacion------------");
                System.out.println("Digita los numeros que quieras multiplicar: ");
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 4:
                System.out.println("---------------Division-------------");
                System.out.println("Digita los numeros que quieras multiplicar: ");
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                resultado = num1 / num2;
                System.out.println("El resultado de la division es: " + resultado);
                break;
            default:
                System.out.println("Error!");
                break;
        }
            
        
       //VARIABLES
       
       
    }
    
}
