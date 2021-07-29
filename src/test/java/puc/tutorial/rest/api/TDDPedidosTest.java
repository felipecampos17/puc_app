package puc.tutorial.rest.api;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import puc.tutorial.rest.api.model.PedidoItensModel;
import puc.tutorial.rest.api.model.PedidosModel;
import puc.tutorial.rest.api.model.ProdutosModel;
import puc.tutorial.rest.api.repository.PedidoItensRepository;
import puc.tutorial.rest.api.repository.PedidosRepository;
import puc.tutorial.rest.api.repository.ProdutosRepository;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@RunWith(SpringRunner.class)
public class TDDPedidosTest {
    @Autowired
    private PedidosRepository repository0;

    @Autowired
    private PedidoItensRepository repository2;

    @Autowired
    private ProdutosRepository repository3;

    @Test
    public void tddPedidosTestCalculadorPeriodo()
    {
        Date inicio = new Date(System.currentTimeMillis()); //User define
        Date termino = new Date(System.currentTimeMillis()); //User define
        AtomicReference<Integer> totalizador = new AtomicReference<>(0);

        List<PedidosModel> pedidos = relatorio(inicio,termino);

        if (pedidos != null)
        {
            pedidos.forEach(ped -> {
                List<PedidoItensModel> listPI = consultar(ped.codPedido.toString());

                if (listPI != null )
                {
                    listPI.forEach(prod -> {
                        Optional<ProdutosModel> pm = consultarProduto((prod.codProduto));
                        if (pm != null) {
                            totalizador.updateAndGet(v -> v + pm.get().precoProduto);
                        }
                    });
                }
            });
        }

        Assertions.assertEquals(totalizador.get() > 0 ,true);
    }

    @Test
    public void tddPedidosTestCalculadorPeriodoTotalizadorBanco()
    {
        Date inicio = new Date(20210701);   //LocalDate.parse("2021-07-01");
        Date termino = new Date(20210729);

        AtomicReference<Integer> totalizador = new AtomicReference<>(0);

        List<PedidosModel> pedidos = relatorio(inicio,termino);

        if (pedidos != null)
        {
            pedidos.forEach(ped -> {
                List<PedidoItensModel> listPI = consultar(ped.codPedido.toString());

                if (listPI != null )
                {
                    listPI.forEach(prod -> {
                        Optional<ProdutosModel> pm = consultarProduto((prod.codProduto));
                        if (pm != null) {
                            totalizador.updateAndGet(v -> v + pm.get().precoProduto);
                        }
                    });
                }
            });
        }

        Assertions.assertEquals(totalizador.get() ,12380);
    }

    public List<PedidosModel> relatorio(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dataInicial,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dataFinal) {
        return repository0.findAllByDataPedidoBetween(dataInicial, dataFinal);
    }

    public List<PedidoItensModel> consultar(@PathVariable("codPedido") String codPedido){
        return repository2.findByCodPedido(codPedido);
    }

    public Optional<ProdutosModel> consultarProduto(@PathVariable("codProduto") Integer codProduto){
        return repository3.findById(codProduto);
    }

}
