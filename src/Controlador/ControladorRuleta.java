/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import InterfazGrafica.VistaRuleta;
import Logica.Mesa;
import Logica.TipoApuesta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.RuletaExcepcion;
import modelo.RuletaModelo;

/**
 *
 * @author hp
 */
public class ControladorRuleta {

    private RuletaModelo ruletaModelo;
    private VistaRuleta vista;

    public ControladorRuleta(RuletaModelo ruletaModel, VistaRuleta vista) {
        this.ruletaModelo = ruletaModel;
        this.vista = vista;

        // Configurar controladores de eventos de la vista
        vista.agregarAccionBotonIniciarMesa(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarMesa();
            }
        });

        // Configurar más controladores de eventos según sea necesario
    }

    public void iniciarMesa() {
        ArrayList<TipoApuesta> tiposApuestaSeleccionados = (ArrayList<TipoApuesta>) vista.obtenerTiposApuestaSeleccionados();
        ruletaModelo.agregarMesa(new Mesa(tiposApuestaSeleccionados));
        vista.mostrarMensaje("Mesa creada con éxito");
    }
}
