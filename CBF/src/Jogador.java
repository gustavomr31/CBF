public abstract class Jogador implements Funcionario {
    private String nome;
    private int numero;
    private boolean falta;

    public Jogador(String nome, int numero, boolean falta) {
        this.nome = nome;
        this.numero = numero;
        this.falta = falta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFalta() {
        if (falta == true)
            return "sim";
        else
            return "não";
    }

    public void setFalta(boolean falta) {
        this.falta = falta;
    }

    @Override
    public String toString() {
        return "nome do jogador: " + nome + "\n" +
               "número da camisa:" + numero + "\n" +
               "batedor de falta: " + this.getFalta();
    }

    @Override
    public double recebeSalario() {
        return 10000.00;
    }

    @Override
    public String salarioRecebido() {
        return "salário recebido: " + this.recebeSalario();
    }
}
