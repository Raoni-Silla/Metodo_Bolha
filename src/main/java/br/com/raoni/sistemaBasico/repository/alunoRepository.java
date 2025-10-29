package br.com.raoni.sistemaBasico.repository;

import br.com.raoni.sistemaBasico.entidades.AlunoBubble;

import java.util.Arrays;
import java.util.List;

public class alunoRepository {
    public static List<AlunoBubble> findAll() {
       return Arrays.asList(
                new AlunoBubble("Ana Silva", "123.456.789-00", 20),
                new AlunoBubble("Bruno Santos", "987.654.321-11", 22),
                new AlunoBubble("Carla Oliveira", "321.654.987-22", 19),
                new AlunoBubble("Diego Pereira", "654.321.987-33", 25),
                new AlunoBubble("Elaine Costa", "159.753.486-44", 18),
                new AlunoBubble("Felipe Souza", "111.222.333-55", 23),
                new AlunoBubble("Gabriela Rocha", "222.333.444-66", 21),
                new AlunoBubble("Hugo Fernandes", "333.444.555-77", 24),
                new AlunoBubble("Isabela Martins", "444.555.666-88", 20),
                new AlunoBubble("João Almeida", "555.666.777-99", 26),
                new AlunoBubble("Kátia Lima", "666.777.888-00", 19),
                new AlunoBubble("Lucas Mendes", "777.888.999-11", 22),
                new AlunoBubble("Mariana Duarte", "888.999.000-22", 18),
                new AlunoBubble("Natália Ribeiro", "999.000.111-33", 21),
                new AlunoBubble("Otávio Teixeira", "000.111.222-44", 23)
        );
    }
}
