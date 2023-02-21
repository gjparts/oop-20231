package herencia20231;
/**
 * Define a un empleado de la organizacion
 * @author Gerardo Portillo
 * @since 2023/02/21
 */
public class Empleado extends Persona {
    //atributos
    public float salario;
    public String cargo;
    //constructores
    /**
     * Crea un objeto de clase Empleado
     */
    public Empleado(){
        //construir la super clase (clase padre o sea Persona)
        super("no tiene", 0, "no definido");
        //atributos de esta clase
        this.salario = 0.00f;
        this.cargo = "no determinado";
    }
    //metodos
    /**
     * muestra informacion laboral sobre el empleado
     */
    public void trabajar(){
        System.out.println("Estoy trabajando como "+this.cargo);
    }
}
