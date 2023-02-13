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
        //Baterias para smartphone
        Bateria batSony = new Bateria(sony, 4000);
        Bateria batSamsung = new Bateria(samsung, 4500);
        Bateria batApple = new Bateria(apple, 6000);
        //Chips
        Chip sim1 = new Chip(tigo, 99995599);
        Chip sim2 = new Chip(claro, 33331133);
        Chip sim3 = new Chip(tigo, 98981298);
        //Smartphones
        Smartphone s22 = new Smartphone(samsung, "S22 lite");
        s22.almacenamiento = 128;   s22.ram = 6;
        s22.bateria = batSamsung;   s22.chip1 = sim3;
        s22.chip2 = sim1;       
        s22.imprimir();
    }
    
}
