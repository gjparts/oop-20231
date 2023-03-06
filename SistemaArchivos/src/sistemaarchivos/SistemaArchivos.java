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
public class SistemaArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear un objeto feca
        Calendar f1 = Calendar.getInstance();
        f1.set(2023, 1, 28, 17, 52, 59);
                
        File a1 = new File("prueba", 150123, "docx", f1);
        System.out.println( a1.toString() );
        
        //crear autores
        Author au1 = new Author("Gerardo Portillo", "califik.com", "gjparts@gmail.com");
        Author au2 = new Author("Estebancito Maravilla","","steviewonder@gmail.com");
        Author au3 = new Author("Jhonny El Pirata","","");
        //crear documentos y fecha de modificacion
        Calendar f2 = Calendar.getInstance();
        f2.set(2023, 2, 6, 9, 12, 37);
        
        Document d1 = new Document("tesis", 560124, "docx", f1, au1, f2, 5000);
        Document d2 = new Document();
        d2.name = "informe";
        d2.extension = "docx";
        d2.creationDate = f2;
        
        System.out.println( d1.toString() );
        System.out.println( d2.toString() );
        
        //crear archivos de audio
        Audio aud1 = new Audio("jeremy", 3456123, "mp3", f1, au3, 216000,
                                "Pearl Jam", "Ten", 1991, 6);
        System.out.println( aud1.toString() );
        
        //crear un archivo de video
        Video v1 = new Video("Watchmen", 345678959, "mkv");
        v1.chapters = 10;
        v1.codec = "Matroska Video";
        v1.creationDate = f2;
        v1.author = new Author("Cuevana 3","cuevana3.org","");
        System.out.println(v1.toString());
        
        //crear un audio mas
        Audio aud2 = new Audio("Damage Inc.",123456,"mp3", null,
                                new Author("Capitan Nemo","",""), 512000,
                                "Metallica", "Master of Puppets", 1986, 6);
        
        //Calendar.getInstance() nos crea un Calendar con la fecha/hora actuales
        aud2.creationDate = Calendar.getInstance();
        aud2.creationDate.set(2020, 0,5,23,13,45);
        System.out.println(aud2.toString());
    }
    
}
