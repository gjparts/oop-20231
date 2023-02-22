package herencia20231;
/**
 * Define a un catedratico
 * @author Gerardo Portillo
 * @since 2023/02/22
 */
public class Catedratico extends Empleado {
    //atributos
    public String profesion;
    //constructores
    /**
     * Crea un nuevo objeto de clase Catedratico
     * @param nombre    nombre del docente
     * @param salario   salario del docente
     * @param profesion profesion del docente
     */
    public Catedratico(String nombre, float salario, String profesion){
        //construir la super clase (el padre en este caso Empleado)
        super();    //constructor sin parametros de clase padre
        
        //inicializar los parametros de la clase abuelo (Persona)
        this.nombre = nombre;
        
        //inicailizar los parametros de la clase padre (Empleado)
        this.salario = salario;
        this.cargo = "Catedratico"; //siempre el cargo de este tipo de empleados sera Catedratico
        
        //inicializar los parametros de la clase hijo
        this.profesion = profesion;
    }
    //metodos
    /**
     * muestra informacion sobre el educador
     */
    public void educar(){
        System.out.println("Soy "+this.nombre+", estoy dando clases. Mi profesion es "+this.profesion);
    }
}
