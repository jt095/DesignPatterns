package Commands;

public abstract class Command {
    public void execute() {};

    protected Command() {};

    public boolean isReversible() {
        return reversible;
    }

    public void setReversible(boolean reversible) {
        this.reversible = reversible;
    }

    protected boolean reversible = false;
}
