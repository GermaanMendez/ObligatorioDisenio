
package Logica;

import java.util.ArrayList;


public class Casillero {
    private int ucc;
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Numero> numeros;
    private Ronda ronda;
    private TipoApuesta tipoApuesta;

    public Casillero(int ucc, ArrayList<Apuesta> apuestas, ArrayList<Numero> numeros, Ronda ronda, TipoApuesta tipoApuesta) {
        this.ucc = ucc;
        this.apuestas = apuestas;
        this.numeros = numeros;
        this.ronda = ronda;
        this.tipoApuesta = tipoApuesta;
    }

    public int getUcc() {
        return ucc;
    }

    public void setUcc(int ucc) {
        this.ucc = ucc;
    }

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(ArrayList<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

    public ArrayList<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Numero> numeros) {
        this.numeros = numeros;
    }

    public Ronda getRonda() {
        return ronda;
    }

    public void setRonda(Ronda ronda) {
        this.ronda = ronda;
    }

    public TipoApuesta getTipoApuesta() {
        return tipoApuesta;
    }

    public void setTipoApuesta(TipoApuesta tipoApuesta) {
        this.tipoApuesta = tipoApuesta;
    }
    
    
    
}
