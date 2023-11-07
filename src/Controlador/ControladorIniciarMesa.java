/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import InterfazGrafica.VistaIniciarMesa;
import Logica.Crupier;
import Observador.Observable;
import Observador.Observador;
import modelo.RuletaExcepcion;


/**
 *
 * @author hp
 */
public class ControladorIniciarMesa implements Observador{
    
    private Crupier crupierLogueado;
    private VistaIniciarMesa vista;
    
    public ControladorIniciarMesa(VistaIniciarMesa vista,Crupier crupierLogueado){
        this.vista = vista;
        this.crupierLogueado = crupierLogueado;
        
    }
    
    public void crearMesa(){
        //lo que tiene que pasar
        //curso alternativo
        
    }

    @Override
    public void actualizar(Object evento, Observable origen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
