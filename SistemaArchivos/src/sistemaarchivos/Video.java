package sistemaarchivos;

import java.util.LinkedList;
public class Video extends Media {
    public String codec;
    public int chapters;
    public String[] audio;
    public LinkedList<Subtitle> subtitles;
    
    public Video(String name, int size, String extension){
        //construir la super clase
        super(name, size, extension, null, null, 0);
        
        //llenar los atributos
        this.codec = "unknown";
        this.chapters = 0;
        this.audio = null;
        this.subtitles = null;
    }
}
