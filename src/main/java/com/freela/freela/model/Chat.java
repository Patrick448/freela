package com.freela.freela.model;



import org.springframework.data.util.Pair;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="tb_chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Calendar dataInicio;
    //private Usuario user;
    @ManyToMany
    private Set<Usuario> usuarioPair;

    @OneToMany(mappedBy = "chat", fetch = FetchType.LAZY)
    private List<Mensagem> mensagemList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

  /*  public Usuario getUser() {
        return user;
    }*/

   /* public void setUser(Usuario user) {
        this.user = user;
    }*/

    public List<Mensagem> getMensagemList() {
        return mensagemList;
    }

    public void setMensagemList(List<Mensagem> mensagemList) {
        this.mensagemList = mensagemList;
    }

    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagemList.add(mensagem);
    }

    public Set<Usuario> getUsuarioPair() {
        return usuarioPair;
    }

    public void setUsuarioPair(Set<Usuario> usuarioPair) {
        this.usuarioPair = usuarioPair;
    }
}
