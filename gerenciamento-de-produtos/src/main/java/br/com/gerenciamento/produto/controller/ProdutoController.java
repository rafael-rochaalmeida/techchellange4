package br.com.gerenciamento.produto.controller;

import java.util.List;

import javax.swing.text.html.parser.Entity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerenciamento.produto.domain.Produto;

@RestController
@RequestMapping("/produto")
public class ProdutoController {


    @GetMapping
    public ResponseEntity<List<Produto>> getProdutos(){
        return null;
    }

}
