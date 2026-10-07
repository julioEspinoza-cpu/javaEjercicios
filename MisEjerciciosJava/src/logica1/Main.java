package logica1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1 = 7;
        int numeroDelJugador = 0;
        int[] historial = new int[6];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("----- Ingrese  un  Numero  entre  0 y 10 ,tenes 5 chances para adivinar   --------");

            numeroDelJugador = teclado.nextInt();
            if (numeroDelJugador < 0 || numeroDelJugador > 10) {
                System.out.println("❌ Número no válido. Debe ser entre 0 y 10. perdiste una Chance ");
            }
            historial[i] = numeroDelJugador;

            if (num1 == numeroDelJugador) {
                System.out.println("Ganaste");
                break;
            } else if (num1 < numeroDelJugador) {
                System.out.println(" Este numero es mayor");

            } else if (num1 > numeroDelJugador) {
                System.out.println("Este numero es menor");

            }
            ;
            if (i == 4) {
                System.out.println("Tus Chances se Terminaron ");

            }

        }
        teclado.close();
        System.out.println("Los numero del  historial son : " + Arrays.toString(historial));
    }
}

/*
 * / 1. EL IMPORT (Va arriba del todo, antes de la clase)
 * // Lo necesitas para poder usar la función mágica que muestra los números en
 * pantalla.
 * import java.util.Arrays;
 * 
 * 
 * // 2. LA DECLARACIÓN (Va antes de empezar el juego)
 * // Usamos "new int[6]" porque el arreglo empieza vacío.
 * // Le asignamos 6 espacios porque tu bucle va del 0 al 5 (6 vueltas en
 * total).
 * int[] historial = new int[6];
 * 
 * 
 * // 3. EL GUARDADO (Va adentro del bucle 'for')
 * // Usamos la variable 'i' del bucle como índice (historial[0], historial[1],
 * etc.).
 * // NOTA: No uses llaves vacías {} al declarar si vas a llenarlo de esta
 * forma.
 * historial[i] = numeroDelJugador;
 * 
 * 
 * // 4. LA IMPRESIÓN (Va al final de todo, fuera del bucle)
 * // Usamos "Arrays.toString()" con la S al final para convertir el arreglo a
 * texto.
 * // NOTA: Si pones solo "+ historial", Java te imprimirá un código raro de
 * memoria.
 * System.out.println("Los numeros del historial son : " +
 * Arrays.toString(historial));
 * 
 * ------------------------ este tambien lo tenes que
 * agregar.--------------------
 * 
 * // Validamos si el número está FUERA del rango permitido (0 a 10)
 * if (numeroDelJugador < 0 || numeroDelJugador > 10) {
 * System.out.println("❌ Número no válido. Debe ser entre 0 y 10.");
 * i--; // 👈 Le devolvemos el intento para que no lo pierda
 * continue; // 👈 Salta el resto del bucle y vuelve a pedir el número
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 */