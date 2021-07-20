package puc.tutorial.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import puc.tutorial.rest.api.model.ClientesModel;

public interface ClientesRepository extends CrudRepository<ClientesModel,String> {
}
