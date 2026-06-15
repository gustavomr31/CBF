public class Main {
    public static void main(String[] args) {
        Time time = new Time("Figueirense");

        Tecnico t = new Tecnico("Francisco", 24, 0.40);
        Goleiro g = new Goleiro("João",1,false,0.79);
        Linha l1 = new Linha("Pedro",10,false,"Atacante",0.56);
        Linha l2 = new Linha("Lucas",11,true,"Meio-campo",0.62);
        Linha l3 = new Linha("José",12,true,"Zagueiro",0.83);

        time.adicionarElenco(t);
        time.adicionarElenco(g);
        time.adicionarElenco(l1);
        time.adicionarElenco(l2);
        time.adicionarElenco(l3);

        System.out.println(time.toString());


    }
}