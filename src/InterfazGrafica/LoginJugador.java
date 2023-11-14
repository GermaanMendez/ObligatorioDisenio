/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import Controlador.ControladorLogin;
import Controlador.ControladorLoginJugador;
import Logica.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author mende
 */
public class LoginJugador extends Login{

    public LoginJugador() {
        super();
    }
    
    @Override
    public ControladorLogin crearControlador() {
        return new ControladorLoginJugador(this);
    }

    @Override
    public void ejecutarProximoCasoUso(Usuario usu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    


    
}
