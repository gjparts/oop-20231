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
        this.setType("Video File");   //super.setType("Video File");
        
        //llenar los atributos
        this.codec = "unknown";
        this.chapters = 0;
        this.audio = null;
        this.subtitles = null;
    }
    //metodos
    @Override
    public String toString(){
        //obtener el stoString de la super clase como
        //punto de partida
        //Media hereda toString() de File
        //Video sobreescribe toString() de la clase Media
        String str = super.toString();
        //anexar al String los datos de Video y Media
        str += "\nAuthor: "+this.author.nombre;
        str += "\nDuration: "+this.duration+" seconds.";
        str += "\nCodec: "+this.codec;
        str += "\nNumber of Chapters: "+this.chapters;
        //canales de audio disponibles
        str += "\nAudio channels:";
        for( int i = 0; i < this.audio.length; i++ ){
            //validacion de null
            if( this.audio[i] != null )
                str += "\n\t"+this.audio[i];
        }
        //subtitulos disponibles
        str += "\nAvailable subtitles:";
        for( int i = 0; i < this.subtitles.size(); i++ ){
            //validacion de null
            if( this.subtitles.get(i) != null )
                str += "\n\t"+this.subtitles.get(i).language+" ("+this.subtitles.get(i).author.nombre+")";
        }
        
        return str;
    }
}
