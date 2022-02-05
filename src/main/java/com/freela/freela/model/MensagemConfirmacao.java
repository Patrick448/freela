public class MensagemConfirmacao extends Mensagem {
    private Servico servico;

    public MensagemConfirmacao() {
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
}
