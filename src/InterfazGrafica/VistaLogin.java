/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfazGrafica;

import Logica.Usuario;

/**
 *
 * @author mende
 */
public interface VistaLogin {

    public void mostrarError(String msg);

    public void salir();

     public void ejecutarProximoCasoUso(Usuario usu);

    
}
