import java.util.Scanner;

public class EstructurasDescomponerNumero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char volver;
            
            do {
                // Limpiar pantalla simulada con saltos de línea
                for (int i = 0; i < 30; i++) System.out.println();
                
                System.out.println("Diseñe un programa que solicite un número por teclado,");
                System.out.println("encuentre cuantos dígitos tiene y lo descomponga y muestre en pantalla.");
                System.out.println();
                
                int num, cant = 0, resid, temp;
                System.out.print("Escribir un número entero: ");
                num = scanner.nextInt();
                
                temp = num;
                
                // Contar cantidad de dígitos
                if (temp == 0) {
                    cant = 1;  // caso para 0 que tiene un dígito
                } else {
                    while (temp > 0) {
                        temp /= 10;  // truncado al dividir enteros
                        cant++;
                    }
                }
                
                System.out.println("El número tiene " + cant + " dígitos y se descompone así:");
                System.out.println();
                
                resid = num;
                
                // Descomponer y mostrar dígitos
                while (cant > 0) {
                    int divisor = (int) Math.pow(10, cant - 1);
                    int digito = resid / divisor;
                    System.out.print(digito + " - ");
                    
                    resid = resid % divisor;
                    cant--;
                }
                System.out.println();
                
                System.out.print("\nPara repetir digite < s >, para salir cualquier tecla: ");
                scanner.nextLine();  // limpiar buffer
                String input = scanner.nextLine();
                volver = input.isEmpty() ? ' ' : input.charAt(0);
                
            } while (volver == 's' || volver == 'S');
            
            System.out.println("\nPrograma finalizado.");
        }
    }
}
