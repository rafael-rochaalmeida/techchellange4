package br.com.gerenciamento.produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciamento.produto.domain.Produto;
import br.com.gerenciamento.produto.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ControllerProduto {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<List<Produto>> getProdutos(){
        return ResponseEntity.status(200).body(produtoRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Produto> postProduto(@RequestBody Produto produto){
        return ResponseEntity.status(201).body(produtoRepository.save(produto));
    }

}
