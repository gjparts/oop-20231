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
        
        Carro c3 = new Carro("Honda", "Civic");
        System.out.println("Marca de c3: "+c3.marca);
        System.out.println("Color de c3: "+c3.color);
        
        Punto p1 = new Punto(5, 4);
        Punto p2 = new Punto(1,3);
        //Punto p3 = new Punto(); no dejara porque exige el constr.
                                 //con parametros
        
        Persona pe1 = new Persona();
        System.out.println(pe1.nombre);
        
        Persona pe2 = new Persona("Gerardo", 'M', 40);
        
        try{
            pe2.setEdad(-1);
        }catch(Exception ex){
            
        }
        
        System.out.println(pe2.nombre);
        System.out.println("imprimir persona 2:");
        pe2.imprimir();
        
        Persona pe3 = new Persona("Josue", 'M', 20, 10000, true);
        System.out.println(pe3.nombre);
        pe3.saludar();
        pe3.despedirse(true);
        pe3.despedirse(false);
    }
    
}
