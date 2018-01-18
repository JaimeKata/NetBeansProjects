
package Banco;

/**
 *
 * @author JaimeKata
 */
public class CuentaCorriente {
    private String numeroCuenta;
    private String nombreCliente;
    private double saldo;
    private final static int numeroMinimo = 0;
    private final static int numeroMaximo = 10;
    
    public CuentaCorriente(){
        this.numeroCuenta = null;
        this.nombreCliente = null;
        this.saldo = 0; 
    }
    public CuentaCorriente(String nombreCliente, double saldo){
        this.numeroCuenta = "00"+(int) Math.floor(Math.random() * (numeroMinimo - numeroMaximo) + numeroMaximo);
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    @Override
    public String toString() {
        return "CuentaCorriente[" + "Numero de Cuenta:" + numeroCuenta +", nombre del cliente:  "+nombreCliente+", saldo:" + saldo + "]";
    }
    
}
