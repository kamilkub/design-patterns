package pl.designs.structural.bridge;

public class Client {

    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(9);
        collection.offer(77);
        collection.offer(31);

    }

}
