package com.projectoelecroiotjava.projectelectroiot.controller;


import com.projectoelecroiotjava.projectelectroiot.model.Entidades.Paciente;
import com.projectoelecroiotjava.projectelectroiot.model.Service.IPacienteService;
//import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/paciente-service")
public class UsuarioRestController {
    @Autowired
    IPacienteService pacienteService;

    @RequestMapping(value = "/paciente/{id}", method = RequestMethod.GET)
    public Paciente getPaciente (@PathVariable long id ){
        Paciente paciente = new Paciente();
        paciente.setId(id);
        paciente.setEmail("cristhian0492@hotmail.com");
        paciente.setNombres("Cristhian David");
        paciente.setApellidos("Martinez");
        return paciente;
    }

    @RequestMapping(value = "/paciente", method = RequestMethod.POST)
    public void registrarPaciente(@RequestBody Paciente usuarioP){
        pacienteService.save(usuarioP);
    }

    @GetMapping("/paciente/{id}")
    public Paciente buscarPaciente(@PathVariable("id") Long id){
        return pacienteService.findById(id);
    }

    public List<Paciente> getPacientes (){
        List<Paciente> pacientes = new ArrayList<Paciente>();
        for (int i=0; i<5; i++){
            pacientes.add(new Paciente());
        }
        return pacientes;
   }


}

