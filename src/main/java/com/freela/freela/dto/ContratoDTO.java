package com.freela.freela.dto;

import com.freela.freela.model.Contrato;
import com.freela.freela.model.Servico;
import com.freela.freela.model.Usuario;

import javax.persistence.*;
import java.util.Calendar;

public class ContratoDTO {
    Long id;
    String titulo;
    String descrição;
    Usuario prestador;
    Usuario contratante;
    ServicoDTO servico;
    boolean buscaContratante;
    boolean buscaPrestador;
    Calendar dataContratação;
    Calendar dataPrestacao;
    boolean concluido;
    boolean confirmado;
    boolean cancelado;
    int parcelas;
    float valorParcela;

    public ContratoDTO() {
    }


    public ContratoDTO(Long id, String titulo, String descrição, Usuario prestador, Usuario contratante, ServicoDTO servico, boolean buscaContratante, boolean buscaPrestador, Calendar dataContratação, Calendar dataPrestacao, boolean concluido, boolean confirmado, boolean cancelado, int parcelas, float valorParcela) {
        this.id = id;
        this.titulo = titulo;
        this.descrição = descrição;
        this.prestador = prestador;
        this.contratante = contratante;
        this.servico = servico;
        this.buscaContratante = buscaContratante;
        this.buscaPrestador = buscaPrestador;
        this.dataContratação = dataContratação;
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
        this.descrição = entity.getDescrição();
        this.prestador = entity.getPrestador();
        this.contratante = entity.getContratante();
        this.servico = new ServicoDTO(entity.getServico());
        this.buscaContratante = entity.isBuscaContratante();
        this.buscaPrestador = entity.isBuscaPrestador();
        this.dataContratação = entity.getDataContratação();
        this.dataPrestacao = entity.getDataPrestacao();
        this.concluido = entity.isConcluido();
        this.confirmado = entity.isConfirmado();
        this.cancelado = entity.isCancelado();
        this.parcelas = entity.getParcelas();
        this.valorParcela = entity.getValorParcela();
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

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
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

    public Calendar getDataContratação() {
        return dataContratação;
    }

    public void setDataContratação(Calendar dataContratação) {
        this.dataContratação = dataContratação;
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
