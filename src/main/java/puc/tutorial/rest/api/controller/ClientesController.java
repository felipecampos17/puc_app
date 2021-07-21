package puc.tutorial.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import puc.tutorial.rest.api.model.ClientesModel;
import puc.tutorial.rest.api.repository.ClientesRepository;

@RestController
public class ClientesController {

    @Autowired
    private ClientesRepository repository;

    @GetMapping(path = "api/cliente/{cpf}")
    public ResponseEntity consultar(@PathVariable("cpf") String cpf){
        return repository.findById(cpf)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "api/cliente/salvar")
    public ClientesModel salvar(@RequestBody ClientesModel cliente) {return repository.save(cliente);}
}