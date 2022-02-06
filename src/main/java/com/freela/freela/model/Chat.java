package com.freela.freela.model;

import java.util.Calendar;
import java.util.List;

public class Chat {
    private int id;
    private Calendar dataInicio;
    private Usuario user;
    private List<Mensagem> mensagemList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<Mensagem> getMensagemList() {
        return mensagemList;
    }

    public void setMensagemList(List<Mensagem> mensagemList) {
        this.mensagemList = mensagemList;
    }

    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagemList.add(mensagem);
    }
}
