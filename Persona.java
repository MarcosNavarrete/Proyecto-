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
        
public class Persona {
    
    private String nombre;
  private String rut;
  Validador val = new Validador();
  public Persona(String nombre, String rut) {
    this.nombre = nombre;
    setRut(rut);
  }
  
  public void Validador() {
    Validador val = new Validador();
  }
  
  public void servicios() {
    Servicios serv = new Servicios();
  }
  
  public Persona() {
    setNombre();
    boolean rutValidado;
    
    do{
      System.out.println("Ingresa el rut de la persona");
      Scanner teclado = new Scanner(System.in);
      rutValidado = setRut(teclado.next());
    }while(!rutValidado);

  }

  public void setNombre() {
    System.out.println("Ingrese el nombre de la persona");
    Scanner teclado = new Scanner(System.in);
    this.nombre = teclado.next();
  }

  public boolean setRut(String rut) {

    if(validarRut(rut)){
      this.rut = rut;
      return true;
    }
    
    System.out.println("Ingresa un rut correcto");
    return false;
  }

  public String getNombre() {
    return nombre;
  }

  public String getRut() {
    return rut;
  }

  public boolean validarRut(String rut) {
    boolean validacion = false;
    
    try {
      rut = rut.toUpperCase();
      rut = rut.replace(".", "");
      rut = rut.replace("-", "");
      int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
      char dv = rut.charAt(rut.length() - 1);
      int m = 0, s = 1;
      
      for (; rutAux != 0; rutAux /= 10) {
        s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
      }
      
      if (dv == (char) (s != 0 ? s + 47 : 75)) {
        validacion = true;
      }

    } catch (java.lang.NumberFormatException e) {
        
    } catch (Exception e) {
        
    }
    
    return validacion;
  }
    
}
