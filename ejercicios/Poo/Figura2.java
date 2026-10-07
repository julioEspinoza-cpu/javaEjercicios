package Poo;

public interface Figura2 {
    void saludar();
}

class Persona implements Figura2 {
    @Override
    public void saludar() {
        System.out.println("Todo Bien");
    }
}

class Main {

    public static void main(String[] args) {
        Figura2 p = new Persona();
        p.saludar();
    }
/*
 * Interface:
 * Es un contrato que dice qué métodos debe implementar una clase.
 * Una clase puede implementar muchas interfaces.
 * No se puede instanciar.
 */