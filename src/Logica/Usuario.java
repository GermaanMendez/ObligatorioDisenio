/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author mende
 */
public abstract class Usuario {
    
    private String cedula;
    private String contraseña;
    private String nombreCompleto;
    private Boolean logueado;

    public Usuario(String cedula, String contraseña, String nombreCompleto) {
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
        this.logueado = false;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Boolean getLogueado() {
        return logueado;
    }

    public void setLogueado(Boolean logueado) {
        this.logueado = logueado;
    }
    
    
    
    
    
}
