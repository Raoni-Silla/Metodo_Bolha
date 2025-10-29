package br.com.raoni.sistemaBasico.repository;

import br.com.raoni.sistemaBasico.entidades.AlunoBoblle;

import java.util.Arrays;
import java.util.List;

public class alunoRepository {
    public static List<AlunoBoblle> findAll() {
       return Arrays.asList(
                new AlunoBoblle("Ana Silva", "123.456.789-00", 20),
                new AlunoBoblle("Bruno Santos", "987.654.321-11", 22),
                new AlunoBoblle("Carla Oliveira", "321.654.987-22", 19),
                new AlunoBoblle("Diego Pereira", "654.321.987-33", 25),
                new AlunoBoblle("Elaine Costa", "159.753.486-44", 18),
                new AlunoBoblle("Felipe Souza", "111.222.333-55", 23),
                new AlunoBoblle("Gabriela Rocha", "222.333.444-66", 21),
                new AlunoBoblle("Hugo Fernandes", "333.444.555-77", 24),
                new AlunoBoblle("Isabela Martins", "444.555.666-88", 20),
                new AlunoBoblle("João Almeida", "555.666.777-99", 26),
                new AlunoBoblle("Kátia Lima", "666.777.888-00", 19),
                new AlunoBoblle("Lucas Mendes", "777.888.999-11", 22),
                new AlunoBoblle("Mariana Duarte", "888.999.000-22", 18),
                new AlunoBoblle("Natália Ribeiro", "999.000.111-33", 21),
                new AlunoBoblle("Otávio Teixeira", "000.111.222-44", 23)
        );
    }
}
