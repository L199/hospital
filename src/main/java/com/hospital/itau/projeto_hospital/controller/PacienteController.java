package com.hospital.itau.projeto_hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.itau.projeto_hospital.model.Paciente;
import com.hospital.itau.projeto_hospital.repository.PacienteRepo;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteRepo pacienteRepo;

    @GetMapping
    public ResponseEntity<List<Paciente>> getAll() {
        List<Paciente> lista = (List<Paciente>) pacienteRepo.findAll();
        if (lista == null || lista.size() == 0) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(lista);
    }

}
