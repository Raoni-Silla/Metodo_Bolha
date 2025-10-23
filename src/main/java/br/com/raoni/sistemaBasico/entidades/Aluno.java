package br.com.raoni.sistemaBasico.entidades;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_alunos")

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_aluno", nullable = false)
    private String nome;

    @Column(name = "cpf_aluno", nullable = false)
    private String cpf;

    @Column(name = "idade_aluno", nullable = true)
    private int idade;

    public Aluno () {
    }

    public Aluno(String nome, String cpf, int idade) {
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }

}
