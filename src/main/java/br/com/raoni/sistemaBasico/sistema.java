package br.com.raoni.sistemaBasico;

import br.com.raoni.sistemaBasico.entidades.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class sistema {
    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("exercicios-jpa").createEntityManager();

        System.out.println(" -=-=-=-=-=-=-=-= Ordenação de alunos apartir do bubble sort -=-=-=-=-=-=-=-= ");
        System.out.println(" -=-=-=-=-=-=-=-= Lista Original Sem Passar Pelo Bubble Sort -=-=-=-=-=-=-=-= ");

        em.getTransaction().begin();

        String jpql = "select a from Aluno a";
        TypedQuery<Aluno> query = em.createQuery(jpql, Aluno.class);
        List<Aluno> alunos = query.getResultList();

        em.getTransaction().commit();

        em.close();

        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() +
                    " | CPF: " + aluno.getCpf() +
                    " | Idade: " + aluno.getIdade());
        }

// ------------------- Bubble Sort por idade -------------------
        for (int i = 0; i < alunos.size()- 1; i++) {
            for (int j = 0; j < alunos.size() - 1 - i; j++) {
                if (alunos.get(j).getIdade() > alunos.get(j + 1).getIdade()) {
                    // troca de posição
                    Aluno temp = alunos.get(j);
                    alunos.set(j, alunos.get(j + 1));
                    alunos.set(j + 1, temp);
                }
            }
        }


        System.out.println("\n -=-=-=-=-=-=-=-= Lista Ordenada por Idade -=-=-=-=-=-=-=-= ");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() +
                    " | CPF: " + aluno.getCpf() +
                    " | Idade: " + aluno.getIdade());
        }

    }
}
