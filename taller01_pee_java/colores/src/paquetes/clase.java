
package paquetes;
import java.util.Scanner
public class clase {

   
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Menu de colores:");
        System.out.println("1 = Amarillo");
        System.out.println("2 = Azul");
        System.out.println("3 = Rojo");

        // Función para leer y validar la entrada de un número
        num1 = leerNumero(sc, "Seleccione el primer numero de color: ");
        num2 = leerNumero(sc, "Seleccione el segundo numero de color: ");

        String color = combinar(num1, num2);
        System.out.println("El color es " + color + ".");
        sc.close();
    }

    // Lee un entero, verifica que sea válido (1 a 3), permite repeticiones
    private static int leerNumero(Scanner sc, String prompt) {
        int n;
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNextInt()) {
                System.out.println("Eso no es un número. Intente de nuevo.");
                sc.next(); // descarta lo no numérico
                continue;
            }
            n = sc.nextInt();
            if (n < 1 || n > 3) {
                System.out.println("Número fuera de rango. Intente de nuevo.");
            } else {
                break;
            }
        }
        return n;
    }

    // Retorna el resultado según la combinación de dos colores base
    private static String combinar(int a, int b) {
        // Amarillo=1, Azul=2, Rojo=3
        if (a == b) {
            switch (a) {
                case 1: return "amarillo";
                case 2: return "azul";
                case 3: return "rojo";
            }
        } else {
            int sum = a + b;
            if ( (a==1 && b==2) || (a==2 && b==1) ) return "verde";       // amarillo + azul = verde
            if ( (a==1 && b==3) || (a==3 && b==1) ) return "naranja";     // amarillo + rojo = naranja
            if ( (a==2 && b==3) || (a==3 && b==2) ) return "morado";      // azul + rojo = morado
        }
        return "mezcla desconocida";
        
    }
    
}
