/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Vista.Interfaz;
/**
 *
 * @author Alejandro Penagos
 */
public class Controlador {
    
    private Interfaz vista;
    private Cliente modelo;
    
    public Controlador(){
        this.vista = new Interfaz();
        this.vista.capturarDatosCliente(this);
    }
    
    public void crearCliente(int id, String nombre, String apellido) {
        modelo = new Cliente();
        modelo.setId(id);
        modelo.setNombre(nombre);
        modelo.setApellido(apellido);
        actualizarVista();
    }
    
    public void actualizarVista(){
        vista.imprimirDatosCliente(modelo.getId(),modelo.getNombre(), modelo.getApellido());
    }
    
}
