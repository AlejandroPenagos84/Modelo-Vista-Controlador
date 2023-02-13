/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Alejandro Penagos
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int id;
    
    /**
     * Devolver Nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Modificar nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devolver apellido
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }
    
    /**
     * Modificar Apellido
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * Devolver Id
     * @return id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Modificar Id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
}
