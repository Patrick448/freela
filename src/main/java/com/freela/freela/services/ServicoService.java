package com.freela.freela.services;

import com.freela.freela.dto.ServicoDTO;
import com.freela.freela.dto.UsuarioDTO;
import com.freela.freela.model.Servico;
import com.freela.freela.model.Usuario;
import com.freela.freela.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
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

    @Transactional(readOnly = true)
    public List<ServicoDTO> findServicesByUserEmail(String email){
        List<Servico> result = repository.findServicesByUserEmail(email);
        return result.stream().map(entity -> new ServicoDTO(entity)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Page<ServicoDTO> findServicoByType(Pageable pageable, boolean buscaContratante){
        Page<Servico> result;

        if(buscaContratante==true){
            result= repository.findServicesLookingForContractors(pageable);
        }else{
            result= repository.findServicesLookingForProviders(pageable);
        }
        return result.map(entity -> new ServicoDTO(entity));
    }

    @Transactional(readOnly = true)
    public ServicoDTO findById(Long id){
        Optional<Servico> servico = repository.findById(id);

        if(servico.isEmpty()){
            return null;
        }
        return new ServicoDTO(servico.get());
    }

    @Transactional
    public Servico save(Servico entity){
        return repository.save(entity);
    }
}
