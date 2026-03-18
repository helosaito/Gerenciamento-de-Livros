package com.lachimia.saito.controllers;

import com.lachimia.saito.models.LivroModel;
import com.lachimia.saito.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public ResponseEntity<List<LivroModel>>findAll(){
        List<LivroModel> requeste = livroService.findall();
        return ResponseEntity.ok(requeste);
    }

    @PostMapping
    public ResponseEntity<LivroModel>criarLivro(@RequestBody LivroModel livroModel){
        LivroModel livro = livroService.criarLivro(livroModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(livro.getId()).toUri();
        return ResponseEntity.created(uri).body(livro);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?>deletarLivro(Long id){
        livroService.deletarLivro(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public Optional<LivroModel> buscarLivro(Long id){
        return livroService.buscarLivro(id);
    }

    @GetMapping("/{id}")
    public LivroModel listarLivro(Long id){
        return livroService.listarLivro(id);
    }
}
