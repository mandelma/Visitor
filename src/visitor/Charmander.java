package visitor;

public class Charmander implements GameState {
    private static Charmander INSTANCE = null;
    private int bonus;

    public static Charmander getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Charmander();
        }
        return INSTANCE;
    }

    @Override
    public String printStatus() {
        return "Charmander" + " Bonus: " +  String.valueOf(bonus);
    }

    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visitCharmander(this);
    }

    @Override
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
