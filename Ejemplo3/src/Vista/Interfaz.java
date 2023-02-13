/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

import Controlador.Controlador;
import java.util.InputMismatchException;
/**
 *
 * @author Alejandro Penagos
 */
public class Interfaz { 
    Scanner lector = new Scanner(System.in);
    
    private Controlador control;
    public void capturarDatosCliente(Controlador control){
        int id = 0;
        String nombre;
        String apellido;
        
        System.out.println("INGRESA TUS DATOS");
        
        do{
            System.out.print("Ingresa tu ID: ");
            id = lector.nextInt();
            System.out.print("");                        
        }while(control.buscarClientes(id));
        
        System.out.print("Ingresa tu nombre: ");
        nombre = lector.next();
        System.out.print("");
        
        System.out.print("Ingresa tu apellido: ");
        apellido = lector.next();
        System.out.print("");
        
        control.crearCliente(id,nombre,apellido);
    }
    
    public void imprimirDatosCliente(int id, String nombre, String apellido){
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("\tID:"+id);
        System.out.println("\tNombre:"+nombre);
        System.out.println("\tApellido:"+apellido);
        
    }
    
    public void menu(Controlador controlador){
        this.control = controlador;
        int opc = 0;
        int buscarId;
        do{
            System.out.println("MENU ");
            System.out.println("\t1. Insertar Usuario");
            System.out.println("\t2. Buscar Usuario");
            System.out.println("\t3. Salir ");
            System.out.print("\tIngresa una opcion: ");
            opc = lector.nextInt();
            
            if(opc == 1){
                this.capturarDatosCliente(control);
            }
          
            if(opc == 2){
                try{
                    System.out.print("Ingresa el id del cliente que deseas buscar: ");
                    buscarId = lector.nextInt();
                    if(control.buscarClientes(buscarId)){
                        control.actualizarVista(buscarId);
                    }else{
                        System.out.println("El cliente con el ID: "+buscarId+" no se encuentra registrado.");
                    }
                }catch(NullPointerException ex){
                    System.out.println("Debes ingresar un cliente");
                    System.out.println("");
                }
                
            }
            
            if(opc==3){
                break;
            }
        }while(opc!=3);
    }
}
