/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import InterfazGrafica.CrearMesa;
import Logica.Crupier;
import Logica.Fachada;
import Observador.Observable;
import Observador.Observador;
import modelo.RuletaExcepcion;


/**
 *
 * @author hp
 */
public class ControladorCrearMesa implements Observador{
    
    private  vistaCrearMesa vista;
    
    private Crupier crupierLogueado;
    
    //El controlador recibe la Interfaz que implementa la vista crear mesa y ejecuta los metodos correspondientes de la vista
    //en este caso se necesita que cuando se levante la vista ya esten los tipos de apuesta prontos para ser elegidos.
    public ControladorCrearMesa(vistaCrearMesa vista,Crupier crupierLogueado){
        this.vista = vista;
        this.crupierLogueado = crupierLogueado;
        mostrarTiposApuesta();
    }
    
    public void crearMesa(){
        //lo que tiene que pasar
        //curso alternativo
        
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void mostrarTiposApuesta() {
        vista.mostrarTiposApuesta(Fachada.getInstancia().ObtenerTiposApuesta());
    }
    
    
}
