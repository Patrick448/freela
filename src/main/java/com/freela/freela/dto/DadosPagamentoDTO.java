package com.freela.freela.dto;

import com.freela.freela.model.DadosPagamento;
import com.freela.freela.model.Usuario;

import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Calendar;

public class DadosPagamentoDTO implements Serializable {
    private static final long serialVersionUID=1L;
    Long id;
    String nomeTitular;
    String numero;
    Calendar validade;
    String cvv;
    int parcelas;
    float valorParcela;
    Usuario usuario;


    public DadosPagamentoDTO() {
    }

    public DadosPagamentoDTO(Long id, String nomeTitular, String numero, Calendar validade, String cvv,
                             int parcelas, float valorParcela, Usuario usuario) {
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.validade = validade;
        this.cvv = cvv;
        this.parcelas = parcelas;
        this.valorParcela = valorParcela;
        this.usuario = usuario;
    }

    public DadosPagamentoDTO(DadosPagamento entity) {
        this.id = entity.getId();
        this.nomeTitular = entity.getNomeTitular();
        this.numero = entity.getNumero();
        this.validade = entity.getValidade();
        this.cvv = entity.getCvv();
        this.parcelas = entity.getParcelas();
        this.valorParcela = entity.getValorParcela();
        this.usuario = entity.getUsuario();
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Calendar getValidade() {
        return validade;
    }

    public void setValidade(Calendar validade) {
        this.validade = validade;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
