package visitor;

public class Charmeleon implements GameState {
    private static Charmeleon INSTANCE = null;
    private int bonus;

    public static Charmeleon getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Charmeleon();
        }
        return INSTANCE;
    }

    @Override
    public String printStatus() {
        return "Charmeleon" + " Bonus: " +  String.valueOf(bonus);
    }

    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visitCharmeleon(this);
    }

    @Override
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
