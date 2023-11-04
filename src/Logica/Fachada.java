/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author mende
 */
public  class Fachada  {
    private static Fachada instancia = new Fachada();
    
    private SistemaAcceso sistemaAcceso = new SistemaAcceso();
    private SistemaRuleta sistemaRuleta = new SistemaRuleta();

    public Fachada() {
    }

    public static Fachada getInstancia() {
        return instancia;
    }

    public void agregarUsuarioCrupier(String cedula, String contraseña,String nombreCompleto ) {
        sistemaAcceso.agregarUsuarioCrupier(nombreCompleto, contraseña, cedula);
    }

    public void agregarUsuarioJugador(double saldoInicial, String cedula, String contraseña, String nombreCompleto) {
        sistemaAcceso.agregarUsuarioJugador(saldoInicial, cedula, contraseña, nombreCompleto);
    }

    public boolean loginJugador(String cedula, String pass) {
        return sistemaAcceso.loginJugador(cedula, pass);
    }

    public boolean loginCrupier(String cedula, String pass) {
        return sistemaAcceso.loginCrupier(cedula, pass);
    }
    
}
