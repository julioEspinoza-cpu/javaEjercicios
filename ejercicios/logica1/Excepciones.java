
public class Excepciones {

    public static void main(String[] args) {

        try {
            int edades[] = { 15, 12, 23, 30 };
            System.out.println("La edad de la posicion 4 " + edades[4]);
        } catch (Exception E) {
            System.out.println("INTENTASTE ACCEDER A UN INDICE MAL");
        }
    }
}