import java.util.Calendar;
import java.util.List;

public class Servico {
    int id;
    String titulo;
    String descrição;
    Usuario prestador;
    Usuario contratante;
    boolean buscaContratante;
    boolean buscaPrestador;
    Calendar dataPostagem;
    Calendar dataContratação;
    Calendar dataPrestacao;
    String local;
    float preco;
    boolean concluido;
    boolean confirmado;
    boolean cancelado;
    List<Avaliacao> avaliacoes;
    DadosPagamento dadosPagamento;



    public Servico() {
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

    public Calendar getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(Calendar dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

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

    void contratar(Usuario usuario){
        if (buscaContratante) {
            setContratante(usuario);

        } else if (buscaPrestador){
            setPrestador(usuario);
        }
    }

    void adicionarAvaliacao(Avaliacao avaliacao){
        avaliacoes.add(avaliacao);
    }
}
