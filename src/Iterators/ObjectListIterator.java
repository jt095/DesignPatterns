package Iterators;

public class ObjectListIterator<T> extends ObjectIterator<T>{

    @Override
    public void first() {
        current = 0;
    }

    @Override
    public void next() {
        current ++;
    }

    @Override
    public boolean isDone() {
        return current >= objectList.count();
    }

    public T currentItem() {
        if (isDone()) {
            throw new IndexOutOfBoundsException("Out of bounds");
        }
        return objectList.get(current);
    }

    protected ObjectListIterator(ObjectList<T> aList) {
        super();
        this.objectList = aList;
        this.current = 0;
    }

    private final ObjectList<T> objectList;
    private int current;
}
