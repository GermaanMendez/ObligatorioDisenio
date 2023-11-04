/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import Controlador.ControladorLogin;
import Controlador.ControladorLoginJugador;
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
    public void proximoCasoUso() {
        JOptionPane.showMessageDialog(this, "LOGIN CORRECTO JUGADOR. Proximo paso mostrar mesas disponivles");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
