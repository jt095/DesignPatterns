package Commands;

import java.util.Objects;

public class OpenCommand extends Command{
    public OpenCommand(Application application) {
        this.application = application;
    };

    @Override
    public void execute() {
        String name = askUser();

        if (!Objects.equals(name, "")) {
            Document document = new Document(name);
            application.addDocument(document);
            document.open();
        }
    };

    protected String askUser() {
        System.out.println("Document Name: ");
        return System.console().readLine();
    };

    private final Application application;
    private String response;


}
