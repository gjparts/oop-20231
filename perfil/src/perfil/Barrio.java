package perfil;
/**
 * Define a un barrio como una zona geografica
 * @author Gerardo Portillo
 * @since 2023/02/15
 */
public class Barrio {
    //atributos
    public String nombre;
    public String tipo;
    public String zona;
    public String codigoPostal;
    //constructores
    /**
     * Construye un objeto de clase Barrio
     * @param nombre    nombre del barrio
     * @param tipo      puede ser barrio, colonia, residencial, etc.
     * @param zona      punto cardinal donde se ubica
     * @param codigoPostal zip code
     */
    public Barrio(String nombre, String tipo, String zona, String codigoPostal){
        this.nombre = nombre;
        this.tipo = tipo;
        this.zona = zona;
        this.codigoPostal = codigoPostal;
    }
}
