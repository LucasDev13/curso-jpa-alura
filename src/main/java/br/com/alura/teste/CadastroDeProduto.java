package br.com.alura.teste;

import br.com.alura.dao.ProdutoDao;
import br.com.alura.modelo.Categoria;
import br.com.alura.modelo.Produto;
import br.com.alura.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Produto celular = new Produto("Xiaomi Readmi", "Muito legal",
                new BigDecimal("800"), Categoria.CELULARES);

        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDao dao = new ProdutoDao(em);

        em.getTransaction().begin();
        dao.cadastra(celular);
        em.getTransaction().commit();
        em.close();
    }
}
