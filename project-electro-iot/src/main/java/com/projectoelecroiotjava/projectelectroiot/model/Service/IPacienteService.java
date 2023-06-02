package com.projectoelecroiotjava.projectelectroiot.model.Service;



import com.projectoelecroiotjava.projectelectroiot.model.Entidades.Paciente;

import java.util.List;

public interface IPacienteService {
    Paciente save (Paciente paciente);

    void delete(Paciente paciente);
    Paciente update(Paciente paciente);
    List<Paciente> findAll();
    Paciente findById(Long id);
}


