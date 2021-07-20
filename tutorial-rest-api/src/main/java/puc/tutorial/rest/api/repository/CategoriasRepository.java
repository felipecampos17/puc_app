package puc.tutorial.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import puc.tutorial.rest.api.model.CategoriasModel;

public interface CategoriasRepository extends CrudRepository<CategoriasModel,String> {
}
