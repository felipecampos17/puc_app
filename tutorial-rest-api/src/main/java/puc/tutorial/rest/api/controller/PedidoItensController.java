package puc.tutorial.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import puc.tutorial.rest.api.model.PedidoItensModel;
import puc.tutorial.rest.api.model.UsuarioModel;
import puc.tutorial.rest.api.repository.PedidoItensRepository;

@RestController
public class PedidoItensController {
    @Autowired
    private PedidoItensRepository repository;

    @GetMapping(path = "/api/pedidoitem/{codPedido}")
    public ResponseEntity consultar(@PathVariable("codPedido") String codPedido){
        return repository.findById(codPedido)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/pedidoitem/salvar")
    public PedidoItensModel salvar(@RequestBody PedidoItensModel pedidoitens){
        return repository.save(pedidoitens);
    }
}
