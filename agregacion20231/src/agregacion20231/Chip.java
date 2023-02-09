package agregacion20231;
/**
 * Define un chip telefonico
 * @author Gerardo Portillo
 * @since 2023/02/09
 */
public class Chip {
    public Operador proveedor;
    public int numeroTelefonico;
    /**
     * Crea un objeto de clase Chip
     * @param proveedor el proveedor de servicios telefonicos, de tipo Operador
     * @param numeroTelefonico el numero de telefono asignado al chip
     */
    public Chip(Operador proveedor, int numeroTelefonico){
        this.proveedor = proveedor;
        this.numeroTelefonico = numeroTelefonico;
    }
}
