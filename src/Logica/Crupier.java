/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author mende
 */
public class Crupier extends Usuario {
    
    private Mesa mesaAsignada;

    public Crupier( String cedula, String contraseña, String nombreCompleto) {
        super(cedula, contraseña, nombreCompleto);
    }

    public Mesa getMesaAsignada() {
        return mesaAsignada;
    }

    public void setMesaAsignada(Mesa mesaAsignada) {
        this.mesaAsignada = mesaAsignada;
    }
    
    
    
}
