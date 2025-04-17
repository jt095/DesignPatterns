package Iterators;

import java.util.ArrayList;
import java.util.List;

public class ObjectList<T> {


    public ObjectList() {};
    public void append(T t) {
        items.add(t);
    }

    public int count() { return items.size(); }
    public T get(int index) { return items.get(index); }

    private List<T> items = new ArrayList<T>();
    private static final int DEFAULT_LIST_CAPACTIY = 10;
}
