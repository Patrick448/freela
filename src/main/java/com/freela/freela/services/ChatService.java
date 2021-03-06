package com.freela.freela.services;


import com.freela.freela.dto.ChatDTO;
import com.freela.freela.dto.ContratoDTO;
import com.freela.freela.model.Chat;
import com.freela.freela.model.Contrato;
import com.freela.freela.model.Servico;
import com.freela.freela.repositories.ChatRepository;
import com.freela.freela.repositories.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChatService {

    @Autowired
    ChatRepository repository;


    @Transactional(readOnly = true)
    public List<ChatDTO> findAll(){
        List<Chat> result = repository.findAll();
        return result.stream().map(entity -> new ChatDTO(entity)).collect(Collectors.toList());
    }
    /*@Transactional(readOnly = true)
    public List<ContratoDTO> findContractsByUserEmail(String email){
        List<Contrato> result = repository.findContractsByUserEmail(email);
        return result.stream().map(entity -> new ContratoDTO(entity)).collect(Collectors.toList());
    }*/

    @Transactional
    public Chat save(Chat entity){
        return repository.save(entity);
    }


}
