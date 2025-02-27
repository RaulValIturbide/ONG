/*
Vamos a ver c�mo podemos ordenar las colecciones seg�n los criterios que queramos. Para ello vamos a suponer que estamos haciendo una aplicaci�n para una ONG. 
Tendremos una clase Socio, de la que queremos guardar el nombre, la aportaci�n mensual y el dni.
Tendremos un arraylist donde iremos guardando los socios. 
Cuando tengamos 4 o 5 clientes, ordenaremos el arraylist de distintas maneras.
El orden natural ser� por aportacion.
Adem�s queremos que se puedan ordenar por DNI y por la aportaci�n.
Cuando tengamos hecho lo anterior, debemos hacer lo siguiente: a la hora de introducir el dni,
hay que corroborar que el formato es de 8 d�gitos, un guion y una letra. Adem�s, se tiene que tener en cuenta que la letra sea la que
corresponde (ver por internet c�mo se calcula).
 */
package principal;

import Gestion.*;
import Grafica.Menu;
import java.util.Collections;

/**
 *
 * @author baske
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionSocio gs = new GestionSocio();

        int usuario;

        do {
            usuario = Menu.introduccion();
            switch (usuario) {
                case 1:
                    gs.addSocio();
                    break;
                case 2:
                    gs.rmvSocio();
                    break;
                case 3:
                    switch (Menu.queListar()) {
                        case 1:
                            System.out.println("********** Listado por aportacion **********");
                            Collections.sort(gs.getListaSocio());
                            gs.listar();
                            break;
                        case 2:
                            System.out.println("********** Listado por edad **********");
                            Collections.sort(gs.getListaSocio(), Socio.compararEdad);
                            gs.listar();
                            break;
                    }

                    break;
                case 0:
                    System.out.println("Un placer, esperamos que vuelva pronto");
            }
        } while (usuario != 0);

    }

}
