package Commands;

public class UseCommands {
    public static void main(String[] args) {
        Application app = new Application();
        Document doc1 = new Document("Word Document");

        app.addDocument(doc1);

        System.out.println("Opening document...");
        OpenCommand openCommand = new OpenCommand(app);
        openCommand.execute();

        System.out.println("Creating macro command with 4 paste commands");
        MacroCommand macroCommand = new MacroCommand();

        macroCommand.addCommand(new PasteCommand(doc1));
        macroCommand.addCommand(new PasteCommand(doc1));
        macroCommand.addCommand(new PasteCommand(doc1));
        macroCommand.addCommand(new PasteCommand(doc1));

        macroCommand.execute();
    }
}
