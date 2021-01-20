package br.com.jero.crm.jerocrm.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false, name = "idpessoa")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idpessoa;

    private String nomerazao;

    private char tipo;

    private String cpf;

    private String cnpj;

    private String endereco;

    private String numero;

    private String complemento;

    private String bairro;

    private Estados uf;

    @ManyToOne
    //@JoinColumn(name = "municipio")
    private Cidades municipio;

    private String cep;

    private String telefone;

    private String email;

    private Date nascimento;

    @ManyToOne
    //@JoinColumn(name = "relacionamento", referencedColumnName = "id_relacionamento_empresarial")
    private  Relacionamento relacionamento;


}
