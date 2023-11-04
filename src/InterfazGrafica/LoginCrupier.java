/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import Controlador.ControladorLogin;
import Controlador.ControladorLoginCrupier;
import javax.swing.JOptionPane;

/**
 *
 * @author mende
 */
public class LoginCrupier extends Login {

    public LoginCrupier() {
        super();
    }

    @Override
    public void proximoCasoUso() {
        //VISTA INICIAR MESA
        JOptionPane.showMessageDialog(this, "LOGIN CORRECTO CRUPIER. Proximo caso de uso motrar vista para crear mesa");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ControladorLogin crearControlador() {
        return new ControladorLoginCrupier(this);
    }
    
}
