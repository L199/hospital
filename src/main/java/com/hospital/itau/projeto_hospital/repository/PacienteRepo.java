package com.hospital.itau.projeto_hospital.repository;

import org.springframework.data.repository.CrudRepository;

import com.hospital.itau.projeto_hospital.model.Paciente;


public interface PacienteRepo extends CrudRepository <Paciente, Long> {
    
}
