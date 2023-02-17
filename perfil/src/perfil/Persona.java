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
    //constructores
    public Persona(String codigo, String nombre, String telefono, Direccion direccion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    //metodos
    public void imprimir(){
        System.out.println("******* Perfil *******");
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Telefono: "+this.telefono);
        System.out.print("Dirección: ");
        if( this.direccion == null )
            System.out.println("No viene");
        else
        {
            System.out.println( this.direccion.colonia.tipo+" "+this.direccion.colonia.nombre );
            System.out.println("Ave."+this.direccion.avenida+", calle: "+this.direccion.calle);
            System.out.println("Casa: "+this.direccion.casa);
            System.out.println("Referencias: "+this.direccion.referencias);
        }
        System.out.print("Empresa donde labora: ");
        if( this.empresaLabora == null )
            System.out.println("No determinada");
        else
        {
            System.out.println( this.empresaLabora.nombre );
            System.out.println( "Tel: "+this.empresaLabora.telefono );
            System.out.println("Cargo desempeñado: "+this.cargo);
        }
        System.out.print("Conyuge: ");
        if( this.conyuge == null )
            System.out.println("No tiene");
        else
            System.out.println( this.conyuge.nombre );
        //hijos (es un arreglo)
        System.out.print("Hijos: ");
        if( this.hijos == null )
            System.out.println("No tiene");
        else
        {
            System.out.println("");
            for( int i = 0; i < this.hijos.length; i++ )
            {
                if( this.hijos[i] != null )
                    System.out.println("\tHijo "+(i+1)+": "+this.hijos[i].nombre);
            }
        }
        //referencias personales
        System.out.print("Referencias Personales: ");
        if( this.referencias == null )
            System.out.println("No tiene");
        else
        {
            System.out.println("");
            for( int i = 0; i < this.referencias.size(); i++ )
            {
                if( this.referencias.get(i) != null )
                    System.out.println("\tReferencia "+(i+1)+": "+this.referencias.get(i).nombre);
            }
        }
    }
}
