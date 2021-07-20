package puc.tutorial.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import puc.tutorial.rest.api.model.PedidosModel;
import puc.tutorial.rest.api.repository.PedidosRepository;

@RestController
public class PedidosController {

    @Autowired
    private PedidosRepository repository;

    @GetMapping(path = "/api/pedido/{codPedido}")
    public ResponseEntity consultar(@PathVariable("codPedido") Integer codPedido){
        return repository.findById(codPedido)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/pedido/salvar")
    public PedidosModel salvar(@RequestBody PedidosModel pedido){
        return repository.save(pedido);
    }
}
