package Commands;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Application {
    // fake "application" class
    public Application() {};

    public void addDocument(Document document) {
        documents.add(document);
    }

    public Document getDocument(int documentIndex) {
        return documents.get(documentIndex);
    }

    public boolean removeDocument(Document document) {
        return documents.remove(document);
    }

    private List<Document> documents = new ArrayList<>();

}
