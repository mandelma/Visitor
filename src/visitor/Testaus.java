package visitor;

public class Testaus {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        pokemon.addBonus();

        System.out.println("-------------------------");

        pokemon.getInfo();

        pokemon.stateCharmeleon();
        pokemon.getInfo();

        pokemon.stateCharizard();
        pokemon.getInfo();
    }
}
