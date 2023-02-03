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
public class Persona {
    //atributos de la clase
    public String nombre;
    public char genero;
    private int edad;
    public double salario;
    public boolean casado;
    //constructores
    public Persona(){
        this.nombre = "no tiene";
        this.genero = ' ';
        this.edad = 0;
        this.salario = 0;
        this.casado = false;
    }
    public Persona(String nombre, char genero, int edad){
        this.nombre = nombre;
        this.genero = genero;
        this.setEdad(edad); //la edad tiene reglas a traves de un set
        this.salario = 0;
        this.casado = false;
    }
    public Persona(String nombre, char genero, int edad, double salario, boolean casado){
        this.nombre = nombre;
        this.genero = genero;
        this.setEdad(edad); //la edad tiene reglas a traves de un set
        this.salario = salario;
        this.casado = casado;
    }
    //metodos
    /**
     * Este metodo da un saludo.
     */  
    public void saludar(){
        System.out.println("Hola mi nombre es "+this.nombre);
    }
    /**
     * Este metodo da un mensaje de despedida.
     * @param enIngles si le pone true se despide en ingles de lo contrario en español
     */
    public void despedirse(boolean enIngles){
        if( enIngles == true )
        {
            System.out.println("Goodbye");
        }
        else
        {
            System.out.println("Adios.");
        }
    }
    /**
     * imprime un resumen de los datos de la persona
     */
    public void imprimir(){
        System.out.println("********************");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Genero: "+( this.genero == 'M' ? "Masculino" : ( this.genero == 'F' ? "Femenino" : "N/A" ) )  );
        System.out.println("Edad: "+this.edad);
        System.out.println("Salario: "+this.salario);
        System.out.println("Es Casado: "+( this.casado == true ? "Si" : "No" ) );
    }
    /*
    public void imprimir(){
        //la misma funcion imprimir pero sin el operador ternario
        System.out.println("********************");
        System.out.println("Nombre: "+this.nombre);
        
        if( this.genero == 'M' )
            System.out.println("Masculino");
        else
        {
            if( this.genero == 'F' )
                System.out.println("Femenino");
            else
                System.out.println("N/A");
        }
        
        System.out.println("Edad: "+this.edad);
        System.out.println("Salario: "+this.salario);
        System.out.println("Es Casado: "+( this.casado == true ? "Si" : "No" ) );
    }*/
    //metodos get y set (para los atributos privados)
    /**
     * Asigna una edad a la persona
     * @param edad debe ser un entero entre 0 y 200
     */
    public void setEdad(int edad){
        if( edad >= 0 && edad <= 200 )
            this.edad = edad;   //si se cumple entonces se escribe el atr.
        else
            throw new IllegalArgumentException("Edad debe estar entre 0 y 200");
    }
}
