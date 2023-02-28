/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaarchivos;

/**
 *
 * @author Gerardo
 */
import java.util.Calendar;
public class File {
    //atributos
    public String name;
    public int size;
    private String type;
    public String extension;
    public Calendar creationDate;
    //constructores
    public File(String name, int size, String extension, Calendar creationDate){
        this.name = name;
        this.size = size;
        this.extension = extension;
        this.creationDate = creationDate;
        this.type = "undefined";
    }
    //metodos
    public String getType(){
        return type;
    }
    public String toString(){
        String str;
        str = "***** FILE *****";
        str += "\nname: "+this.name;
        str += "\nsize (in bytes): "+this.size;
        str += "\nType: "+this.type;
        str += "\nExtension: "+this.extension;
        
        str += "\nCreation Date: ";
        if( this.creationDate == null )
            str += "unknown";
        else
            str += this.creationDate.toString();
        
        return str;
        /*System.out.println("***** FILE *****");
        System.out.println("name: "+this.name);
        System.out.println("size (in bytes): "+this.size);
        System.out.println("Type: "+this.type);
        System.out.println("Extension: "+this.extension);
        System.out.println("Creation Date: "+this.creationDate.toString());*/
    }
}
