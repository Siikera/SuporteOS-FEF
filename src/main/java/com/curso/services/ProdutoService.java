package com.curso.services;

import com.curso.domains.dtos.ProdutoDTO;
import com.curso.repositories.GrupoProdutoRepository;
import com.curso.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepo;

    public List<ProdutoDTO> findAll(){
        return produtoRepo.findAll().stream()
                .map(obj-> new ProdutoDTO(obj))
                .collect(Collectors.toList());
    }

}

