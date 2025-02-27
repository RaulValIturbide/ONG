/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import Grafica.Menu;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author baske
 */
public class GestionSocio {

    public static Scanner teclado = new Scanner(System.in);

    ArrayList<Socio> listaSocios = new ArrayList<>();

    public void addSocio(Socio socio) {
        listaSocios.add(socio);
    }

    public void rmvSocio() {
        String usuario;
        boolean encontrado = false;
        System.out.println("Dni del socio que quieres borrar:");
        System.out.print(">>");
        usuario = teclado.nextLine();
        for (int i = 0; i < listaSocios.size(); i++) {
            if (listaSocios.get(i).getDNI().equals(usuario)) {
                listaSocios.remove(listaSocios.get(i));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Usuario no encontrado");
        }
    }

    public void addSocio() {
        String nombre;
        String dni;
        int aportacion;
        int edad;
        boolean correcto = false;
        while (!correcto) {
            try {
                System.out.println("Nombre del socio?:");
                System.out.print(">>");
                nombre = teclado.nextLine();

                do {
                    System.out.println("Dni del socio?:");
                    System.out.print(">>");
                    dni = teclado.nextLine();
                } while (!compDNI(dni));

                System.out.println("Aportacion del socio?:");
                System.out.print(">>");
                aportacion = Integer.parseInt(teclado.nextLine());

                System.out.println("Edad del socio?");
                System.out.print(">>");
                edad = Integer.parseInt(teclado.nextLine());

                correcto = true;
                listaSocios.add(new Socio(nombre, dni, aportacion, edad));
                Menu.limpiarBuffer();

            } catch (InputMismatchException e) {
                System.out.println("introduccion incorrecta, intentelo de nuevo");

            } catch (Exception ex) {
                System.out.println("Error desconocido, intentelo de nuevo");
            }
        }

    }

    /**
     * Este metodo sirve para comprobar que el dni cumple con el formato de 8
     * numeros y una letra final
     *
     * @param dni
     * @return
     */
    private boolean compDNI(String dni) {
        String expReg = "^\\d{8}[A-Z]{1}$";
        if (dni.matches(expReg)) {
            return true;
        } else {
            System.out.println("Formato de Dni incorrecto (8 numeros y letra Mayus)");
            return false;
        }
    }

    public void removeSocio(Socio socio) {
        listaSocios.remove(socio);
    }

    public void listar() {
        for (int i = 0; i < listaSocios.size(); i++) {
            System.out.println((i + 1) + "\n" + listaSocios.get(i).toString());

        }
    }

    public ArrayList<Socio> getListaSocio() {
        return listaSocios;
    }

}
