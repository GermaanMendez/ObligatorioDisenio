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
public class Mesa {
    
    private Crupier crupier;
    private ArrayList<Jugador> jugadores;
    private ArrayList<TipoApuesta>tiposApuestasHabilitadas;
    private ArrayList<Ronda>rondas;
    private ArrayList<Efecto>efectos;
    private int nue;
    

    public Mesa(Crupier crupier) {
        this.crupier = crupier;
        this.jugadores = new ArrayList<Jugador>();
        this.tiposApuestasHabilitadas = new ArrayList<TipoApuesta>();
        this.rondas = new ArrayList<Ronda>();
        this.efectos = new ArrayList<Efecto>();
    }

    public Crupier getCrupier() {
        return crupier;
    }

    public void setCrupier(Crupier crupier) {
        this.crupier = crupier;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<TipoApuesta> getTiposApuestasHabilitadas() {
        return tiposApuestasHabilitadas;
    }

    public void setTiposApuestasHabilitadas(ArrayList<TipoApuesta> tiposApuestasHabilitadas) {
        this.tiposApuestasHabilitadas = tiposApuestasHabilitadas;
    }

    public ArrayList<Ronda> getRondas() {
        return rondas;
    }

    public void setRondas(ArrayList<Ronda> rondas) {
        this.rondas = rondas;
    }

    public ArrayList<Efecto> getEfectos() {
        return efectos;
    }

    public void setEfectos(ArrayList<Efecto> efectos) {
        this.efectos = efectos;
    }
    
    
    
    
}
