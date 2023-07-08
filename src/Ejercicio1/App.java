
package Ejercicio1;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Undo undo = Undo.getInstance();

        while (true) {
        	System.out.println("1-Agregar Orden,2-Borrar,3-listar,4-Salir");
        	System.out.print("Digite una opción [1,2,3,4]: ");
        	int opcion = scanner.nextInt();
        	
        	 scanner.nextLine();
            if (opcion == 1) {
                System.out.print("Ingresar un nombre de orden:");
                String orden = scanner.nextLine();
                undo.agregarOrden(orden);
            } else if (opcion == 2) {
                undo.eliminarUltimaOrden();
            } else if (opcion == 3){
                undo.listarOrdenes();
            } else if (opcion == 4) {
                break;
            } else {
                System.out.println("La opción ingresada no es valida.");
            }
        }

        System.out.println("Fin del Programa");
        scanner.close();
    }
}
