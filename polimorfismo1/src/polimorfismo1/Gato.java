package polimorfismo1;

public class Gato extends Animal {
    //atributos
    public String apodo;
    private boolean tienePelaje;
    //constructores
    public Gato(String apodo, boolean tienePelaje, boolean tieneCola){
        //construir la super clase
        super("Gato", "Mamifero", 4, tieneCola);
        //inicializar los atributos de la clase hijo
        this.apodo = apodo;
        this.tienePelaje = tienePelaje;
    }
    //metodos
    void ronronear(){
        System.out.println(this.getNombre()+"hace: Prrrrrrrrrrr");
    }
    //Polimorfismo: sobreesceibir metodos de la clase padre
    @Override
    public void hablar(){
        System.out.println("El gato hace miau.");
    }
    @Override
    public void imprimir(){
        //ejecutar el metodo imprimir de la clase padre
        //para aprovechar lo que ya esta escrito
        super.imprimir();
        
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Tiene Pelaje: "+( this.tienePelaje == true ? "Si" : "No" ));
    }
}
