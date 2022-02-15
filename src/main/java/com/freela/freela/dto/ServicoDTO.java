package com.freela.freela.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.freela.freela.model.Servico;

import java.io.Serializable;
import java.util.Calendar;

public class ServicoDTO implements Serializable {

    private static final long serialVersionUID=1L;
    Long id;
    String titulo;
    String descricao;
    @JsonIgnore
    UsuarioDTO anunciante;
    boolean buscaContratante;
    boolean buscaPrestador;
    Calendar data;
    String local;
    float preco;
    Long anuncianteId;


    public ServicoDTO() {
    }

    public ServicoDTO(Long id, String titulo, String descricao, UsuarioDTO anunciante, boolean buscaContratante, boolean buscaPrestador, Calendar data, String local, float preco) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.anunciante = anunciante;
        this.buscaContratante = buscaContratante;
        this.buscaPrestador = buscaPrestador;
        this.data = data;
        this.local = local;
        this.preco = preco;

    }

    public ServicoDTO(Long id, String titulo, String descricao, UsuarioDTO anunciante, boolean buscaContratante, boolean buscaPrestador, Calendar data, String local, float preco, Long anuncianteId) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.anunciante = anunciante;
        this.buscaContratante = buscaContratante;
        this.buscaPrestador = buscaPrestador;
        this.data = data;
        this.local = local;
        this.preco = preco;
        this.anuncianteId = anuncianteId;
    }

    public ServicoDTO(Servico entity) {
        this.id = entity.getId();
        this.titulo = entity.getTitulo();
        this.descricao = entity.getDescricao();
        this.anunciante = new UsuarioDTO(entity.getAnunciante());
        this.buscaContratante = entity.isBuscaContratante();
        this.buscaPrestador = entity.isBuscaPrestador();
        this.data = entity.getData();
        this.local = entity.getLocal();
        this.preco = entity.getPreco();
    }

    public Long getAnuncianteId() {
        return anuncianteId;
    }

    public void setAnuncianteId(Long anuncianteId) {
        this.anuncianteId = anuncianteId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UsuarioDTO getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(UsuarioDTO anunciante) {
        this.anunciante = anunciante;
    }

    public boolean isBuscaContratante() {
        return buscaContratante;
    }

    public void setBuscaContratante(boolean buscaContratante) {
        this.buscaContratante = buscaContratante;
    }

    public boolean isBuscaPrestador() {
        return buscaPrestador;
    }

    public void setBuscaPrestador(boolean buscaPrestador) {
        this.buscaPrestador = buscaPrestador;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


}
