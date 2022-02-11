package com.freela.freela.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.freela.freela.dto.UsuarioDTO;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="tb_users")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String nome;
    @NotEmpty
    @Column(unique = true)
    private String email;
    @NotEmpty
    @JsonIgnore
    private String senha;
    private Calendar dataNascimento;
    private char genero;
    private String telefone;
    //private List<Avaliacao> avaliacaoList;
    private int estrelas;
    private boolean admin;

    @ManyToMany(mappedBy = "usuarioPair", fetch = FetchType.LAZY)
    private List<Chat> chats;
    @OneToMany(mappedBy = "anunciante", fetch = FetchType.LAZY)
    private List<Servico> servicosPublicadosList;

    @OneToMany(mappedBy = "contratante", fetch = FetchType.LAZY)
    private List<Contrato> contratadosList;

    @OneToMany(mappedBy = "prestador", fetch = FetchType.LAZY)
    private List<Contrato> prestadosList;

    @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
    private DadosPagamento dadosPagamento;

    public List<Servico> getServicosPublicadosList() {
        return servicosPublicadosList;
    }

    public void setServicosPublicadosList(List<Servico> servicosPublicadosList) {
        this.servicosPublicadosList = servicosPublicadosList;
    }



    public Usuario() {

    }

    public Usuario(UsuarioDTO dto) {
        this.id = dto.getId();
        this.nome = dto.getNome();
        this.email = dto.getEmail();
        this.senha = dto.getSenha();
        this.dataNascimento = dto.getDataNascimento();
        this.genero = dto.getGenero();
        this.telefone = dto.getTelefone();
        this.estrelas = dto.getEstrelas();
        this.admin = dto.isAdmin();
        // this.servicosPublicadosList = entity.getServicosPublicadosList();
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAdmin() {
        return admin;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
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
