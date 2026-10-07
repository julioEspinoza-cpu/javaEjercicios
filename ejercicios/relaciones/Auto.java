
package ejercicios.relaciones;

import java.util.List;

public class Auto {

    private Long id;
    private String marca;
    private String modelo;
    private List<Propietario> listaPropietarios;

    @Override
    public String toString() {
        return "Auto [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", listaPropietarios=" + listaPropietarios
                + "]";
    }

    // Constructor vacío (obligatorio para frameworks y buenas prácticas)
    public Auto() {
    }

    // Constructor con atributos básicos
    public Auto(Long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;

    }

    // --- Métodos Getters y Setters ---

    public Auto(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
