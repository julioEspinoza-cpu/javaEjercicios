package claabstract;

abstract class Figura {
    protected double x;
    protected double y;

    public Figura() {
    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();
}

public class Circulo extends Figura {

    private double radio;

    public Circulo() {
        super();
    }

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

}
