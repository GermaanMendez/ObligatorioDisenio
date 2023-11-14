/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author mende
 */
public class SistemaAcceso {
    private ArrayList<Crupier>crupiers = new ArrayList<Crupier>();
    private ArrayList<Jugador>jugadores = new ArrayList<Jugador>();

    public ArrayList<Crupier> getCrupiers() {
        return crupiers;
    }
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarUsuarioCrupier(String nombreCompleto,String contraseña,String cedula){
        crupiers.add(new Crupier(cedula,contraseña,nombreCompleto));
    }
    public void agregarUsuarioJugador(double saldoInicial, String cedula, String contraseña, String nombreCompleto){
        jugadores.add(new Jugador(saldoInicial, cedula, contraseña,nombreCompleto));
    }

    public Usuario loginJugador(String cedula,String pass){
       Jugador j = (Jugador) buscarUsuario(cedula,pass,jugadores);
       if(j!=null){
           j.setLogueado(true);
           return j;
       }
       return null;
    }
    public Crupier loginCrupier(String cedula,String pass){
       Crupier c = (Crupier) buscarUsuario(cedula,pass,crupiers);
       if(c!=null){
           c.setLogueado(true);
           return c;
       }
        return null;
     
    }
    
    private Usuario buscarUsuario(String cedula, String pass,ArrayList listaBuscar ){
        Usuario u;
        for(Object o: listaBuscar){
            u = (Usuario)o;
            if(u.getCedula().equals(cedula) && u.getContraseña().equals(pass)){
                return u;
            }
        }//Enviar excepciones en caso de error
        return null;
    }

    
}
