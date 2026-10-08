package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

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

        List<persona> lista = new LinkedList<>();
        // agregar personas al Final De la lista

        lista.add(new persona(1, "julioooo", 35));
        lista.add(new persona(2, "enero", 18));
        lista.add(new persona(3, "carlos", 40));
        lista.add(new persona(4, "fredY", 36));

        // agregar al principio
        // se coloco el "0" antes de al palabra new y eso hace que en la lista quede al
        // principio.
        lista.add(0, new persona(5, "probando", 30));

        // recorrido Foreach
        System.out.println("--------------------foreach-----------------------");
        for (persona perso : lista) {
            System.out.println("prueba: " + perso.getNombre());
        }
    }
}
