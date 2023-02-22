package herencia20231;
/**
 * Define a un practicante
 * @author Gerardo Portillo
 * @since 2023/02/22
 */
public class Praticante extends Empleado {
    //atributos
    public int meses;
    //constructores
    /**
     * Construye un objeto de clase Practicante
     * @param nombre    nombre del practicante
     * @param edad      edad del practicante
     * @param meses     meses de practica que hara
     */
    public Praticante(String nombre, int edad, int meses){
        //construir la superclase
        super();
        
        //inicializar los atributos de la clase abuelo
        this.nombre = nombre;
        this.edad = edad;
        
        //inicializar los atributos de la clase padre
        this.salario = 0.00f;
        this.cargo = "Practicante";
        
        //inicializar los atributos de la clase hijo
        this.meses = meses;
    }
}
