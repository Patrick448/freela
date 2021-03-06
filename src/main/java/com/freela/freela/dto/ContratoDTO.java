package com.freela.freela.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.freela.freela.model.Contrato;
import com.freela.freela.model.Servico;
import com.freela.freela.model.Usuario;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

public class ContratoDTO implements Serializable {
    private static final long serialVersionUID=1L;

    Long id;
    String titulo;
    String descricao;
    @JsonIgnore
    Usuario prestador;
    @JsonIgnore
    Usuario contratante;
    ServicoDTO servico;
    boolean buscaContratante;
    boolean buscaPrestador;
    Calendar dataContratacao;
    Calendar dataPrestacao;
    boolean concluido;
    boolean confirmado;
    boolean cancelado;
    int parcelas;
    float valorParcela;
    Long prestadorId;
    Long contratanteId;
    Long servicoId;

    public ContratoDTO() {
    }


    public Long getPrestadorId() {
        return prestadorId;
    }

    public void setPrestadorId(Long prestadorId) {
        this.prestadorId = prestadorId;
    }

    public Long getContratanteId() {
        return contratanteId;
    }

    public void setContratanteId(Long contratanteId) {
        this.contratanteId = contratanteId;
    }

    public Long getServicoId() {
        return servicoId;
    }

    public void setServicoId(Long servicoId) {
        this.servicoId = servicoId;
    }

    public ContratoDTO(Long id, String titulo, String descricao, Usuario prestador, Usuario contratante, ServicoDTO servico, boolean buscaContratante, boolean buscaPrestador, Calendar dataContratacao, Calendar dataPrestacao, boolean concluido, boolean confirmado, boolean cancelado, int parcelas, float valorParcela) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prestador = prestador;
        this.contratante = contratante;
        this.servico = servico;
        this.buscaContratante = buscaContratante;
        this.buscaPrestador = buscaPrestador;
        this.dataContratacao = dataContratacao;
        this.dataPrestacao = dataPrestacao;
        this.concluido = concluido;
        this.confirmado = confirmado;
        this.cancelado = cancelado;
        this.parcelas = parcelas;
        this.valorParcela = valorParcela;
    }

    public ContratoDTO(Contrato entity) {
        this.id = entity.getId();
        this.titulo = entity.getTitulo();
        this.descricao = entity.getDescricao();
        this.prestador = entity.getPrestador();
        this.contratante = entity.getContratante();
        this.servico = new ServicoDTO(entity.getServico());
        this.buscaContratante = entity.isBuscaContratante();
        this.buscaPrestador = entity.isBuscaPrestador();
        this.dataContratacao = entity.getDataContratacao();
        this.dataPrestacao = entity.getDataPrestacao();
        this.concluido = entity.isConcluido();
        this.confirmado = entity.isConfirmado();
        this.cancelado = entity.isCancelado();
        this.parcelas = entity.getParcelas();
        this.valorParcela = entity.getValorParcela();
        this.prestadorId = entity.getPrestador().getId();
        this.contratanteId = entity.getContratante().getId();
        this.servicoId = entity.getServico().getId();
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

    public Usuario getPrestador() {
        return prestador;
    }

    public void setPrestador(Usuario prestador) {
        this.prestador = prestador;
    }

    public Usuario getContratante() {
        return contratante;
    }

    public void setContratante(Usuario contratante) {
        this.contratante = contratante;
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

    public Calendar getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Calendar dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Calendar getDataPrestacao() {
        return dataPrestacao;
    }

    public void setDataPrestacao(Calendar dataPrestacao) {
        this.dataPrestacao = dataPrestacao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }
}
