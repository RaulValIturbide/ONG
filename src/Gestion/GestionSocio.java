/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;
import java.util.ArrayList;
/**
 *
 * @author baske
 */
public class GestionSocio {
    
    ArrayList<Socio> listaSocios = new ArrayList<>();

   public void addSocio(Socio socio){
       listaSocios.add(socio);
   }
   public void removeSocio(Socio socio){
       listaSocios.remove(socio);
   }
   public void listar(){
       for(int i = 0; i < listaSocios.size(); i++){
           listaSocios.get(i).toString();
       }
   }
    
}
