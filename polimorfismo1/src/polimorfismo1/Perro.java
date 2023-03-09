package polimorfismo1;

import java.util.LinkedList;
public class Perro extends Animal {
    //atributos
    public String apodo;
    private String raza;
    //constructores
    public Perro(String apodo, String raza, boolean tieneCola){
        //construir la superclase
        super("Perro", "Mamifero", 4, tieneCola);
        //atributos de la clase hijo
        this.apodo = apodo;
        this.raza = raza;
    }
    //metodos
    public void jugar(){
        System.out.println(this.getNombre()+" corre feliz por todas partes.");
    }
    //polimorfismo de metodos
    @Override
    public void hablar(){
        System.out.println(this.getNombre()+" hace guau, si es bilingüe entonces hace bark.");
    }
    @Override
    public void imprimir(){
        //imprimir lo que imprime la superclase
        super.imprimir();
        
        //imprimir lo que corresponde a la clase hijo
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Raza: "+this.raza);
    }
}
