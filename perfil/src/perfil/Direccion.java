package perfil;
/**
 * Define a una direccion para ubicar una casa
 * @author Gerardo Portillo
 * @since 2023/02/15
 */
public class Direccion {
    //atributos
    public Barrio colonia;
    public String bloque;
    public String calle;
    public String avenida;
    public String casa;
    public String referencias;
    //constructores
    /**
     * Define un objeto de clase Direccion
     * @param colonia   barrio/colonia/residencial es de tipo Barrio
     * @param calle     calle donde se ubica
     * @param avenida   avenida donde se ubica
     * @param casa      numero de casa
     */
    public Direccion(Barrio colonia, String calle, String avenida, String casa){
        this.colonia = colonia;
        this.calle = calle;
        this.avenida = avenida;
        this.casa = casa;
    }
}
