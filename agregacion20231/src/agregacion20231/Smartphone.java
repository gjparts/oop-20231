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
        System.out.println("Fabricante: "+this.marca.nombre);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Almacenamiento: "+this.almacenamiento+"GB");
        System.out.println("RAM: "+this.ram+"GB");
        //comprobar si tiene bateria:
        if( this.bateria == null )
            System.out.println("Bateria: No tiene");
        else
        {
            System.out.println("Bateria *****");
            System.out.println("\tMarca: "+this.bateria.marca.nombre);
            System.out.println("\tMiliAmperios: "+this.bateria.miliAmperios);
        }
        //comprobar si tiene chip1:
        if( this.chip1 == null )
            System.out.println("Chip 1: no tiene");
        else
        {
            System.out.println("Chip 1 *******");
            System.out.println("\tProveedor de servicios: "+this.chip1.proveedor.nombre);
            System.out.println("\tPais: "+this.chip1.proveedor.pais);
            System.out.println("\tNumero de telefono: "+this.chip1.numeroTelefonico);
        }
        //comprobar si tiene chip2:
        if( this.chip2 == null )
            System.out.println("Chip 2: no tiene");
        else
        {
            System.out.println("Chip 2 *******");
            System.out.println("\tProveedor de servicios: "+this.chip2.proveedor.nombre);
            System.out.println("\tPais: "+this.chip2.proveedor.pais);
            System.out.println("\tNumero de telefono: "+this.chip2.numeroTelefonico);
        }
    }
}
