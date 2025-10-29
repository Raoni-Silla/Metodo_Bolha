package br.com.raoni.sistemaBasico;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import br.com.raoni.sistemaBasico.entidades.AlunoBubble;



public class sistema {
    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("exercicios-jpa").createEntityManager();

        System.out.println(" -=-=-=-=-=-=-=-= Ordenação de alunos apartir do bubble sort -=-=-=-=-=-=-=-= ");
        System.out.println(" -=-=-=-=-=-=-=-= Lista Original Sem Passar Pelo Bubble Sort -=-=-=-=-=-=-=-= ");


        em.getTransaction().begin();

        String jpql = "select a from AlunoBubble a";
        TypedQuery<AlunoBubble> query = em.createQuery(jpql, AlunoBubble.class);
        List<AlunoBubble> alunos = query.getResultList();

        em.getTransaction().commit();

        em.close();

        for (AlunoBubble aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() +
                    " | CPF: " + aluno.getCpf() +
                    " | Idade: " + aluno.getIdade());
        }

// ------------------- Bubble Sort por idade -------------------
        for (int i = 0; i < alunos.size()- 1; i++) {
            for (int j = 0; j < alunos.size() - 1 - i; j++) {
                if (alunos.get(j).getIdade() > alunos.get(j + 1).getIdade()) {

                    // troca de posição
                    AlunoBubble temp = alunos.get(j);
                    alunos.set(j, alunos.get(j + 1));
                    alunos.set(j + 1, temp);

                }
            }
        }


        System.out.println("\n -=-=-=-=-=-=-=-= Lista Ordenada por Idade -=-=-=-=-=-=-=-= ");

        for (AlunoBubble aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() +
                    " | CPF: " + aluno.getCpf() +
                    " | Idade: " + aluno.getIdade());
        }

    }
}
