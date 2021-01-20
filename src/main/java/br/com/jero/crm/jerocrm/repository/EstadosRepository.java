package br.com.jero.crm.jerocrm.repository;

import br.com.jero.crm.jerocrm.model.Estados;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadosRepository extends CrudRepository<Estados, Integer> {
}
