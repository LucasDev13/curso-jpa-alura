package br.com.alura.dao;

import br.com.alura.modelo.Produto;

import javax.persistence.EntityManager;

public class ProdutoDao {
    private EntityManager em;
    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastra(Produto produto){
        this.em.persist(produto);    }
}
