package Commands;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand extends Command {
    public MacroCommand() {};

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void removeCommand(Command command) {
        this.commands.remove(command);
    }

    @Override
    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
    }

    private final List<Command> commands = new ArrayList<>() {};

}
