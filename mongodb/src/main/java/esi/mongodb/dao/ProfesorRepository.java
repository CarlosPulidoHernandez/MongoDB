package esi.mongodb.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import esi.mongodb.model.Profesor;

public interface ProfesorRepository extends MongoRepository<Profesor, Integer> {
	
	List<Profesor> findByDedicacion(String dedicacion);

}




