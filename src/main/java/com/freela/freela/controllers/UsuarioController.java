package com.freela.freela.controllers;

import com.freela.freela.dto.UsuarioDTO;
import com.freela.freela.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
