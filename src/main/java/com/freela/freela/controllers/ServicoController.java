package com.freela.freela.controllers;

import com.freela.freela.dto.ServicoDTO;
import com.freela.freela.dto.UsuarioDTO;
import com.freela.freela.model.Servico;
import com.freela.freela.model.Usuario;
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
@RequestMapping(value = "/services")
public class ServicoController {

    @Autowired
    private ServicoService service;
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<Page<ServicoDTO>> findAll(Pageable pageable, @RequestParam boolean buscaContrante){
        System.out.println("Returning services");
        System.out.println(pageable);
        Page<ServicoDTO> list = service.findServicoByType(pageable, buscaContrante);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value="/current-user")
    public ResponseEntity<List<ServicoDTO>> findAllCurrentUser(Pageable pageable, @AuthenticationPrincipal String username){
        System.out.println("Returning services of this user");
        List<ServicoDTO> list = service.findServicesByUserEmail(username);
        return ResponseEntity.ok(list);
    }



    @PostMapping(value = "/register",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity resgisterService(@RequestBody ServicoDTO servicoDTO, @AuthenticationPrincipal String username){

        Servico servicoFromDTO = new Servico(servicoDTO);
        UsuarioDTO anuncianteDTO = usuarioService.findByEmail(username);
        servicoFromDTO.setAnunciante(new Usuario(anuncianteDTO));
        servicoFromDTO.setData(Calendar.getInstance());


        try {
            service.save(servicoFromDTO);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok().build();
    }
}
