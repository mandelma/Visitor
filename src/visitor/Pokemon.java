package visitor;

public class Pokemon {
    private GameState state;

    public Pokemon() {
        this.state = Charmander.getInstance();
    }

    public void getInfo() {
        System.out.println(state.printStatus());
    }

    public void addBonus() {
        Charmander.getInstance().accept(new BonusVisitor());
        Charmeleon.getInstance().accept(new BonusVisitor());
        Charizard.getInstance().accept(new BonusVisitor());
    }

    public void stateCharmeleon() {
        state = Charmeleon.getInstance();
    }

    public void stateCharizard() {
        state = Charizard.getInstance();
    }
}
