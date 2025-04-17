package Commands;

public class PasteCommand extends Command{
    public PasteCommand(Document document) {
        this.setReversible(true);
        this.document = document;
    };

    @Override
    public void execute() {
        document.paste();
    }

    private final Document document;
}
