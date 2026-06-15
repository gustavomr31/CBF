import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Funcionario> elenco = new ArrayList<>();

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarElenco(Funcionario funcionario) {
        elenco.add(funcionario);
    }

    public void removerElenco(Funcionario funcionario) {
        elenco.remove(funcionario);
    }

    @Override
    public String toString() {
        String s = "nome do time : " + nome + "\n" +
                   "elenco: " + "\n";
        for (Funcionario f : elenco)
            s += f.toString() + "\n";
        return s;
    }
}
