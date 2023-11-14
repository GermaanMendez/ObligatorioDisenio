/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import InterfazGrafica.VistaLogin;
import Logica.Fachada;
import Logica.Usuario;

/**
 *
 * @author mende
 */
public abstract class ControladorLogin {
    
    VistaLogin vista;

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
    }
    
    
    public void login(String cedula, String pass) throws Exception{
        try{
            Usuario usu = llamarLoginModelo(cedula,pass);
            vista.ejecutarProximoCasoUso(usu);
            vista.salir();
        }catch(Exception ex){
            //ACA HAY QUE CREAR Y MANDAR NUESTRAS PROPIAS EXCEPCIONES
            throw new Exception("Error: " + ex.getMessage());
        }
    }

    public abstract Usuario llamarLoginModelo(String cedula, String pass)throws Exception;
    
    
}
