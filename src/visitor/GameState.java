package visitor;

public interface GameState {
    public String printStatus();
    public void accept(BonusVisitor visitor);
    public void setBonus(int bonus);
}
