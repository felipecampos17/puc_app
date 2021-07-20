package puc.tutorial.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import puc.tutorial.rest.api.model.PedidosModel;

public interface PedidosRepository extends CrudRepository<PedidosModel,Integer> {
}
