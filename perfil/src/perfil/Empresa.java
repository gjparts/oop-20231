package perfil;
/**
 * Define a una empresa o negocio
 * @author Gerardo Portillo
 * @since 2023/02/15
 */
public class Empresa {
    //atributo
    public String nombre;
    public Direccion direccion;
    public String telefono;
    //constructores
    /**
     * Construye un objeto de clase Empresa
     * @param nombre    nombre de la empresa o negocio
     * @param direccion ubicacion, debe ser de clase Direccion
     * @param telefono  telefono de contacto
     */
    public Empresa(String nombre, Direccion direccion, String telefono ){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
