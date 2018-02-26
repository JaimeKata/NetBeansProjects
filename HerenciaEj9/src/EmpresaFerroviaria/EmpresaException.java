/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaFerroviaria;

/**
 *
 * @author usuario
 */
public class EmpresaException extends Exception{
    public static final String EMPLEADO_REGISTRADO = "El nombre del empleado ya se encuentra en el sistema.";
    public static final String ADMIN_REGISTRADO = "El nombre del administrador ya se encuentra en el sistema.";
    public static final String MAQUINISTA_REGISTRADO = "El nombre del maquinista ya se encuentra en el sistema.";
    public static final String EMPLEADO_NO_ENCONTRADO = "El empleado que desea modificar no esta registrado en el sistema";
    public static final String ADMIN_NO_ENCONTRADO = "El administrativo que desea modificar no esta registrado en el sistema";
    public static final String MAQUINISTA_NO_ENCONTRADO = "El maquinista que desea modificar no esta registrado en el sistema";
    public EmpresaException(){
        super("Se ha producido una excepción en la aplicación");
    }
    public EmpresaException(String txt){
        super(txt);
    }
}
