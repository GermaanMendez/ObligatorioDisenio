/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Logica.Fachada;
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
    public void llamarLoginModelo(String cedula, String pass) throws Exception {
        try {
            Fachada.getInstancia().loginJugador(cedula, pass);
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
