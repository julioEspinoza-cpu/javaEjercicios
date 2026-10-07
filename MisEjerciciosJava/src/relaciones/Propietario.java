
package relaciones;

public class Propietario {

    // 1. Atributos (Las variables donde se guarda la información)
    private Long id;
    private String nombre;
    private String apellido;

    @Override
    public String toString() {
        return "Propietario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
    }

    // 2. Constructor vacío (Obligatorio)
    public Propietario() {
    }

    // 3. Constructor con parámetros (Por si quieres crear el propietario con datos
    // desde el inicio)
    public Propietario(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // 4. Métodos Getters y Setters (¡Los que le faltan a tu proyecto!)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
