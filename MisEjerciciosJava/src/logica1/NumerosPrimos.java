package logica1;

public class NumerosPrimos {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {

            // 1. ANTES del segundo for: Asumimos que 'i' es primo
            boolean esPrimo = true;

            // Corregido: Empezamos en 2 y probamos mientras j sea menor que i
            for (int j = 2; j < i; j++) {

                // 2. Si da exacto, encontramos un divisor. ¡Ya NO es primo!
                if (i % j == 0) {
                    esPrimo = false; // Bajamos la bandera

                }
            }

            // 3. DESPUÉS del segundo for: Revisamos si la bandera se mantuvo en true
            if (esPrimo) {
                System.out.println(i); // Si nadie la bajó, ¡es un número primo!
            }
        }

    }
}
