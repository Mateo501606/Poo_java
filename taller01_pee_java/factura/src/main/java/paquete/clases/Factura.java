
package paquete.clases;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        char volver, canasta, mas;
        String articulo;
        int cantidad;
        double precio, ivaPrd, ivaAcm, subtotal, totalParcial, total;
        double IVA = 0.19;

        do {
           
            System.out.print("\033[H\033[2J");
            System.out.flush();

          
            ;
            
          
            volver = ' ';
            canasta = ' ';
            articulo = "";
            cantidad = 0;
            ivaAcm = 0.0;
            precio = 0.0;
            total = 0.0;

           
            do {
              
                ivaPrd = 0.0;
                totalParcial = 0.0;
                subtotal = 0.0;

               
                System.out.println();
                System.out.print("Nombre del Artículo: ");
                articulo = scanner.nextLine();

                System.out.print("Precio: ");
                precio = scanner.nextDouble();

                System.out.print("Cantidad: ");
                cantidad = scanner.nextInt();

                System.out.print("Canasta familiar (s/n): ");
                canasta = scanner.next().charAt(0);

               
                totalParcial = precio * cantidad;

               
                if (canasta != 's') {
                    ivaPrd = totalParcial * IVA;
                }

              
                totalParcial = totalParcial - ivaPrd;

               
                subtotal = totalParcial + ivaPrd;

             
                total += totalParcial;

           
                ivaAcm += ivaPrd;

           
                System.out.println("      Total Parcial:   " + totalParcial);
                System.out.println("                IVA:   " + ivaPrd);
                System.out.println("  Subtotal Producto:   " + subtotal);
                System.out.println();
                System.out.println("    Subtotal Compra:   " + total);
                System.out.println("      IVA Acumulado:   " + ivaAcm);

            
                System.out.print("Digite < s > para ingresar otro articulo, de lo contrario cualquier tecla: ");
                mas = scanner.next().charAt(0);
                scanner.nextLine();

            } while (mas == 's'); 

           
            System.out.println();
            System.out.println("----------- GRACIAS POR SU COMPRA -----------------");
            System.out.println();
            System.out.println("    Subtotal Compra:   " + total);
            System.out.println("      IVA Acumulado:   " + ivaAcm);

           
            total += ivaAcm;

           
            System.out.println("      Total a Pagar:   " + total);

           
            System.out.print("Para repetir digite < s >, para salir cualquier tecla: ");
            volver = scanner.next().charAt(0);
            scanner.nextLine(); 

        } while (volver == 's'); 

        scanner.close(); 
    }
}

