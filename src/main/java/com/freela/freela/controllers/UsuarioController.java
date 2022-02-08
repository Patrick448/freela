package com.freela.freela.controllers;

import com.freela.freela.dto.UsuarioDTO;
import com.freela.freela.model.Usuario;
import com.freela.freela.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> findAll(){
        List<UsuarioDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping(value = "/register",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity resgisterUser(@RequestBody UsuarioDTO usuarioDTO){

        Usuario usuarioFromDTO = new Usuario(usuarioDTO);

        try {
            service.save(usuarioFromDTO);
        }catch(Exception e){
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok().build();
    }

}
