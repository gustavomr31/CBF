public class Tecnico implements Funcionario {
    private String nome;
    private int anosExperiencia;
    private double taxaAproveitamento;

    public Tecnico(String nome, int anosExperiencia, double taxaAproveitamento) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
        this.taxaAproveitamento = taxaAproveitamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public double getTaxaAproveitamento() {
        return taxaAproveitamento;
    }

    public void setTaxaAproveitamento(double taxaAproveitamento) {
        this.taxaAproveitamento = taxaAproveitamento;
    }

    @Override
    public String toString() {
        return "===== TÉCNICO =====" + "\n" +
                "nome: " + nome + "\n" +
                "anos de experiência: " + anosExperiencia + "\n" +
                "taxa de aproveitamento: " + 100*taxaAproveitamento + "%";
    }

    @Override
    public double recebeSalario() {
        return 30000;
    }

    @Override
    public String salarioRecebido() {
        return "salário recebido: " + this.recebeSalario();
    }
}
