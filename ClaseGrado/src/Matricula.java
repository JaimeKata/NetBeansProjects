/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaime-kata
 */
public class Matricula {
    private String dniAlumno;
    private String codigoAsignatura;
    private String nombreAsignatura;
    private int notaAsignatura;
    
    public Matricula(){
        this.dniAlumno = null; 
        this.codigoAsignatura = null; 
        this.nombreAsignatura = null; 
        this.notaAsignatura = 0; 
    }
    
    public Matricula(String dniAlumno, String codigoAsignatura, String nombreAsignatura, int notaAsignatura){
        this.dniAlumno = dniAlumno;
        this.codigoAsignatura = codigoAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.notaAsignatura = notaAsignatura;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getNotaAsignatura() {
        return notaAsignatura;
    }

    public void setNotaAsignatura(int notaAsignatura) {
        this.notaAsignatura = notaAsignatura;
    }

    @Override
    public String toString() {
        return "dniAlumno=" + dniAlumno + ", codigoAsignatura=" + codigoAsignatura + ", nombreAsignatura=" + nombreAsignatura + ", notaAsignatura=" + notaAsignatura;
    }
    
    
}
