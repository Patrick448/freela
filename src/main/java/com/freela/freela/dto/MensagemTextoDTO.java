package com.freela.freela.dto;

import com.freela.freela.model.Chat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Calendar;

public class MensagemTextoDTO {

    private Long id;
    private int idRemetente;
    private Calendar dataEnvio;
    private Chat chat;
    private String conteudo;

    public MensagemTextoDTO() {
    }

    public MensagemTextoDTO(Long id, int idRemetente, Calendar dataEnvio, Chat chat, String conteudo) {
        this.id = id;
        this.idRemetente = idRemetente;
        this.dataEnvio = dataEnvio;
        this.chat = chat;
        this.conteudo = conteudo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdRemetente() {
        return idRemetente;
    }

    public void setIdRemetente(int idRemetente) {
        this.idRemetente = idRemetente;
    }

    public Calendar getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Calendar dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
