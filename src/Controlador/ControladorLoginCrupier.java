package Controlador;

import Controlador.ControladorLogin;
import Controlador.VistaLogin;
import Logica.Fachada;
import javax.swing.JOptionPane;
import modelo.RuletaExcepcion;

public class ControladorLoginCrupier extends ControladorLogin {

    public ControladorLoginCrupier(VistaLogin vista) {
        super(vista);
    }

    @Override
    public Object llamarLoginModelo(String cedula, String pass) throws Exception {
        //curso normal
        return Fachada.getInstancia().loginCrupier(cedula, pass);
    }
}
