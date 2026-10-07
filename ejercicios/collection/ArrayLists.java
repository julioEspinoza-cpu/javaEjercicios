package ejercicios.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static class persona {
        private int id;
        private String nombre;
        private int edad;

        public persona(int id, String nombre, int edad) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }

    public static void main(String[] args) {

        List<persona> lista = new ArrayList<>();

        lista.add(new persona(1, "julio", 35));
        lista.add(new persona(2, "ener", 18));
        lista.add(new persona(3, "carlo", 40));
        lista.add(new persona(4, "fred", 36));

        // por indice
        System.out.println("--------------------for-----------------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(" estos son : " + lista.get(i).getNombre());
        }
        // recorrido Foreach
        System.out.println("--------------------foreach-----------------------");
        for (persona perso : lista) {
            System.out.println("prueba: " + perso.getNombre());
        }
    }
}
