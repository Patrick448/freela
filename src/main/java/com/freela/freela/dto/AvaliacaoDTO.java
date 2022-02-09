package com.freela.freela.dto;

import com.freela.freela.model.Avaliacao;
import com.freela.freela.model.Servico;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

public class AvaliacaoDTO implements Serializable {

    private static final long serialVersionUID=1L;
    Long id;
    int estrelas;
    String texto;
    Calendar data;
    private ServicoDTO servico;

    public AvaliacaoDTO() {
    }

    public AvaliacaoDTO(Long id, int estrelas, String texto, Calendar data, ServicoDTO servico) {
        this.id = id;
        this.estrelas = estrelas;
        this.texto = texto;
        this.data = data;
        this.servico = servico;
    }

    public AvaliacaoDTO(Avaliacao entity) {
        this.id = entity.getId();
        this.estrelas = entity.getEstrelas();
        this.texto = entity.getTexto();
        this.data = entity.getData();
        this.servico = new ServicoDTO(entity.getServico());
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public ServicoDTO getServico() {
        return servico;
    }

    public void setServico(ServicoDTO servico) {
        this.servico = servico;
    }
}
