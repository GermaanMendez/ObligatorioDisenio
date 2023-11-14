/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

import Controlador.ControladorLogin;
import Controlador.ControladorLoginCrupier;
import Logica.Crupier;
import Logica.Usuario;
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
    public ControladorLogin crearControlador() {
        return new ControladorLoginCrupier(this);
    }

    @Override
    public void ejecutarProximoCasoUso(Usuario usu) {
        //Aca es donde debo crear la nueva vista pasandole el crupier que recibi para que la 'vista crear' mesa tenga el crupier logueado
        //Despues junto la informacion de la configuracion de la mesa y llamo al controlador de crear mesa para que este la cree pasandole
        //la configuracion mas el crupier logueado de esa forma el controlador podra crear la mesa y generar la relacion 1 1
        new CrearMesa((Crupier)usu).setVisible(true);
    }

  

 
    
}
