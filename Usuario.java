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

public class Usuario {
    
    Scanner teclado  = new Scanner(System.in);
  String usu = "Administrador";
  String pass = "admin1234";
  
  public void usuario() {
    System.out.println("Ingrese el nombre de usuario");
    String usuario = teclado.nextLine();
    
    if (usu.equals(usuario)) {
      System.out.println("Usuario ingresado correctamente");
      System.out.println("Ingrese la contraseÃ±a por favor");
      String contrasena = teclado.nextLine();
      
      if (pass.equals(contrasena)) {
        System.out.println("Contraseña ingresada correctamente");
        System.out.println("Sesion iniciada");   
      } else {
        System.out.println("ContraseÃ±a ingresada incorrecta, ingrese datos nuevamente.");
        usuario();
      }
          
    }else {
      System.out.println("Usuario ingresado incorrecto, intente nuevamente.");
      usuario();
    }

  }
    
}
