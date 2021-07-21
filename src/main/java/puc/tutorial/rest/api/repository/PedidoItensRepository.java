package puc.tutorial.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import puc.tutorial.rest.api.model.PedidoItensModel;

public interface PedidoItensRepository extends CrudRepository<PedidoItensModel,String> {
}
