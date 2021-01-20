package br.com.jero.crm.jerocrm.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "relacionamento_empresarial")

/**
 * Classe que representa a entidade de relacionamento "relacionamento_empresarial". Ela define o tipo de relação a Pessoa,
 * entidade pessoa tem com a empresa. relaconamento 1x1.
 */

public class Relacionamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_relacionamento_empresarial;

    private String relacionamento;


}
