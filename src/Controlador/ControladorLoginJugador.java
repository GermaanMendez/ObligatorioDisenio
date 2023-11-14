/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import InterfazGrafica.VistaLogin;
import Logica.Fachada;
import Logica.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author mende
 */
public class ControladorLoginJugador extends ControladorLogin {

    public ControladorLoginJugador(VistaLogin vista) {
        super(vista);
    }

    @Override
    public Usuario llamarLoginModelo(String cedula, String pass) throws Exception {
        try {
            return Fachada.getInstancia().loginJugador(cedula, pass);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
