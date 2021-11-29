package visitor;

public class Charizard implements GameState {
    private static Charizard INSTANCE = null;
    private int bonus;

    public static Charizard getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Charizard();
        }
        return INSTANCE;
    }

    @Override
    public String printStatus() {
        return "Charizard" + " Bonus: " +  String.valueOf(bonus);
    }

    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visitCharizard(this);
    }

    @Override
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
