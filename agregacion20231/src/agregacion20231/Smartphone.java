package agregacion20231;
/**
 * Define a un telefono inteligente (Smartphone)
 * @author Gerardo Portillo
 * @since   2023/02/09
 */
public class Smartphone {
    //atributos
    public Fabricante marca;
    public String modelo;
    public int almacenamiento;
    public int ram;
    public Bateria bateria;
    public Chip chip1;
    public Chip chip2;
    //constructores
    /**
     * Crear un objeto de tipo Smartphone
     * @param marca la marca del equipo de tipo Fabricante
     * @param modelo el modelo del equipo de tipo cadena de texto
     */
    public Smartphone(Fabricante marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    //metodos
    /**
     * Imprime un resumen con la informacion relevante del smartphone
     */
    public void imprimir(){
        System.out.println("*********** SMARTPHONE ***********");
        System.out.println("Fabricante: "+marca);
    }
}
