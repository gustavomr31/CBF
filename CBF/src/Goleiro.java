public class Goleiro extends Jogador {
    private double taxaDefesa;

    public Goleiro(String nome, int numero, boolean falta, double taxaDefesa) {
        super(nome, numero, falta);
        this.taxaDefesa = taxaDefesa;
    }

    public double getTaxaDefesa() {
        return taxaDefesa;
    }

    public void setTaxaDefesa(double taxaDefesa) {
        this.taxaDefesa = taxaDefesa;
    }

    @Override
    public String toString() {
        return "===== GOLEIRO =====" + "\n" +
               super.toString() + "\n" +
               "chance de defesa: " + 100*taxaDefesa + "%";
    }

    @Override
    public double recebeSalario() {
        return super.recebeSalario() + 10000.00;
    }
}
