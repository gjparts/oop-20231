package herencia20231;

public class Herencia20231 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Gerardo Portillo",40,"Masculino");
        p1.saludar();
        
        Estudiante e1 = new Estudiante("Josue Erazo", "Masculino", 18, "20012002049", "Ing. Industrial");
        e1.saludar();
        e1.estudiar();
        System.out.println(e1.nombre);
        
        Persona p2 = new Persona("Viena Portillo",14,"Femenino");
        System.out.println(p2.nombre);
        
        Empleado em1 = new Empleado();
        em1.nombre = "Filomeno Colinas";
        em1.edad = 45;
        em1.genero = "Masculino";
        em1.salario = 20000;
        em1.cargo = "Maestro de Obra";
        em1.saludar();
        em1.trabajar();
        
    }
    
}
