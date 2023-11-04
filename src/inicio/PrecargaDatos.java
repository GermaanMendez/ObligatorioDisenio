/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio;

import Logica.Crupier;
import Logica.Fachada;

/**
 *
 * @author mende
 */
public class PrecargaDatos {
    
    public static void cargar(){
        Fachada logica = Fachada.getInstancia();
         
        //PRECARGA DE CRUPIERS
        logica.agregarUsuarioCrupier("101", "aaa", "101aaa");
        logica.agregarUsuarioCrupier("102", "bbb", "102bbb");
        logica.agregarUsuarioCrupier("103", "ccc", "103ccc");
        
        //PRECARGA DE JUGADORES
        logica.agregarUsuarioJugador(1000,"201", "aaa","103ccc");
        logica.agregarUsuarioJugador(500,"202", "bbb","202bbb");
        logica.agregarUsuarioJugador(100,"203", "ccc","203ccc");
        logica.agregarUsuarioJugador(50,"204", "ddd","204ddd");
        logica.agregarUsuarioJugador(10,"205", "eee","205eee");
    }
}
