package com.freela.freela.controllers;

import com.freela.freela.dto.ServicoDTO;
import com.freela.freela.dto.UsuarioDTO;
import com.freela.freela.services.ServicoService;
import com.freela.freela.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ServicoController {

    @Autowired
    private ServicoService service;

    @GetMapping
    public ResponseEntity<Page<ServicoDTO>> findAll(Pageable pageable){
        Page<ServicoDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}
