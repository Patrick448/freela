package com.freela.freela.controllers;

import com.freela.freela.dto.ContratoDTO;
import com.freela.freela.dto.ServicoDTO;
import com.freela.freela.dto.UsuarioDTO;
import com.freela.freela.model.Contrato;
import com.freela.freela.model.Servico;
import com.freela.freela.model.Usuario;
import com.freela.freela.services.ContratoService;
import com.freela.freela.services.ServicoService;
import com.freela.freela.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping(value = "/contracts")
public class ContratoController {

    @Autowired
    private ContratoService service;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private ServicoService servicoService;


    @GetMapping
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
    }

    @PostMapping(value = "/register",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity resgisterService(@RequestBody ContratoDTO contratoDTO, @AuthenticationPrincipal String username){

        Contrato contrato = new Contrato(contratoDTO);
        Usuario contratante = new Usuario(usuarioService.findById(contratoDTO.getContratanteId()));
        Usuario prestador = new Usuario(usuarioService.findById(contratoDTO.getPrestadorId()));
        Servico servico = new Servico(servicoService.findById(contratoDTO.getServicoId()));
        contrato.setContratante(contratante);
        contrato.setPrestador(prestador);
        contrato.setServico(servico);

        try {
            service.save(contrato);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok().build();
    }


/*
    @PutMapping(value = "/register",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity resgisterService(@RequestBody ServicoDTO servicoDTO, @AuthenticationPrincipal String username){

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
