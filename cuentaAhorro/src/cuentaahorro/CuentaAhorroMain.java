package cuentaahorro;

public class CuentaAhorroMain {

    public static void main(String[] args) {
        //pruebas
        CuentaAhorro c1 = new CuentaAhorro();
        System.out.println("Saldo "+c1.getSaldo());
        c1.depositar(2000);
        c1.depositar(500);
        System.out.println("Saldo "+c1.getSaldo());
        c1.retirar(750);
        System.out.println("Saldo "+c1.getSaldo());
    }
    
}
