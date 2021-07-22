package puc.tutorial.rest.api.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import puc.tutorial.rest.api.model.PedidosModel;

public interface PedidosRepository extends CrudRepository<PedidosModel,Integer> {
	List<PedidosModel> findAllByDataPedidoBetween(Date dataInicial, Date dataFinal);
}
