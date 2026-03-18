package com.lachimia.saito.services;

import com.lachimia.saito.models.LivroModel;
import com.lachimia.saito.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    public List<LivroModel>findall(){
        return livroRepository.findAll();
    }

    public LivroModel criarLivro(LivroModel livroModel){
        return livroRepository.save(livroModel);
    }

    public LivroModel listarLivro(Long id){
        return livroRepository.findById(id).get();
    }

    public Optional<LivroModel> buscarLivro(Long id){
        return livroRepository.findById(id);
    }

    public void deletarLivro(Long id){
        livroRepository.deleteById(id);
    }
}
