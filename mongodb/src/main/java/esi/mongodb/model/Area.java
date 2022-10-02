package esi.mongodb.model;

import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;

public class Area {
	
	@Id
	private ObjectId id;
	
	private String nombre;

	public Area() {}

	public Area(String nombre) {
		super();
		this.id = new ObjectId();
		this.nombre = nombre;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Area [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
