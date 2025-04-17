package Commands;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    public CommandHistory() {};

    public void addCommand(Command command) {
        commands.add(command);
        current += 1;
    }

    public void undo() {

    }

    private int current = -1;
    private List<Command> commands = new ArrayList<>();
}
