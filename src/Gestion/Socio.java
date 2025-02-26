/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import java.util.Comparator;
import java.util.Collections;
/**
 *
 * @author baske
 */
public class Socio implements Comparable<Socio> {
        

    private String nombre;
    private String DNI;
    private double aportacion;
    private int edad;
    
    public Socio(String nombre,String DNI, double aportacion,int edad){
        this.nombre = nombre;
        this.DNI = DNI;
        this.aportacion = aportacion;
        this.edad = edad;
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
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
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
                          Aportacion: %.2f
                          Edad: %d
                          """, DNI, nombre, aportacion,edad);

    }
    /**
     * -1 es cuando el objeto que se está comparando es mayor que el objeto en los argumentos
     * 1 es cuando el objeto que se está comparando es menor que el objeto en los argumentos
     * @param o el objeto a comparar
     * @return -1,0,1
     */
    @Override
    public int compareTo(Socio o) {
        if (this.aportacion > o.aportacion) {
            return -1;
        } else if (this.aportacion < o.aportacion) {
            return 1;
        } else {
            return 0;
        }
    }

   public static final Comparator<Socio> compararDNI = new Comparator<Socio>() { 
    @Override
    public int compare(Socio s1, Socio s2) {
        return s1.getDNI().toLowerCase().compareTo(s2.getDNI().toLowerCase());
    }
   };
   
   public static void sumaDNI(Socio s){
       String Dni = s.DNI.substring(0,8);
       System.out.println(Dni);
   }
    
    public static final Comparator<Socio> compararEdad = new Comparator<Socio>(){
        
        @Override
        public int compare(Socio s1, Socio s2){
        return Integer.compare(s2.getEdad(),s1.getEdad());
                }
    
    };
}


    
    

