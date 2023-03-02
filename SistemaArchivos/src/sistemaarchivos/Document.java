package sistemaarchivos;

import java.util.Calendar;
public class Document extends File {
    //propiedades
    public Author author;
    public Calendar modificationDate;
    public int words;
    //constructores
    public Document(){
        //construir la super clase
        //como el constructor de Document no recibe suficiente informacion
        //para consutruir la super clase entonces le ponemos valores
        //default como parametros.
        super("unknown name", 0, "", null);
        //atributos de clase hijo
        this.author = null;
        this.modificationDate = null;
        this.words = 0;
    }
    //crear el otro constructor full parametros
}
