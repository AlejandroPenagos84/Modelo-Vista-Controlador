/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Vista.Interfaz;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Alejandro Penagos
 */
public class Controlador {
    
    private Interfaz vista;  
    private ArrayList <Cliente> listaClientes;
    
    public Controlador(){
        this.vista = new Interfaz();
        this.listaClientes = new ArrayList<Cliente>();
        this.vista.menu(this);       
    }
    
    public void crearCliente(int id, String nombre, String apellido) {
        Cliente modelo = new Cliente();
        modelo.setId(id);
        modelo.setNombre(nombre);
        modelo.setApellido(apellido);
        listaClientes.add(modelo);        
    }
    
    public void actualizarVista(int id){
        for(int i = 0; i <listaClientes.size();i++){
                if(listaClientes.get(i).getId()==id){
                    vista.imprimirDatosCliente(listaClientes.get(i).getId(), listaClientes.get(i).getNombre(), listaClientes.get(i).getApellido());
            }
        }
    }
    
    
    public boolean buscarClientes(int id){
        int num = 0;
        try{
            Iterator <Cliente> it = listaClientes.iterator();
            while(it.hasNext()){
                int buscarId = it.next().getId();
                if(buscarId == id){
                    num++;
                }
            }     
        }catch(NullPointerException e){}    
        System.out.print(num);
        return num == 1;   
    } 
    
}

/*
    public void mostrarCliente(int id){
        int buscarId = 0;
        String buscarNombre = null;
        String buscarApellido = null;
        
        try{
            for(Cliente c : listaClientes){
                if(c.getId() == id){
                    buscarId = c.getId();
                    buscarNombre = c.getNombre();
                    buscarApellido = c.getApellido();
                }
            }
            vista.imprimirDatosCliente(buscarId, buscarNombre, buscarApellido);
        }catch(NullPointerException e){}  
    }    */ 