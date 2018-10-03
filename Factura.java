/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author gilio
 */
public class Factura {
    
     private Persona Persona;
     public Servicios Servicios;
    
  public void factura() {
    System.out.println("Ingrese nombre del cliente");
    this.Persona = new Persona(); 
  }  
  
  public void archivo(){
    Archivo archivo = new Archivo();
  }
    
}
