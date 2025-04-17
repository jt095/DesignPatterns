package Iterators;

public abstract class ObjectIterator<T> {
    public void first() {};
    public void next() {};
    public boolean isDone() {
        return false;
    };
    public T currentItem() {
        return null;
    };

    protected ObjectIterator() {};

}
