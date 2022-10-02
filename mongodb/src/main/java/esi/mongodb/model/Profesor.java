package esi.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Profesor")
public class Profesor {
	
	@Id
	private int id;
	
	private String apellido1;
	private String apellido2;
	private String nombre_pila;
	private int activo;
	private String categoria;
	private String dedicacion;
	private String area;
	
	public Profesor() {}
	
	public Profesor(int id, String apellido1, String apellido2, String nombre_pila, int activo, String categoria,
			String dedicacion, String area) {
		super();
		this.id = id;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre_pila = nombre_pila;
		this.activo = activo;
		this.categoria = categoria;
		this.dedicacion = dedicacion;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNombre_pila() {
		return nombre_pila;
	}

	public void setNombre_pila(String nombre_pila) {
		this.nombre_pila = nombre_pila;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDedicacion() {
		return dedicacion;
	}

	public void setDedicacion(String dedicacion) {
		this.dedicacion = dedicacion;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", nombre_pila="
				+ nombre_pila + ", activo=" + activo + ", categoria=" + categoria + ", dedicacion=" + dedicacion
				+ ", area=" + area + "]";
	}

	
}
