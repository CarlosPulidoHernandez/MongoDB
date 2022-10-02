package esi.mongodb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import esi.mongodb.dao.DepartamentoRepository;
import esi.mongodb.dao.ProfesorRepository;
import esi.mongodb.model.Area;
import esi.mongodb.model.Departamento;
import esi.mongodb.model.Profesor;

@SpringBootApplication
public class MongodbApplication implements CommandLineRunner {

  @Autowired
  private ProfesorRepository profesorRepository;
  
  @Autowired
  private DepartamentoRepository departamentoRepository;

  public static void main(String[] args) {
    SpringApplication.run(MongodbApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {	
	  	  
	// INSERTAR 
	
	Profesor pi1 = new Profesor(1, "Dominguez", "Parra", "Eduardo", 1, "TEU", "TC", "LSI");
	profesorRepository.save(pi1);
	
	Profesor pi2 = new Profesor(2, "Calero", "Muñoz", "Coral", 1, "AEU", "TC", "LSI");
	Profesor pi3 = new Profesor(3, "Adan", "Oliver", "Antonio", 1, "TEU", "TC", "ATC");	
	profesorRepository.saveAll(Arrays.asList(pi2,pi3));
	
	// ELIMINAR
	
	// profesorRepository.deleteAll();
	// profesorRepository.deleteById(3);
	
	// CONSULTAR
	
	Optional<Profesor> profesorId1 = profesorRepository.findById(1);
	if (!profesorId1.isEmpty()) {
		//System.out.println(profesorId1.get());
	}
	
	List<Profesor> profesores = profesorRepository.findAll();
	for (Profesor profesor : profesores) {
		//System.out.println(profesor);
	}
	
	List<Profesor> profesoresTC = profesorRepository.findByDedicacion("TC");
	for (Profesor profesor : profesoresTC) {
		//System.out.println(profesor);
	}	
	
	// OBJETOS ANIDADOS EJEMPLO: Nombres de los departamentos que tengan como nombre de area x 
	
	Area a1 = new Area("Arquitectura y Tecnologia de Computadores");
	Area a2 = new Area("Ciencia de la Computacion e Inteligencia Artificial");
	Area a3 = new Area("Estadistica e Investigacion Operativa");
	Area a4 = new Area("Lenguajes y Sistemas Informaticos");
	
	List<Area> areas1 = new ArrayList<>();
	areas1.add(a1);
	areas1.add(a2);
	areas1.add(a3);
	areas1.add(a4);
	
	List<Area> areas2 = new ArrayList<>();
	
	areas2.add(a2);
	areas2.add(a3);
	areas2.add(a4);
	
	Departamento d1 = new Departamento(1, "Informatica", areas1);	
	departamentoRepository.save(d1);
	
	Departamento d2 = new Departamento(2, "Organización de Empresas", areas2);
	departamentoRepository.save(d2);
		
	List<Departamento> departamentos = departamentoRepository.findByAreasNombre("Arquitectura y Tecnologia de Computadores");
	
	for (Departamento departamento: departamentos) {
		System.out.println(departamento.getNombre());
	}
	
  }
}