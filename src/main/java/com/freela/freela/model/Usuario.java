package com.freela.freela.model;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="tb_users")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private byte senha;
    private Calendar dataNascimento;
    private char genero;
    private String telefone;
    //private List<Avaliacao> avaliacaoList;
    private int estrelas;
    // private List<Chat> chats;
    @OneToMany(mappedBy = "anunciante", fetch = FetchType.LAZY)
    private List<Servico> servicosPublicadosList;
    //private List<Contrato> contratadosList;
    //private List<Contrato> prestadosList;

    public List<Servico> getServicosPublicadosList() {
        return servicosPublicadosList;
    }

    public void setServicosPublicadosList(List<Servico> servicosPublicadosList) {
        this.servicosPublicadosList = servicosPublicadosList;
    }



    public Usuario() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getSenha() {
        return senha;
    }

    public void setSenha(byte senha) {
        this.senha = senha;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   /* public List<Avaliacao> getAvaliacaoList() {
        return avaliacaoList;
    }*/

   /* public void setAvaliacaoList(List<Avaliacao> avaliacaoList) {
        this.avaliacaoList = avaliacaoList;
    }*/

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

   /* public List<Chat> getChats() {
        return chats;
    }*/

  /*  public void setChats(List<Chat> chats) {
        this.chats = chats;
    }*/

    public void adicionarServico(Servico servico) {
        this.servicosPublicadosList.add(servico);
    }

    /*public void calcularEstrelas() {
        int estrelasSoma = 0;
        int cont = 0;
        for(Avaliacao aval : this.avaliacaoList) {
            estrelasSoma += aval.getEstrelas();
            cont++;
        }
        this.estrelas = estrelasSoma / cont;
    }*/
}
