package com.example.shoestore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Tipo_identificaión;
	private String Número_identificación;
	private String Nombre;
	private String Apellido;
	private String teléfono;
	private String Dirección;
	private String Ciudad;
	private String Estado;
	private String Acción;
	
	public Cliente(int id, String tipo_identificaión, String número_identificación, String nombre, String apellido,
			String teléfono, String dirección, String ciudad, String estado, String acción) {
		super();
		this.id = id;
		Tipo_identificaión = tipo_identificaión;
		Número_identificación = número_identificación;
		Nombre = nombre;
		Apellido = apellido;
		this.teléfono = teléfono;
		Dirección = dirección;
		Ciudad = ciudad;
		Estado = estado;
		Acción = acción;
	}

	public Cliente() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo_identificaión() {
		return Tipo_identificaión;
	}

	public void setTipo_identificaión(String tipo_identificaión) {
		Tipo_identificaión = tipo_identificaión;
	}

	public String getNúmero_identificación() {
		return Número_identificación;
	}

	public void setNúmero_identificación(String número_identificación) {
		Número_identificación = número_identificación;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}

	public String getDirección() {
		return Dirección;
	}

	public void setDirección(String dirección) {
		Dirección = dirección;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getAcción() {
		return Acción;
	}

	public void setAcción(String acción) {
		Acción = acción;
	}
	
}
