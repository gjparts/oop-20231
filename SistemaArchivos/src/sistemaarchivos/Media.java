package sistemaarchivos;

import java.util.Calendar;
public class Media extends File {
    //atributos
    public Author author;
    public int duration;
    //constructores
    public Media(String name, int size, String extension, Calendar creationDate, Author author, int duration){
        //construir la super clase
        super(name, size, extension, creationDate);
        //llenar los atributos de la clase hijo
        this.author = author;
        this.duration = duration;
    }
}
