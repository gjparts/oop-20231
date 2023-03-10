package sistemaarchivos;

import java.util.Calendar;
public class Audio extends Media {
    public String artist;
    public String album;
    public int year;
    public int track;
    //constructores
    public Audio(String name, int size, String extension, Calendar creationDate,
                 Author author, int duration,
                 String artist, String album, int year, int track){
        //construir la super clase
        super(name, size, extension, creationDate, author, duration);
        this.setType("Audio File");   //super.setType("Audio File");
        //inicalizar los atributos de la clase hijo
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.track = track;
    }
    //metodos
    @Override
    public String toString(){
        //obtener el stoString de la super clase como
        //punto de partida
        //Media hereda toString() de File
        //Audio sobreescribe toString() de la clase Media
        String str = super.toString();
        //anexar al String los datos de Audio y Media
        str += "\nAuthor: "+this.author.nombre;
        str += "\nDuration: "+this.duration+" seconds.";
        str += "\nArtist: "+this.artist;
        str += "\nAlbum: "+this.album;
        str += "\nYear: "+this.year;
        str += "\nTrack Number: "+this.track;
        
        return str;
    }
}
