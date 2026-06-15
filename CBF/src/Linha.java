public class Linha extends Jogador {
    private String posicao;
    private double efetividadeCampo;

    public Linha(String nome, int numero, boolean falta, String posicao, double efetividadeCampo) {
        super(nome, numero, falta);
        this.posicao = posicao;
        this.efetividadeCampo = efetividadeCampo;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getEfetividadeCampo() {
        return efetividadeCampo;
    }

    public void setEfetividadeCampo(double efetividadeCampo) {
        this.efetividadeCampo = efetividadeCampo;
    }

    @Override
    public String toString() {
        return "===== " + posicao.toUpperCase() + " =====" + "\n" +
               super.toString() + "\n" +
               "efetividade em campo: " + 100*efetividadeCampo + "%";
    }

    @Override
    public double recebeSalario() {
        return super.recebeSalario() + efetividadeCampo*100*1000.00;
    }
}
