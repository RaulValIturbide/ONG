/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

/**
 *
 * @author baske
 */
public class Socio {
        
    
    private String nombre;
    private String DNI;
    private double aportacion;
    
    public Socio(String nombre,String DNI, double aportacion){
        this.nombre = nombre;
        this.DNI = DNI;
        this.aportacion = aportacion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDNI(){
        return DNI;
    }
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    public double getAportacion(){
        return aportacion;
    }
    public void setAportacion(double aportacion){
        this.aportacion = aportacion;
    }
    
    @Override
    public String toString() {
        return String.format("""
                          DNI: %s
                          Nombre: %s
                          Aportacion: %f
                          """, DNI, nombre, aportacion);

    }
    
}
