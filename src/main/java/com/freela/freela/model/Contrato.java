package com.freela.freela.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name="tb_contracts")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String titulo;
    String descricao;
    @ManyToOne(fetch = FetchType.LAZY)
    Usuario prestador;
    @ManyToOne(fetch = FetchType.LAZY)
    Usuario contratante;

    @ManyToOne(fetch = FetchType.LAZY)
    Servico servico;
    boolean buscaContratante;
    boolean buscaPrestador;
    Calendar dataContratacao;
    Calendar dataPrestacao;
    boolean concluido;
    boolean confirmado;
    boolean cancelado;
    int parcelas;
    float valorParcela;

    public Contrato() {
    }


    public Contrato(Long id, String titulo, String descricao, Usuario prestador, Usuario contratante, Servico servico, boolean buscaContratante, boolean buscaPrestador, Calendar dataContratacao, Calendar dataPrestacao, boolean concluido, boolean confirmado, boolean cancelado, int parcelas, float valorParcela) {
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

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
}
