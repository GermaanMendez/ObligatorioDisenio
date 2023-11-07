/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class RuletaExcepcion extends Exception {

    public RuletaExcepcion(String mensaje) {
        super(mensaje);
    }

    public RuletaExcepcion(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    public RuletaExcepcion(Throwable causa) {
        super(causa);
    }
}


