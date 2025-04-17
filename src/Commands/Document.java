package Commands;

public class Document {
    public Document(String name) {
        this.name = name;
    };

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void open() {
        isOpen = true;
        System.out.println("Document is Open.");
    }

    public void close() {
        isOpen = false;
        System.out.println("Document is Closed.");
    }

    public void paste() {

        System.out.println("Pasting to Document");
        contents += ", Content to paste.";
    }

    private String contents;
    private String name;
    private boolean isOpen = false;
}
