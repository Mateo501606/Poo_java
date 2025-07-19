
package paquete.clase;

import java.util.Scanner;

public class Cilindro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {
            double radio = 0.0;
            double altura = 0.0;
            double area = 0.0;
            double perimetro = 0.0;
            double volumen = 0.0;

            do {
                System.out.println();
                System.out.println("Recuerde que el radio de la tapa y la altura del rectangulo no pueden ser menores o iguales a 0");
                System.out.println();

                System.out.print("Digite el radio: ");
                radio = scanner.nextDouble();

                System.out.print("Digite la altura: ");
                altura = scanner.nextDouble();

            } while (radio <= 0 || altura <= 0);

            perimetro = 2 * Math.PI * radio; 
            area = 2 * Math.PI * Math.pow(radio, 2); 
            area += perimetro * altura; 

            double perimetroFinal = (4 * perimetro) + (2 * altura);
            volumen = Math.PI * Math.pow(radio, 2) * altura;

            // Resultados
            System.out.println();
            System.out.println("La Figura es un:   Cilindro");
            System.out.printf("Su perimetro es:   %.2f metros%n", perimetroFinal);
            System.out.printf("Su area es:        %.2f metros cuadrados%n", area);
            System.out.printf("Su volumen es:     %.2f metros cúbicos%n", volumen);

            // Preguntar si desea repetir
            System.out.println();
            System.out.print("Para repetir digite < s >, para salir cualquier otra tecla: ");
            volver = scanner.next().toLowerCase().charAt(0);

        } while (volver == 's');

        scanner.close();
    }
}
