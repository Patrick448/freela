package com.freela.freela.model;

import java.util.Calendar;
import java.util.List;

public class Contrato {
    int id;
    String titulo;
    String descrição;
    Usuario prestador;
    Usuario contratante;
    boolean buscaContratante;
    boolean buscaPrestador;
    Calendar dataContratação;
    Calendar dataPrestacao;
    boolean concluido;
    boolean confirmado;
    boolean cancelado;
    int parcelas;
    float valorParcela;
}
