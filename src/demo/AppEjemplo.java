/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demo;

import InterfazGrafica.Login;
import InterfazGrafica.MenuInicio;
import inicio.PrecargaDatos;

/**
 *
 * @author digregor
 */
public class AppEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       new VentanaMesa().setVisible(true);
//       new Login().setVisible(true);
         PrecargaDatos.cargar();
         new MenuInicio().setVisible(true);
    }
    
}
