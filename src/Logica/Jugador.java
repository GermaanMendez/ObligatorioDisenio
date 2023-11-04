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
public class Jugador extends Usuario{
    private double saldoInicial ;
    private ArrayList<Mesa> mesas;
    private ArrayList<Apuesta> apuestas;
    
    public Jugador(double saldoInicial, String cedula, String contraseña, String nombreCompleto) {
        super(cedula, contraseña, nombreCompleto);
        this.saldoInicial = saldoInicial;
        this.mesas = new ArrayList<Mesa>();
        this.apuestas = new ArrayList<Apuesta>();;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(ArrayList<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }
    
    
    
    
}
