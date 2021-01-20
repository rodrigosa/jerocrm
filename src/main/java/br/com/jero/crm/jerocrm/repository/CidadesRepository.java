package br.com.jero.crm.jerocrm.repository;

import br.com.jero.crm.jerocrm.model.Cidades;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadesRepository  extends CrudRepository<Cidades, Integer> {
}
