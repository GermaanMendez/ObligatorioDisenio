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
public class SistemaRuleta {
 
    private ArrayList<Crupier> crupiers = new ArrayList<Crupier>();
    private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    private ArrayList<Efecto> efectos = new ArrayList<Efecto>();
    private ArrayList<TipoApuesta> tiposApuestas = new ArrayList<TipoApuesta>();
 
    
    
    public void AregarMesa(Mesa nuevaMesa){
        mesas.add(nuevaMesa);
    }
    public void AgregarEfecto(Efecto nuevoEfecto){
        efectos.add(nuevoEfecto);
    }
    public void AgrearTipoApuesta(TipoApuesta nuevoTipo){
        tiposApuestas.add(nuevoTipo);
    }
    
    
    
    
    
}
