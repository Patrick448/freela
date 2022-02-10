package com.freela.freela.model;

import com.freela.freela.dto.ServicoDTO;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="tb_services")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String titulo;
    String descricao;

    //Usuario prestador;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "announcer_id")
    Usuario anunciante;
    boolean buscaContratante;
    boolean buscaPrestador;
    Calendar data;
    String local;
    float preco;

    @OneToMany(mappedBy = "servico", fetch = FetchType.LAZY)
    List<Avaliacao> avaliacoes;

    @OneToMany(mappedBy = "servico", fetch = FetchType.LAZY)
    List<Contrato> contratos;

    //List<Avaliacao> avaliacoes;


    public Servico() {
    }

    public Servico(ServicoDTO servicoDTO) {
        this.id = servicoDTO.getId();
        this.titulo = servicoDTO.getTitulo();
        this.descricao = servicoDTO.getDescricao();
        //this.anunciante = new Usuario(servicoDTO.getAnunciante());
        this.buscaContratante = servicoDTO.isBuscaContratante();
        this.buscaPrestador = servicoDTO.isBuscaPrestador();
        this.data = servicoDTO.getData();
        this.local = servicoDTO.getLocal();
        this.preco = servicoDTO.getPreco();
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

    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }
/*
    public Usuario getPrestador() {
        return prestador;
    }

    public void setPrestador(Usuario prestador) {
        this.prestador = prestador;
    }
*/
    public Usuario getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(Usuario contratante) {
        this.anunciante = contratante;
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
/*
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
*/
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

    /*public boolean isConcluido() {
        return concluido;
    }*/

    /*public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }*/

    /*public boolean isConfirmado() {
        return confirmado;
    }*/

    /*public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }*/

   /* public boolean isCancelado() {
        return cancelado;
    }*/

    /*public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }*/
/*
    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public DadosPagamento getDadosPagamento() {
        return dadosPagamento;
    }

    public void setDadosPagamento(DadosPagamento dadosPagamento) {
        this.dadosPagamento = dadosPagamento;
    }

      void adicionarAvaliacao(Avaliacao avaliacao){
        avaliacoes.add(avaliacao);
    }
*/

    /*
    void contratar(Usuario usuario){
        if (buscaContratante) {
            setAnunciante(usuario);

        } else if (buscaPrestador){
            setPrestador(usuario);
        }
    }*/


}
