package com.tecsup.lab01.model;

public class User {
  String nombre;
  String Ape_paterno;
  int edad;


public User() {
}

public void setnombre(String nombre) {
	this.nombre = nombre;
}
public String getnombre() {
	return nombre;
}

public void setApe_paterno(String Ape_paterno) {
	this.Ape_paterno = Ape_paterno;
}
public String getApe_paterno() {
	return Ape_paterno;
}
public void setedad(int edad) {
	this.edad = edad;
}
public int getedad() {
	return edad;
}
}