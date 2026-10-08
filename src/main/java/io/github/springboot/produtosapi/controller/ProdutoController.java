package io.github.springboot.produtosapi.controller;

import io.github.springboot.produtosapi.model.Produto;
import io.github.springboot.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        var uuid = UUID.randomUUID().toString();
        produto.setId(uuid);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable String id){
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public Produto atualizar(@PathVariable String id, @RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public List<Produto> buscarPorNome(@RequestParam String nome){
        return produtoRepository.findByNome(nome);
    }

}
