package br.com.treinaweb.ediaristas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity // para falar que é uma coluna no BD
@Data // gera automaticamente os métodos getters/setters
@NoArgsConstructor // gera um construtor vazio
@AllArgsConstructor // gera um construtor com todos os argumentos
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // gerar o equals hashcode com base apenas no atributo ID, pois por padrão é baseado em todos os atributos
public class Diarista {

    /* Annotations */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include // define o atributo para o hashcode
    private long id;

    @Column(nullable = false, length = 100)
    private String nomeCompleto;    
    
    @Column(nullable = false, unique = true, length = 11)
    private String cpf;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false, length = 11)
    private String telefone;
    
    @Column(nullable = false)
    private String logradouro;
    
    @Column(nullable = false)
    private String numero;
    
    @Column(nullable = false)
    private String bairro;
    
    @Column(nullable = true)
    private String complemento;
    
    @Column(nullable = false, length = 8)
    private String cep;
    
    @Column(nullable = false)
    private String cidade;
    
    @Column(nullable = false, length = 2)
    private String estado;
    
    @Column(nullable = false)
    private String codigoIbge;

}
