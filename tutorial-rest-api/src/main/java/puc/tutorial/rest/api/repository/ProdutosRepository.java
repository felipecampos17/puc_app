package puc.tutorial.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import puc.tutorial.rest.api.model.ProdutosModel;

public interface ProdutosRepository extends CrudRepository<ProdutosModel,Integer> {
}
