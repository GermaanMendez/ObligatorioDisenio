/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Logica.Crupier;
import Logica.Jugador;
import Logica.Mesa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class RuletaModelo {
    private List<Mesa> mesas;
    private List<Crupier> crupieres;
    private List<Jugador> jugadores;

    public RuletaModelo() {
        this.mesas = new ArrayList<>();
        this.crupieres = new ArrayList<>();
        this.jugadores = new ArrayList<>();
    }

    //mesas
    public void agregarMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public List<Mesa> obtenerMesas() {
        return mesas;
    }

    //crupiers
    public void agregarCrupier(Crupier crupier) {
        crupieres.add(crupier);
    }

    public List<Crupier> obtenerCrupieres() {
        return crupieres;
    }

    //jugadores
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public List<Jugador> obtenerJugadores() {
        return jugadores;
    }

    // Otros métodos relacionados con el modelo
    // Por ejemplo, métodos para realizar operaciones de juego, estadísticas, etc.
}