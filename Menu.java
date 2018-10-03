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

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    
    public void generarFactura() { 
    Factura factura = new Factura();
  }
  
  public void Validador() {
    Validador val = new Validador();
  }
  
  public void persona() {
    Persona per = new Persona();
  }
  
  public void buscarFactura() {
  
  }   
  
  public void salirMenu() {
    System.out.println("Ha seleccionado salir del menÃº.");
    System.exit(0);
  }
    
  public void menu() { 
    Scanner teclado = new Scanner(System.in);
    System.out.println("¿QuÃ© desea hacer?");
    System.out.println(); 
    System.out.println("1.- Generar factura");
    System.out.println("2.- Buscar factura");
    System.out.println("3.- Cerrar programa");
    
    int opcn = val();
    seleccion(opcn);
  }
  
  public void seleccion (int opcn) {
    
    switch (opcn) {
      case 1: generarFactura();
              menu();
      break;
      
      case 2: buscarFactura();
              menu();
      break;
        
      case 3: salirMenu();
      break;
        
      default: menu();
      break;
    }
    
  }  
    
  public int val () {
    int num = 0;
    boolean error; 
     
    do {
        
      try {
        error = false;
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("El caracter ingresado no es numÃ©rico o se encuentra fuera del rango establecido, intÃ©ntelo nuevamente.");     
        error = true;
      }
      
    } while (error);
    
    return num;
  }
    
}
