package com.freela.freela.controllers;

import com.freela.freela.dto.MensagemDTO;
import com.freela.freela.dto.MensagemTextoDTO;
import com.freela.freela.model.MensagemTexto;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;

@Controller
public class ChatWebsocketController {

    @MessageMapping("/send")
    @SendTo("/chat-response/response")
    public MensagemTextoDTO sendMessage(@AuthenticationPrincipal String username, MensagemTextoDTO mensagemDTO){
        System.out.println("Send message!");
        MensagemTextoDTO response = new MensagemTextoDTO();
        response.setConteudo("Testando");

        return response;
    }
}
