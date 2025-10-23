package br.com.raoni.sistemaBasico.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO <Entidade> {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
    protected EntityManager em;
    private final Class<Entidade> entidade;

    public DAO(Class<Entidade> entidade) {
        em = emf.createEntityManager();
        this.entidade = entidade;
    }
    public DAO() {
        this(null);
    }

    public DAO<Entidade> abrirTransacao() {
        em.getTransaction().begin();
        return this;
    }
    public DAO<Entidade> fecharTransacao() {
        em.getTransaction().commit();
        return this;
    }
    public DAO<Entidade> incluir(Entidade entidade) {
        em.persist(entidade);
        return this;
    }

    public DAO<Entidade> alterar(Entidade entidade) {
        em.merge(entidade);
        return this;
    }
    public DAO<Entidade> remover(Entidade entidade) {
        em.remove(entidade);
        return this;
    }
    public List<Entidade> ObterTodos(int limit, int offset) {

        if (entidade == null) {
            throw new UnsupportedOperationException("classe nula");
        }

        String jpql = "SELECT e FROM " + entidade.getName() + " e";
        TypedQuery<Entidade> query = em.createQuery(jpql, entidade);
        query.setMaxResults(limit);
        query.setFirstResult(offset);
        return query.getResultList();
    }

    public void fecharEm() {
        em.close();
    }
}
