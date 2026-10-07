package ejercicios.relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");

        List<Propietario> ListaPropietarios = new ArrayList<Propietario>();
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        prop1.setId(35L);
        prop1.setNombre("Luisina");
        prop1.setApellido("De Paula");

        prop2.setId(23L);
        prop2.setNombre("Suscribite");
        prop2.setApellido("A TodoCode");

        ListaPropietarios.add(prop1);
        ListaPropietarios.add(prop2);

        // ¡Esta es la línea que te falta! Le asignamos la lista al auto
        aut.setListaPropietarios(ListaPropietarios);

        System.out.println("el  Auto " + aut.getMarca() + " " + aut.getModelo() + "Tiene como propietario a : "
                + aut.getListaPropietarios().toString());
    }
}
