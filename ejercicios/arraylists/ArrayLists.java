package ejercicios.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<persona> lista = new ArrayList<persona>();

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
