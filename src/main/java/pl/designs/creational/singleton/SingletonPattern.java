package pl.designs.creational.singleton;

public class SingletonPattern {

    private static final SingletonPattern INSTANCE = new SingletonPattern();

    private SingletonPattern(){}

    public static SingletonPattern getInstance(){
        return INSTANCE;
    }

}
