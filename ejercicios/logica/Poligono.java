// Línea 1: Declara la clase pública llamada "Poligono", que es el contenedor principal de todo tu código.
public class Poligono {
    // Línea 2: Variable de texto para guardar qué figura es (ej: "Cuadrado",
    // "Triangulo", "Rectangulo").
    String tipo;
    // Línea 3: Variable para números con decimales que guardará el valor del primer
    // lado (o la base).
    double Lado1;
    // Línea 4: Variable para números con decimales que guardará el valor del
    // segundo lado (o la altura).
    double Lado2;

    // Línea 6: El Constructor. Es la función especial que se ejecuta para dar los
    // datos iniciales al crear el objeto.
    public Poligono(String tipo, double Lado1, double Lado2) {
        // Línea 7: Guarda el texto que le mandas en la variable "tipo" de este objeto
        // específico.
        this.tipo = tipo;
        // Línea 8: Guarda el primer número que le mandas en el "Lado1" de este objeto
        // específico.
        this.Lado1 = Lado1;
        // Línea 9: Guarda el segundo número que le mandas en el "Lado2" de este objeto
        // específico.
        this.Lado2 = Lado2;

        // Línea 11: Cierra el bloque de código del constructor.
    }

    // Línea 13: Función que calcula el área. "double" significa que al final va a
    // devolver (retornar) un número decimal.
    public double calcularArea(Poligono poli) {

        // Línea 15: Evalúa si el texto de la variable "tipo" de ese polígono es
        // exactamente igual a "Rectangulo".
        if (poli.tipo.equals("Rectangulo")) {

            // Línea 17: Multiplica base por altura y devuelve el resultado de inmediato
            // hacia afuera de la función.
            return (poli.Lado1 * poli.Lado2);
            // Línea 18: Si no fue un Rectángulo, evalúa si el "tipo" es exactamente igual a
            // "Triangulo".
        } else if (poli.tipo.equals("Triangulo")) {

            // Línea 20: Multiplica base por altura, lo divide entre 2 y devuelve ese
            // resultado decimal.
            return (poli.Lado1 * poli.Lado2) / 2;
            // Línea 21: Si no fue ninguno de los anteriores, evalúa si el "tipo" es
            // exactamente igual a "Cuadrado".
        } else if (poli.tipo.equals("Cuadrado")) {

            // Línea 23: Multiplica lado por lado y devuelve el resultado de la superficie.
            return (poli.Lado1 * poli.Lado2);
            // Línea 24: Si el texto introducido no coincide con ninguna de las tres figuras
            // anteriores (ej: "Circulo").
        } else {
            // Línea 25: Muestra en la terminal un mensaje advirtiendo que la figura no está
            // soportada.
            System.out.println("Tipo de polígono no reconocido.");
            // Línea 26: Devuelve un 0 para evitar que el programa falle, ya que la función
            // está obligada a retornar un número.
            return 0;
        }

        // Línea 29: Cierra el bloque de código de la función calcularArea.
    }

    // Línea 31: Método principal "main". Es el punto de arranque obligatorio que
    // Java busca para ejecutar el programa.
    public static void main(String[] args) {
        // Línea 32: Crea el objeto real "rectangulo" pasándole al constructor sus tres
        // datos iniciales.
        Poligono rectangulo = new Poligono("Rectangulo", 5.1, 3);
        // Línea 33: Crea el objeto real "triangulo" pasándole al constructor sus tres
        // datos iniciales.
        Poligono triangulo = new Poligono("Triangulo", 4.5, 6);
        // Línea 34: Crea el objeto real "cuadrado" pasándole al constructor sus tres
        // datos iniciales.
        Poligono cuadrado = new Poligono("Cuadrado", 4.2, 4.2);

        // Línea 36: Imprime el texto, llama a la función pasándole el objeto
        // "rectangulo", recibe su return y lo muestra.
        System.out.println("El area del Rectangulo es: " + rectangulo.calcularArea(rectangulo));
        // Línea 37: Imprime el texto, llama a la función pasándole el objeto
        // "triangulo", recibe su return y lo muestra.
        System.out.println("El area del Triangulo es: " + triangulo.calcularArea(triangulo));
        // Línea 38: Imprime el texto, llama a la función pasándole el objeto
        // "cuadrado", recibe su return y lo muestra.
        System.out.println("El area del Cuadrado es: " + cuadrado.calcularArea(cuadrado));

        // Línea 40: Cierra el bloque de código del método principal main.
    }
    // Línea 41: Cierra el bloque de la clase general Poligono (fin del archivo).
}
