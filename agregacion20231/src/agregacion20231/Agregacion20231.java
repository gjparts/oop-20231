/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion20231;

/**
 *
 * @author Gerardo
 */
public class Agregacion20231 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fabricantes de equipos
        Fabricante sony = new Fabricante("Sony", "Japon", "Sr. Tanaka");
        Fabricante samsung = new Fabricante("Samsung","Corea del Sur","Sr. Kim");
        Fabricante apple = new Fabricante("Apple", "USA", "Mr. Tim Cook");
        //Operadores de servicios telefonicos
        Operador tigo = new Operador("CELTEL","Honduras");
        Operador claro = new Operador("Claro de Honduras","Honduras");
        
    }
    
}
