/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

import Controlador.Controlador;
/**
 *
 * @author Alejandro Penagos
 */
public class Interfaz {
    Scanner lector = new Scanner(System.in);
       
    public void capturarDatosCliente(Controlador control){
        int id;
        String nombre;
        String apellido;
        
        System.out.println("INGRESA TUS DATOS");
        
        System.out.print("Ingresa tu ID: ");
        id = lector.nextInt();
        System.out.print("");
        
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
}
