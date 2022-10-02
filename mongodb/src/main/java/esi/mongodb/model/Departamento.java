package esi.mongodb.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Departamentos")
public class Departamento {
	
	@Id
	private int id;
	
	private String nombre;
	private List<Area> areas;
	
	public Departamento() {}

	public Departamento(int id, String nombre, List<Area> areas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.areas = areas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", areas=" + areas + "]";
	} 

}
