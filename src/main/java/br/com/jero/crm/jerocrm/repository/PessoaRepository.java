package br.com.jero.crm.jerocrm.repository;

import br.com.jero.crm.jerocrm.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer > {
}
