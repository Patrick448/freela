package com.freela.freela.controllers;

import com.freela.freela.dto.UsuarioDTO;
import com.freela.freela.model.Usuario;
import com.freela.freela.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/all")
    public ResponseEntity<List<UsuarioDTO>> findAll(@AuthenticationPrincipal UserDetails userDetails){
        System.out.println(userDetails);
        List<UsuarioDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/get-user")
    public ResponseEntity<UsuarioDTO> getCurrentUser(@AuthenticationPrincipal String userDetails){
        System.out.println(userDetails);
        UsuarioDTO usuarioDTO = service.findByEmail(userDetails);
        return ResponseEntity.ok(usuarioDTO);
    }

    @PostMapping(value = "/register",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity resgisterUser(@RequestBody UsuarioDTO usuarioDTO){

        Usuario usuarioFromDTO = new Usuario(usuarioDTO);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        usuarioFromDTO.setSenha(passwordEncoder.encode(usuarioDTO.getSenha()));
        usuarioFromDTO.setAdmin(false);

        try {
            service.save(usuarioFromDTO);
        }catch(Exception e){
            return ResponseEntity.internalServerError().build();
        }

        return ResponseEntity.ok().build();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping(value = "/test")
    public ResponseEntity testMethod(){
        return ResponseEntity.ok().build();
    }

}
