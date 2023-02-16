package perfil;
import java.util.LinkedList;
public class Persona {
    //atributos
    public String codigo;
    public String nombre;
    public String telefono;
    public Direccion direccion;
    public Empresa empresaLabora;
    public String cargo;
    public Persona conyuge;
    public Persona[] hijos;
    public LinkedList<Persona> referencias;
}
