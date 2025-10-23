package br.com.raoni.sistemaBasico.repository;

import br.com.raoni.sistemaBasico.entidades.Aluno;

import java.util.Arrays;
import java.util.List;

public class alunoRepository {
    public static List<Aluno> findAll() {
       return Arrays.asList(
                new Aluno("Ana Silva", "123.456.789-00", 20),
                new Aluno("Bruno Santos", "987.654.321-11", 22),
                new Aluno("Carla Oliveira", "321.654.987-22", 19),
                new Aluno("Diego Pereira", "654.321.987-33", 25),
                new Aluno("Elaine Costa", "159.753.486-44", 18),
                new Aluno("Felipe Souza", "111.222.333-55", 23),
                new Aluno("Gabriela Rocha", "222.333.444-66", 21),
                new Aluno("Hugo Fernandes", "333.444.555-77", 24),
                new Aluno("Isabela Martins", "444.555.666-88", 20),
                new Aluno("João Almeida", "555.666.777-99", 26),
                new Aluno("Kátia Lima", "666.777.888-00", 19),
                new Aluno("Lucas Mendes", "777.888.999-11", 22),
                new Aluno("Mariana Duarte", "888.999.000-22", 18),
                new Aluno("Natália Ribeiro", "999.000.111-33", 21),
                new Aluno("Otávio Teixeira", "000.111.222-44", 23)
        );
    }
}
