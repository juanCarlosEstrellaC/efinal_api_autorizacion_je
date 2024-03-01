package com.example.demo.service.to;

import java.io.Serializable;


public class UsuarioTo implements Serializable{
	
	// No implemento RepresentationModel<> porque no tendrá linsk
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String password;
	private String semilla;
	private Integer tiempo;
	
	// ToString:
	@Override
	public String toString() {
		return "UsuarioTo [nombre=" + nombre + ", password=" + password + "]";
	}
	
	public String getSemilla() {
		return semilla;
	}

	public void setSemilla(String semilla) {
		this.semilla = semilla;
	}

	public Integer getTiempo() {
		return tiempo;
	}

	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
