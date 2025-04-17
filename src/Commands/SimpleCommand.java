package Commands;

public class SimpleCommand extends Command{
    public SimpleCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    private Receiver receiver;

}
