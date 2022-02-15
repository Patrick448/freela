package com.freela.freela.services;


import com.freela.freela.dto.ContratoDTO;
import com.freela.freela.dto.ServicoDTO;
import com.freela.freela.model.Chat;
import com.freela.freela.model.Contrato;
import com.freela.freela.model.Servico;
import com.freela.freela.repositories.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContratoService {

    @Autowired
    ContratoRepository repository;

    @Transactional(readOnly = true)
    public List<ContratoDTO> findAll(){
        List<Contrato> result = repository.findAll();
        return result.stream().map(entity -> new ContratoDTO(entity)).collect(Collectors.toList());
    }
    @Transactional(readOnly = true)
    public List<ContratoDTO> findContractsByUserEmail(String email){
        List<Contrato> result = repository.findContractsByUserEmail(email);
        return result.stream().map(entity -> new ContratoDTO(entity)).collect(Collectors.toList());
    }

    @Transactional
    public Contrato save(Contrato entity){
        return repository.save(entity);
    }
}
