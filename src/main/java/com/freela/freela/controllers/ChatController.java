package com.freela.freela.controllers;

import com.freela.freela.services.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/chat")
public class ChatController {

    @Autowired
    private ChatService service;

    /*@GetMapping
    public ResponseEntity<List<ContratoDTO>> findAll(Pageable pageable){
        System.out.println("Returning contracts");

        List<ContratoDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value="/current-user")
    public ResponseEntity<List<ContratoDTO>> findAllCurrentUser(@AuthenticationPrincipal String username){
        System.out.println("Returning services of this user");
        List<ContratoDTO> list = service.findContractsByUserEmail(username);
        return ResponseEntity.ok(list);
    }*/


/*
    @PutMapping(value = "/send-message",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity resgisterService(@RequestBody Message servicoDTO, @AuthenticationPrincipal String username){

        Servico servicoFromDTO = new Servico(servicoDTO);
        UsuarioDTO anuncianteDTO = usuarioService.findByEmail(username);
        servicoFromDTO.setAnunciante(new Usuario(anuncianteDTO));


        try {
            service.save(servicoFromDTO);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok().build();
    }*/
}
