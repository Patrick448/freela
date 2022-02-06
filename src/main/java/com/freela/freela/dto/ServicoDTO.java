package com.freela.freela.dto;

import com.freela.freela.model.Servico;

import java.util.Calendar;

public class ServicoDTO {

    int id;
    String titulo;
    String descrição;
    UsuarioDTO anunciante;
    boolean buscaContratante;
    boolean buscaPrestador;
    Calendar data;
    String local;
    float preco;
    boolean concluido;
    boolean confirmado;
    boolean cancelado;

    public ServicoDTO() {
    }

    public ServicoDTO(int id, String titulo, String descrição, UsuarioDTO anunciante, boolean buscaContratante, boolean buscaPrestador, Calendar data, String local, float preco, boolean concluido, boolean confirmado, boolean cancelado) {
        this.id = id;
        this.titulo = titulo;
        this.descrição = descrição;
        this.anunciante = anunciante;
        this.buscaContratante = buscaContratante;
        this.buscaPrestador = buscaPrestador;
        this.data = data;
        this.local = local;
        this.preco = preco;
        this.concluido = concluido;
        this.confirmado = confirmado;
        this.cancelado = cancelado;
    }

    public ServicoDTO(Servico entity) {
        this.id = entity.getId();
        this.titulo = entity.getTitulo();
        this.descrição = entity.getDescrição();
        this.anunciante = new UsuarioDTO(entity.getAnunciante());
        this.buscaContratante = entity.isBuscaContratante();
        this.buscaPrestador = entity.isBuscaPrestador();
        this.data = entity.getData();
        this.local = entity.getLocal();
        this.preco = entity.getPreco();
        this.concluido = entity.isConcluido();
        this.confirmado = entity.isConfirmado();
        this.cancelado = entity.isCancelado();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
