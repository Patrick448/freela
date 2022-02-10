package com.freela.freela.services;

import com.freela.freela.dto.ServicoDTO;
import com.freela.freela.model.Servico;
import com.freela.freela.model.Usuario;
import com.freela.freela.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository repository;

    @Transactional(readOnly = true)
    public Page<ServicoDTO> findAll(Pageable pageable){
        Page<Servico> result = repository.findAll(pageable);
        return result.map(entity -> new ServicoDTO(entity));
    }

    @Transactional
    public Servico save(Servico entity){
        return repository.save(entity);
    }
}
