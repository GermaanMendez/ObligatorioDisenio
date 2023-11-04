/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Logica.Fachada;

/**
 *
 * @author mende
 */
public abstract class ControladorLogin {
    
    private VistaLogin vista;

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
    }
    
    
    public void login(String cedula, String pass) throws Exception{
        try{
            llamarLoginModelo(cedula,pass);
            vista.cerrar();
            vista.proximoCasoUso();
        }catch(Exception ex){
            //ACA HAY QUE CREAR Y MANDAR NUESTRAS PROPIAS EXCEPCIONES
            throw new Exception("Error: " + ex.getMessage());
        }
        
    }

    public abstract void llamarLoginModelo(String cedula, String pass)throws Exception;
    
    
}
