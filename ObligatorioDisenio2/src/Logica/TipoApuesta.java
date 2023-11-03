/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author mende
 */
public abstract class TipoApuesta {
    private int factorPago;
    private String nombre;
    public TipoApuesta(int factorPago,String nombre) {
        this.factorPago = factorPago;
        this.nombre=nombre;
    }



}
