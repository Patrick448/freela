package com.freela.freela.model;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table(name="tb_messages")
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int idRemetente;
    private Calendar dataEnvio;
    @ManyToOne
    private Chat chat;

    public Mensagem() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdRemetente() {
        return idRemetente;
    }

    public void setIdRemetente(int idRemetente) {
        this.idRemetente = idRemetente;
    }

    public Calendar getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Calendar dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }
}
