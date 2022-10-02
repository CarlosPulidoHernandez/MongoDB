package esi.mongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import esi.mongodb.model.Departamento;

public interface DepartamentoRepository extends MongoRepository<Departamento, Integer> {

}