package logica1;

import java.util.Scanner;

public class Menuinteractivo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("ingrese el numero ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opcion 1");
                    break;
                case 2:
                    System.out.println("Seleccionaste la opcion 2");
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 3);

        teclado.close();

    }

}
