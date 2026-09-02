
// Importamos la herramienta Arrays de Java para poder ordenar y comparar las listas de letras
import java.util.Arrays;

public class Anagrama {

    public static void main(String[] args) {
        // Imprime un mensaje inicial en la consola para saber que el programa arrancó
        System.out.println("Probando anagramas...");

        // Ejecuta la función enviándole "roma" y "amor", y guarda la respuesta
        // (true/false) en 'resultado'
        boolean resultado = esAnagrama("roma", "amor");

        // Muestra en la pantalla el resultado final de la comparación junto con el
        // texto aclaratorio
        System.out.println("¿Es Anagrama? " + resultado);
    }

    public static boolean esAnagrama(String palabra1, String palabra2) {

        // Convierte la primera palabra a minúsculas para que las mayúsculas no alteren
        // la comparación
        String p1 = palabra1.toLowerCase();

        // Convierte la segunda palabra a minúsculas asegurando que ambas jueguen bajo
        // las mismas reglas
        String p2 = palabra2.toLowerCase();

        // Evalúa si ambas palabras son idénticas tras el formateo; si lo son, rompe la
        // regla del anagrama
        if (p1.equals(p2)) {
            // Detiene la función de inmediato y responde 'false' porque palabras iguales no
            // son anagramas
            return false;
        }

        // Desmantele la primera palabra transformándola en un arreglo de caracteres
        // individuales (letras sueltas)
        char[] letras1 = p1.toCharArray();

        // Desmantele la segunda palabra transformándola también en su propio arreglo de
        // letras sueltas
        char[] letras2 = p2.toCharArray();

        // Toma el primer arreglo de letras y lo reordena alfabéticamente (por ejemplo,
        // "roma" pasa a ser "amor")
        Arrays.sort(letras1);

        // Toma el segundo arreglo de letras y lo ordena de la A a la Z exactamente de
        // la misma manera
        Arrays.sort(letras2);

        // Verifica de forma nativa si ambos arreglos ya ordenados contienen exactamente
        // los mismos elementos
        return Arrays.equals(letras1, letras2);
    }
}
