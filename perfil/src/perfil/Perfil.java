/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfil;

import java.util.LinkedList;

/**
 *
 * @author Gerardo
 */
public class Perfil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //barrios
        Barrio satelite = new Barrio("Satelite", "Colonia", "Este", "21103");
        Barrio guamilito = new Barrio("Guamilito","Barrio","Centro","21101");
        //direcciones
        Direccion dirCofisa = new Direccion(guamilito, "7", "7", "123");
        Direccion dirGerardo = new Direccion(satelite,"Pasaje verduras","Boulevard Las Torres","123");
        //empresas
        Empresa cofisa = new Empresa("Compañia Financiera S.A.", dirCofisa, "5555-sincorriente");
        //array de hijos
        Persona viena = new Persona("1234","Viena Portillo","no tiene", dirGerardo);
        
        Persona[] hijosGerardo = {
            new Persona("789", "Josue Portillo", "no tiene", dirGerardo),
            viena
        };
        
        //referencias personales
        Persona brand = new Persona("456","Guillermo Brand","se lo robaron",null);
        
        LinkedList<Persona> refsGerardo = new LinkedList();
        refsGerardo.add(brand);
        refsGerardo.add( new Persona("111","Roberto Hernandez","no disponible",null) );
        refsGerardo.add( new Persona("458","Wilmer Suarez","no tiene",null) );
        
        Persona gerardo = new Persona("777","Gerardo Portillo","7777-7777", dirGerardo);
        gerardo.conyuge = new Persona("001","Irene Erazo","1111-1111", dirGerardo);
        gerardo.empresaLabora = cofisa;
        gerardo.cargo = "Director de IT";
        gerardo.hijos = hijosGerardo;
        gerardo.referencias = refsGerardo;
        gerardo.imprimir();
    }
    
}
