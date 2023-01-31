/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma2023;

/**
 *
 * @author Gerardo
 */
public class PrimerPrograma2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar un nuevo objeto de clase Carro
        Carro c1 = new Carro();
        c1.marca = "Toyota";
        c1.color = "Rojo";
        c1.modelo = "Yaris";
        c1.anio = 2007;
        
        Carro c2 = new Carro();
        System.out.println( "La marca de c2 es "+c2.marca );
        
    }
    
}
