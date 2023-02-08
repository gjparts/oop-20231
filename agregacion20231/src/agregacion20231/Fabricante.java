package agregacion20231;

/**
 * Define a un fabricante de productos electronicos
 * @author Gerardo Portillo
 * @since 2023/08/02
 */
public class Fabricante {
    //atributos
    public String nombre;
    public String pais;
    public String contacto;
    /**
     * Construye un nuevo objeto de clase Fabricante
     * @param nombre    el nombre del fabricante
     * @param pais      el pais del fabricante
     * @param contacto  la persona a contactar
     */
    public Fabricante(String nombre, String pais, String contacto){
        this.nombre = nombre;
        this.pais = pais;
        this.contacto = contacto;
    }
}
