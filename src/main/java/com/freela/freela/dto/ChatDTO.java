package com.freela.freela.dto;

import com.freela.freela.model.Chat;
import com.freela.freela.model.Mensagem;
import com.freela.freela.model.Usuario;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Set;


public class ChatDTO implements Serializable {
    private static final long serialVersionUID=1L;
    private Long id;
    private Calendar dataInicio;
   // private Set<Usuario> usuarioPair;
   // private List<Mensagem> mensagemList;

    public ChatDTO() {

    }

    public ChatDTO(Long id, Calendar dataInicio) {
        this.id = id;
        this.dataInicio = dataInicio;
    }

    public ChatDTO(Chat entity) {
        this.id = entity.getId();
        this.dataInicio = entity.getDataInicio();
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    /*public List<Mensagem> getMensagemList() {
        return mensagemList;
    }

    public void setMensagemList(List<Mensagem> mensagemList) {
        this.mensagemList = mensagemList;
    }

    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagemList.add(mensagem);
    }

    public Set<Usuario> getUsuarioPair() {
        return usuarioPair;
    }

    public void setUsuarioPair(Set<Usuario> usuarioPair) {
        this.usuarioPair = usuarioPair;
    }*/
}
