package com.tecsup.lab01.view;

import com.tecsup.lab01.controller.*;
import com.tecsup.lab01.model.*;
import com.tecsup.lab01.view.*;
public class ImprimirDatosView {

	public static void main(String[] args) {
	
		User modelo = insertarDatosUsuario();
		UserView vista = new UserView();
		
		UserController controlador = new UserController(modelo, vista);
		
		controlador.actualizarVista();
	}

	private static User insertarDatosUsuario() {
		User usuario = new User();
		usuario.setnombre("Roberto");
		usuario.setApe_paterno("Carbajal");
		usuario.setedad(22);
		return usuario;
	}

}
