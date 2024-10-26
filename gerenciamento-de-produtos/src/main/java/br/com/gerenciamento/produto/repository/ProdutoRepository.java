package br.com.gerenciamento.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gerenciamento.produto.domain.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
