package puc.tutorial.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import puc.tutorial.rest.api.model.CategoriasModel;
import puc.tutorial.rest.api.repository.CategoriasRepository;

@RestController
public class CategoriasController {
    @Autowired
    private CategoriasRepository repository;

    @GetMapping(path = "/api/categoria/{codCategoria}")
    public ResponseEntity consultar(@PathVariable("codCategoria") String codCategoria){
        return repository.findById(codCategoria)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/categoria/salvar")
    public CategoriasModel salvar(@RequestBody CategoriasModel categoria){
        return repository.save(categoria);
    }
}
