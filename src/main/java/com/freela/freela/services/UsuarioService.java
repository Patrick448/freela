package com.freela.freela.services;

import com.freela.freela.dto.UsuarioDTO;
import com.freela.freela.model.Usuario;
import com.freela.freela.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Transactional(readOnly = true)
    public List<UsuarioDTO> findAll(){
        List<Usuario> result = repository.findAll();
        return result.stream().map(entity -> new UsuarioDTO(entity)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public UsuarioDTO findById(Long id){
        Optional<Usuario> usuario = repository.findById(id);

        if(usuario.isEmpty()){
            return null;
        }
        return new UsuarioDTO(usuario.get());
    }

    @Transactional
    public Usuario save(Usuario entity){
       return repository.save(entity);
    }
}
