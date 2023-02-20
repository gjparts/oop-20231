package herencia20231;
/**
 * Define una clase que representa a una persona
 * @author Gerardo Portillo
 * @since 2023-02-20
 */
public class Persona {
    //atributos/propiedades
    public String nombre;
    public int edad;
    public String genero;
    //constructores
    /**
     * Crea un objeto de clase Persona
     * @param nombre    nombre de la persona
     * @param edad      edad de la persona
     * @param genero    genero de la persona
     */
    public Persona(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    //metodos
    /**
     * saluda dando nombre y edad de la persona
     */
    public void saludar(){
        System.out.println("Hola me llamo "+this.nombre+", mi edad es "+this.edad);
    }
}
