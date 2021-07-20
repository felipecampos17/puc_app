package puc.tutorial.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import puc.tutorial.rest.api.model.ProdutosModel;
import puc.tutorial.rest.api.repository.ProdutosRepository;

@RestController
public class ProdutosController {
    @Autowired
    private ProdutosRepository repository;

    @GetMapping(path = "/api/produto/{codProduto}")
    public ResponseEntity consultar(@PathVariable("codProduto") Integer codProduto){
        return repository.findById(codProduto)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/produto/salvar")
    public ProdutosModel salvar(@RequestBody ProdutosModel produto){
        return repository.save(produto);
    }
}
