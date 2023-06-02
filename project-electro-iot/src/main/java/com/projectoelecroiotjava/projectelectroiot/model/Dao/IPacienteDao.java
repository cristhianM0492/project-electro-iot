package com.projectoelecroiotjava.projectelectroiot.model.Dao;



import com.projectoelecroiotjava.projectelectroiot.model.Entidades.Paciente;
import org.springframework.data.repository.CrudRepository;



public interface IPacienteDao extends CrudRepository<Paciente, Long> {

}

