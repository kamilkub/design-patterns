package pl.designs.structural.bridge;

public interface LinkedList<T> {
    void addFirst(T element);
    T removeFirst();

    void addLast(T element);

    int getSize();

}
