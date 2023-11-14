package Controlador;

import Controlador.ControladorLogin;
import InterfazGrafica.VistaLogin;
import Logica.Fachada;
import Logica.Usuario;
import javax.swing.JOptionPane;
import modelo.RuletaExcepcion;

public class ControladorLoginCrupier extends ControladorLogin {

    public ControladorLoginCrupier(VistaLogin vista) {
        super(vista);
    }

    @Override
    public Usuario llamarLoginModelo(String cedula, String pass) throws Exception {
        //fachada debe retornar al crupier
        try{
            return Fachada.getInstancia().loginCrupier(cedula, pass);   
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
