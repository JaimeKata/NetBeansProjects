/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime-kata
 */
public class ColegioException extends Exception{
    public static final String DNI_REGISTRADO = "El DNI ya esta registrado en el sistema";
    public static final String CODIGO_REGISTRADO = "El codigo de esta asignatura ya esta registrado en el sistema";
    public static final String TUTOR_NO_REGISTRADO = "El tutor no esta registrado en el sistema";
    public static final String DATOS_ERRONEOS = "El alumno o la asignatura no existen";
    public static final String ALUMNO_NO_REGISTRADO = "El alumno no existe en el sistema";
    public static final String NOTA_REGISTRADA = "La nota de este alumno en esta asignatura ya se encuentra registrada";
    public static final String ASIGNATURA_NO_REGISTRADA = "El codigo de esta asignatura no está registrado en el sistema";
    
    public ColegioException(){
        super("Se ha producido una excepción en la aplicación");
    }
    public ColegioException(String txt){
        super(txt);
    }
    
}
