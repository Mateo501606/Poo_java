package paquete.clases;

import java.util.Scanner;

public class Tipos_de_triangulos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver; // Variable para saber si el usuario quiere repetir

        // Ciclo principal que se repetirá mientras el usuario ingrese 'sí'
        do {
            System.out.println("Selecciona cómo deseas ingresar los datos del triángulo:");
            System.out.println("1. Ingresar los ángulos y un lado.");
            System.out.println("2. Ingresar los tres lados.");
            System.out.print("Selecciona una opción (1 o 2): ");
            int opcion = scanner.nextInt();

            double angA = 0.0, angB = 0.0, angC = 0.0;
            double ladoA = 0.0, ladoB = 0.0, ladoC = 0.0;
            double area = 0.0, perimetro = 0.0;

            if (opcion == 1) {
                System.out.println("Recuerda que la suma de los tres ángulos debe ser 180°.");

                System.out.print("Digite el primer ángulo (A) en grados: ");
                angA = scanner.nextDouble();
                
                System.out.print("Digite el segundo ángulo (B) en grados: ");
                angB = scanner.nextDouble();

                angC = 180 - angA - angB;

                System.out.print("Digite el valor del lado opuesto al ángulo A: ");
                ladoA = scanner.nextDouble();

                ladoB = (ladoA * Math.sin(Math.toRadians(angB))) / Math.sin(Math.toRadians(angA));
                ladoC = (ladoA * Math.sin(Math.toRadians(angC))) / Math.sin(Math.toRadians(angA));

            } else if (opcion == 2) {
                System.out.print("Digite el valor del primer lado (A): ");
                ladoA = scanner.nextDouble();

                System.out.print("Digite el valor del segundo lado (B): ");
                ladoB = scanner.nextDouble();

                System.out.print("Digite el valor del tercer lado (C): ");
                ladoC = scanner.nextDouble();

                // Verificar si los lados forman un triángulo válido
                if (ladoA + ladoB <= ladoC || ladoB + ladoC <= ladoA || ladoC + ladoA <= ladoB) {
                    System.out.println("Los lados no forman un triángulo válido.");
                    continue; // Volver al inicio del ciclo para intentar de nuevo
                }

                angA = Math.toDegrees(Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC)));
                angB = Math.toDegrees(Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoA * ladoC)));
                angC = 180 - angA - angB;

            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
                continue; // Si la opción no es válida, se reinicia el ciclo
            }

            // Cálculos del perímetro y área
            perimetro = ladoA + ladoB + ladoC;

            double semiperimetro = perimetro / 2;
            area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));

            // Determinar tipo de triángulo por lados
            String tipoLados = "";
            if (ladoA == ladoB && ladoB == ladoC) {
                tipoLados = "Equilátero";
            } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                tipoLados = "Isósceles";
            } else {
                tipoLados = "Escaleno";
            }

            // Determinar tipo de triángulo por ángulos
            String tipoAngulos = "";
            if (angA == 90 || angB == 90 || angC == 90) {
                tipoAngulos = "Rectángulo";
            } else if (angA < 90 && angB < 90 && angC < 90) {
                tipoAngulos = "Acutángulo";
            } else {
                tipoAngulos = "Obtusángulo";
            }

            // Mostrar resultados
            System.out.println();
            System.out.println("Los ángulos del triángulo son:");
            System.out.printf("Ángulo A: %.2f grados%n", angA);
            System.out.printf("Ángulo B: %.2f grados%n", angB);
            System.out.printf("Ángulo C: %.2f grados%n", angC);

            System.out.println("El perímetro del triángulo es: " + perimetro + " unidades.");
            System.out.println("El área del triángulo es: " + area + " unidades cuadradas.");

            System.out.println("Tipo de triángulo por lados: " + tipoLados);
            System.out.println("Tipo de triángulo por ángulos: " + tipoAngulos);

            // Preguntar si desea repetir
            System.out.println();
            System.out.print("Para repetir digite < s >, para salir cualquier otra tecla: ");
            volver = scanner.next().toLowerCase().charAt(0);  // Se captura la respuesta para volver

        } while (volver == 's');  // Condición para repetir el ciclo si el usuario ingresa 's'

        scanner.close();  // Cerrar el scanner para liberar recursos
    }
}
