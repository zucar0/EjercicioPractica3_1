/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractica3_1;

/**
 *
 * @author Toño
 */
public class Datos {
    
    private String localidad;
    private String clave;
    private String turno;
    private String centroEducativo;
    private String domicilio;
    private int numExterior;
    private int codigoPostal;
    private int lada;
    private int telefono;
    private int docentesMujeres;
    private int docentesHombres; 
    private int alumnosMujeres;
    private int alumnosHombres; 
    
        //Constructor
    public Datos(String localidad, String clave, String turno, String centroEducativo, String domicilio, int numExterior, int codigoPostal, int lada, int telefono, int docentesMujeres, int docentesHombres, int alumnosMujeres, int alumnosHombres){
        this.localidad=localidad;
        this.clave=clave;
        this.turno=turno;
        this.centroEducativo=centroEducativo;
        this.domicilio=domicilio; 
        this.numExterior=numExterior;
        this.codigoPostal=codigoPostal;
        this.lada=lada;
        this.telefono=telefono;
        this.docentesMujeres=docentesMujeres;
        this.docentesHombres=docentesHombres; 
        this.alumnosMujeres=alumnosMujeres;
        this.alumnosHombres=alumnosHombres;
    }
    
    public String toString() {
        String datosCSV = "";
        datosCSV = "\nLocalidad: " + localidad +
                   "\nClave: "             + clave +
                   "\nTurno: "             + turno +
                   "\nCentro educativo: " + centroEducativo+
                   "\nDomicilio: " + domicilio+
                   "\nNúm. Exterior: " + numExterior+
                   "\nCódigo Postal: " + codigoPostal+
                   "\nLADA: " + lada +
                   "\nTeléfono: " + telefono +
                   "\nDocentes mujeres: " + docentesMujeres+ 
                   "\nDocentes hombres: " + docentesHombres+
                   "\nAlumnos mujeres: " + alumnosMujeres +
                   "\nAlumnos hombres: " + alumnosHombres;
        return datosCSV;
    }
    
    
    public String getLocalidad(){
        return localidad;
    }
    
    public void setLocalidad(String localidad){
        this.localidad=localidad;
    }
    
    public String getClave(){
        return clave;
    }
    public void setClave(String clave){
        this.clave=clave;
    }
    
    public String getTurno(){
        return turno;
    }
    public void setTurno(String turno){
        this.turno=turno;
    }
    
    public String getCentroEducativo(){
        return centroEducativo;
    }
    
    public void setCentroEducativo(String centroEducativo){
        this.centroEducativo=centroEducativo;
    }
    public String getDomicilio(){
        return domicilio;
    }
    
    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
    public int getNumExterior(){
        return numExterior;
    }
    
    public void setNumExterior(int numExterior) {
        this.numExterior = numExterior;
    }
    
    
    public int getCodigoPostal(){
        return codigoPostal;
    }
    public void setCodigoPostal(int codigoPostal){
        this.codigoPostal=codigoPostal;
    }
    public int getLada(){
        return lada;
    }
    
    public void setLada(int lada){
        this.lada=lada;
    }
    public int getTelefono(){
        return telefono;
    }
    
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    
    public int getDocentesMujeres(){
        return docentesMujeres;
    }
    
    public void setDocentesMujeres(int docentesMujeres){
        this.docentesMujeres=docentesMujeres;
    }
    
    public int getDocentesHombres(){
        return docentesHombres;
    }
    
    public void setDocentesHombres(int docentesHombres){
        this.docentesHombres=docentesHombres;
    }
    
    public int getAlumnosHombres(){
        return alumnosHombres;
    }
    
    public void setAlumnosHombres(int alumnosHombres){
        this.alumnosHombres=alumnosHombres;
    }
    
    public int getAlumnosMujeres(){
        return alumnosMujeres;
    }
    
    public void setAlumnosMujeres(int alumnosMujeres){
        this.alumnosMujeres=alumnosMujeres;
    }
    
}
