package cuentaahorro;
/**
 * Define una clase que representa una cuenta de ahorros
 * @author Gerardo Portillo
 * @since 2023/02/14
 */
public class CuentaAhorro {
    //atributos
    public String nombreCliente;
    public String numeroCuenta;
    private float saldo;
    //constructores
    /**
     * Construye un nuevo objeto de clase CuentaAhorro
     */
    public CuentaAhorro(){
        this.nombreCliente = "sin definir";
        this.numeroCuenta = "no determinado";
        this.saldo = 0.00f;
    }
    //metodos
    /**
     * Metodo set, aumenta el saldo de la cuenta de ahorros mediante un deposito
     * @param monto valor a depositar
     */
    public void depositar(float monto){
        //validacion
        if( monto >= 0 )
            this.saldo += monto;
        else
            throw new IllegalArgumentException("No se permite montos negativos.");
    }
    /**
     * Metodo set, disminuye el saldo de la cuenta de ahorros mediante un retiro
     * @param monto valor a retirar
     */
    public void retirar(float monto){
        if( monto < 0 )
            throw new IllegalArgumentException("No se permite montos negativos.");
        else
        {
            if( monto > this.saldo )
                throw new IllegalArgumentException("No se permite retirar mas de lo que hay.");
            else
                this.saldo -= monto;
        }
    }
    /**
     * Metodo get, devuelve el saldo de la cuenta de ahorros
     * @return un valor float con el saldo de la cuenta de ahorros
     */
    public float getSaldo(){
        return this.saldo;
    }
}
