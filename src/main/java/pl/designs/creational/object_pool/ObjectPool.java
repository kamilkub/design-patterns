package pl.designs.creational.object_pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ObjectPool<T extends  Poolable> {

    private BlockingQueue<T> availablePool;

    public ObjectPool() {
        this.availablePool = new LinkedBlockingQueue<>();
    }

    public T get() {
        try {
            return this.availablePool.take();
        } catch (InterruptedException e) {
            System.err.println("Error while taking");
        }

        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            this.availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.println("Error while putting");
        }
    }
}
