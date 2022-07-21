package br.dh.meli.spring01.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity //dizendo p JPA que ela vai p BD
@Table(name = "tb_user") //personalizando nome da tabela
public class UserBD {

    @Id //dizendo que ID é uma PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ele gera um ID automático e sequencial
    private long id;

    @Column(name = "name", length = 100, nullable = false)
//dizendo que é uma coluna e eu poderia dar um nome personalizado, caso quisesse um nome diferente
    private String name;

    //unique = true quer dizer que não pode ter dois e-mails iguais
    @Column(length = 80, nullable = false, unique = true)
    private String email;

}
