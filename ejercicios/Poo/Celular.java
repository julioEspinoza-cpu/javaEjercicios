package Poo;

public class Celular {

    private String modelo;
    private String color;
    private Double tamanoPantalla;
    private int bateria;

    public Celular(String modelo, String color, Double tamanoPantalla, int bateria) {
        this.modelo = modelo;
        this.color = color;
        this.tamanoPantalla = tamanoPantalla;
        this.bateria = bateria;
    }

    public Celular() {
        // buenasPracticas
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(Double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Celular [modelo=" + modelo + ", color=" + color + ", tamanoPantalla=" + tamanoPantalla + ", bateria="
                + bateria + "]";

    }

    public void recargarBateria(int cantidad) {
        this.bateria = this.bateria + cantidad;

    }

    public void enviarMensaje(String texto) {

        if (this.bateria > 0) {
            this.bateria--;
            System.out.println("El mensaje fue enviado correctamente   y la bateria tiene ahora " + bateria);
        } else {
            System.out.println(" el celular esta sin bateria ");
        }

    }
}
/*
 * "Creá un método público llamado toString que, cuando lo ejecuten, va a procesar los datos y va a devolver un resultado de tipo String (texto)"
 * .
 * Y por eso adentro del método aparece la palabra clave return, que es la que
 * se encarga de "escupir" hacia afuera el texto armado con el modelo, color y
 * batería.
 */
/*
 * la anotación @Override se usa exclusivamente
 * para avisarle al compilador que estás "reescribiendo" el
 * comportamiento de un método que ya existía en una clase superior (una clase
 * padre).
 */