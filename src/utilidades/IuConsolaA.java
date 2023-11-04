/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import Logica.Fachada;
import utilidades.Consola;

/**
 *
 * @author Dario
 */
public class IuConsolaA {
    
    Fachada logica = Fachada.getInstancia();
    Consola consola = new Consola();
    
    public void iniciar(){
        int opcion = pedirOpcion();
        if(opcion==1){
            boolean salir=false;
            do{
                String c = Consola.leer("Cedula: ");
                String p = Consola.leer("Pass: ");
                if(logica.loginJugador(c, p)){
                    System.out.println("******  LOGIN CON EXITO USUARIO***********" );
                }else{
                    System.out.println("******  ERROR LOGIN USUARIO***********" );
                }
            }while(!salir);

        }else if(opcion==2){
            boolean salir=false;
            do{
                String c = Consola.leer("Cedula: ");
                String p = Consola.leer("Pass: ");
                if(logica.loginCrupier(c, p)){
                    System.out.println("******  LOGIN CON EXITO CRUPIER***********" );
                    salir=true;
                }else{
                    System.out.println("******  ERROR LOGIN CRUPIER***********" );
                }
            }while(!salir);
        }else{
            return ;
        }
    }

    private int pedirOpcion() {
        int opcion = Consola.leerInt("Digite 1 para login user, 2 para login crupier, 3 para salir:");
        return opcion;
    }



    private void mostrarExito(String mensaje) {
        System.out.println("******");
        System.out.println("******  " + mensaje);
        System.out.println("******");
    }

    
    
    
}
