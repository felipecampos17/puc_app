package puc.tutorial.rest.api.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
 
    @GetMapping(path = "/api/pedido/relatorio")
    public List<PedidosModel> relatorio(
    		@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dataInicial,
    		@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dataFinal) {
    	return repository.findAllByDataPedidoBetween(dataInicial, dataFinal);
    }
}
