package Controlador;

import Controlador.ControladorLogin;
import Controlador.VistaLogin;
import Logica.Fachada;
import javax.swing.JOptionPane;

public class ControladorLoginCrupier  extends ControladorLogin{

    public ControladorLoginCrupier(VistaLogin vista) {
        super(vista);
    }

    @Override
    public void llamarLoginModelo(String cedula, String pass) throws Exception{
        try{
            Fachada.getInstancia().loginCrupier(cedula, pass);
        }catch(Exception ex){
            throw new Exception("");
        }
        
    }
    
}
