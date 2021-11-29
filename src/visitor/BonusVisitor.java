package visitor;

public class BonusVisitor {
    final int charmanderBonus = 10;
    final int charmeleonBonus = 20;
    final int charizardBonus = 30;


    public void visitCharmander(GameState state) {
        System.out.println("Visiting Charmander!");
        state.setBonus(charmanderBonus);
    }

    public void visitCharmeleon(GameState state) {
        System.out.println("Visiting Charmeleon!");
        state.setBonus(charmeleonBonus);
    }

    public void visitCharizard(GameState state) {
        System.out.println("Visiting Charizard!");
        state.setBonus(charizardBonus);
    }
}
