package agregacion20231;

/**
 * Define a un operador de servicios telefonicos
 * @author Gerardo Portillo
 * @since 2023/02/08
 */
public class Operador {
    //atributos
    public String nombre;
    public String pais;
    //constructores
    /**
     * Crea un objeto de clase Operador
     * @param nombre nombre de la compañia
     * @param pais   pais donde ofrece sus servicios
     */
    public Operador(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
    }
}
