package puc.tutorial.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import puc.tutorial.rest.api.model.PedidoItensModel;
import puc.tutorial.rest.api.repository.PedidoItensRepository;

@RestController
public class PedidoItensController {
    @Autowired
    private PedidoItensRepository repository;

    @GetMapping(path = "/api/pedidoitem/{codPedido}")
    public List<PedidoItensModel> consultar(@PathVariable("codPedido") String codPedido){
        return repository.findByCodPedido(codPedido);
    }

    @PostMapping(path = "/api/pedidoitem/salvar")
    public PedidoItensModel salvar(@RequestBody PedidoItensModel pedidoitens){
        return repository.save(pedidoitens);
    }
}
