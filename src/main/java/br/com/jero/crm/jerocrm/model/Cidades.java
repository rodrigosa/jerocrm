package br.com.jero.crm.jerocrm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Table(name = "cidades")
public class Cidades implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false)
    private Integer id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estados estado;


}
