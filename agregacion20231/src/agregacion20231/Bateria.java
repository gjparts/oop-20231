package agregacion20231;
/**
 * Define una bateria para smartphone
 * @author Gerardo Portillo
 * @since 2023/02/09
 */
public class Bateria {
    public Fabricante marca;
    public float miliAmperios;
    /**
     * Crea un objeto de clase Bateria
     * @param marca el fabricante de la bateria, el tipo de dato es Fabricante
     * @param miliAmperios la capacidad en mA de la bateria
     */
    public Bateria(Fabricante marca, float miliAmperios){
        this.marca = marca;
        this.miliAmperios = miliAmperios;
    }
}
