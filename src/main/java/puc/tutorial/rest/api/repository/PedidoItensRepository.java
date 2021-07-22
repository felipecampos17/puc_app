package puc.tutorial.rest.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import puc.tutorial.rest.api.model.PedidoItensModel;
import puc.tutorial.rest.api.model.PedidoItensModelPK;

public interface PedidoItensRepository extends CrudRepository<PedidoItensModel,PedidoItensModelPK> {
	List<PedidoItensModel> findByCodPedido(String codPedido);
}
