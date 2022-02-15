package com.freela.freela.controllers;

import com.freela.freela.dto.ChatDTO;
import com.freela.freela.dto.MensagemDTO;
import com.freela.freela.dto.UsuarioDTO;
import com.freela.freela.model.Chat;
import com.freela.freela.model.Usuario;
import com.freela.freela.services.ChatService;
import com.freela.freela.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/chat")
public class ChatController {

    @Autowired
    private ChatService service;
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<ChatDTO>> findAll(Pageable pageable){
        System.out.println("Returning chats");

        List<ChatDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }



    /*@GetMapping(value="/current-user")
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


    @PostMapping(value = "/create-chat",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity resgisterService(@AuthenticationPrincipal String username, @RequestBody ChatDTO chatDTO){

        Chat chat = new Chat();
        Usuario usuario1 = new Usuario(usuarioService.findById(chatDTO.getIdUser1()));
       // usuario1.setId(chatDTO.getIdUser1());
        Usuario usuario2 = new Usuario(usuarioService.findById(chatDTO.getIdUser2()));
       // usuario1.setId(chatDTO.getIdUser2());

        Set<Usuario> pair = new HashSet<>(Arrays.asList(usuario1, usuario2));
        chat.setUsuarioPair(pair);
        chat.setDataInicio(Calendar.getInstance());


        try {
            service.save(chat);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok().build();
    }
}
