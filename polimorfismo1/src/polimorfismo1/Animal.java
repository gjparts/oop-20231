/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo1;

/**
 *
 * @author Gerardo
 */
public class Animal {
    //atributos
    private String nombre;
    private String especie;
    private int patas;
    private boolean tieneCola;
    //constructores
    public Animal( String nombre, String especie, int patas, boolean tieneCola ){
        this.nombre = nombre;
        this.especie = especie;
        this.patas = patas;
        this.tieneCola = tieneCola;
    }
    //metodos
    public void imprimir(){
        System.out.println("******"+this.nombre+"******");
        System.out.println("Especie: "+this.especie);
        System.out.println("Patas: "+this.patas);
        System.out.println("Tiene cola: "+( this.tieneCola == true ? "Si" : "No" ));
    }
    public void hablar(){
        System.out.println(this.nombre+" emite sonido.");
    }
    public String getNombre(){
        return this.nombre;
    }
}
