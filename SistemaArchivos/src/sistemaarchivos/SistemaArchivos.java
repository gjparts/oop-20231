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
        f1.set(2023, 2, 28, 9, 52, 59);
        
        
        File a1 = new File("prueba.docx", 150123, "docx", f1);
        System.out.println( a1.toString() );
    }
    
}
