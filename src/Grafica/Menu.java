/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafica;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author baske
 */
public class Menu {

    public static Scanner teclado = new Scanner(System.in);

    public static void limpiarBuffer() {
        teclado.nextLine();
    }

    public static int introduccion() {
        int usuario = 0;
        boolean correcto = false;
        System.out.println("""
                           ¿Qué deseas hacer?
                           1-Añadir usuario
                           2-Eliminar usuario
                           3-Listar usuario
                           
                           0-Salir""");
        while (!correcto) {
            try {
                System.out.print(">>");
                usuario = teclado.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero");
            } catch (Exception e) {
                System.out.println("Erro desconocido, intentelo de nuevo");
            }
        }
        return usuario;
    }

    /**
     * El objetivo de este metodo es que el usuario decida por cual atributo
     * desea listar
     *
     * @return un numero que activará el switch desde la main para ejecutar un
     * listado u otro
     */
    public static int queListar() {
        int usuario = 0;
        boolean correcto = false;
        System.out.println("""
                           ¿Por que atributo quieres listar?
                           1-Aportacion(Mayor a Menor)
                           2-Edad (Mayor a Menor)
                           """);
        while (!margenDatos(1, 2, usuario)) {
            try {
                System.out.print(">>");
                usuario = teclado.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un numero e intentelo de nuevo");
            } catch (Exception e) {
                System.out.println("Error desconocido, intentelo de nuevo");
            }
        }

        return usuario;
    }

    /**
     * El objetivo de este metodo es marcar los min y max permitidos
     *
     * @param min el numero (inclusive) minimo que marca el usuario
     * @param max el numero (inclusive) maximo que marca el usuario
     * @param usuario el numero que ha marcado el usuario
     * @return será false si no cumple los requisitos y true si cumple
     */
    private static boolean margenDatos(int min, int max, int usuario) {

        if (usuario < min || usuario > max) {
            System.out.println("Por favor introduzca datos entre " + min + " y " + max);
            return false;
        } else {
            return true;
        }
    }

}
