package br.com.raoni.sistemaBasico.entidades;


import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "alunos_bubble") // <-- nome da nova tabela
public class AlunoBubble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_aluno", nullable = false)
    private String nome;

    @Column(name = "cpf_aluno", nullable = false)
    private String cpf;

    @Column(name = "idade_aluno")
    private Integer idade; // use Integer para aceitar null

    public AlunoBubble() {
    }

    public AlunoBubble(String nome, String cpf, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
}