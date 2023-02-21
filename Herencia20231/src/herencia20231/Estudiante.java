package herencia20231;
/**
 * Define a un estudiante
 * @author Gerardo Portillo
 * @since 2023-02-21
 */
public class Estudiante extends Persona {
    //atributos
    public String cuenta;
    public String carrera;
    /**
     * Crea un objeto de clase Estudiante
     * @param nombre    nombre completo del estudiante
     * @param genero    genero del estudiante
     * @param edad      edad del estudiante
     * @param cuenta    numero de cuenta usado por la universidad
     * @param carrera   carrera del estudiante
     */
    public Estudiante(String nombre, String genero, int edad, String cuenta, String carrera){
        //mandar a llamar el constructor de la super clase (la clase padre)
        super(nombre, edad, genero);
        //asignar los valores a los atributos de esta clase
        this.cuenta = cuenta;
        this.carrera = carrera;
    }
    //metodos
    /**
     * Muestra informacion sobre los estudios del estudiante
     */
    public void estudiar(){
        System.out.println("Tengo "+this.edad+" años y estudio la carrera "+this.carrera);
    }
}
