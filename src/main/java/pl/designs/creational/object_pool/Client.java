package pl.designs.creational.object_pool;

public class Client {

    public static void main(String[] args) {
        ObjectPool<Image> objectPool = new ObjectPool<>();
        objectPool.get();

    }
}
