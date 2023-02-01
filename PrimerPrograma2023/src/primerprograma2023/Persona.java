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
    public int edad;
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
        this.edad = edad;
        this.salario = 0;
        this.casado = false;
    }
    public Persona(String nombre, char genero, int edad, double salario, boolean casado){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.salario = salario;
        this.casado = casado;
    }
}
