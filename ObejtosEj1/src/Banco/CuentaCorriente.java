package Banco;

/**
 *
 * @author JaimeKata
 */
public class CuentaCorriente {

    private String numero;
    private Double saldo;
    private String cliente;
    private static Integer siguiente = 1;

   
    public CuentaCorriente(Double saldo, String cliente) {
        String num = "0000" + siguiente;
        numero = num.substring(num.length() - 3);
        this.saldo = saldo;
        this.cliente = cliente;
        siguiente++;
    }

    
    public String getNumero() {
        return numero;
    }

  
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    public Double getSaldo() {
        return saldo;
    }

    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    
    public String getCliente() {
        return cliente;
    }

   
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

  
    public static Integer getSiguiente() {
        return siguiente;
    }

    
    public void ingresarEfectivo(Double importe) {
        this.saldo = saldo + importe;
    }
    
    public void borrarCuenta(){
        cliente = (cliente + " CERRADA");
        saldo = 0.0;
    }

    
    public Boolean retirarEfectivo(Double importe) {
        if (importe > this.saldo) {
            return false;
        } else {
            this.saldo = saldo - importe;
            return true;
        }
    }

    public static CuentaCorriente fusion(CuentaCorriente cuenta1, CuentaCorriente cuenta2){
        CuentaCorriente nueva = null;
        if(cuenta1.cliente.equalsIgnoreCase(cuenta2.cliente) && !cuenta1.numero.equalsIgnoreCase(cuenta2.numero)){
            nueva = new CuentaCorriente((cuenta1.saldo + cuenta2.saldo), cuenta1.cliente);
            System.out.println("Cuenta fusionada con existo");
            cuenta1.borrarCuenta();
            cuenta2.borrarCuenta();
        }else {
            System.out.println("Las cuentas no pertenecen al mismo cliente");
        }
        return nueva;
    }
    
    @Override
    public String toString() {
        return "Cuentacorriente [Cliente: "+cliente+" ,numero de cuenta: " + numero + " ,saldo: " + saldo + "]";
    }

    
    public String visualiza() {
        return "Cuentacorriente [Cliente: "+cliente+" ,numero de cuenta: " + numero + " ,saldo: " + saldo + "]";
    }

}
