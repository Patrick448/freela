package com.freela.freela.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.freela.freela.model.Servico;
import com.freela.freela.model.Usuario;

import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;


public class UsuarioDTO implements Serializable {

    private static final long serialVersionUID=1L;
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Calendar dataNascimento;
    private char genero;
    private String telefone;
    //private List<Avaliacao> avaliacaoList;
    private int estrelas;
    private boolean admin;
    // private List<Chat> chats;
    @JsonIgnore(value = true)
    private List<ServicoDTO> servicosPublicadosList;
    //private List<Contrato> contratadosList;
    //private List<Contrato> prestadosList;


    public UsuarioDTO() {
    }

    public UsuarioDTO(Usuario entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.email = entity.getEmail();
        this.senha = entity.getSenha();
        this.dataNascimento = entity.getDataNascimento();
        this.genero = entity.getGenero();
        this.telefone = entity.getTelefone();
        this.estrelas = entity.getEstrelas();
        this.admin = entity.isAdmin();
        //this.servicosPublicadosList = entity.getServicosPublicadosList().stream()
          //      .map(x -> new ServicoDTO(x)).collect(Collectors.toList());
       // this.servicosPublicadosList = entity.getServicosPublicadosList();
    }

    public UsuarioDTO(Long id, String nome, String email, String senha, Calendar dataNascimento, char genero, String telefone, int estrelas, boolean admin, List<ServicoDTO> servicosPublicadosList) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.telefone = telefone;
        this.estrelas = estrelas;
       this.servicosPublicadosList = servicosPublicadosList;
       this.admin = admin;
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

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

   public List<ServicoDTO> getServicosPublicadosList() {
        return servicosPublicadosList;
    }

    public void setServicosPublicadosList(List<ServicoDTO> servicosPublicadosList) {
        this.servicosPublicadosList = servicosPublicadosList;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
