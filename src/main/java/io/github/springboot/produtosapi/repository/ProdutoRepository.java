package io.github.springboot.produtosapi.repository;

import io.github.springboot.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    public List<Produto> findByNome(@RequestParam String nome);
}
