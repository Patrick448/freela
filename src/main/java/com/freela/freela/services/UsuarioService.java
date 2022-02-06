package com.freela.freela.services;

import com.freela.freela.dto.UsuarioDTO;
import com.freela.freela.model.Usuario;
import com.freela.freela.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioDTO> findAll(){
        List<Usuario> result = repository.findAll();
        return result.stream().map(entity -> new UsuarioDTO(entity)).collect(Collectors.toList());
    }
}