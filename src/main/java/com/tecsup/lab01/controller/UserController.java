package com.tecsup.lab01.controller;
import com.tecsup.lab01.model.*;
import com.tecsup.lab01.view.*;
public class UserController {
   private UserView vista;
   private User modelo;
   
   public UserController(User modelo , UserView vista) {
	   this.modelo=modelo;
	   this.vista=vista;
   }

	public String getnombre() {
		return modelo.getnombre();
	}
	public void setnombre(String nombre) {
		this.modelo.setnombre(nombre); 
	}
	public String getApe_paterno() {
		return modelo.getApe_paterno();
	}
	public void setApe_paterno(String Ape_paterno) {
		this.modelo.setApe_paterno(Ape_paterno);
	}
	public int getedad() {
		return modelo.getedad();
	}
	public void setedad(int edad) {
		this.modelo.setedad(edad);
	}
	public void actualizarVista() {
		vista.imprimirDatosUsuario(modelo.getnombre(), modelo.getApe_paterno(), modelo.getedad());
	}
	
}
